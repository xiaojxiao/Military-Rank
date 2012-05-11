package com.xiaojxiao.military.util;

import java.util.List;
import java.util.Map;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AssetAdapter extends BaseAdapter
{
	private Context mContext;
	private int[] mTo;
    private String[] mFrom;
    private List<? extends Map<String, ?>> mData;
    private int mResource;
    private LayoutInflater mInflater;
	
	public AssetAdapter(Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to)
	{
		mContext = context;
		mInflater = LayoutInflater.from(context);
		mData = data;
        mResource = resource;
        mFrom = from;
        mTo = to;
	}
	
	@Override
	public int getCount()
	{
		return mData.size();
	}

	@Override
	public Object getItem(int position)
	{
		return mData.get(position);
	}

	@Override
	public long getItemId(int position)
	{
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		convertView = mInflater.inflate(mResource, parent, false);
		
		for(int i=0;i<mTo.length;i++)
		{
			Map<String, ?> iData = mData.get(position);
			String text = (String)(iData.get(mFrom[i]));
			View v = convertView.findViewById(mTo[i]);
			
			if(v instanceof TextView)
			{
				setViewText((TextView)v, text);
			}
			else if(v instanceof ImageView)
			{
				setViewImage((ImageView)v, text);
			}
			
		}

		return convertView;
	}
	
	public void setViewText(TextView v, String text) 
	{
        v.setText(text);
    }
	
	public void setViewImage(ImageView v, String path)
	{
		try
		{
			v.setImageBitmap(BitmapFactory.decodeStream(mContext.getAssets().open(path)));
		} 
		catch (Exception e)
		{
			Log.i("AssetAdapter", e.getLocalizedMessage());
		}
		
    }
}
