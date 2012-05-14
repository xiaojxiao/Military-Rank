package com.xiaojxiao.military.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.xiaojxiao.military.data.Country;
import com.xiaojxiao.military.data.DBUtil;
import com.xiaojxiao.military.util.AssetAdapter;

public class CountryList extends ActivityGroup
{
	static List<Country> country_list = new ArrayList<Country>();
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		Log.i("listview_country", "Country...................");
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.country_list);
		
		DBUtil dbUtil = new DBUtil(this);
		
		country_list = dbUtil.getCountryList();
		
		List<HashMap<String, Object>> listItem = new ArrayList<HashMap<String, Object>>();

		for(Country country : country_list)
		{
			//Log.i("Military Rank..........", country.get_country_name() + " -- " + country.get_locale_country_name());
			
			HashMap<String, Object> map = new HashMap<String, Object>();
			
			map.put("name", country.get_country_name());
			map.put("locale_name", country.get_locale_country_name());
			map.put("flag", country.get_logo_path());
			
			listItem.add(map);
		}
		
		ListView listview_country = (ListView) findViewById(R.id.listview_country);
		
		AssetAdapter listItemAdapter = new AssetAdapter(this, listItem, R.layout.country_list_item, 
				new String[]{"name", "flag", "locale_name"}, 
				new int[]{R.id.country_list_item_name, R.id.country_list_item_flag, R.id.country_list_item_locale_name});
		
		listview_country.setAdapter(listItemAdapter);
		listview_country.setOnItemClickListener(new OnItemClickListener()
		{
			public void onItemClick(AdapterView<?> parent, View view, int position, long id)
			{
				Log.i("listview_country", country_list.get(position).get_country_name());
				Intent intent = new Intent(CountryList.this, BranchList.class);
				intent.putExtra("country_id", country_list.get(position).get_country_id());
				
				ListTabGroup.listTabGroup.startNewActivity("Branch", intent);
			}
		});
		
		listview_country.setDividerHeight(15);

		//set Ad
		//AdView ad_country = (AdView) findViewById(R.id.ad_country);
		//ad_country.loadAd(new AdRequest());
	}
}