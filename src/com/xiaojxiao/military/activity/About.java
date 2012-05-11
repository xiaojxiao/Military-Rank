package com.xiaojxiao.military.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.ListView;

import com.google.ads.AdRequest;
import com.google.ads.AdView;
import com.xiaojxiao.military.data.DBUtil;
import com.xiaojxiao.military.data.Rank;
import com.xiaojxiao.military.util.AssetAdapter;

public class About extends Activity
{
	static String AD_about = "AD_about";
	
	static AdView ad_about;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.about);
		
		//set Ad
		ad_about = (AdView) findViewById(R.id.ad_about);

		//check AD preference
		SharedPreferences settings = getSharedPreferences(Menu.STORE_NAME, MODE_PRIVATE);
		boolean isShow = settings.getBoolean(AD_about, false);

		if(!isShow)
		{
			//set Ad
			ad_about = (AdView) findViewById(R.id.ad_about);
			ad_about.loadAd(new AdRequest());
			ad_about.post(new Runnable()
			{
				@Override
				public void run()
				{
					int iChildCount = ad_about.getChildCount();
					for(int i=0;i<iChildCount;i++)
					{
						View cv = ad_about.getChildAt(i);
						cv.setOnTouchListener(new OnTouchListener(){
							public boolean onTouch(View v, MotionEvent event)
							{
								if(event.getAction() == MotionEvent.ACTION_DOWN)
								{
									SharedPreferences settings = getSharedPreferences(Menu.STORE_NAME, MODE_PRIVATE);
									SharedPreferences.Editor editor = settings.edit();  
									editor.putBoolean(AD_about, true); 
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