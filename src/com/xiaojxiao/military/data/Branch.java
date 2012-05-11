package com.xiaojxiao.military.data;

public class Branch
{
	private int _branch_id;
	private String _branch_name;
	private String _locale_branch_name;
	private int _country;
	private String _branch_logo_path;
	
	public static String COL_BRANCH_ID = "branch_id";
	public static String COL_BRANCH_NAME = "branch_name";
	public static String COL_LOCALE_BRANCH_NAME = "locale_branch_name";
	public static String COL_COUNTRY = "country";
	public static String COL_BRANCH_LOGO_PATH = "branch_logo_path";

	
	public Branch()
	{
		super();
	}

	public Branch(int _branch_id, String _branch_name,
			String _locale_branch_name, int _country, String _branch_logo_path)
	{
		super();
		this._branch_id = _branch_id;
		this._branch_name = _branch_name;
		this._locale_branch_name = _locale_branch_name;
		this._country = _country;
		this._branch_logo_path = _branch_logo_path;
	}



	public int get_branch_id()
	{
		return _branch_id;
	}

	public void set_branch_id(int _branch_id)
	{
		this._branch_id = _branch_id;
	}

	public String get_branch_name()
	{
		return _branch_name;
	}

	public void set_branch_name(String _branch_name)
	{
		this._branch_name = _branch_name;
	}

	public String get_locale_branch_name()
	{
		return _locale_branch_name;
	}

	public void set_locale_branch_name(String _locale_branch_name)
	{
		this._locale_branch_name = _locale_branch_name;
	}

	public int get_country()
	{
		return _country;
	}

	public void set_country(int _country)
	{
		this._country = _country;
	}

	public String get_branch_logo_path()
	{
		return _branch_logo_path;
	}

	public void set_branch_logo_path(String _branch_logo_path)
	{
		this._branch_logo_path = _branch_logo_path;
	}

}