package com.xiaojxiao.military.util;

import android.content.Intent;

public class TabContent
{
	private String id;
	private Intent intent;
	
	public TabContent(String id, Intent intent)
	{
		super();
		this.id = id;
		this.intent = intent;
	}
	
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public Intent getIntent()
	{
		return intent;
	}
	public void setIntent(Intent intent)
	{
		this.intent = intent;
	}
}
