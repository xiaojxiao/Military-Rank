package com.xiaojxiao.military.activity;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import com.xiaojxiao.military.data.RankDBHelper;

import android.app.ActivityGroup;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.Window;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;

public class Menu extends ActivityGroup
{
	public static TabHost tab_host;
	public static String STORE_NAME = "military_setting";
	static AlertDialog.Builder builder;;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
		
		try
		{
			RankDBHelper rankDBHelper = new RankDBHelper(this);
			rankDBHelper.getWritableDatabase().close();
			
			//check version code
			int newVersionCode = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;

			SharedPreferences settings = getSharedPreferences(STORE_NAME, MODE_PRIVATE);
			int oldVersionCode = settings.getInt("version_code", -1);
			
			//Log.i("Menu", newVersionCode + "   " + oldVersionCode);
			//if the version has been changed, copy the database again
			if(newVersionCode != oldVersionCode)
			{
				rankDBHelper = new RankDBHelper(this);
				rankDBHelper.copyFromAsset();
				
				SharedPreferences.Editor editor = settings.edit();  
				editor.putInt("version_code", newVersionCode); 
				editor.commit(); 
			}
		}
		catch (Exception e)
		{
			Log.i("Menu", e.getLocalizedMessage());
		}
		
		builder = new AlertDialog.Builder(this);

		tab_host = (TabHost) findViewById(R.id.tabhost);
		tab_host.setPadding(tab_host.getPaddingLeft()+1,tab_host.getPaddingTop(), 
				tab_host.getPaddingRight()+1,tab_host.getPaddingBottom() - 5);

		tab_host.setup(this.getLocalActivityManager());
		tab_host.getTabWidget().setDividerDrawable(R.drawable.tab_divider);

		setupTab(new Intent(Menu.this, ListTabGroup.class), "List");
		setupTab(new Intent(Menu.this, SearchTabGroup.class), "Search");	
		setupTab(new Intent(Menu.this, About.class), "About");
		
		tab_host.setCurrentTab(0);
	}
	
	private void setupTab(Intent intent, final String tag) 
	{
		View tabview = createTabView(tab_host.getContext(), tag);

		TabSpec setContent = tab_host.newTabSpec(tag).setIndicator(tabview).setContent(intent);
		tab_host.addTab(setContent);

	}
	
	private static View createTabView(final Context context, final String text) 
	{
		View view = LayoutInflater.from(context).inflate(R.layout.tabs_bg, null);
		TextView tv = (TextView) view.findViewById(R.id.tabsText);
		tv.setText(text);
		return view;
	}

	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu)
	{
		menu.add(0, 1, 1, "Exit").setOnMenuItemClickListener(new OnMenuItemClickListener()
		{
			
			@Override
			public boolean onMenuItemClick(MenuItem item)
			{
				exit();

				return false;
			}
		});
		
		return true;
	}
	
	/**
	 * exit the app
	 */
	public static void exit()
	{
		builder.setMessage("Are you sure you want to exit?")
	       .setCancelable(false)
	       .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
	           public void onClick(DialogInterface dialog, int id) {
	        	   android.os.Process.killProcess(android.os.Process.myPid());
	       			System.exit(0);
	           }
	       })
	       .setNegativeButton("No", new DialogInterface.OnClickListener() {
	           public void onClick(DialogInterface dialog, int id) {
	                dialog.cancel();
	           }
	       });
		
		AlertDialog alert = builder.create();
		alert.show();
		
		/* Another method. For API 1.5+
		ActivityManager am = (ActivityManager)getSystemService (Context.ACTIVITY_SERVICE);
		am.restartPackage(getPackageName());
		*/
	}
}