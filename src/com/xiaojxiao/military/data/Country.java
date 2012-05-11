package com.xiaojxiao.military.data;

import android.R.integer;

public class Country
{
	private int _country_id;
	private String _country_name;
	private String _locale_country_name;
	private String _logo_path;
	
	public static String COL_COUNTRY_ID = "country_id";
	public static String COL_COUNTRY_NAME = "country_name";
	public static String COL_LOCALE_COUNTRY_NAME = "locale_country_name";
	public static String COL_LOGO_PATH = "logo_path";
	
	

	public Country()
	{
		super();
	}

	public Country(int _country_id, String _country_name,
			String _locale_country_name, String _logo_path)
	{
		super();
		this._country_id = _country_id;
		this._country_name = _country_name;
		this._locale_country_name = _locale_country_name;
		this._logo_path = _logo_path;
	}

	public int get_country_id()
	{
		return _country_id;
	}

	public void set_country_id(int _country_id)
	{
		this._country_id = _country_id;
	}

	public String get_country_name()
	{
		return _country_name;
	}

	public void set_country_name(String _country_name)
	{
		this._country_name = _country_name;
	}

	public String get_locale_country_name()
	{
		return _locale_country_name;
	}

	public void set_locale_country_name(String _locale_country_name)
	{
		this._locale_country_name = _locale_country_name;
	}

	public String get_logo_path()
	{
		return _logo_path;
	}

	public void set_logo_path(String _logo_path)
	{
		this._logo_path = _logo_path;
	}

}
