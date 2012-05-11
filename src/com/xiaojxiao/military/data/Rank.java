package com.xiaojxiao.military.data;

public class Rank
{
	private int _id;
	private String _title;
	private String _locale_title;
	private int _branch;
	private int _level;
	private String _insignia_path;
	private String _info;
	private Branch _branch_object;
	private Country _country_object;
	
	public static String COL_ID = "id";
	public static String COL_TITLE = "title";
	public static String COL_LOCALE_TITLE = "locale_title";
	public static String COL_BRANCH = "branch";
	public static String COL_LEVEL = "level";
	public static String COL_INSIGNIA_PATH = "insignia_path";
	public static String COL_INFO = "info";

	
	public Rank()
	{
		super();
	}

	public Rank(int _id, String _title, String _locale_title, int _branch,
			int _level, String _insignia_path, String _info)
	{
		super();
		this._id = _id;
		this._title = _title;
		this._locale_title = _locale_title;
		this._branch = _branch;
		this._level = _level;
		this._insignia_path = _insignia_path;
		this._info = _info;
	}

	public int get_id()
	{
		return _id;
	}

	public void set_id(int _id)
	{
		this._id = _id;
	}

	public String get_title()
	{
		return _title;
	}

	public void set_title(String _title)
	{
		this._title = _title;
	}

	public String get_locale_title()
	{
		return _locale_title;
	}

	public void set_locale_title(String _locale_title)
	{
		this._locale_title = _locale_title;
	}

	public int get_branch()
	{
		return _branch;
	}

	public void set_branch(int _branch)
	{
		this._branch = _branch;
	}

	public int get_level()
	{
		return _level;
	}

	public void set_level(int _level)
	{
		this._level = _level;
	}

	public String get_insignia_path()
	{
		return _insignia_path;
	}

	public void set_insignia_path(String _insignia_path)
	{
		this._insignia_path = _insignia_path;
	}

	public String get_info()
	{
		return _info;
	}

	public void set_info(String _info)
	{
		this._info = _info;
	}

	public Branch get_branch_object()
	{
		return _branch_object;
	}

	public void set_branch_object(Branch _branch_object)
	{
		this._branch_object = _branch_object;
	}

	public Country get_country_object()
	{
		return _country_object;
	}

	public void set_country_object(Country _country_object)
	{
		this._country_object = _country_object;
	}
	
	
}
