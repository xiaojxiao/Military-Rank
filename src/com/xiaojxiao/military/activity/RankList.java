package com.xiaojxiao.military.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ListView;

import com.xiaojxiao.military.data.DBUtil;
import com.xiaojxiao.military.data.Rank;
import com.xiaojxiao.military.util.AssetAdapter;

public class RankList extends Activity
{
	public static List<Rank> rank_list;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rank_list);
		
		int branch_id = getIntent().getIntExtra("branch_id", -1);
		
		DBUtil dbUtil = new DBUtil(this);
		rank_list = dbUtil.getRankList(branch_id);
		
		List<HashMap<String, Object>> listItem = new ArrayList<HashMap<String, Object>>();
		
		for(Rank rank : rank_list)
		{			
			HashMap<String, Object> map = new HashMap<String, Object>();
			
			map.put("title", rank.get_title());
			map.put("insignia", rank.get_insignia_path());
			
			listItem.add(map);
		}
		
		ListView listview_rank = (ListView) findViewById(R.id.listview_rank);
		
		AssetAdapter listItemAdapter = new AssetAdapter(this, listItem, R.layout.rank_list_item, 
				new String[]{"title", "insignia"}, 
				new int[]{R.id.rank_list_item_title, R.id.rank_list_item_insignia});
		
		listview_rank.setAdapter(listItemAdapter);
		listview_rank.setOnItemClickListener(new OnItemClickListener()
		{
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id)
			{
				Intent intent = new Intent(RankList.this, RankDetail.class);
				intent.putExtra("rank_id", rank_list.get(position).get_id());
				
				ListTabGroup.listTabGroup.startNewActivity("RankDetail", intent);
			}
		});
		
		//go back button
		ImageButton back_button = (ImageButton)findViewById(R.id.btn_back_2);
		back_button.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				ListTabGroup.listTabGroup.back();
			}
		});
	}
}