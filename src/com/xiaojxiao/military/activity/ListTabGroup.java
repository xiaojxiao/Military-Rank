package com.xiaojxiao.military.activity;

import java.util.ArrayList;
import java.util.List;

import com.xiaojxiao.military.util.TabContent;

import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

public class ListTabGroup extends ActivityGroup
{
	public static ListTabGroup listTabGroup;
	static List<View> view_history = new ArrayList<View>();
	
	static List<TabContent> content_history = new ArrayList<TabContent>();
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		listTabGroup = this;
		view_history = new ArrayList<View>();
		content_history = new ArrayList<TabContent>();
		
		Intent intent = new Intent(ListTabGroup.this, CountryList.class);
		
		startNewActivity("Country", intent);
	}
	
	/**
	 * start new intent
	 * @param id
	 * @param intent
	 */
	public void startNewActivity(String id, Intent intent)
	{
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);  //Important!
		View new_view = this.getLocalActivityManager().startActivity(id, intent).getDecorView();
		view_history.add(new_view);
		
		content_history.add(new TabContent(id, intent));
		
		setContentView(new_view);
	}
	
	/**
	 * get the previous view
	 */
	public void back()
	{
		/*
		if(view_history != null && view_history.size() > 0)
		{
			//Log.i("back", view_history.size() + "");
			view_history.remove(view_history.size()-1);
			
			if(view_history.size() <= 0)
			{
				finish();
			}
			else 
			{
				View prev_view = view_history.get(view_history.size()-1);
				
				setContentView(prev_view);
			}
		}
		else 
		{
			finish();
		}
		*/
		
		if(content_history != null && content_history.size() > 0)
		{
			Log.i("back", content_history.size() + "");
			content_history.remove(content_history.size()-1);
			
			if(content_history.size() <= 0)
			{
				finish();
			}
			else 
			{
				TabContent content = content_history.get(content_history.size()-1);
				
				Intent intent = content.getIntent();
				
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);  //Important!
				View prev_view = this.getLocalActivityManager().startActivity(content.getId(), intent).getDecorView();
				setContentView(prev_view);
			}
		}
		else 
		{
			finish();
		}
	}
	
	/**
	 * override the back event
	 */
	public boolean onKeyDown(int keyCode, KeyEvent event)  
	{
	    if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) 
	    {
	    	back();
	    	
	        return true;
	    }

	    return super.onKeyDown(keyCode, event);
	}
}
