package com.xiaojxiao.military.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.opengl.Visibility;
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

public class Search extends Activity
{
	DBUtil dbUtil;
	
	String[] test = new String[]{"Private", "corporal", "Co"};
	String[] title_array = new String[]{};
	
	static List<Rank> result_list = new ArrayList<Rank>();
	
	Context contextSearch;
	AutoCompleteTextView txt_keyword;
	ImageButton btn_search;
	ListView listview_result;
	
	static String AD_search = "AD_search";
	
	static AdView ad_search;
	
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.search);
		
		contextSearch = this;
		dbUtil = new DBUtil(this);
		
		listview_result = (ListView) findViewById(R.id.listview_search);
		txt_keyword = (AutoCompleteTextView) findViewById(R.id.txt_keyword);
		btn_search = (ImageButton) findViewById(R.id.btn_search);
		
		title_array = dbUtil.getAllRankNameArray();
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, android.R.id.text1, title_array);
		
		txt_keyword.setAdapter(arrayAdapter);
		txt_keyword.setOnItemClickListener(new OnItemClickListener()
		{

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3)
			{
				hideSoftInput();
			}
		});
		txt_keyword.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3)
			{
				hideSoftInput();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0)
			{
				hideSoftInput();
			}
		});

		btn_search.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{				
				txt_keyword.clearFocus();
				hideSoftInput();
				listview_result.requestFocus();
				
				result_list = dbUtil.getRankListByTitle(txt_keyword.getText().toString());
				
				List<HashMap<String, Object>> listItem = new ArrayList<HashMap<String, Object>>();
				
				for(Rank rank : result_list)
				{			
					//Log.i("RankList", "rank_id: " + rank.get_id() + " branch: " + rank.get_branch_object().get_branch_name() + "  country: " + rank.get_country_object().get_country_name());
					
					HashMap<String, Object> map = new HashMap<String, Object>();
					
					map.put("title", rank.get_title());
					map.put("insignia", rank.get_insignia_path());
					map.put("country_logo", rank.get_country_object().get_logo_path());
					map.put("branch_logo", rank.get_branch_object().get_branch_logo_path());
					
					listItem.add(map);
				}
				
				AssetAdapter listItemAdapter = new AssetAdapter(contextSearch, listItem, R.layout.advance_rank_list_item, 
						new String[]{"title", "insignia", "country_logo"}, 
						new int[]{R.id.advance_rank_list_item_title, R.id.advance_rank_list_item_insignia, R.id.advance_rank_list_item_flag});
				
				listview_result.setAdapter(listItemAdapter);
				
				listview_result.setVisibility(View.VISIBLE);
			}
		});
		
		listview_result.setOnItemClickListener(new OnItemClickListener()
		{
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id)
			{
				Intent intent = new Intent(Search.this, RankDetail.class);
				intent.putExtra("rank_id", result_list.get(position).get_id());
				
				SearchTabGroup.searchTabGroup.startNewActivity("RankDetail", intent);
			}
		});
		
		//set Ad
		ad_search = (AdView) findViewById(R.id.ad_search);

		//check AD preference
		SharedPreferences settings = getSharedPreferences(Menu.STORE_NAME, MODE_PRIVATE);
		boolean isShow = settings.getBoolean(AD_search, false);

		if(!isShow)
		{
			//set Ad
			ad_search = (AdView) findViewById(R.id.ad_search);
			ad_search.loadAd(new AdRequest());
			ad_search.post(new Runnable()
			{
				@Override
				public void run()
				{
					int iChildCount = ad_search.getChildCount();
					for(int i=0;i<iChildCount;i++)
					{
						View cv = ad_search.getChildAt(i);
						cv.setOnTouchListener(new OnTouchListener(){
							public boolean onTouch(View v, MotionEvent event)
							{
								if(event.getAction() == MotionEvent.ACTION_DOWN)
								{
									SharedPreferences settings = getSharedPreferences(Menu.STORE_NAME, MODE_PRIVATE);
									SharedPreferences.Editor editor = settings.edit();  
									editor.putBoolean(AD_search, true); 
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
	
	/**
	 * hide the softkey pane
	 */
	public void hideSoftInput()
	{
		InputMethodManager inputManager = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE); 
		inputManager.hideSoftInputFromWindow(txt_keyword.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
	}
}