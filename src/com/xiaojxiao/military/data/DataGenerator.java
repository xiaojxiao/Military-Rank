package com.xiaojxiao.military.data;

import java.util.List;

import android.content.Context;
import android.util.Log;

public class DataGenerator
{
	public static void generateAllData(Context context)
	{	
		DBUtil dbUtil = new DBUtil(context);
		dbUtil.refreshDB();

		//1 USA
		dbUtil.insertCountry("USA", "USA", "usa/flag.png");
		
		//USA Army
		dbUtil.insertBranch("Army", "Army", 1, "usa/army/logo.png");
		
		dbUtil.insertRank("Private", "Private", 1, -3, "usa/army/-3.png", "Abbrv  : PVT \n Pay Grade  : E-1 \n "); //NONE
		dbUtil.insertRank("Private 2", "Private 2", 1, -2, "usa/army/-2.png", "Abbrv  : PV2 \n Pay Grade  : E-2 \n ");
		dbUtil.insertRank("Private First Class", "Private First Class", 1, -1, "usa/army/-1.png", "Abbrv  : PFC \n Pay Grade  : E-3 \n ");
		dbUtil.insertRank("Specialist", "Specialist", 1, 0, "usa/army/0.png", "Abbrv  : SPC \n Pay Grade  : E-4 \n ");
		dbUtil.insertRank("Corporal", "Corporal", 1, 1, "usa/army/1.png", "Abbrv  : CPL \n Pay Grade  : E-4 \n ");
		dbUtil.insertRank("Sergeant", "Sergeant", 1, 2, "usa/army/2.png", "Abbrv  : SGT \n Pay Grade  : E-5 \n ");
		dbUtil.insertRank("Staff Sergeant", "Staff Sergeant", 1, 3, "usa/army/3.png", "Abbrv  : SSG \n Pay Grade  : E-6 \n ");
		dbUtil.insertRank("Sergeant First Class", "Sergeant First Class", 1, 4, "usa/army/4.png", "Abbrv  : SFC \n Pay Grade  : E-7 \n ");
		dbUtil.insertRank("Master Sergeant", "Master Sergeant", 1, 5, "usa/army/5.png", "Abbrv  : MSG \n Pay Grade  : E-8 \n ");
		dbUtil.insertRank("First Sergeant", "First Sergeant", 1, 6, "usa/army/6.png", "Abbrv  : 1SG \n Pay Grade  : E-8 \n ");
		dbUtil.insertRank("Sergeant Major", "Sergeant Major", 1, 7, "usa/army/7.png", "Abbrv  : SGM \n Pay Grade  : E-9 \n ");
		dbUtil.insertRank("Command Sergeant Major", "Command Sergeant Major", 1, 8, "usa/army/8.png", "Abbrv  : CSM \n Pay Grade  : E-9 \n ");
		dbUtil.insertRank("Sergeant Major of the Army", "Sergeant Major of the Army", 1, 9, "usa/army/9.png", "Abbrv  : SMA \n Pay Grade  : E-9 \n ");
		dbUtil.insertRank("Warrant Officer", "Warrant Officer", 1, 10, "usa/army/10.png", "Abbrv  : WO1 \n Pay Grade  : W-1 \n ");
		dbUtil.insertRank("Chief Warrant Officer 2", "Chief Warrant Officer 2", 1, 11, "usa/army/11.png", "Abbrv  : CW2 \n Pay Grade  : W-2 \n ");
		dbUtil.insertRank("Chief Warrant Officer 3", "Chief Warrant Officer 3", 1, 12, "usa/army/12.png", "Abbrv  : CW3 \n Pay Grade  : W-3 \n ");
		dbUtil.insertRank("Chief Warrant Officer 4", "Chief Warrant Officer 4", 1, 13, "usa/army/13.png", "Abbrv  : CW4 \n Pay Grade  : W-4 \n ");
		dbUtil.insertRank("Chief Warrant Officer 5", "Chief Warrant Officer 5", 1, 14, "usa/army/14.png", "Abbrv  : CW5 \n Pay Grade  : W-5 \n ");
		dbUtil.insertRank("Second Lieutenant", "Second Lieutenant", 1, 15, "usa/army/15.png", "Abbrv  : 2LT \n Pay Grade  : O-1 \n ");
		dbUtil.insertRank("First Lieutenant", "First Lieutenant", 1, 16, "usa/army/16.png", "Abbrv  : 1LT \n Pay Grade  : O-2 \n ");
		dbUtil.insertRank("Captain", "Captain", 1, 17, "usa/army/17.png", "Abbrv  : CPT \n Pay Grade  : O-3 \n ");
		dbUtil.insertRank("Major", "Major", 1, 18, "usa/army/18.png", "Abbrv  : MAJ \n Pay Grade  : O-4 \n ");
		dbUtil.insertRank("Lieutenant Colonel", "Lieutenant Colonel", 1, 19, "usa/army/19.png", "Abbrv  : LTC \n Pay Grade  : O-5 \n ");
		dbUtil.insertRank("Colonel", "Colonel", 1, 20, "usa/army/20.png", "Abbrv  : COL \n Pay Grade  : O-6 \n ");
		dbUtil.insertRank("Brigadier General", "Brigadier General", 1, 21, "usa/army/21.png", "Abbrv  : BG \n Pay Grade  : O-7 \n ");
		dbUtil.insertRank("Major General", "Major General", 1, 22, "usa/army/22.png", "Abbrv  : MG \n Pay Grade  : O-8 \n ");
		dbUtil.insertRank("Lieutenant General", "Lieutenant General", 1, 23, "usa/army/23.png", "Abbrv  : LTG \n Pay Grade  : O-9 \n ");
		dbUtil.insertRank("General", "General", 1, 24, "usa/army/24.png", "Abbrv  : GEN \n Pay Grade  : O-10 \n ");
		dbUtil.insertRank("General of the Army", "General of the Army", 1, 25, "usa/army/25.png", "Abbrv  : GA \n Pay Grade  : Special \n ");

		//USA Navy
		dbUtil.insertBranch("Navy", "Navy", 1, "usa/navy/logo.png");

		dbUtil.insertRank("Seaman Recruit", "Seaman Recruit", 2, 1, "usa/navy/1.png", "Abbrv  : SR \n Pay Grade  : E-1 \n ");
		dbUtil.insertRank("Seaman Apprentice", "Seaman Apprentice", 2, 2, "usa/navy/2.png", "Abbrv  : SA \n Pay Grade  : E-2 \n ");
		dbUtil.insertRank("Seaman", "Seaman", 2, 3, "usa/navy/3.png", "Abbrv  : SN \n Pay Grade  : E-3 \n ");
		dbUtil.insertRank("Petty Officer Third Class", "Petty Officer Third Class", 2, 4, "usa/navy/4.png", "Abbrv  : PO3 \n Pay Grade  : E-4 \n ");
		dbUtil.insertRank("Petty Officer Second  Class", "Petty Officer Second  Class", 2, 5, "usa/navy/5.png", "Abbrv  : PO2 \n Pay Grade  : E-5 \n ");
		dbUtil.insertRank("Petty Officer First Class", "Petty Officer First Class", 2, 6, "usa/navy/6.png", "Abbrv  : PO1 \n Pay Grade  : E-6 \n ");
		dbUtil.insertRank("Chief Petty Officer", "Chief Petty Officer", 2, 7, "usa/navy/7.png", "Abbrv  : CPO \n Pay Grade  : E-7 \n ");
		dbUtil.insertRank("Senior Chief Petty Officer", "Senior Chief Petty Officer", 2, 8, "usa/navy/8.png", "Abbrv  : SCPO \n Pay Grade  : E-8 \n ");
		dbUtil.insertRank("Master Chief Petty Officer", "Master Chief Petty Officer", 2, 9, "usa/navy/9.png", "Abbrv  : MCPO \n Pay Grade  : E-9 \n ");
		dbUtil.insertRank("Command Master Chief Petty Officer", "Command Master Chief Petty Officer", 2, 10, "usa/navy/10.png", "Abbrv  :  \n Pay Grade  : E-9 \n ");
		dbUtil.insertRank("Force Master Chief Petty Officer", "Force Master Chief Petty Officer", 2, 11, "usa/navy/11.png", "Abbrv  :  \n Pay Grade  : E-9 \n ");
		dbUtil.insertRank("Master Chief Petty Officer of the Navy", "Master Chief Petty Officer of the Navy", 2, 12, "usa/navy/12.png", "Abbrv  : MCPON \n Pay Grade  : E-9 \n ");
		dbUtil.insertRank("Chief Warrant Officer 2", "Chief Warrant Officer 2", 2, 13, "usa/navy/13.png", "Abbrv  : CWO2 \n Pay Grade  : W-2 \n ");
		dbUtil.insertRank("Chief Warrant Officer 3", "Chief Warrant Officer 3", 2, 14, "usa/navy/14.png", "Abbrv  : CWO3 \n Pay Grade  : W-3 \n ");
		dbUtil.insertRank("Chief Warrant Officer 4", "Chief Warrant Officer 4", 2, 15, "usa/navy/15.png", "Abbrv  : CWO4 \n Pay Grade  : W-4 \n ");
		dbUtil.insertRank("Chief Warrant Officer 5", "Chief Warrant Officer 5", 2, 16, "usa/navy/16.png", "Abbrv  : CWO5 \n Pay Grade  : W-5 \n ");
		dbUtil.insertRank("Ensign", "Ensign", 2, 17, "usa/navy/17.png", "Abbrv  : ENS \n Pay Grade  : O-1 \n ");
		dbUtil.insertRank("Lieutenant Junior Grade", "Lieutenant Junior Grade", 2, 18, "usa/navy/18.png", "Abbrv  : LTJG \n Pay Grade  : O-2 \n ");
		dbUtil.insertRank("Lieutenant", "Lieutenant", 2, 19, "usa/navy/19.png", "Abbrv  : LT \n Pay Grade  : O-3 \n ");
		dbUtil.insertRank("Lieutenant Commander", "Lieutenant Commander", 2, 20, "usa/navy/20.png", "Abbrv  : LCDR \n Pay Grade  : O-4 \n ");
		dbUtil.insertRank("Commander", "Commander", 2, 21, "usa/navy/21.png", "Abbrv  : CDR \n Pay Grade  : O-5 \n ");
		dbUtil.insertRank("Captain", "Captain", 2, 22, "usa/navy/22.png", "Abbrv  : CAPT \n Pay Grade  : O-6 \n ");
		dbUtil.insertRank("Rear Admiral (lower half)", "Rear Admiral (lower half)", 2, 23, "usa/navy/23.png", "Abbrv  : RDML \n Pay Grade  : O-7 \n ");
		dbUtil.insertRank("Rear Admiral (upper half)", "Rear Admiral (upper half)", 2, 24, "usa/navy/24.png", "Abbrv  : RADM \n Pay Grade  : O-8 \n ");
		dbUtil.insertRank("Vice Admiral", "Vice Admiral", 2, 25, "usa/navy/25.png", "Abbrv  : VADM \n Pay Grade  : O-9 \n ");
		dbUtil.insertRank("Admiral", "Admiral", 2, 26, "usa/navy/26.png", "Abbrv  : ADM \n Pay Grade  : O-10 \n ");
		dbUtil.insertRank("Fleet Admiral", "Fleet Admiral", 2, 27, "usa/navy/27.png", "Abbrv  : FADM \n Pay Grade  : O-11 \n ");

		
		//USA Air Force
		dbUtil.insertBranch("Air Force", "Air Force", 1, "usa/air_force/logo.gif");

		dbUtil.insertRank("Airman Basic", "Airman Basic", 3, 0, "usa/air_force/0.png", "Abbrv  : AB \n Pay Grade  : E-1 \n "); //NONE
		dbUtil.insertRank("Airman", "Airman", 3, 1, "usa/air_force/1.png", "Abbrv  : Amn \n Pay Grade  : E-2 \n ");
		dbUtil.insertRank("Airman First Class", "Airman First Class", 3, 2, "usa/air_force/2.png", "Abbrv  : A1C \n Pay Grade  : E-3 \n ");
		dbUtil.insertRank("Senior Airman", "Senior Airman", 3, 3, "usa/air_force/3.png", "Abbrv  : SrA \n Pay Grade  : E-4 \n ");
		dbUtil.insertRank("Staff Sergeant", "Staff Sergeant", 3, 4, "usa/air_force/4.png", "Abbrv  : SSgt \n Pay Grade  : E-5 \n ");
		dbUtil.insertRank("Technical Sergeant", "Technical Sergeant", 3, 5, "usa/air_force/5.png", "Abbrv  : TSgt \n Pay Grade  : E-6 \n ");
		dbUtil.insertRank("Master Sergeant", "Master Sergeant", 3, 6, "usa/air_force/6.png", "Abbrv  : MSgt \n Pay Grade  : E-7 \n ");
		dbUtil.insertRank("First Sergeant", "First Sergeant", 3, 7, "usa/air_force/7.png", "Abbrv  : \n Pay Grade  : E-7 \n ");
		dbUtil.insertRank("Senior Master Sergeant", "Senior Master Sergeant", 3, 8, "usa/air_force/8.png", "Abbrv  : SMSgt \n Pay Grade  : E-8 \n ");
		dbUtil.insertRank("First Sergeant", "First Sergeant", 3, 9, "usa/air_force/9.png", "Abbrv  : \n Pay Grade  : E-8 \n ");
		dbUtil.insertRank("Chief Master Sergeant", "Chief Master Sergeant", 3, 10, "usa/air_force/10.png", "Abbrv  : CMSgt \n Pay Grade  : E-9 \n ");
		dbUtil.insertRank("First Sergeant", "First Sergeant", 3, 11, "usa/air_force/11.png", "Abbrv  :  \n Pay Grade  : E-9 \n ");
		dbUtil.insertRank("Command Chief Master Sergeant", "Command Chief Master Sergeant", 3, 12, "usa/air_force/12.png", "Abbrv  : CCM \n Pay Grade  : E-9 \n ");
		dbUtil.insertRank("Chief Master Sergeant of the Air Force", "Chief Master Sergeant of the Air Force", 3, 13, "usa/air_force/13.png", "Abbrv  : CMSAF \n Pay Grade  : E-9 \n ");
		dbUtil.insertRank("Second Lieutenant", "Second Lieutenant", 3, 14, "usa/air_force/14.png", "Abbrv  : 2d Lt \n Pay Grade  : O-1 \n ");
		dbUtil.insertRank("First Lieutenant", "First Lieutenant", 3, 15, "usa/air_force/15.png", "Abbrv  : 1st Lt \n Pay Grade  : O-2 \n ");
		dbUtil.insertRank("Captain", "Captain", 3, 16, "usa/air_force/16.png", "Abbrv  : Capt \n Pay Grade  : O-3 \n ");
		dbUtil.insertRank("Major", "Major", 3, 17, "usa/air_force/17.png", "Abbrv  : Maj \n Pay Grade  : O-4 \n ");
		dbUtil.insertRank("Lieutenant Colonel", "Lieutenant Colonel", 3, 18, "usa/air_force/18.png", "Abbrv  : Lt Col \n Pay Grade  : O-5 \n ");
		dbUtil.insertRank("Colonel", "Colonel", 3, 19, "usa/air_force/19.png", "Abbrv  : Col \n Pay Grade  : O-6 \n ");
		dbUtil.insertRank("Brigadier General", "Brigadier General", 3, 20, "usa/air_force/20.png", "Abbrv  : Brig Gen \n Pay Grade  : O-7 \n ");
		dbUtil.insertRank("Major General", "Major General", 3, 21, "usa/air_force/21.png", "Abbrv  : Maj Gen \n Pay Grade  : O-8 \n ");
		dbUtil.insertRank("Lieutenant General", "Lieutenant General", 3, 22, "usa/air_force/22.png", "Abbrv  : Lt Gen \n Pay Grade  : O-9 \n ");
		dbUtil.insertRank("General Air Force Chief of Staff", "General Air Force Chief of Staff", 3, 23, "usa/air_force/23.png", "Abbrv  : Gen \n Pay Grade  : O-10 \n ");
		dbUtil.insertRank("General of the Air Force", "General of the Air Force", 3, 24, "usa/air_force/24.png", "Abbrv  : GAF \n Pay Grade  : Special \n ");

		//USA Marine
		dbUtil.insertBranch("Marine", "Marine", 1, "usa/marine/logo.png");
		
		dbUtil.insertRank("Private", "Private", 4, 0, "usa/marine/0.png", "Abbrv  : Pvt \n Pay Grade  : E-1 \n "); //NONE
		dbUtil.insertRank("Private First Class", "Private First Class", 4, 1, "usa/marine/1.png", "Abbrv  : PFC \n Pay Grade  : E-2 \n ");
		dbUtil.insertRank("Lance Corporal", "Lance Corporal", 4, 2, "usa/marine/2.png", "Abbrv  : LCpl \n Pay Grade  : E-3 \n ");
		dbUtil.insertRank("Corporal", "Corporalt", 4, 3, "usa/marine/3.png", "Abbrv  : Cpl \n Pay Grade  : E-4 \n ");
		dbUtil.insertRank("Sergeant", "Sergeant", 4, 4, "usa/marine/4.png", "Abbrv  : Sgt \n Pay Grade  : E-5 \n ");
		dbUtil.insertRank("Staff Sergeant", "Staff Sergeant", 4, 5, "usa/marine/5.png", "Abbrv  : SSgt \n Pay Grade  : E-6 \n ");
		dbUtil.insertRank("Gunnery Sergeant", "Gunnery Sergeant", 4, 6, "usa/marine/6.png", "Abbrv  : GySgt \n Pay Grade  : E-7 \n ");
		dbUtil.insertRank("Master Sergeant", "Master Sergeant", 4, 7, "usa/marine/7.png", "Abbrv  : MSgt \n Pay Grade  : E-8 \n ");
		dbUtil.insertRank("First Sergeant", "First Sergeant", 4, 8, "usa/marine/8.png", "Abbrv  : 1stSgt \n Pay Grade  : E-8 \n ");
		dbUtil.insertRank("Master Gunnery Sergeant", "Master Gunnery Sergeant", 4, 9, "usa/marine/9.png", "Abbrv  : MGySgt \n Pay Grade  : E-9 \n ");
		dbUtil.insertRank("Sergeant Major", "Sergeant Major", 4, 10, "usa/marine/10.png", "Abbrv  : SMA \n Pay Grade  : E-9 \n ");
		dbUtil.insertRank("Sergeant Major of the Marine Corps", "Sergeant Major of the Marine Corps", 4, 11, "usa/marine/11.png", "Abbrv  : SMA \n Pay Grade  : E-9 \n ");
		dbUtil.insertRank("Warrant Officer", "Warrant Officer", 4, 13, "usa/marine/13.png", "Abbrv  : W1 \n Pay Grade  : W-1 \n ");
		dbUtil.insertRank("Chief Warrant Officer 2", "Chief Warrant Officer 2", 4, 14, "usa/marine/14.png", "Abbrv  : W2 \n Pay Grade  : W-2 \n ");
		dbUtil.insertRank("Chief Warrant Officer 3", "Chief Warrant Officer 3", 4, 15, "usa/marine/15.png", "Abbrv  : W3 \n Pay Grade  : W-3 \n ");
		dbUtil.insertRank("Chief Warrant Officer 4", "Chief Warrant Officer 4", 4, 16, "usa/marine/16.png", "Abbrv  : W4 \n Pay Grade  : W-4 \n ");
		dbUtil.insertRank("Chief Warrant Officer 5", "Chief Warrant Officer 5", 4, 17, "usa/marine/17.png", "Abbrv  : W5 \n Pay Grade  : W-5 \n ");
		dbUtil.insertRank("Second Lieutenant", "Second Lieutenant", 4, 18, "usa/marine/18.png", "Abbrv  : 2ndLt \n Pay Grade  : O-1 \n ");
		dbUtil.insertRank("First Lieutenant", "First Lieutenant", 4, 19, "usa/marine/19.png", "Abbrv  : 1stLt \n Pay Grade  : O-2 \n ");
		dbUtil.insertRank("Captain", "Captain", 4, 20, "usa/marine/20.png", "Abbrv  : Capt \n Pay Grade  : O-3 \n ");
		dbUtil.insertRank("Major", "Major", 4, 21, "usa/marine/21.png", "Abbrv  : Maj \n Pay Grade  : O-4 \n ");
		dbUtil.insertRank("Lieutenant Colonel", "Lieutenant Colonel", 4, 22, "usa/marine/22.png", "Abbrv  : LtCol \n Pay Grade  : O-5 \n ");
		dbUtil.insertRank("Colonel", "Colonel", 4, 23, "usa/marine/23.png", "Abbrv  : Col \n Pay Grade  : O-6 \n ");
		dbUtil.insertRank("Brigadier General", "Brigadier General", 4, 24, "usa/marine/24.png", "Abbrv  : BGen \n Pay Grade  : O-7 \n ");
		dbUtil.insertRank("Major General", "Major General", 4, 25, "usa/marine/25.png", "Abbrv  : MajGen \n Pay Grade  : O-8 \n ");
		dbUtil.insertRank("Lieutenant General", "Lieutenant General", 4, 26, "usa/marine/26.png", "Abbrv  : LtGen \n Pay Grade  : O-9 \n ");
		dbUtil.insertRank("General", "General", 4, 27, "usa/marine/27.png", "Abbrv  : Gen \n Pay Grade  : O-10 \n ");

		//2 China
		dbUtil.insertCountry("China", "中国", "china/flag.png");
		
		//China Army
		dbUtil.insertBranch("Army", "中国人民解放军", 2, "china/army/logo.png");

		dbUtil.insertRank("Private", "列兵", 5, 1, "china/army/1.png", "NATO rank code equivalent: OR-2");
		dbUtil.insertRank("Private First Class", "上等兵", 5, 2, "china/army/2.png", "NATO rank code equivalent: OR-3");
		dbUtil.insertRank("NCO Class 1", "一级士官", 5, 3, "china/army/3.png", "NATO rank code equivalent: OR-4");
		dbUtil.insertRank("NCO Class 2", "二级士官", 5, 4, "china/army/4.png", "NATO rank code equivalent: OR-5");
		dbUtil.insertRank("NCO Class 3", "三级士官", 5, 5, "china/army/5.png", "NATO rank code equivalent: OR-6");
		dbUtil.insertRank("NCO Class 4", "四级士官", 5, 6, "china/army/6.png", "NATO rank code equivalent: OR-7");
		dbUtil.insertRank("NCO Class 5", "五级士官", 5, 7, "china/army/7.png", "NATO rank code equivalent: OR-8");
		dbUtil.insertRank("NCO Class 6", "六级士官", 5, 8, "china/army/8.png", "NATO rank code equivalent: OR-9");
		dbUtil.insertRank("Second Lieutenant", "少尉", 5, 9, "china/army/9.png", "NATO rank code equivalent: OF-1");
		dbUtil.insertRank("First Lieutenant", "中尉", 5, 10, "china/army/10.png", "NATO rank code equivalent: OF-2");
		dbUtil.insertRank("Captain", "上尉", 5, 11, "china/army/11.png", "NATO rank code equivalent: OF-3");
		dbUtil.insertRank("Major", "少校", 5, 12, "china/army/12.png", "NATO rank code equivalent: OF-4");
		dbUtil.insertRank("Lieutenant Colonel", "中校", 5, 13, "china/army/13.png", "NATO rank code equivalent: OF-5");
		dbUtil.insertRank("Colonel", "上校", 5, 14, "china/army/14.png", "NATO rank code equivalent: OF-6");
		dbUtil.insertRank("Senior Colonel", "大校", 5, 15, "china/army/15.png", "NATO rank code equivalent: OF-7");
		dbUtil.insertRank("Major General", "少将", 5, 16, "china/army/16.png", "NATO rank code equivalent: OF-8");
		dbUtil.insertRank("Lieutenant General", "中将", 5, 17, "china/army/17.png", "NATO rank code equivalent: OF-9");
		dbUtil.insertRank("General", "上将", 5, 18, "china/army/18.png", "NATO rank code equivalent: OF-10");
		
		//China Navy
		dbUtil.insertBranch("Navy", "中国人民解放军海军", 2, "china/navy/logo.png");
		
		dbUtil.insertRank("Navy Officer Cadet", "海军学员", 6, 0, "china/navy/0.png", "NATO rank code equivalent: OF-D");
		dbUtil.insertRank("Sailor", "水兵", 6, 1, "china/navy/1.png", "NATO rank code equivalent: OR-2");
		dbUtil.insertRank("Sailor First Class", "海军上等兵", 6, 2, "china/navy/2.png", "NATO rank code equivalent: OR-3");
		dbUtil.insertRank("Naval NCO Class 1", "海军一级士官", 6, 3, "china/navy/3.png", "NATO rank code equivalent: OR-4");
		dbUtil.insertRank("Naval NCO Class 2", "海军海军二级士官", 6, 4, "china/navy/4.png", "NATO rank code equivalent: OR-5");
		dbUtil.insertRank("Naval NCO Class 3", "海军三级士官", 6, 5, "china/navy/5.png", "NATO rank code equivalent: OR-6");
		dbUtil.insertRank("Naval NCO Class 4", "海军四级士官", 6, 6, "china/navy/6.png", "NATO rank code equivalent: OR-7");
		dbUtil.insertRank("Naval NCO Class 5", "海军五级士官", 6, 7, "china/navy/7.png", "NATO rank code equivalent: OR-8");
		dbUtil.insertRank("Naval NCO Class 6", "海军六级士官", 6, 8, "china/navy/8.png", "NATO rank code equivalent: OR-9");
		dbUtil.insertRank("Junior Lieutenant", "海军少尉", 6, 9, "china/navy/9.png", "NATO rank code equivalent: OF-1");
		dbUtil.insertRank("Lieutenant", "海军中尉", 6, 10, "china/navy/10.png", "NATO rank code equivalent: OF-1");
		dbUtil.insertRank("Senior Lieutenant", "海军上尉", 6, 11, "china/navy/11.png", "NATO rank code equivalent: OF-2");
		dbUtil.insertRank("Lieutenant Commander", "海军少校", 6, 12, "china/navy/12.png", "NATO rank code equivalent: OF-3");
		dbUtil.insertRank("Commander", "海军中校", 6, 13, "china/navy/13.png", "NATO rank code equivalent: OF-4");
		dbUtil.insertRank("Captain", "海军上校", 6, 14, "china/navy/14.png", "NATO rank code equivalent: OF-5");
		dbUtil.insertRank("Commodore", "海军大校", 6, 15, "china/navy/15.png", "NATO rank code equivalent: OF-6");
		dbUtil.insertRank("Rear Admiral", "海军少将", 6, 16, "china/navy/16.png", "NATO rank code equivalent: OF-7");
		dbUtil.insertRank("Vice Admiral", "海军中将", 6, 17, "china/navy/17.png", "NATO rank code equivalent: OF-8");
		dbUtil.insertRank("Admiral", "海军上将", 6, 18, "china/navy/18.png", "NATO rank code equivalent: OF-9");
		
		//China Air Force
		dbUtil.insertBranch("Air Force", "中国人民解放军空军", 2, "china/air_force/logo.png");
		
		dbUtil.insertRank("Air Force Officer Cadet", "空军学员", 7, 0, "china/air_force/0.png", "NATO rank code equivalent: OF-D");
		dbUtil.insertRank("Airman", "空军列兵", 7, 1, "china/air_force/1.png", "NATO rank code equivalent: OR-2");
		dbUtil.insertRank("Airman First Class", "空军上等兵", 7, 2, "china/air_force/2.png", "NATO rank code equivalent: OR-3");
		dbUtil.insertRank("Air NCO Class 1", "空军一级士官", 7, 3, "china/air_force/3.png", "NATO rank code equivalent: OR-4");
		dbUtil.insertRank("Air NCO Class 2", "空军空军二级士官", 7, 4, "china/air_force/4.png", "NATO rank code equivalent: OR-5");
		dbUtil.insertRank("Air NCO Class 3", "空军三级士官", 7, 5, "china/air_force/5.png", "NATO rank code equivalent: OR-6");
		dbUtil.insertRank("Air NCO Class 4", "空军四级士官", 7, 6, "china/air_force/6.png", "NATO rank code equivalent: OR-7");
		dbUtil.insertRank("Air NCO Class 5", "空军五级士官", 7, 7, "china/air_force/7.png", "NATO rank code equivalent: OR-8");
		dbUtil.insertRank("Air NCO Class 6", "空军六级士官", 7, 8, "china/air_force/8.png", "NATO rank code equivalent: OR-9");
		dbUtil.insertRank("Air Force Junior Lieutenant", "空军少尉", 7, 9, "china/air_force/9.png", "NATO rank code equivalent: OF-1");
		dbUtil.insertRank("Air Force First Lieutenant", "空军中尉", 7, 10, "china/air_force/10.png", "NATO rank code equivalent: OF-1");
		dbUtil.insertRank("Air Force Captain", "空军上尉", 7, 11, "china/air_force/11.png", "NATO rank code equivalent: OF-2");
		dbUtil.insertRank("Air Force Major", "空军少校", 7, 12, "china/air_force/12.png", "NATO rank code equivalent: OF-3");
		dbUtil.insertRank("Air Force Lieutenant Colonel", "空军中校", 7, 13, "china/air_force/13.png", "NATO rank code equivalent: OF-4");
		dbUtil.insertRank("Air Force Colonel", "空军上校", 7, 14, "china/air_force/14.png", "NATO rank code equivalent: OF-5");
		dbUtil.insertRank("Air Force Senior Colonel", "空军大校", 7, 15, "china/air_force/15.png", "NATO rank code equivalent: OF-6");
		dbUtil.insertRank("Air Force Major General", "空军少将", 7, 16, "china/air_force/16.png", "NATO rank code equivalent: OF-7");
		dbUtil.insertRank("Air Force Lieutenant General", "空军中将", 7, 17, "china/air_force/17.png", "NATO rank code equivalent: OF-8");
		dbUtil.insertRank("Air Force Colonel General", "空军上将", 7, 18, "china/air_force/18.png", "NATO rank code equivalent: OF-9");
		
		//China Armed Police
		dbUtil.insertBranch("Armed Police", "武装警察部队", 2, "china/armed_police/logo.png");
		
		dbUtil.insertRank("Officer Cadet", "学员", 8, 0, "china/armed_police/0.png", "");
		dbUtil.insertRank("Private", "列兵", 8, 1, "china/armed_police/1.png", "");
		dbUtil.insertRank("Private First Class", "上等兵", 8, 2, "china/armed_police/2.png", "");
		dbUtil.insertRank("NCO Class 1", "一级士官", 8, 3, "china/armed_police/3.png", "");
		dbUtil.insertRank("NCO Class 2", "二级士官", 8, 4, "china/armed_police/4.png", "");
		dbUtil.insertRank("NCO Class 3", "三级士官", 8, 5, "china/armed_police/5.png", "");
		dbUtil.insertRank("NCO Class 4", "四级士官", 8, 6, "china/armed_police/6.png", "");
		dbUtil.insertRank("NCO Class 5", "五级士官", 8, 7, "china/armed_police/7.png", "");
		dbUtil.insertRank("NCO Class 6", "六级士官", 8, 8, "china/armed_police/8.png", "");
		dbUtil.insertRank("Second Lieutenant", "少尉", 8, 9, "china/armed_police/9.png", "");
		dbUtil.insertRank("Lieutenant", "中尉", 8, 10, "china/armed_police/10.png", "");
		dbUtil.insertRank("Captain", "上尉", 8, 11, "china/armed_police/11.png", "");
		dbUtil.insertRank("Major", "少校", 8, 12, "china/armed_police/12.png", "");
		dbUtil.insertRank("Lieutenant Colonel", "中校", 8, 13, "china/armed_police/13.png", "");
		dbUtil.insertRank("Colonel", "上校", 8, 14, "china/armed_police/14.png", "");
		dbUtil.insertRank("Senior Colonel", "大校", 8, 15, "china/armed_police/15.png", "");
		dbUtil.insertRank("Major General", "少将", 8, 16, "china/armed_police/16.png", "");
		dbUtil.insertRank("Lieutenant General", "中将", 8, 17, "china/armed_police/17.png", "");
		dbUtil.insertRank("General", "上将", 8, 18, "china/armed_police/18.png", "");

		//3 Russia
		dbUtil.insertCountry("Russia", "Россия", "russia/flag.png");

		//Russia Army
		dbUtil.insertBranch("Ground Forces", "Сухопутные войска", 3, "russia/army/logo.png");

		dbUtil.insertRank("Private", "рядово́й", 9, 1, "russia/army/1.png", "NATO rank code equivalent: OR-1/OR-2");
		dbUtil.insertRank("Efreitor", "ефре́йтор", 9, 2, "russia/army/2.png", "NATO rank code equivalent: OR-3");
		dbUtil.insertRank("Junior Sergeant", "мла́дший сержа́нт", 9, 3, "russia/army/3.png", "NATO rank code equivalent: OR-4");
		dbUtil.insertRank("Sergeant", "сержа́нт", 9, 4, "russia/army/4.png", "NATO rank code equivalent: OR-5");
		dbUtil.insertRank("Senior Sergeant", "ста́рший сержа́нт", 9, 5, "russia/army/5.png", "NATO rank code equivalent: OR-6");
		dbUtil.insertRank("Starshina", "старшина́", 9, 6, "russia/army/6.png", "NATO rank code equivalent: OR-7");
		dbUtil.insertRank("Praporshchik", "пра́порщик", 9, 7, "russia/army/7.png", "NATO rank code equivalent: OR-8/WO-1");
		dbUtil.insertRank("Senior Praporshchik", "ста́рший пра́порщик", 9, 8, "russia/army/8.png", "NATO rank code equivalent: OR-9/WO-2");
		dbUtil.insertRank("Junior Lieutenant", "мла́дший лейтена́нт", 9, 9, "russia/army/9.png", "NATO rank code equivalent: OF-1");
		dbUtil.insertRank("Lieutenant", "лейтена́нт", 9, 10, "russia/army/10.png", "NATO rank code equivalent: OF-1");
		dbUtil.insertRank("Senior Lieutenant", "ста́рший лейтена́нт", 9, 11, "russia/army/11.png", "NATO rank code equivalent: OF-2");
		dbUtil.insertRank("Captain", "капита́н", 9, 12, "russia/army/12.png", "NATO rank code equivalent: OF-2");
		dbUtil.insertRank("Major", "майо́р", 9, 13, "russia/army/13.png", "NATO rank code equivalent: OF-3");
		dbUtil.insertRank("Podpolkovnik", "подполко́вник", 9, 14, "russia/army/14.png", "NATO rank code equivalent: OF-4");
		dbUtil.insertRank("Polkovnik", "полко́вник", 9, 15, "russia/army/15.png", "NATO rank code equivalent: OF-5/OF-6");
		dbUtil.insertRank("General-Major", "генера́л-майо́р", 9, 16, "russia/army/16.png", "NATO rank code equivalent: OF-6/OF-7");
		dbUtil.insertRank("General-Lieutenant", "генера́л-лейтена́нт", 9, 17, "russia/army/17.png", "NATO rank code equivalent: OF-7/OF-8");
		dbUtil.insertRank("General-Colonel", "генера́л-полко́вник", 9, 18, "russia/army/18.png", "NATO rank code equivalent: OF-8/OF-9");
		dbUtil.insertRank("General of the Army", "генера́л а́рмии", 9, 19, "russia/army/19.png", "NATO rank code equivalent: OF-9/OF-10");
		dbUtil.insertRank("Marshal of the Russian Federation", "Ма́ршал Росси́йской Федера́ции", 9, 20, "russia/army/20.png", "NATO rank code equivalent: OF-10\n(Honorary) \n Currently inactive");
		
		//Russia Navy
		dbUtil.insertBranch("Ground Forces", "Сухопутные войска", 3, "russia/navy/logo.png");

		dbUtil.insertRank("Seaman", "матро́с", 10, 1, "russia/navy/1.png", "NATO rank code equivalent: OR-1/OR-2");
		dbUtil.insertRank("Senior Seaman", "ста́рший матро́с", 10, 2, "russia/navy/2.png", "NATO rank code equivalent: OR-3");
		dbUtil.insertRank("Starshina, 2nd class", "старшина́ 2-й статьи́", 10, 3, "russia/navy/3.png", "NATO rank code equivalent: OR-4");
		dbUtil.insertRank("Starshina, 1st class", "старшина́ 1-й статьи́", 10, 4, "russia/navy/4.png", "NATO rank code equivalent: OR-5");
		dbUtil.insertRank("Chief Starshina", "гла́вный старшина́", 10, 5, "russia/navy/5.png", "NATO rank code equivalent: OR-6");
		dbUtil.insertRank("Chief Ship Starshina", "гла́вный корабе́льный старшина́", 10, 6, "russia/navy/6.png", "NATO rank code equivalent: OR-7");
		dbUtil.insertRank("Midshipman", "ми́чман", 10, 7, "russia/navy/7.png", "NATO rank code equivalent: OR-8/WO-1");
		dbUtil.insertRank("Senior Midshipman", "ста́рший ми́чман", 10, 8, "russia/navy/8.png", "NATO rank code equivalent: OR-9/WO-2");
		dbUtil.insertRank("Junior Lieutenant", "мла́дший лейтена́нт", 10, 9, "russia/navy/9.png", "NATO rank code equivalent: OF-1");
		dbUtil.insertRank("Lieutenant", "лейтена́нт", 10, 10, "russia/navy/10.png", "NATO rank code equivalent: OF-1");
		dbUtil.insertRank("Senior Lieutenant", "ста́рший лейтена́нт", 10, 11, "russia/navy/11.png", "NATO rank code equivalent: OF-2");
		dbUtil.insertRank("Captain-Lieutenant", "капита́н-лейтена́нт", 10, 12, "russia/navy/12.png", "NATO rank code equivalent: OF-2");
		dbUtil.insertRank("Captain, 3rd rank", "капита́н 3-го р́анга", 10, 13, "russia/navy/13.png", "NATO rank code equivalent: OF-3");
		dbUtil.insertRank("Captain, 2nd rank", "капита́н 2-го р́анга", 10, 14, "russia/navy/14.png", "NATO rank code equivalent: OF-4");
		dbUtil.insertRank("Captain, 1st rank", "капита́н 1-го ра́нга", 10, 15, "russia/navy/15.png", "NATO rank code equivalent: OF-5/OF-6");
		dbUtil.insertRank("Counter Admiral", "ко́нтр-адмира́л", 10, 16, "russia/navy/16.png", "NATO rank code equivalent: OF-6/OF-7");
		dbUtil.insertRank("Vice Admiral", "ви́це-адмира́л", 10, 17, "russia/navy/17.png", "NATO rank code equivalent: OF-7/OF-8");
		dbUtil.insertRank("Admiral", "адмира́л", 10, 18, "russia/navy/18.png", "NATO rank code equivalent: OF-8/OF-9");
		dbUtil.insertRank("Admiral of the Fleet", "адмира́л фло́та", 10, 19, "russia/navy/19.png", "NATO rank code equivalent: OF-9/OF-10");


		//Russia Air Force
		dbUtil.insertBranch("Air Force", "Военно-воздушные cилы России", 3, "russia/air_force/logo.png");

		dbUtil.insertRank("Private", "рядово́й", 11, 1, "russia/air_force/1.png", "NATO rank code equivalent: OR-1/OR-2");
		dbUtil.insertRank("Efreitor", "ефре́йтор", 11, 2, "russia/air_force/2.png", "NATO rank code equivalent: OR-3");
		dbUtil.insertRank("Junior Sergeant", "мла́дший сержа́нт", 11, 3, "russia/air_force/3.png", "NATO rank code equivalent: OR-4");
		dbUtil.insertRank("Sergeant", "сержа́нт", 11, 4, "russia/air_force/4.png", "NATO rank code equivalent: OR-5");
		dbUtil.insertRank("Senior Sergeant", "ста́рший сержа́нт", 11, 5, "russia/air_force/5.png", "NATO rank code equivalent: OR-6");
		dbUtil.insertRank("Starshina", "старшина́", 11, 6, "russia/air_force/6.png", "NATO rank code equivalent: OR-7");
		dbUtil.insertRank("Praporshchik", "пра́порщик", 11, 7, "russia/air_force/7.png", "NATO rank code equivalent: OR-8/WO-1");
		dbUtil.insertRank("Senior Praporshchik", "ста́рший пра́порщик", 11, 8, "russia/air_force/8.png", "NATO rank code equivalent: OR-9/WO-2");
		dbUtil.insertRank("Junior Lieutenant", "мла́дший лейтена́нт", 11, 9, "russia/air_force/9.png", "NATO rank code equivalent: OF-1");
		dbUtil.insertRank("Lieutenant", "лейтена́нт", 11, 10, "russia/air_force/10.png", "NATO rank code equivalent: OF-1");
		dbUtil.insertRank("Senior Lieutenant", "ста́рший лейтена́нт", 11, 11, "russia/air_force/11.png", "NATO rank code equivalent: OF-2");
		dbUtil.insertRank("Captain", "капита́н", 11, 12, "russia/air_force/12.png", "NATO rank code equivalent: OF-2");
		dbUtil.insertRank("Major", "майо́р", 11, 13, "russia/air_force/13.png", "NATO rank code equivalent: OF-3");
		dbUtil.insertRank("Podpolkovnik", "подполко́вник", 11, 14, "russia/air_force/14.png", "NATO rank code equivalent: OF-4");
		dbUtil.insertRank("Polkovnik", "полко́вник", 11, 15, "russia/air_force/15.png", "NATO rank code equivalent: OF-5/OF-6");
		dbUtil.insertRank("General-Major", "генера́л-майо́р", 11, 16, "russia/air_force/16.png", "NATO rank code equivalent: OF-6/OF-7");
		dbUtil.insertRank("General-Lieutenant", "генера́л-лейтена́нт", 11, 17, "russia/air_force/17.png", "NATO rank code equivalent: OF-7/OF-8");
		dbUtil.insertRank("General-Colonel", "генера́л-полко́вник", 11, 18, "russia/air_force/18.png", "NATO rank code equivalent: OF-8/OF-9");
		dbUtil.insertRank("General of the Army", "генера́л а́рмии", 11, 19, "russia/air_force/19.png", "NATO rank code equivalent: OF-9/OF-10");

		//4 United Kingdom
		dbUtil.insertCountry("United Kingdom", "United Kingdom", "united_kingdom/flag.png");
		
		//United Kingdom Army
		dbUtil.insertBranch("British Army", "British Army", 4, "united_kingdom/army/logo.png");

		dbUtil.insertRank("Private", "Private", 12, 0, "united_kingdom/army/0.png", "NATO rank code: OR-1");  //NONE
		dbUtil.insertRank("Lance Corporal", "Lance Corporal", 12, 1, "united_kingdom/army/1.png", "NATO rank code: OR-3");
		dbUtil.insertRank("Corporal", "Corporal", 12, 2, "united_kingdom/army/2.png", "NATO rank code: OR-4");
		dbUtil.insertRank("Sergeant", "Sergeant", 12, 3, "united_kingdom/army/3.png", "NATO rank code: OR-6");
		dbUtil.insertRank("Staff Sergeant", "Staff Sergeant", 12, 4, "united_kingdom/army/4.png", "NATO rank code: OR-7");
		dbUtil.insertRank("Warrant Officer Class Two", "Warrant Officer Class Two", 12, 5, "united_kingdom/army/5.png", "NATO rank code: OR-8");
		dbUtil.insertRank("Warrant Officer Class Two", "Warrant Officer Class Two", 12, 6, "united_kingdom/army/6.png", "NATO rank code: OR-8");
		dbUtil.insertRank("Warrant Officer Class One", "Warrant Officer Class One", 12, 7, "united_kingdom/army/7.png", "NATO rank code: OR-9");
		dbUtil.insertRank("Warrant Officer Class One(Conductor)", "Warrant Officer Class One(Conductor)", 12, 8, "united_kingdom/army/8.png", "NATO rank code: OR-9");
		dbUtil.insertRank("Second Lieutenant", "Second Lieutenant", 12, 9, "united_kingdom/army/9.png", "NATO rank code: OF-1");
		dbUtil.insertRank("Lieutenant", "Lieutenant", 12, 10, "united_kingdom/army/10.png", "NATO rank code:  OF-1");
		dbUtil.insertRank("Captain", "Captain", 12, 11, "united_kingdom/army/11.png", "NATO rank code: OF-2");
		dbUtil.insertRank("Major", "Major", 12, 12, "united_kingdom/army/12.png", "NATO rank code: OF-3");
		dbUtil.insertRank("Lieutenant Colonel", "Lieutenant Colonel", 12, 13, "united_kingdom/army/13.png", "NATO rank code: OF-4");
		dbUtil.insertRank("Colonel", "Colonel", 12, 14, "united_kingdom/army/14.png", "NATO rank code: OF-5");
		dbUtil.insertRank("Brigadier", "Brigadier", 12, 15, "united_kingdom/army/15.png", "NATO rank code: OF-6");
		dbUtil.insertRank("Major General", "Major General", 12, 16, "united_kingdom/army/16.png", "NATO rank code: OF-7");
		dbUtil.insertRank("Lieutenant General", "Lieutenant General", 12, 17, "united_kingdom/army/17.png", "NATO rank code: OF-8");
		dbUtil.insertRank("General", "General", 12, 18, "united_kingdom/army/18.png", "NATO rank code: OF-9");
		dbUtil.insertRank("Field Marshal", "Field Marshal", 12, 19, "united_kingdom/army/19.png", "NATO rank code: OF-10");
	

		//United Kingdom Navy
		dbUtil.insertBranch("Royal Navy", "Royal Navy", 4, "united_kingdom/navy/logo.png");

		dbUtil.insertRank("Ordinary Seaman", "Ordinary Seaman", 13, 1, "united_kingdom/navy/1.png", "NATO rank code: OR-2");
		dbUtil.insertRank("Leading Rate", "Leading Rate", 13, 2, "united_kingdom/navy/2.png", "NATO rank code: OR-4");
		dbUtil.insertRank("Petty Officer", "Petty Officer", 13, 3, "united_kingdom/navy/3.png", "NATO rank code: OR-6");
		dbUtil.insertRank("Chief Petty Officer", "Chief Petty Officer", 13, 4, "united_kingdom/navy/4.png", "NATO rank code: OR-7");
		dbUtil.insertRank("Warrant Officer Class Two", "Warrant Officer Class Two", 13, 5, "united_kingdom/navy/5.png", "NATO rank code: OR-8");
		dbUtil.insertRank("Warrant Officer Class One", "Warrant Officer Class One", 13, 6, "united_kingdom/navy/6.png", "NATO rank code: OR-9");
		dbUtil.insertRank("Midshipman", "Midshipman", 13, 7, "united_kingdom/navy/7.png", "NATO rank code: OF-D");
		dbUtil.insertRank("Sub-Lieutenant", "Sub-Lieutenant", 13, 8, "united_kingdom/navy/8.png", "NATO rank code: OF-1");
		dbUtil.insertRank("Lieutenant", "Lieutenant", 13, 9, "united_kingdom/navy/9.png", "NATO rank code: OF-2");
		dbUtil.insertRank("Lieutenant-Commander", "Lieutenant-Commander", 13, 10, "united_kingdom/navy/10.png", "NATO rank code:  OF-3");
		dbUtil.insertRank("Commander", "Commander", 13, 11, "united_kingdom/navy/11.png", "NATO rank code: OF-4");
		dbUtil.insertRank("Captain", "Captain", 13, 12, "united_kingdom/navy/12.png", "NATO rank code: OF-5");
		dbUtil.insertRank("Commodore", "Commodore", 13, 13, "united_kingdom/navy/13.png", "NATO rank code: OF-6");
		dbUtil.insertRank("Rear Admiral", "Rear Admiral", 13, 14, "united_kingdom/navy/14.png", "NATO rank code: OF-7");
		dbUtil.insertRank("Vice Admiral", "Vice Admiral", 13, 15, "united_kingdom/navy/15.png", "NATO rank code: OF-8");
		dbUtil.insertRank("Admiral", "Admiral", 13, 16, "united_kingdom/navy/16.png", "NATO rank code: OF-9");
		dbUtil.insertRank("Admiral of the Fleet", "Admiral of the Fleet", 13, 17, "united_kingdom/navy/17.png", "NATO rank code: OF-10");

		//United Kingdom Air Force
		dbUtil.insertBranch("Royal Air Force", "Royal Air Force", 4, "united_kingdom/air_force/logo.png");
		
		dbUtil.insertRank("Aircraftman", "Aircraftman", 14, 0, "united_kingdom/air_force/0.png", "NATO rank code: OR-1");  //NONE
		dbUtil.insertRank("Leading Aircraftman", "Leading Aircraftman", 14, 1, "united_kingdom/air_force/1.png", "NATO rank code: OR-2");
		dbUtil.insertRank("Senior Aircraftman", "Senior Aircraftman", 14, 2, "united_kingdom/air_force/2.png", "NATO rank code: OR-2");
		dbUtil.insertRank("Senior Aircraftman Technician", "Senior Aircraftman Technician", 14, 3, "united_kingdom/air_force/3.png", "NATO rank code: OR-2");
		dbUtil.insertRank("Lance Corporal", "Lance Corporal", 14, 4, "united_kingdom/air_force/4.png", "NATO rank code: OR-3");
		dbUtil.insertRank("Corporal", "Corporal", 14, 5, "united_kingdom/air_force/5.png", "NATO rank code: OR-4");
		dbUtil.insertRank("Sergeant", "Sergeant", 14, 6, "united_kingdom/air_force/6.png", "NATO rank code: OR-5");
		dbUtil.insertRank("Sergeant Aircrew", "Sergeant Aircrew", 14, 7, "united_kingdom/air_force/7.png", "NATO rank code: OR-6");
		dbUtil.insertRank("Chief Technician", "Chief Technician", 14, 8, "united_kingdom/air_force/8.png", "NATO rank code: OR-7");
		dbUtil.insertRank("Flight Sergeant", "Flight Sergeant", 14, 9, "united_kingdom/air_force/9.png", "NATO rank code: OR-7");
		dbUtil.insertRank("Flight Sergeant Aircrew", "Flight Sergeant Aircrew", 14, 10, "united_kingdom/air_force/10.png", "NATO rank code: OR-7");
		dbUtil.insertRank("Master Aircrew", "Master Aircrew", 14, 11, "united_kingdom/air_force/11.png", "NATO rank code: OR-9");
		dbUtil.insertRank("Warrant Officer", "Warrant Officer", 14, 12, "united_kingdom/air_force/12.png", "NATO rank code: OR-9");
		dbUtil.insertRank("Pilot Officer", "Pilot Officer", 14, 13, "united_kingdom/air_force/13.png", "NATO rank code: OF-1");
		dbUtil.insertRank("Flying Officer", "Flying Officer", 14, 14, "united_kingdom/air_force/14.png", "NATO rank code: OF-1");
		dbUtil.insertRank("Flight Lieutenant", "Flight Lieutenant", 14, 15, "united_kingdom/air_force/15.png", "NATO rank code: OF-2");
		dbUtil.insertRank("Squadron Leader", "Squadron Leader", 14, 16, "united_kingdom/air_force/16.png", "NATO rank code: OF-3");
		dbUtil.insertRank("Wing Commander", "Wing Commander", 14, 17, "united_kingdom/air_force/17.png", "NATO rank code: OF-4");
		dbUtil.insertRank("Group Captain", "Group Captain", 14, 18, "united_kingdom/air_force/18.png", "NATO rank code: OF-5");
		dbUtil.insertRank("Air Commodore", "Air Commodore", 14, 19, "united_kingdom/air_force/19.png", "NATO rank code: OF-6");
		dbUtil.insertRank("Air Vice-Marshal", "Air Vice-Marshal", 14, 20, "united_kingdom/air_force/20.png", "NATO rank code: OF-7");
		dbUtil.insertRank("Air Marshal", "Air Marshal", 14, 21, "united_kingdom/air_force/21.png", "NATO rank code: OF-8");
		dbUtil.insertRank("Air Chief Marshal", "Air Chief Marshal", 14, 22, "united_kingdom/air_force/22.png", "NATO rank code: OF-9");
		dbUtil.insertRank("Marshal of the Royal Air Force", "Marshal of the Royal Air Force", 14, 23, "united_kingdom/air_force/23.png", "NATO rank code: OF-10");
		
		//5 France
		dbUtil.insertCountry("France", "République française", "france/flag.png");

		//France Army
		dbUtil.insertBranch("Army", "Armée de Terre", 5, "france/army/logo.png");

		dbUtil.insertRank("Private", "Soldat", 15, 0, "france/army/0.png", "NATO rank code: OR-1");  //NONE
		dbUtil.insertRank("Private 1st Class", "Soldat 1e classe", 15, 1, "france/army/1.png", "NATO rank code: OR-2");
		dbUtil.insertRank("Lance Corporal", "Caporal", 15, 2, "france/army/2.png", "NATO rank code: OR-3");
		dbUtil.insertRank("Corporal", "Caporal-chef", 15, 3, "france/army/3.png", "NATO rank code: OR-4");
		dbUtil.insertRank("Sergeant", "Élève sous-officier", 15, 4, "france/army/4.png", "NATO rank code: OR-5");
		dbUtil.insertRank("Sergeant", "Sergent", 15, 5, "france/army/5.png", "NATO rank code: OR-5");
		dbUtil.insertRank("Sergeant Major", "Sergent-chef", 15, 6, "france/army/6.png", "NATO rank code: OR-6");
		dbUtil.insertRank("Warrant Officer II", "Adjudant", 15, 7, "france/army/7.png", "NATO rank code: OR-8");
		dbUtil.insertRank("Warrant Officer I", "Adjudant-Chef", 15, 8, "france/army/8.png", "NATO rank code: OR-9");
		dbUtil.insertRank("Chief Warrant Officer", "Major", 15, 9, "france/army/9.png", "NATO rank code: OR-9");
		dbUtil.insertRank("Officer Candidate", "Aspirant", 15, 10, "france/army/10.png", "NATO rank code: OF-D");
		dbUtil.insertRank("Lieutenant", "Sous-Lieutenant", 15, 11, "france/army/11.png", "NATO rank code: OF-1");
		dbUtil.insertRank("1st Lieutenant", "Lieutenant", 15, 12, "france/army/12.png", "NATO rank code: OF-1");
		dbUtil.insertRank("Captain", "Capitaine", 15, 13, "france/army/13.png", "NATO rank code: OF-2");
		dbUtil.insertRank("Major", "Commandant", 15, 14, "france/army/14.png", "NATO rank code: OF-3");
		dbUtil.insertRank("Lieutenant Colonel", "Lieutenant-Colonel", 15, 15, "france/army/15.png", "NATO rank code: OF-4");
		dbUtil.insertRank("Colonel", "Colonel", 15, 16, "france/army/16.png", "NATO rank code: OF-5");
		dbUtil.insertRank("Brigadier General", "Général de brigade", 15, 17, "france/army/17.png", "NATO rank code: OF-6");
		dbUtil.insertRank("Major General", "Général de division	", 15, 18, "france/army/18.png", "NATO rank code: OF-7");
		dbUtil.insertRank("Lieutenant General", "Général de corps d'armée", 15, 19, "france/army/19.png", "NATO rank code: OF-8");
		dbUtil.insertRank("General", "Général d'armée", 15, 20, "france/army/20.png", "NATO rank code: OF-9");
		dbUtil.insertRank("Marshal of France", "Maréchal de France", 15, 21, "france/army/21.png", "NATO rank code: OF-10");
	

		//France Navy
		dbUtil.insertBranch("Navy", "Marine Nationale", 5, "france/navy/logo.png");

		dbUtil.insertRank("Sailor", "Matelot", 16, 0, "france/navy/0.png", "NATO rank code: OR-1");
		dbUtil.insertRank("Diplomed sailor", "Matelot breveté", 16, 1, "france/navy/1.png", "NATO rank code: OR-2");
		dbUtil.insertRank("Quarter-master second class", "Quartier-maître de 2ème classe", 16, 2, "france/navy/2.png", "NATO rank code: OR-3");
		dbUtil.insertRank("Quarter-master first class", "Quartier-maître de 1ère classe", 16, 3, "france/navy/3.png", "NATO rank code: OR-4");
		dbUtil.insertRank("Second master", "Second-maître", 16, 4, "france/navy/4.png", "NATO rank code: OR-5");
		dbUtil.insertRank("Master", "Maître", 16, 5, "france/navy/5.png", "NATO rank code: OR-6");
		dbUtil.insertRank("First master", "Premier-maître", 16, 6, "france/navy/6.png", "NATO rank code: OR-8");
		dbUtil.insertRank("Principal master", "Maître-principal", 16, 7, "france/navy/7.png", "NATO rank code: OR-9");
		dbUtil.insertRank("Major", "Major", 16, 8, "france/navy/8.png", "NATO rank code: OR-9");
		dbUtil.insertRank("Midshipman", "Aspirant", 16, 9, "france/navy/9.png", "NATO rank code: OF-D");
		dbUtil.insertRank("Ensign second class", "Enseigne de vaisseau de deuxième classe", 16, 10, "france/navy/10.png", "NATO rank code: OF-1");
		dbUtil.insertRank("Ensign first class", "Enseigne de vaisseau de première classew", 16, 11, "france/navy/11.png", "NATO rank code: OF-1");
		dbUtil.insertRank("Ship-of-the-Line Lieutenant", "Lieutenant de vaisseau", 16, 12, "france/navy/12.png", "NATO rank code: OF-2");
		dbUtil.insertRank("Corvette Captain", "Capitaine de corvette", 16, 13, "france/navy/13.png", "NATO rank code: OF-3");
		dbUtil.insertRank("Frigate Captain", "Capitaine de frégate", 16, 14, "france/navy/14.png", "NATO rank code: OF-4");
		dbUtil.insertRank("Ship-of-the-Line Captain", "Capitaine de vaisseau", 16, 15, "france/navy/15.png", "NATO rank code: OF-5");
		dbUtil.insertRank("Counter-Admiral", "Contre-Amiral", 16, 16, "france/navy/16.png", "NATO rank code: OF-6");
		dbUtil.insertRank("Vice-Admiral", "Vice-Amiral", 16, 17, "france/navy/17.png", "NATO rank code: OF-7");
		dbUtil.insertRank("Squadron Vice-Admiral", "Vice-Amiral d'escadre", 16, 18, "france/navy/18.png", "NATO rank code: OF-8");
		dbUtil.insertRank("Admiral", "Amiral", 16, 19, "france/navy/19.png", "NATO rank code: OF-9");
		

		//France Air Force
		dbUtil.insertBranch("Air Force", "Armée de l'Air", 5, "france/air_force/logo.png");
		
		dbUtil.insertRank("Airman", "Aviateur de deuxième classe", 17, 1, "france/air_force/1.png", "");
		dbUtil.insertRank("Airman 1st Class", "Aviateur de première classe", 17, 2, "france/air_force/2.png", "");
		dbUtil.insertRank("Senior Airman", "Caporal", 17, 3, "france/air_force/3.png", "");
		dbUtil.insertRank("Staff Sergeant", "Caporal-chef", 17, 4, "france/air_force/4.png", "");
		dbUtil.insertRank("Technical Sergeant", "Sergent P.D.L", 17, 5, "france/air_force/5.png", "");
		dbUtil.insertRank("Master Sergeant", "Sergent A.D.L", 17, 6, "france/air_force/6.png", "");
		dbUtil.insertRank("Chief Master Sergeant", "Sergent-chef", 17, 7, "france/air_force/7.png", "");
		dbUtil.insertRank("Junior Warrant Officer", "Adjudant", 17, 8, "france/air_force/8.png", "");
		dbUtil.insertRank("Warrant Officer", "Adjudant-Chef", 17, 9, "france/air_force/9.png", "");
		dbUtil.insertRank("Chief Warrant Officer", "Major", 17, 10, "france/air_force/10.png", "");
		dbUtil.insertRank("Officer Candidate", "Aspirant", 17, 11, "france/air_force/11.png", "NATO rank code: OF-D");
		dbUtil.insertRank("2nd Lieutenant", "Sous-Lieutenant", 17, 12, "france/air_force/12.png", "NATO rank code: OF-1");
		dbUtil.insertRank("1st Lieutenant", "Lieutenant", 17, 13, "france/air_force/13.png", "NATO rank code: OF-1");
		dbUtil.insertRank("Captain", "Capitaine", 17, 14, "france/air_force/14.png", "NATO rank code: OF-2");
		dbUtil.insertRank("Major", "Commandant", 17, 15, "france/air_force/15.png", "NATO rank code: OF-3");
		dbUtil.insertRank("Lieutenant Colonel", "Lieutenant-Colonel", 17, 16, "france/air_force/16.png", "NATO rank code: OF-4");
		dbUtil.insertRank("Colonel", "Colonel", 17, 17, "france/air_force/17.png", "NATO rank code: OF-5");
		dbUtil.insertRank("Brigadier General", "Général de brigade aérienne", 17, 18, "france/air_force/18.png", "NATO rank code: OF-6");
		dbUtil.insertRank("Major General", "Général de division aérienne", 17, 19, "france/air_force/19.png", "NATO rank code: OF-7");
		dbUtil.insertRank("Lieutenant General", "Général de corps aérien", 17, 20, "france/air_force/20.png", "NATO rank code: OF-8");
		dbUtil.insertRank("General", "Général d'armée aérienne", 17, 21, "france/air_force/21.png", "NATO rank code: OF-9");
	}
}
