package com.xiaojxiao.military.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.R.bool;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.ads.AdRequest;
import com.google.ads.AdView;
import com.xiaojxiao.military.data.Branch;
import com.xiaojxiao.military.data.DBUtil;
import com.xiaojxiao.military.util.AssetAdapter;

public class BranchList extends Activity
{
	static List<Branch> branch_list;
	
	static AdView ad_branch;
	
	static String AD_branch = "AD_branch";
	
	static Context branchListContext;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.branch_list);

		branchListContext = this;
		
		int country_id = getIntent().getIntExtra("country_id", -1);
		
		//Log.i("BranchList", "country_id: " + country_id);
		
		DBUtil dbUtil = new DBUtil(this);
		branch_list = dbUtil.getBranchList(country_id);

		List<HashMap<String, Object>> listItem = new ArrayList<HashMap<String, Object>>();
		
		for(Branch branch : branch_list)
		{
			HashMap<String, Object> map = new HashMap<String, Object>();
			
			map.put("name", branch.get_branch_name());
			map.put("locale_name", branch.get_locale_branch_name());
			map.put("logo", branch.get_branch_logo_path());
			
			listItem.add(map);
		}
		
		GridView branch_gridview = (GridView) findViewById(R.id.branch_gridview);
		
		AssetAdapter listItemAdapter = new AssetAdapter(this, listItem, R.layout.branch_list_item, 
				new String[]{"name", "locale_name", "logo"}, 
				new int[]{R.id.branch_list_item_name, R.id.branch_list_item_locale_name, R.id.branch_list_item_logo});
		
		branch_gridview.setAdapter(listItemAdapter);
		branch_gridview.setOnItemClickListener(new OnItemClickListener()
		{

			public void onItemClick(AdapterView<?> parent, View view, int position, long id)
			{
				//Log.i("listview_rank", branch_list.get(position).get_branch_name());
				Intent intent = new Intent(BranchList.this, RankList.class);
				intent.putExtra("branch_id", branch_list.get(position).get_branch_id());
				
				ListTabGroup.listTabGroup.startNewActivity("Rank", intent);
			}
		});
		
		//go back button
		ImageButton back_button = (ImageButton)findViewById(R.id.btn_back_1);
		back_button.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				ListTabGroup.listTabGroup.back();
			}
		});
		
		//check AD preference
		SharedPreferences settings = getSharedPreferences(Menu.STORE_NAME, MODE_PRIVATE);
		boolean isShow = settings.getBoolean(AD_branch, false);

		if(!isShow)
		{
			//set Ad
			ad_branch = (AdView) findViewById(R.id.ad_branch);
			ad_branch.loadAd(new AdRequest());
			ad_branch.post(new Runnable()
			{
				@Override
				public void run()
				{
					int iChildCount = ad_branch.getChildCount();
					for(int i=0;i<iChildCount;i++)
					{
						View cv = ad_branch.getChildAt(i);
						cv.setOnTouchListener(new OnTouchListener(){
							public boolean onTouch(View v, MotionEvent event)
							{
								if(event.getAction() == MotionEvent.ACTION_DOWN)
								{
									SharedPreferences settings = getSharedPreferences(Menu.STORE_NAME, MODE_PRIVATE);
									SharedPreferences.Editor editor = settings.edit();  
									editor.putBoolean(AD_branch, true); 
									editor.commit();
								}
								
								return false;
							}
						});
					}
				}
			});
		}
	}
}
