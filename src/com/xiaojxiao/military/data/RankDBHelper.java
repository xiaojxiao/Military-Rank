package com.xiaojxiao.military.data;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class RankDBHelper extends SQLiteOpenHelper
{
	public static final int DATABASE_VERSION = 1;
	
	public static final String DATABASE_NAME = "military_rank";
	
	public static final String TABLE_RANK = "Rank";
	public static final String TABLE_COUNTRY = "Country";
	public static final String TABLE_BRANCH = "Branch";
	public static final String VIEW_RANK = "Rank_Map";
    
    private static final String SQL_CREATE_TABLE_RANK = "CREATE TABLE IF NOT EXISTS " + TABLE_RANK +  
    													   " (id INTEGER PRIMARY KEY AUTOINCREMENT, " + 
    													   "title VARCHAR, " +
    													   "locale_title VARCHAR, " + 
    													   "branch INTEGER, " + 
    													   "level INTEGER, " +
    													   "info VARCHAR," +
    													   "insignia_path VARCHAR)";
    
    private static final String SQL_CREATE_TABLE_COUNTRY = "CREATE TABLE IF NOT EXISTS " +  TABLE_COUNTRY +  
														   " (country_id INTEGER PRIMARY KEY AUTOINCREMENT, " + 
														   "country_name VARCHAR, " +
														   "locale_country_name VARCHAR, " + 
														   "logo_path VARCHAR)";
    
    private static final String SQL_CREATE_TABLE_BRANCH = "CREATE TABLE IF NOT EXISTS " + TABLE_BRANCH +   
														   " (branch_id INTEGER PRIMARY KEY AUTOINCREMENT, " + 
														   "branch_name VARCHAR, " +
														   "locale_branch_name VARCHAR, " + 
														   "country INTEGER, " + 
														   "branch_logo_path VARCHAR)";
    
    private static final String SQL_CREATE_RANK_VIEW = "CREATE VIEW Rank_Map AS " + 
    												   "SELECT * from Rank, Branch, Country " +
    												   "WHERE Rank.branch = Branch.branch_id AND Branch.country = Country.country_id";
    
    private static final String SQL_DROP_TABLE_RANK = "DROP TABLE IF EXISTS Rank";
    private static final String SQL_DROP_TABLE_COUNTRY = "DROP TABLE IF EXISTS Country";
    private static final String SQL_DROP_TABLE_BRANCH = "DROP TABLE IF EXISTS Branch";
    private static final String SQL_DROP_VIEW = "DROP VIEW IF EXISTS Rank_Map";
    
    public static String DB_PATH = "/data/data/com.xiaojxiao.military.activity/databases/" + DATABASE_NAME;
    
    public static Context dbContext;
	
	
	public RankDBHelper(Context context)
	{
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		this.dbContext = context;
	}

	/**
	 * Trigger when create
	 */
	public void onCreate(SQLiteDatabase db)
	{
		//Log.i("onCreate", "Enter onCreate...........");
		/*
		db.execSQL(SQL_CREATE_TABLE_COUNTRY);
		db.execSQL(SQL_CREATE_TABLE_BRANCH);
		db.execSQL(SQL_CREATE_TABLE_RANK);
		db.execSQL(SQL_CREATE_RANK_VIEW);
		*/
	}

	/**
	 * Trigger when upgrade
	 */
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
	{
		//Log.i("onUpgrade", "Enter onUpgrade...........");
		/*
		if(newVersion > oldVersion)
		{
			
			dropTable(db);
			onCreate(db);
		}
		*/
	}
	
	/**
	 * Drop all tables
	 */
	public void dropTable(SQLiteDatabase db)
	{
		db.execSQL(SQL_DROP_TABLE_RANK);
		db.execSQL(SQL_DROP_TABLE_COUNTRY);
		db.execSQL(SQL_DROP_TABLE_BRANCH);
		db.execSQL(SQL_DROP_VIEW);
	}
	
	public void copyFromAsset()
	{
		try
		{
			//Log.i("copyFromAsset", "Enter copyFromAsset...........");

			//copy database from asset
			InputStream assetsDB = dbContext.getAssets().open("military_rank");
			OutputStream dbOut = new FileOutputStream("/data/data/com.xiaojxiao.military.activity/databases/military_rank");
			
			byte[] buffer = new byte[1024];
			int length;
			while ((length = assetsDB.read(buffer))>0)
			{
				dbOut.write(buffer, 0, length);
			}
			 
			dbOut.flush();
			dbOut.close();
			assetsDB.close();
		}
		catch (Exception e)
		{
			Log.i("Copy Database Error", e.getLocalizedMessage());
		}
	}
}
