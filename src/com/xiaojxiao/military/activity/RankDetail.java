package com.xiaojxiao.military.activity;

import android.R.integer;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.ads.AdRequest;
import com.google.ads.AdView;
import com.xiaojxiao.military.data.DBUtil;
import com.xiaojxiao.military.data.Rank;

public class RankDetail extends Activity
{
	static Rank rank;
	
	static String AD_rank_detail = "AD_rank_detail";
	
	static AdView ad_rank_detail;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.rank_detail);
		
		int rank_id = getIntent().getIntExtra("rank_id", -1);
		
		DBUtil dbUtil = new DBUtil(this);
		
		rank = dbUtil.getRankById(rank_id);
		
		//Log.i("RankList", "rank_id: " + rank_id + " branch: " + rank.get_branch_object().get_branch_name() + "  country: " + rank.get_country_object().get_country_name());
		
		ImageView rank_detail_image = (ImageView) findViewById(R.id.rank_detail_img);
		try
		{
			rank_detail_image.setImageBitmap(BitmapFactory.decodeStream(getAssets().open(rank.get_insignia_path())));
		}
		catch (Exception e)
		{
			Log.i("RankDetail", e.getLocalizedMessage());
		}
		
		TextView rank_detail_title = (TextView) findViewById(R.id.rank_detail_title);
		rank_detail_title.setText(rank.get_title());
		
		TextView rank_detail_locale_title = (TextView) findViewById(R.id.rank_detail_locale_title);
		rank_detail_locale_title.setText(rank.get_locale_title());
		
		TextView rank_detail_country = (TextView) findViewById(R.id.rank_detail_country);
		rank_detail_country.setText(rank.get_country_object().get_country_name());
		
		TextView rank_detail_branch = (TextView) findViewById(R.id.rank_detail_branch);
		rank_detail_branch.setText(rank.get_branch_object().get_branch_name());
		
		TextView rank_detail_info = (TextView) findViewById(R.id.rank_detail_info);
		rank_detail_info.setText(rank.get_info());
		
		//go back button
		ImageButton back_button = (ImageButton)findViewById(R.id.btn_back_3);
		back_button.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				//check current tab
				if(Menu.tab_host.getCurrentTab() == 1)
				{
					SearchTabGroup.searchTabGroup.back();
				}
				else
				{
					ListTabGroup.listTabGroup.back();
				}
			}
		});
		
		//set Ad
		ad_rank_detail = (AdView) findViewById(R.id.ad_rank_detail);
		
		//check AD preference
		SharedPreferences settings = getSharedPreferences(Menu.STORE_NAME, MODE_PRIVATE);
		boolean isShow = settings.getBoolean(AD_rank_detail, false);

		if(!isShow)
		{
			//set Ad
			ad_rank_detail = (AdView) findViewById(R.id.ad_rank_detail);
			ad_rank_detail.loadAd(new AdRequest());
			ad_rank_detail.post(new Runnable()
			{
				@Override
				public void run()
				{
					int iChildCount = ad_rank_detail.getChildCount();
					for(int i=0;i<iChildCount;i++)
					{
						View cv = ad_rank_detail.getChildAt(i);
						cv.setOnTouchListener(new OnTouchListener(){
							public boolean onTouch(View v, MotionEvent event)
							{
								if(event.getAction() == MotionEvent.ACTION_DOWN)
								{
									SharedPreferences settings = getSharedPreferences(Menu.STORE_NAME, MODE_PRIVATE);
									SharedPreferences.Editor editor = settings.edit();  
									editor.putBoolean(AD_rank_detail, true); 
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
