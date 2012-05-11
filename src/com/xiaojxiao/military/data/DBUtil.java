package com.xiaojxiao.military.data;

import java.util.ArrayList;
import java.util.List;

import android.R.integer;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;

public class DBUtil
{
	private static RankDBHelper rankDBHelper;

	public DBUtil(Context context)
	{
		rankDBHelper = new RankDBHelper(context);
	}
	
	/**
	 * refresh the database
	 */
	public void refreshDB()
	{
		rankDBHelper.dropTable(rankDBHelper.getWritableDatabase());
		rankDBHelper.onCreate(rankDBHelper.getWritableDatabase());
	}
	
	/**
	 * get all countries
	 * @return
	 */
	public List<Country> getCountryList()
	{
		List<Country> countryList = new ArrayList<Country>();
		
		Cursor cursor = rankDBHelper.getReadableDatabase().query(RankDBHelper.TABLE_COUNTRY, 
														new String[]{Country.COL_COUNTRY_ID, Country.COL_COUNTRY_NAME, Country.COL_LOCALE_COUNTRY_NAME, Country.COL_LOGO_PATH}, 
														null, null, null, null, Country.COL_COUNTRY_NAME + " ASC");
		
		if(cursor != null)
		{
			cursor.moveToFirst();
			
			while (!cursor.isAfterLast())
			{
				Country country = new Country();
				
				country.set_country_id(cursor.getInt(0));
				country.set_country_name(cursor.getString(1));
				country.set_locale_country_name(cursor.getString(2));
				country.set_logo_path(cursor.getString(3));
				
				countryList.add(country);
				
				cursor.moveToNext();
			}
		}
		
		cursor.close();
		rankDBHelper.close();
		
		return countryList;
	}
	
	/**
	 * get all branches
	 * @param country id
	 * @return
	 */
	public List<Branch> getBranchList(int country_id)
	{
		List<Branch> branchList = new ArrayList<Branch>();
		
		Cursor cursor = rankDBHelper.getReadableDatabase().query(RankDBHelper.TABLE_BRANCH, 
				new String[]{Branch.COL_BRANCH_ID, Branch.COL_BRANCH_NAME, Branch.COL_LOCALE_BRANCH_NAME, Branch.COL_COUNTRY, Branch.COL_BRANCH_LOGO_PATH}, 
				Branch.COL_COUNTRY + "=" + country_id, null, null, null, Branch.COL_BRANCH_NAME + " ASC");

		if(cursor != null)
		{
			cursor.moveToFirst();
			
			while (!cursor.isAfterLast())
			{
				Branch branch = new Branch();
				
				branch.set_branch_id(cursor.getInt(0));
				branch.set_branch_name(cursor.getString(1));
				branch.set_locale_branch_name(cursor.getString(2));
				branch.set_country(cursor.getInt(3));
				branch.set_branch_logo_path(cursor.getString(4));
					
				branchList.add(branch);
				
				cursor.moveToNext();
			}
		}
		
		cursor.close();
		rankDBHelper.close();
		
		return branchList;
	}
	
	/**
	 * get all ranks
	 * @param branch id
	 * @return
	 */
	public List<Rank> getRankList(int branch_id)
	{
		List<Rank> rankList = new ArrayList<Rank>();
		
		Cursor cursor = rankDBHelper.getReadableDatabase().query(RankDBHelper.TABLE_RANK, 
				new String[]{Rank.COL_ID, Rank.COL_TITLE, Rank.COL_LOCALE_TITLE, Rank.COL_BRANCH, Rank.COL_LEVEL, Rank.COL_INFO, Rank.COL_INSIGNIA_PATH}, 
				Rank.COL_BRANCH + "=" + branch_id, null, null, null, Rank.COL_LEVEL + " ASC");

		if(cursor != null)
		{
			cursor.moveToFirst();
			
			while (!cursor.isAfterLast())
			{
				Rank rank = new Rank();
				
				rank.set_id(cursor.getInt(0));
				rank.set_title(cursor.getString(1));
				rank.set_locale_title(cursor.getString(2));
				rank.set_branch(cursor.getInt(3));
				rank.set_level(cursor.getInt(4));
				rank.set_info(cursor.getString(5));
				rank.set_insignia_path(cursor.getString(6));
				
				rankList.add(rank);
				
				cursor.moveToNext();
			}
		}
		
		cursor.close();
		rankDBHelper.close();
		
		return rankList;
	}
	
	/**
	 * get Rank Object by rank id
	 * @param rank_id
	 * @return
	 */
	public Rank getRankById(int rank_id)
	{
		Rank rank = new Rank();
		
		Cursor cursor = rankDBHelper.getReadableDatabase().query(RankDBHelper.VIEW_RANK, 
				new String[]{Rank.COL_ID, Rank.COL_TITLE, Rank.COL_LOCALE_TITLE, Rank.COL_BRANCH, Rank.COL_LEVEL, Rank.COL_INFO, Rank.COL_INSIGNIA_PATH,
							 Branch.COL_BRANCH_ID, Branch.COL_BRANCH_NAME, Branch.COL_LOCALE_BRANCH_NAME, Branch.COL_COUNTRY, Branch.COL_BRANCH_LOGO_PATH,
							 Country.COL_COUNTRY_ID, Country.COL_COUNTRY_NAME, Country.COL_LOCALE_COUNTRY_NAME, Country.COL_LOGO_PATH}, 
				Rank.COL_ID + "=" + rank_id, null, null, null, null);

		if(cursor != null)
		{
			cursor.moveToFirst();
				
			rank.set_id(cursor.getInt(cursor.getColumnIndex(Rank.COL_ID)));
			rank.set_title(cursor.getString(cursor.getColumnIndex(Rank.COL_TITLE)));
			rank.set_locale_title(cursor.getString(cursor.getColumnIndex(Rank.COL_LOCALE_TITLE)));
			rank.set_branch(cursor.getInt(cursor.getColumnIndex(Rank.COL_BRANCH)));
			rank.set_level(cursor.getInt(cursor.getColumnIndex(Rank.COL_LEVEL)));
			rank.set_info(cursor.getString(cursor.getColumnIndex(Rank.COL_INFO)));
			rank.set_insignia_path(cursor.getString(cursor.getColumnIndex(Rank.COL_INSIGNIA_PATH)));
			
			Branch branch = new Branch();
			branch.set_branch_id(cursor.getInt(cursor.getColumnIndex(Branch.COL_BRANCH_ID)));
			branch.set_branch_name(cursor.getString(cursor.getColumnIndex(Branch.COL_BRANCH_NAME)));
			branch.set_locale_branch_name(cursor.getString(cursor.getColumnIndex(Branch.COL_LOCALE_BRANCH_NAME)));
			branch.set_country(cursor.getInt(cursor.getColumnIndex(Branch.COL_COUNTRY)));
			branch.set_branch_logo_path(cursor.getString(cursor.getColumnIndex(Branch.COL_LOCALE_BRANCH_NAME)));
			rank.set_branch_object(branch);
			
			Country country = new Country();
			country.set_country_id(cursor.getInt(cursor.getColumnIndex(Country.COL_COUNTRY_ID)));
			country.set_country_name(cursor.getString(cursor.getColumnIndex(Country.COL_COUNTRY_NAME)));
			country.set_locale_country_name(cursor.getString(cursor.getColumnIndex(Country.COL_LOCALE_COUNTRY_NAME)));
			country.set_logo_path(cursor.getString(cursor.getColumnIndex(Country.COL_LOGO_PATH)));
			rank.set_country_object(country);
		}
		
		cursor.close();
		rankDBHelper.close();
		
		return rank;
	}
	
	/**
	 * Get all Rank Names
	 * @return
	 */
	public Cursor getAllRankNameCursor()
	{
		//IMPORTANT! put _id as column
		String sql = "SELECT DISTINCT id as _id, title FROM " + rankDBHelper.TABLE_RANK + " ORDER BY title ASC";
		Cursor cursor = rankDBHelper.getReadableDatabase().rawQuery(sql, null);
		//Cursor cursor = rankDBHelper.getReadableDatabase().query(true, RankDBHelper.TABLE_RANK, 
				//new String[]{Rank.COL_TITLE}, null, null, null, null, null, null);
		
		cursor.moveToFirst();
		
		return cursor;
	}
	
	/**
	 * Get all Rank Names
	 * @return Array
	 */
	public String[] getAllRankNameArray()
	{
		List<String> title_list = new ArrayList<String>();
		
		Cursor cursor = rankDBHelper.getReadableDatabase().query(true, RankDBHelper.TABLE_RANK, 
				new String[]{Rank.COL_TITLE}, null, null, null, null, Rank.COL_TITLE + " ASC", null);
		
		if(cursor != null)
		{
			cursor.moveToFirst();
			
			while (!cursor.isAfterLast())
			{
				title_list.add(cursor.getString(0));
				
				cursor.moveToNext();
			}
		}
		
		cursor.close();
		rankDBHelper.close();
		
		return title_list.toArray(new String[0]);
	}
	
	/**
	 * get all ranks by title
	 * @param title
	 * @return
	 */
	public List<Rank> getRankListByTitle(String title)
	{
		List<Rank> rankList = new ArrayList<Rank>();
			
		Cursor cursor = rankDBHelper.getReadableDatabase().query(RankDBHelper.VIEW_RANK, 
				new String[]{Rank.COL_ID, Rank.COL_TITLE, Rank.COL_LOCALE_TITLE, Rank.COL_BRANCH, Rank.COL_LEVEL, Rank.COL_INFO, Rank.COL_INSIGNIA_PATH,
							 Branch.COL_BRANCH_ID, Branch.COL_BRANCH_NAME, Branch.COL_LOCALE_BRANCH_NAME, Branch.COL_COUNTRY, Branch.COL_BRANCH_LOGO_PATH,
							 Country.COL_COUNTRY_ID, Country.COL_COUNTRY_NAME, Country.COL_LOCALE_COUNTRY_NAME, Country.COL_LOGO_PATH}, 
				Rank.COL_TITLE + " = '" + title + "'", null, null, null, Rank.COL_TITLE + " ASC");

		if(cursor != null)
		{
			cursor.moveToFirst();
			
			while (!cursor.isAfterLast())
			{				
				Rank rank = new Rank();
				rank.set_id(cursor.getInt(cursor.getColumnIndex(Rank.COL_ID)));
				rank.set_title(cursor.getString(cursor.getColumnIndex(Rank.COL_TITLE)));
				rank.set_locale_title(cursor.getString(cursor.getColumnIndex(Rank.COL_LOCALE_TITLE)));
				rank.set_branch(cursor.getInt(cursor.getColumnIndex(Rank.COL_BRANCH)));
				rank.set_level(cursor.getInt(cursor.getColumnIndex(Rank.COL_LEVEL)));
				rank.set_info(cursor.getString(cursor.getColumnIndex(Rank.COL_INFO)));
				rank.set_insignia_path(cursor.getString(cursor.getColumnIndex(Rank.COL_INSIGNIA_PATH)));
				
				Branch branch = new Branch();
				branch.set_branch_id(cursor.getInt(cursor.getColumnIndex(Branch.COL_BRANCH_ID)));
				branch.set_branch_name(cursor.getString(cursor.getColumnIndex(Branch.COL_BRANCH_NAME)));
				branch.set_locale_branch_name(cursor.getString(cursor.getColumnIndex(Branch.COL_LOCALE_BRANCH_NAME)));
				branch.set_country(cursor.getInt(cursor.getColumnIndex(Branch.COL_COUNTRY)));
				branch.set_branch_logo_path(cursor.getString(cursor.getColumnIndex(Branch.COL_LOCALE_BRANCH_NAME)));
				rank.set_branch_object(branch);
				
				Country country = new Country();
				country.set_country_id(cursor.getInt(cursor.getColumnIndex(Country.COL_COUNTRY_ID)));
				country.set_country_name(cursor.getString(cursor.getColumnIndex(Country.COL_COUNTRY_NAME)));
				country.set_locale_country_name(cursor.getString(cursor.getColumnIndex(Country.COL_LOCALE_COUNTRY_NAME)));
				country.set_logo_path(cursor.getString(cursor.getColumnIndex(Country.COL_LOGO_PATH)));
				rank.set_country_object(country);
				
				
				rankList.add(rank);
				
				cursor.moveToNext();
			}
		}
		
		cursor.close();
		rankDBHelper.close();
		
		return rankList;
	}
	
	/**
	 * insert into Country table
	 * @param _country_name
	 * @param _locale_country_name
	 * @param _logo_path
	 */
	public void insertCountry(String _country_name, String _locale_country_name, String _logo_path)
	{
		ContentValues contentValues = new ContentValues();
		contentValues.put(Country.COL_COUNTRY_NAME, _country_name);
		contentValues.put(Country.COL_LOCALE_COUNTRY_NAME, _locale_country_name);
		contentValues.put(Country.COL_LOGO_PATH, _logo_path);
		
		rankDBHelper.getWritableDatabase().insert(RankDBHelper.TABLE_COUNTRY, null, contentValues);
		
		rankDBHelper.close();
	}
	
	/**
	 * insert into Branch table
	 * @param _branch_name
	 * @param _locale_branch_name
	 * @param _country
	 * @param _branch_logo_path
	 */
	public void insertBranch(String _branch_name, String _locale_branch_name, int _country, String _branch_logo_path)
	{
		ContentValues contentValues = new ContentValues();
		contentValues.put(Branch.COL_BRANCH_NAME, _branch_name);
		contentValues.put(Branch.COL_LOCALE_BRANCH_NAME, _locale_branch_name);
		contentValues.put(Branch.COL_COUNTRY, _country);
		contentValues.put(Branch.COL_BRANCH_LOGO_PATH, _branch_logo_path);
		
		rankDBHelper.getWritableDatabase().insert(RankDBHelper.TABLE_BRANCH, null, contentValues);
		
		rankDBHelper.close();
	}
	
	/**
	 * insert into Rank table
	 * @param _title
	 * @param _locale_title
	 * @param _branch
	 * @param _level
	 * @param _insignia_path
	 * @param _info
	 */
	public void insertRank(String _title, String _locale_title, int _branch,int _level, String _insignia_path, String _info)
	{
		ContentValues contentValues = new ContentValues();
		contentValues.put(Rank.COL_TITLE, _title);
		contentValues.put(Rank.COL_LOCALE_TITLE, _locale_title);
		contentValues.put(Rank.COL_BRANCH, _branch);
		contentValues.put(Rank.COL_LEVEL, _level);
		contentValues.put(Rank.COL_INSIGNIA_PATH, _insignia_path);
		contentValues.put(Rank.COL_INFO, _info);
		
		rankDBHelper.getWritableDatabase().insert(RankDBHelper.TABLE_RANK, null, contentValues);
		
		rankDBHelper.close();
	}
}
