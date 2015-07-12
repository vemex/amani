package com.amani.tools;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.security.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;

import java.text.DecimalFormat;
public class CommonTool {

	
	public static boolean isNumeric(String str){
		  for (int i = 0; i < str.length(); i++){
		   if (!Character.isDigit(str.charAt(i))){
		    return false;
		   }
		  }
		  return true;
		 }

	public static Double getFlowNo(List lsCurr)
	{
		if (lsCurr == null || lsCurr.size() == 0) {
			return new Double(1f);
		} else {
			return new Double(lsCurr.size() + 1);
		}
	}
	public static String getLoginInfo(String strValue) {
		return getLoginInfo(strValue, getUserInfo());
	}
	public static UserInformation getUserInfo() {
		return (UserInformation) ActionContext.getContext().getSession().get(
				"userInfo");
	}
	public static String getLoginInfo(String strValue, UserInformation userInfo) {
		if (userInfo == null ) 
			return "";
		if (strValue == null || strValue.equals("")) {
			return "";
		} else {
			if (strValue.equals("COMPID")) {
				return userInfo.getCompId();
			} else if (strValue.equals("USERID")) {
				return userInfo.getUserId();
			} else if (strValue.equals("COMPNAME")) {
				return userInfo.getCompName();
			} else if (strValue.equals("USERNAME")) {
				return userInfo.getUserName();
			} else {
				return "";
			}
		}
	}
	

	public static String getAMNPassWord(String strCurrDate) {
		if (strCurrDate == null || strCurrDate.length() != 8) {
			return "";
		} else {
			String strAMNPwd = "";
			String mon = strCurrDate.trim().substring(4, 6);
			if(Integer.parseInt(mon) == 11)
				mon = Integer.toString(Integer.parseInt(mon) + 1);
			else
				mon = Integer.toString((Integer.parseInt(mon) + 1) % 12);
			if (mon.trim().length() == 1)
				strAMNPwd = "amn0" + mon + "admin0" + mon;
			else if (mon.trim().length() == 2)
				strAMNPwd = "amn" + mon + "admin" + mon;

			return strAMNPwd;
		}
	}

	// 鍦ㄦ棩鏈熷姞涓婂浐瀹氬ぉ鏁�
	// 鍙傛暟: String strCurrDate 鏃ユ湡 骞朵笖鏃ユ湡鏍煎紡
	// int iDay 瑕佷环鐨勫ぉ鏁�
	public static String datePlusDay(String strCurrDate, int iDay) {
		if (iDay == 0 || strCurrDate == null || strCurrDate.equals("")) {
			return strCurrDate;
		} else {
			SimpleDateFormat objStdFormat = new SimpleDateFormat("yyyyMMdd");
			try {
				Date dCurrDate = objStdFormat.parse(strCurrDate);
				Long lDate = dCurrDate.getTime() + new Long(iDay) * 24 * 60 * 60 * 1000;
				Date dCurrDate2 = new Date(lDate);
				return objStdFormat.format(dCurrDate2);
			} catch (Exception e) {
				e.printStackTrace();
				return "";
			}
		}
	}
	//鏃堕棿鐩稿姞 浼犲叆鍙傛暟121212 time锛氭椂闂� 10鍒嗛挓灏辫緭鍏� 10
	public static String timePlusTime(String strCurrTime,int time)
	{	
		if (time == 0 || strCurrTime == null || strCurrTime.equals("")) {
				return strCurrTime;
			} else {
				SimpleDateFormat objStdFormat = new SimpleDateFormat("HHmmss");
				try {
					Date dCurrDate = objStdFormat.parse(strCurrTime);
					Long lDate = dCurrDate.getTime() + new Long(time)* 60*1000;
					Date dCurrDate2 = new Date(lDate);
					return objStdFormat.format(dCurrDate2);
				} catch (Exception e) {
					e.printStackTrace();
					return "";
				}
			}
	}
	//璁＄畻2涓棩鏈熶箣闂寸浉宸殑澶╂暟
	public static int dateSubDate(String strFromDate,String strToDate)
	{
		int differnDays = 0;
		SimpleDateFormat objStdFormat = new SimpleDateFormat("yyyyMMdd");
		try 
		{
			Date dFromDate = objStdFormat.parse(strFromDate);
			Date dToDate = objStdFormat.parse(strToDate);
		    //纭繚startday鍦╡ndday涔嬪墠
		    if(dFromDate.after(dToDate))
		    {
		    	Date cal=dFromDate;
		    	dFromDate=dToDate;
		    	dToDate=cal;
		    }
		    //鍒嗗埆寰楀埌涓や釜鏃堕棿鐨勬绉掓暟
		    Long sl=dFromDate.getTime();
		    Long el=dToDate.getTime();    
		    Long ei=el-sl;    
		    //鏍规嵁姣鏁拌绠楅棿闅斿ぉ鏁�
		    differnDays = (int)(ei/(1000*60*60*24));

		} 
		catch (ParseException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return differnDays;
	}
	// 鑾峰緱褰撳墠鐨勬棩鏈�
	// 杩斿洖鍊硷細20081010
	public static String getCurrDate() {
		SimpleDateFormat objStdFormat = new SimpleDateFormat("yyyyMMdd");
		Date CurrDate = new Date(System.currentTimeMillis());
		return objStdFormat.format(CurrDate);
	}
	// 鑾峰緱褰撳墠鐨勬椂闂�
	// 杩斿洖鍊� :120000
	public static String getCurrTime() {
		SimpleDateFormat objStdFormat = new SimpleDateFormat("HHmmss");
		Date CurrDate = new Date(System.currentTimeMillis());
		return objStdFormat.format(CurrDate);
	}

	// 鏍煎紡鍖栨棩鏈熸牸寮�
	// 鍙傛暟 strCurrDate 瑕佹牸寮忓寲鐨勬棩鏈� 鏍煎紡搴旇鏄�20080101
	// 杩斿洖鍊� 濡傛灉浼犲叆鐨勫弬鏁颁笉鏄叓浣嶇殑璇� 灏辫繑鍥�"" 2008-01-01
	public static String getDateMask(String strCurrDate) {
		if (strCurrDate == null || strCurrDate.equals("")) {
			return "";
		} else if (strCurrDate.length() == 10) {
			return strCurrDate;
		} else if (strCurrDate.length() != 8) {
			return "";
		} else {
			return strCurrDate.substring(0, 4) + "-"
					+ strCurrDate.substring(4, 6) + "-"
					+ strCurrDate.substring(6, 8);
		}
	}

	public static String getDateMaskForMonth(String strCurrDate) {
		if (strCurrDate == null || strCurrDate.equals("")) {
			return "";
		} else if (strCurrDate.length() == 7) {
			return strCurrDate;
		} else if (strCurrDate.length() != 6) {
			return "";
		} else {
			return strCurrDate.substring(0, 4) + "-"
					+ strCurrDate.substring(4, 6);
		}
	}

	// 鍘绘帀鏃ユ湡鐨勬牸寮忓寲
	// 鍙傛暟 strCurrDate 瑕佹牸寮忓寲鐨勬棩鏈� 鏍煎紡搴旇鏄�2008-01-01
	// 杩斿洖鍊� 20080101 濡傛灉浼犲叆鐨勫弬鏁颁笉鏄�10浣嶅氨杩斿洖"" 娉ㄦ剰璋冪敤杩欎釜鍑芥暟鐨勬椂鍊欏簲璇ュ厛璋冪敤checkStdDate鍑芥暟鍒ゆ柇鏃ユ湡鏍煎紡鏄惁鍚堟硶
	public static String setDateMask(String strCurrDate) {
		if (strCurrDate == null || strCurrDate.equals("")) {
			return "";
		} else if (strCurrDate.length() == 8) {
			return strCurrDate;
		} else if (strCurrDate.length() != 10) {
			return "";
		} else {
			return strCurrDate.substring(0, 4) + strCurrDate.substring(5, 7)
					+ strCurrDate.substring(8, 10);
		}
	}

	public static String setDateMaskForMonth(String strCurrDate) {
		if (strCurrDate == null || strCurrDate.equals("")
				|| strCurrDate.length() != 7) {
			return "";
		} else {
			return strCurrDate.substring(0, 4) + strCurrDate.substring(5, 7);
		}
	}

	// 妫�鏌ユ棩鏈熸牸寮忔槸鍚﹀悎娉�
	// 浼犲叆鐨勫弬鏁� strCurrDate 瑕佸潥鎸佺殑鏃ユ湡鏍煎紡 2008-01-01 娉ㄦ剰鏄姞"-"
	// 杩斿洖鍊硷細濡傛灉鍚堟硶灏辫繑鍥瀟rue 鍚﹀垯灏辫繑鍥瀎alse
	public static boolean checkStdDate(String strCurrDate) {
		if (strCurrDate == null || strCurrDate.equals("")) {
			return true;
		}
		if (strCurrDate.length() != 10) {
			return false;
		}
		strCurrDate = strCurrDate.substring(0, 4) + strCurrDate.substring(5, 7)
				+ strCurrDate.substring(8, 10);
		if (strCurrDate.compareTo("17530101") < 0
				|| strCurrDate.compareTo("99991231") > 0) {
			return false;
		}
		int iCurrYear = Integer.parseInt(strCurrDate.substring(0, 4));
		int iCurrMonth = Integer.parseInt(strCurrDate.substring(4, 6));
		int iCurrDay = Integer.parseInt(strCurrDate.substring(6, 8));
		boolean bFlag = false;
		int iDay = 0;
		if (((iCurrYear / 4 == 0) && (iCurrYear / 100 != 0))
				|| (iCurrYear / 400 == 0)) {
			bFlag = true;
		}
		if ((iCurrMonth == 1 || iCurrMonth == 3 || iCurrMonth == 5
				|| iCurrMonth == 7 || iCurrMonth == 8 || iCurrMonth == 10 || iCurrMonth == 12)
				&& (iCurrDay > 31 || iCurrDay < 1)) {
			return false;
		} else if ((iCurrMonth == 4 || iCurrMonth == 6 || iCurrMonth == 9 || iCurrMonth == 11)
				&& (iCurrDay > 30 || iCurrDay < 1)) {
			return false;
		} else if ((iCurrMonth == 2)
				&& ((bFlag == true && iDay > 29)
						|| (bFlag == false && iDay > 28) || iDay < 0)) {
			return false;
		}
		return true;
	}

	// 鏍煎紡鍖栨椂闂�
	// 鍙傛暟:String strTime 瑕佹牸寮忓寲鐨勬椂闂� 鏍煎紡搴旇鏄�120000
	// int iType 瑕佹牸寮忓寲鐨勭被鍨� 濡傛灉杩欎釜鍊兼槸1 閭ｄ箞杩斿洖鐨勫�兼槸12:00:00
	// 濡傛灉鏄� 2 閭ｄ箞灏辫繑鍥�12:00
	public static String getTimeMask(String strTime, int iType) {
		if (iType == 1) {
			if (strTime == null || strTime.equals("")) {
				return "";
			} else if (strTime.length() == 8) {
				return strTime;
			} else {
				return strTime.substring(0, 2) + ":" + strTime.substring(2, 4)
						+ ":" + strTime.substring(4, 6);
			}
		} else if (iType == 2) {
			if (strTime == null || strTime.equals("")) {
				return "";
			} else if (strTime.length() == 5) {
				return strTime;
			} else {
				return strTime.substring(0, 2) + ":" + strTime.substring(2, 4);
			}
		} else {
			return "";
		}
	}

	// 鍘绘帀鏍煎紡鍖栨椂闂�
	// 鍙傛暟:String strTime 瑕佹牸寮忓寲鐨勬椂闂� 鏍煎紡搴旇鏄�12:00:00
	// int iType 瑕佹牸寮忓寲鐨勭被鍨� 濡傛灉杩欎釜鍊兼槸1 閭ｄ箞strTime鐨勫�兼槸12:00:00
	// 濡傛灉鏄� 2 閭ｄ箞strTime鐨勫�兼槸12:00
	// 杩斿洖鍊� 120000
	public static String setTimeMask(String strTime, int iType) {
		if (iType == 1) {
			if (strTime == null || strTime.equals("")) {
				return "";
			} else {
				if(strTime.length()!=8)
				{
					return strTime;
				}
				return strTime.substring(0, 2) + strTime.substring(3, 5)
						+ strTime.substring(6, 8);
			}
		} else if (iType == 2) {
			if (strTime == null || strTime.equals("")) {
				return "";
			} else {
				if(strTime.length()!=5)
				{
					return strTime;
				}
				return strTime.substring(0, 2) + strTime.substring(3, 5) + "00";
			}
		} else {
			return "";
		}
	}

	// 鏍煎紡鍖栭噾棰�
	// 鍙傛暟 Double dValue 瑕佹牸寮忓寲鐨勯噾棰�
	// int iCal 鏍煎紡鍖栫殑灏忔暟浣嶆暟
	// 杩斿洖鍊硷細濡傛灉dValue 鏄痭ull 閭ｄ箞灏辫繑鍥� 0 鍚﹀垯灏辫繑鍥炰粬鐨勬牸寮忓寲閲戦
	public static Double GetGymAmt(Double dValue, int iCal) {
		if (dValue == null) {
			return new Double(0);
		}
		BigDecimal b = new BigDecimal(dValue);
		b = b.setScale(iCal, BigDecimal.ROUND_HALF_UP);
		return new Double(b.doubleValue());
	}

	// 妫�鏌ヨ嚜鍔ㄧ敓鎴愬崟鍙风殑鏄笉鏄拰鍏徃鐩稿叧
	public static boolean ifAutoKeyByComp(String strDefaultKey) {
		int iLen = strDefaultKey.length();
		strDefaultKey = strDefaultKey.toLowerCase();
		int iFlag = 0;
		for (int i = 0; i < iLen; i++) {
			if (strDefaultKey.substring(i, i + 1).equals("c"))
				iFlag++;
		}
		if (iFlag > 0) {
			return true;
		} else {
			return false;
		}
	}

	// 妫�鏌ヨ嚜鍔ㄧ敓鎴愬崟鍙风殑鏄笉鏄拰鏃ユ湡鐩稿叧
	public static boolean ifAutoKeyByDate(String strDefaultKey) {
		int iFlag = 0;
		int iLen = strDefaultKey.length();
		strDefaultKey = strDefaultKey.toLowerCase();
		for (int i = 0; i < iLen; i++) {
			if (strDefaultKey.substring(i, i + 1).equals("y"))
				iFlag++;
			else if (strDefaultKey.substring(i, i + 1).equals("m"))
				iFlag++;
			else if (strDefaultKey.substring(i, i + 1).equals("d"))
				iFlag++;
		}
		if (iFlag > 0) {
			return true;
		} else {
			return false;
		}
	}

	// 妫�鏌ヨ嚜鍔ㄧ敓鎴愬崟鍙风殑鏄笉鏄拰鍏抽敭瀛楃浉鍏�
	public static int checkAutoKey(String strDefaultKey) {
		int iFlag = 0;
		strDefaultKey = strDefaultKey.toLowerCase();
		int l = strDefaultKey.length();
		if (strDefaultKey == "")
			return -1;
		for (int i = 0; i < l; i++) {
			if (strDefaultKey.substring(i, i + 1).equals("x"))
				iFlag++;
		}
		if (iFlag > 0)
			return iFlag;
		else
			return 0;
	}

	// 鍦ㄦ嫾sql鐨勬椂鍊欙紝鍔�''
	public static String quotedStr(String strValue) {
		return "'" + strValue + "'";
	}
	
	

	// 鍒ゆ柇鏄惁鏄暎瀹�
	// 濡傛灉鏄暎瀹㈤偅涔堝氨杩斿洖true
	// 鍚﹀垯灏辫繑鍥瀎alse
	public static boolean isCashCustomer(String strValue) {
		if (strValue != null && strValue.length()>=4 && strValue.substring(1, 4).equals("鏁ｅ"))
			return true;
		else
			return false;
	}

	// 鑾峰緱褰撳墠鐨勬湀浠界殑寮�濮嬫棩鏈�
	public static String getCurrFirstDayOfMonth(String strDate) {
		return strDate.substring(0, 7) + "-01";
	}

	// 鑾峰緱褰撳墠鐨勬湀浠界殑鏈�鍚庝竴澶�
	public static String getCurrLastDayOfMonth(String strCurrDate) {
		int day_tab[][] = {
				{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
				{ 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };
		int leap;
		if (Integer.parseInt(strCurrDate.substring(0, 4)) % 4 == 0
				&& Integer.parseInt(strCurrDate.substring(0, 4)) % 100 != 0
				|| Integer.parseInt(strCurrDate.substring(0, 4)) % 400 == 0) {
			leap = 1;
		} else {
			leap = 0;
		}
		int low = Integer.parseInt(strCurrDate.substring(5, 7));
		int strLastDay = day_tab[leap][low];

		StringBuffer result = new StringBuffer();
		result.append(strCurrDate.substring(0, 4));
		result.append("-");
		result.append(strCurrDate.substring(5, 7));
		result.append("-");
		result.append(strLastDay);
		return result.toString();
	}
//	func: 浼犲叆鏃ユ湡寰楀埌寰楀埌褰撳墠鏃ユ湡鏄槦鏈熷嚑
//	Param: strDate--浼犲叆鐨勬棩鏈�
//	return:鏄熸湡鍑�
//	------------------------------------------------------------------------------
	public static Integer getWeekDay(String strDate)
	{
	    Integer nWeekDay =-1;
	    GregorianCalendar gc = new GregorianCalendar();
	    SimpleDateFormat dataFromat = new SimpleDateFormat("yyyyMMdd");
	    try 
	    {
			Date CurrDate = dataFromat.parse(strDate);
			gc.setTime(CurrDate);
		    nWeekDay = gc.get(Calendar.DAY_OF_WEEK);
		    
	    } 
	    catch (ParseException e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return  nWeekDay;
	}
	public static String AMNCalNextDay(String strFromDate,int dPeriod,String strPeriodUnit)
	{
	    String strRetDay = "";
	    if (strPeriodUnit.equals("1"))
	    {
	        strRetDay = datePlusDay(strFromDate, 365 * dPeriod);
	    }
	    if (strPeriodUnit.equals("2"))
	    {
	        strRetDay = datePlusDay(strFromDate, 31 * dPeriod);
	    }
	    if (strPeriodUnit.equals("3"))
	    {
	        strRetDay = datePlusDay(strFromDate, dPeriod);
	    }
	    if (strPeriodUnit.equals("4"))
	    {
	        strRetDay = datePlusDay(strFromDate, 92 * dPeriod);
	    }

	    return  strRetDay;
	}
	public static HashMap gainOrgList()
	{
		HashMap orgList = null;
		ActionContext ctx = ActionContext.getContext();
		Map application = ctx.getApplication();
		String key = "orgList";
		orgList = (HashMap)application.get(key);
		return orgList;
	}
	public static String gainOrgName(String orgCode)
	{
		HashMap orgList = gainOrgList();
		
		String orgName = (String)orgList.get(orgCode);
		return orgName;
	}
	
	
	
	
	/****************************************************************************
	GetConditionStr()

	/**Category
	    From~To澶勭悊鍑芥暟

	/**Description
	    鏍规嵁From , Tot缁勭粐鎴愮浉搴擲ql 妫�绱㈣鍙�.

	/**Prototype
	    void __fastcall GetConditionStr(
	                    AnsiString a_strFrom,
	                    AnsiString a_strTo,
	    	            AnsiString a_strFieldName,
	                    AnsiString a_strOperation,
	                    int nDataType,
	                    AnsiString &a_strCondition)

	/**Parameters
	    a_strFrom       :   From String
	    a_strTo         :   To String
	    a_strFieldName  :   褰撳墠妫�绱㈠瓧娈靛悕绉�
	    a_strOperation  :   缁勫悎鍏崇郴
	    int nDataType   :   a_strFrom,a_strTo 鏁版嵁绫诲瀷.
	                        CT_DATE_YMD     :   鏃ユ湡绫诲瀷YMD 鏍煎紡
	                        CT_DATE_YM      :   鏃ユ湡绫诲瀷YM  鏍煎紡
	                        CT_DATE_Y       :   鏃ユ湡绫诲瀷Y   鏍煎紡
	                        CT_TIME         :   鏃堕棿绫诲瀷Y   鏍煎紡
	                        CT_STRING       :   瀛楃涓茬被鍨�
	                        CT_FLOAT        :   Float 瀛楁
	                        CT_INTEGER      :   Inter 瀛楁

	    &a_strCondition :   Sql 妫�绱㈣鍙ヨ繑鍥�, 鍙互鍏堣浆鍏ュ凡鏈夎鍙ュ啀涓庣洰鍓嶈鍙ョ粍鍚�.

	/**Return Values
	    No Return

	/**Remarks:
	    SQL 浜х敓鍘熷垯涓�:
	        1.  From, To 閮戒负绌�"", 涓嶇粍缁囨潯浠�
	        2.  From涓�"", SQL 鏉′欢涓�  < =To AND IsNull
	        3.  To 涓�"",   SQL 鏉′欢涓�  >= FORM
	        4.  From , To閮戒笉涓�"",   SQL 鏉′欢涓�  >=From  AND  <=To
	/*****************************************************************************/

	public static void GetConditionStr(String a_strFrom,String a_strTo,
	 			String a_strFieldName,String a_strOperation, int nDataType,StringBuffer a_strCondition)
	{
	    String strFrom = "";
	    String strTo = "";  //get date text
		String strSingleCondition = "";     //current condition
		
	    strFrom=a_strFrom;
	    strTo=a_strTo;

	    if(strFrom.equals("") || strTo.equals(""))
	        return ;
	    if(strFrom.equals("''") || strTo.equals("''"))
	        return ;
	    if (!strFrom.equalsIgnoreCase(quotedStr("*")))// != quotedStr("*"))
	    {
	        if (strFrom.equalsIgnoreCase(strTo))// == strTo)
	        {
	            if(strFrom.equalsIgnoreCase("''") || strFrom.equalsIgnoreCase(""))
	                strSingleCondition ="(" + a_strFieldName + "=" + quotedStr(strFrom) +" OR " + a_strFieldName + " IS NULL)";
	            else
	                strSingleCondition ="(" + a_strFieldName + "=" + quotedStr(strFrom) +")";
	        }
	        else if(strFrom.equalsIgnoreCase("''") || strFrom.equalsIgnoreCase(""))
	            strSingleCondition ="(" + a_strFieldName + "<=" + quotedStr(strTo) + " OR " + a_strFieldName + " IS NULL)";
	        else if(strTo.equalsIgnoreCase("''") || strTo.equalsIgnoreCase(""))
	            strSingleCondition ="(" + a_strFieldName + ">=" + quotedStr(strFrom) +")";
	        else
	            strSingleCondition ="(" + a_strFieldName + ">=" + quotedStr(strFrom) + " AND "+ a_strFieldName + "<=" +quotedStr(strTo) +")";
	    }


	    if (!strSingleCondition.equalsIgnoreCase(""))
	    {
	        if (!a_strCondition.toString().equalsIgnoreCase(""))
	        {
	            a_strCondition = a_strCondition.append(" ").append(a_strOperation).append(" ").append(strSingleCondition);
	 	    }
	        else
	            a_strCondition = a_strCondition.append(strSingleCondition);
	    }
	    return ;
	}
	
//	 鑾峰緱褰撳墠鐨勬椂闂�
	// 杩斿洖鍊� :120000
	public static String getAllCurrDate() {
		SimpleDateFormat objStdFormat = new SimpleDateFormat("yyyyMMdd HHmmss");
		Date CurrDate = new Date(System.currentTimeMillis());
		return objStdFormat.format(CurrDate);
	}
	
//	 鏍煎紡鍖栨棩鏈熸牸寮�
	// 鍙傛暟 strCurrDate 瑕佹牸寮忓寲鐨勬棩鏈� 鏍煎紡搴旇鏄�20080101
	// 杩斿洖鍊� 濡傛灉浼犲叆鐨勫弬鏁颁笉鏄叓浣嶇殑璇� 灏辫繑鍥�"" 2008-01-01
	public static String getAllDateMask(String strCurrDate) {
		if (strCurrDate == null || strCurrDate.equals("")) {
			return "";
		} else if (strCurrDate.length() == 19) {
			return strCurrDate;
		} else if (strCurrDate.length() != 15) {
			return "";
		} else {
			return strCurrDate.substring(0, 4) + "-"
					+ strCurrDate.substring(4, 6) + "-"
					+ strCurrDate.substring(6, 8) 
					+ strCurrDate.substring(8, 9) + strCurrDate.substring(9, 11) 
					+ ":" + strCurrDate.substring(11, 13) 
					+ ":" + strCurrDate.substring(13, 15);
		}
	}
	 
	public static String isNullForString(String str)
	{
		return str == null?"":str;
	}
    public static String FormatString(Object strValue)
    {
        String ret = "";
        try
        {
            if(strValue != null)
                ret = (String)strValue;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            ret = "";
        }
        finally
        {
            return ret;
        }
    }

    public static Integer FormatInteger(Object intValue)
    {
        Integer ret = Integer.valueOf(0);
        try
        {
            if(intValue != null)
                ret = (Integer)intValue;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            ret = 0;
        }
        finally
        {
            return ret;
        }
    }

    public static Double FormatDouble(Object douValue)
    {
        Double ret = Double.valueOf(0.0D);
        try
        {
            if(douValue != null)
                ret = (Double)douValue;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            ret = 0d;
        }
        finally
        {
            return ret;
        }
    } 
    
    public static BigDecimal FormatBigDecimal(Object strValue)
    {
    	BigDecimal ret = new BigDecimal("0");
        try
        {
            if(strValue != null)
                ret = ((BigDecimal)strValue).setScale(2, BigDecimal.ROUND_HALF_UP) ;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            ret = new BigDecimal("0");
        }
        finally
        {
            return ret;
        }
    }
   
    
    public static BigDecimal FormatBigDecimalZ(Object strValue)
    {
    	BigDecimal ret = new BigDecimal("0");
        try
        {
            if(strValue != null)
                ret = ((BigDecimal)strValue).setScale(0, BigDecimal.ROUND_HALF_UP) ;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            ret = new BigDecimal("0");
        }
        finally
        {
            return ret;
        }
    }
    public static BigDecimal FormatBigDecimalT(Object strValue)
    {
    	BigDecimal ret = new BigDecimal("0");
        try
        {
            if(strValue != null)
                ret = ((BigDecimal)strValue).setScale(4, BigDecimal.ROUND_HALF_UP) ;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            ret = new BigDecimal("0");
        }
        finally
        {
            return ret;
        }
    }
  
    //鑾峰緱鏌愭湀鐨勫ぉ鏁�
    //鍙傛暟鏍煎紡锛�2008-12-26
    public static int genDaysOfMonth(String strDate) throws Exception
    {
    	int days=0;
    	if(strDate.length()!=10)
    	{		 
    		throw new Exception("鏃ユ湡鏍煎紡涓嶆纭�!");	
    	} 
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		Calendar calendar = new GregorianCalendar(); 
		Date date1 = sdf.parse(strDate);         
		calendar.setTime(date1); //鏀惧叆浣犵殑鏃ユ湡 
		days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); 
    	return days;
    }
    public static String getRemoteIP()
    {
    	String remoteIp="";
    	ServletContext servletContext = (ServletContext)ActionContext.getContext().get(ServletActionContext.SERVLET_CONTEXT);	
		HttpServletRequest httpServletRequest = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		remoteIp = httpServletRequest.getRemoteAddr();
		
		return remoteIp;
    }
    
    public static String buildSearchCondition(String[] fields,String[] values,boolean bAccurate)
    {
    	String strRet = "";
    	StringBuffer buf = new StringBuffer();
    	for(int i=0;i<fields.length;i++){
    		if(fields[i]==null||values[i]==null)
    			continue;
    		if(fields[i].equalsIgnoreCase("")||values[i].equalsIgnoreCase(""))
    			continue;
    		
    		String filter = "";
    		if(bAccurate)
    			filter = fields[i]+"="+quotedStr(values[i]);
    		else
    			filter = fields[i]+" like "+quotedStr("%"+values[i]+"%");
    		
    		if(!buf.toString().equalsIgnoreCase(""))
    		{
    			filter = " and " + filter;
    			buf.append(filter);
    		}
    		else
    		{
    			buf.append(filter);
    		}
    	}
    	strRet = buf.toString();
    	return strRet;
    }
    public static String genExceptionLogMsg(String exceptFrom,String methodName,String cause)
    {
    	String strErrorMsg = "";
    	strErrorMsg = "AMNEXCEPTION:TYPE("+exceptFrom+")&&METHOD("+methodName+")&&CAUSE BY:\n"+cause;
    	return strErrorMsg;
    }
    public static String genExceptionLogMsg(String exceptFrom,String methodName,String cause,String strSql)
    {
    	String strErrorMsg = "";
    	strErrorMsg = "AMNEXCEPTION:TYPE("+exceptFrom+")&&METHOD("+methodName+")&&SQL("+strSql+")&&CAUSE BY:\n"+cause;
    	return strErrorMsg;
    }
    public static String genExceptionLogMsg(String exceptFrom,String methodName,String cause,
    							String compId,String billId,String date,String time,String cardId)
    {
    	String strErrorMsg = "";
    	String data = "";
    	data = isNullForString(compId)+"$"+isNullForString(billId)
    		 + "$"+isNullForString(date)+"$"+isNullForString(time)+"$"+isNullForString(cardId);
    	strErrorMsg = "AMNEXCEPTION:TYPE("+exceptFrom+")&&METHOD("+methodName+")&&DATA("+data+")&&CAUSE BY:\n"+cause;
    	return strErrorMsg;
    }
  
    /**  
     * 灏哹yte鏁扮粍杞崲涓鸿〃绀�16杩涘埗鍊肩殑瀛楃涓诧紝 濡傦細byte[]{8,18}杞崲涓猴細0813锛� 鍜宲ublic static byte[]  
     * hexStr2ByteArr(String strIn) 浜掍负鍙�嗙殑杞崲杩囩▼  
     *   
     * @param arrB  
     *            闇�瑕佽浆鎹㈢殑byte鏁扮粍  
     * @return 杞崲鍚庣殑瀛楃涓�  
     * @throws Exception  
     *             鏈柟娉曚笉澶勭悊浠讳綍寮傚父锛屾墍鏈夊紓甯稿叏閮ㄦ姏鍑�  
     */  
    public static String byteArr2HexStr(byte[] arrB) throws Exception {   
     int iLen = arrB.length;   
     // 姣忎釜byte鐢ㄤ袱涓瓧绗︽墠鑳借〃绀猴紝鎵�浠ュ瓧绗︿覆鐨勯暱搴︽槸鏁扮粍闀垮害鐨勪袱鍊�   
     StringBuffer sb = new StringBuffer(iLen * 2);   
     for (int i = 0; i < iLen; i++) {   
      int intTmp = arrB[i];   
      // 鎶婅礋鏁拌浆鎹负姝ｆ暟   
      while (intTmp < 0) {   
       intTmp = intTmp + 256;   
      }   
      // 灏忎簬0F鐨勬暟闇�瑕佸湪鍓嶉潰琛�0   
      if (intTmp < 16) {   
       sb.append("0");   
      }   
      sb.append(Integer.toString(intTmp, 16));   
     }   
     return sb.toString();   
    }   
     
    /**  
     * 灏嗚〃绀�16杩涘埗鍊肩殑瀛楃涓茶浆鎹负byte鏁扮粍锛� 鍜宲ublic static String byteArr2HexStr(byte[] arrB)  
     * 浜掍负鍙�嗙殑杞崲杩囩▼  
     *   
     * @param strIn  
     *            闇�瑕佽浆鎹㈢殑瀛楃涓�  
     * @return 杞崲鍚庣殑byte鏁扮粍  
     * @throws Exception  
     *             鏈柟娉曚笉澶勭悊浠讳綍寮傚父锛屾墍鏈夊紓甯稿叏閮ㄦ姏鍑�  
     */  
    public static byte[] hexStr2ByteArr(String strIn) throws Exception {   
     byte[] arrB = strIn.getBytes();   
     int iLen = arrB.length;   
     
     // 涓や釜瀛楃琛ㄧず涓�涓瓧鑺傦紝鎵�浠ュ瓧鑺傛暟缁勯暱搴︽槸瀛楃涓查暱搴﹂櫎浠�2   
     byte[] arrOut = new byte[iLen / 2];   
     for (int i = 0; i < iLen; i = i + 2) {   
      String strTmp = new String(arrB, i, 2);   
      arrOut[i / 2] = (byte) Integer.parseInt(strTmp, 16);   
     }   
     return arrOut;   
    }   
     
    public static String encryptData(String input) throws Exception {   
  	  
        SecureRandom sr = new SecureRandom();   
        byte rawKeyData[] = "GAVINAPPLE".getBytes();   
        DESKeySpec dks = new DESKeySpec(rawKeyData);   
      
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");   
        SecretKey key = keyFactory.generateSecret(dks);   
      
        Cipher c = Cipher.getInstance("DES");   
        c.init(Cipher.ENCRYPT_MODE, key, sr);   
        byte[] cipherByte = c.doFinal(input.getBytes());   
        String dec = byteArr2HexStr(cipherByte);   
        return dec;   
      
    } 
    /**  
     * @param input  
     * @return  
     * @throws Exception  
     */  
    public static String decryptData(String input) throws Exception {   
        byte[] dec = hexStr2ByteArr(input);   
      
        SecureRandom sr = new SecureRandom();   
        byte rawKeyData[] = "GAVINAPPLE".getBytes();   
      
        DESKeySpec dks = new DESKeySpec(rawKeyData);   
      
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");   
      
        SecretKey key = keyFactory.generateSecret(dks);   
      
        Cipher c = Cipher.getInstance("DES");   
        c.init(Cipher.DECRYPT_MODE, key, sr);   
        byte[] clearByte = c.doFinal(dec);   
      
        return new String(clearByte);   
      
    }  
 
	
	// 鑾峰緱搴忓彿
	// 鍙傛暟锛歀ist lsCurr 褰撳墠鐨刲ist
	// strFieldName 鏄綋鍓嶇殑灞炴�� 渚嬪锛歩d.ggb02f
	public static Double getFlowNo_Ex(List lsCurr, String strFieldName)// get
	// flow
	// no
	{
		if (lsCurr == null || lsCurr.size() == 0) {
			return new Double(1f);
		} else {
			Double TemDoubleValue = 0d;
			for (int i = 0; i < lsCurr.size(); i++) {
				try {
					if (Double.parseDouble(BeanUtils.getProperty(lsCurr.get(i),
							strFieldName)) >= TemDoubleValue) {
						TemDoubleValue = Double.parseDouble(BeanUtils
								.getProperty(lsCurr.get(i), strFieldName));
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return new Double(TemDoubleValue + 1);
		}
	}
	
	public static String getLoginUserId() {
		ActionContext ctx = ActionContext.getContext();
		return ctx.getSession().get("StrCurUserid").toString();
	}
	
	

	 /**  
     * 鑾峰彇褰撳墠鎿嶄綔绯荤粺鍚嶇О.  
     * return 鎿嶄綔绯荤粺鍚嶇О 渚嬪:windows xp,linux 绛�.  
     */  
    public static String getOSName() {   
        return System.getProperty("os.name").toLowerCase();   
    }   
       
    /**  
     * 鑾峰彇unix缃戝崱鐨刴ac鍦板潃.  
     * 闈瀢indows鐨勭郴缁熼粯璁よ皟鐢ㄦ湰鏂规硶鑾峰彇.濡傛灉鏈夌壒娈婄郴缁熻缁х画鎵╁厖鏂扮殑鍙杕ac鍦板潃鏂规硶.  
     * @return mac鍦板潃  
     */  
    public static String getUnixMACAddress() {   
        String mac = null;   
        BufferedReader bufferedReader = null;   
        Process process = null;   
        try {   
            process = Runtime.getRuntime().exec("ifconfig eth0");// linux涓嬬殑鍛戒护锛屼竴鑸彇eth0浣滀负鏈湴涓荤綉鍗� 鏄剧ず淇℃伅涓寘鍚湁mac鍦板潃淇℃伅   
            bufferedReader = new BufferedReader(new InputStreamReader(process   
                    .getInputStream()));   
            String line = null;   
            int index = -1;   
            while ((line = bufferedReader.readLine()) != null) {   
                index = line.toLowerCase().indexOf("hwaddr");// 瀵绘壘鏍囩ず瀛楃涓瞇hwaddr]   
                if (index >= 0) {// 鎵惧埌浜�   
                    mac = line.substring(index +"hwaddr".length()+ 1).trim();//  鍙栧嚭mac鍦板潃骞跺幓闄�2杈圭┖鏍�   
                    break;   
                }   
            }   
        } catch (IOException e) {   
            e.printStackTrace();   
        } finally {   
            try {   
                if (bufferedReader != null) {   
                    bufferedReader.close();   
                }   
            } catch (IOException e1) {   
                e1.printStackTrace();   
            }   
            bufferedReader = null;   
            process = null;   
        }   
  
        return mac;   
    }   
  
    /**  
     * 鑾峰彇widnows缃戝崱鐨刴ac鍦板潃.  
     * @return mac鍦板潃  
     */  
    public static String getWindowsMACAddress() {   
        String mac = null;   
        BufferedReader bufferedReader = null;   
        Process process = null;   
        try {   
            process = Runtime.getRuntime().exec("ipconfig /all");// windows涓嬬殑鍛戒护锛屾樉绀轰俊鎭腑鍖呭惈鏈塵ac鍦板潃淇℃伅   
            bufferedReader = new BufferedReader(new InputStreamReader(process   
                    .getInputStream()));   
            String line = null;   
            int index = -1;   
            while ((line = bufferedReader.readLine()) != null) {   
                index = line.toLowerCase().indexOf("physical address");// 瀵绘壘鏍囩ず瀛楃涓瞇physical address]   
                if (index >= 0) {// 鎵惧埌浜�   
                    index = line.indexOf(":");// 瀵绘壘":"鐨勪綅缃�   
                    if (index>=0) {   
                        mac = line.substring(index + 1).trim();//  鍙栧嚭mac鍦板潃骞跺幓闄�2杈圭┖鏍�   
                    }   
                    break;   
                }   
            }   
        } catch (IOException e) {   
            e.printStackTrace();   
        } finally {   
            try {   
                if (bufferedReader != null) {   
                    bufferedReader.close();   
                }   
            } catch (IOException e1) {   
                e1.printStackTrace();   
            }   
            bufferedReader = null;   
            process = null;   
        }   
  
        return mac;   
    } 
    
    public static String getMACAddressEx() 
    { 
    	
    	String address = "";
    	String os = getOSName();
    	if(os.startsWith("windows"))
    	{
    		address = getWindowsMACAddress();
    	}
    	else
    	{
    		address = getUnixMACAddress();
    	}

    	if(address == null ||address.equalsIgnoreCase(""))
    	{
    		address = "FF-FF-FF-FF-FF-FF";
    	}
    	//address = getMetaMachineCodeEX();
    	return address;	
    } 
    
    public static String getMACAddress()
    {
    	String address = "";
    	ServletContext servletContext = (ServletContext)ActionContext.getContext().get(ServletActionContext.SERVLET_CONTEXT);
    	address = (String)servletContext.getAttribute("server_mac");
    	return address;
    }
    
    public  String loadLoaclMACAddress()
    {
    	String strMac="";
    	try
    	{
    		String ip = java.net.InetAddress.getLocalHost().getHostAddress();
    		strMac = getMacAddressIP(ip);
    		strMac = (strMac!=null)?strMac.replaceAll("-", ""):"";
    	}
    	catch (IOException ex)
    	{   
    	} 
    	return strMac;
    }
    

    
    private  String getMacAddressIP(String remotePcIP) {   
    	String str = "";   
    	String macAddress = "";   
    	try {   
    			Process pp = Runtime.getRuntime().exec("nbtstat -A " + remotePcIP);   
    			InputStreamReader ir = new InputStreamReader(pp.getInputStream());   
    			LineNumberReader input = new LineNumberReader(ir);   
    			for (int i = 1; i < 100; i++) {   
    				str = input.readLine();   
    				if (str != null) {   
    					if (str.indexOf("MAC Address") > 1) {   
    						macAddress = str.substring(   
    						str.indexOf("MAC Address") + 14, str.length());   
    						break;   
    					}   
    				}   
    			}   
    	} 
    	catch (IOException ex)
    	{   
    	}   
    	return macAddress;   
    } 
    
  //鑾峰彇鍓嶄笁涓湀鐨勬棩鏈�
    public static String getafterMonththree(){
    	  Date   date=new   Date(); 
    	  Calendar   cal=Calendar.getInstance(); 
    	  cal.setTime(date); 
    	  cal.add(Calendar.MONTH,-3); 
    	  Date   otherDate=cal.getTime(); 
    	  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
    	System.out.println( "today:   "+dateFormat.format(date)+ "   3   months   after:   "+dateFormat.format(otherDate));
    	  return dateFormat.format(otherDate);
    	 }
    //鑾峰彇鍓嶅叚涓湀鐨勬棩鏈�
    public static String getafterMonthsix(){
    	  Date   date=new   Date(); 
    	  Calendar   cal=Calendar.getInstance(); 
    	  cal.setTime(date); 
    	  cal.add(Calendar.MONTH,-6); 
    	  Date   otherDate=cal.getTime(); 
    	  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
    	  System.out.println( "today:   "+dateFormat.format(date)+ "   6   months   after:   "+dateFormat.format(otherDate));
    	  return dateFormat.format(otherDate);
    	 }
    
    //鑾峰彇鍓嶄節涓湀鐨勬棩鏈�
    public static String getafterMonthnine(){
    	  Date   date=new   Date(); 
    	  Calendar   cal=Calendar.getInstance(); 
    	  cal.setTime(date); 
    	  cal.add(Calendar.MONTH,-9); 
    	  Date   otherDate=cal.getTime(); 
    	  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
    	   System.out.println( "today:   "+dateFormat.format(date)+ "   9   months   after:   "+dateFormat.format(otherDate));
    	  return dateFormat.format(otherDate);
    	 }
    
    //鑾峰彇鍓嶄竴骞存湀鐨勬棩鏈�
    public static String getafteryear(){
    	  Date   date=new   Date(); 
    	  Calendar   cal=Calendar.getInstance(); 
    	  cal.setTime(date); 
    	  cal.add(Calendar.MONTH,-12); 
    	  Date   otherDate=cal.getTime(); 
    	  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
    	  System.out.println( "today:   "+dateFormat.format(date)+ "   12   months   after:   "+dateFormat.format(otherDate));
    	  return dateFormat.format(otherDate);
    	 }  
    public static boolean checkStr(String strTmp)
	{
	boolean bRet=false;
	if(strTmp!=null && "".equals(strTmp)==false && "*".equals(strTmp)==false)
	{
	bRet=true;
	}
	return bRet;
	}
    
    public static byte[] loadByteByFile(String strFilename)
	{
		try
		{
			File file=new File(strFilename);
			if (!(file.exists())) {
		        return null;
		    }
			long length = file.length();
			byte[] bytes = new byte[(int) length];
			InputStream is = new FileInputStream(file);
			int offset = 0;
			int numRead = 0;
			while (offset < bytes.length
					&& (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
					offset += numRead;
			}

			// Ensure all the bytes have been read in
			if (offset < bytes.length) {
				throw new IOException("Could not completely read file "
						+ file.getName());
			}
			is.close();
			file=null;
	
			// 鍒涘缓鐩爣鏂囦欢
	    	System.out.println(bytes.length);
	    	
	    	return bytes;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}
    
    

	public static ResultSet loadResultSet(Connection con,Statement stmt,String strSql)
	{
		
		try
		{ 
	
			return stmt.executeQuery(strSql);
			 
		}
		catch(Exception e)
		{ 
			e.printStackTrace();
			return null;
		}
	}
	
	//释放连接
	public boolean closeConnection(Connection con)
	{
		try
		 { 
				if(con==null)
					return true;
				con.close();
				return true;
		 }
		catch(Exception e)
		{ 
				e.printStackTrace();
				return false;
		}
	}
	
	public static String random(int len) {

		Random rand = new Random();
		int[] param = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		for (int i = param.length; i > 1; i--) {
			int index = rand.nextInt(i);
			int tmp = param[index];
			param[index] = param[i - 1];
			param[i - 1] = tmp;
		}
		int result = 0;
		for (int i = 0; i < len; i++) {
			result = result * len + param[i];
		}
		return result + "";
	}
	
	public static String addMonth(String strDate,int months) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Calendar calendar = Calendar.getInstance();
		Date date;
		try {
			date = dateFormat.parse(strDate);
			calendar.setTime(date);
			calendar.add(Calendar.MONTH, months);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dateFormat.format(calendar.getTime());
	}
	
	public static String addSeconds(String strDate,int seconds) {
		TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Calendar calendar = Calendar.getInstance();
		Date date;
		try {
			date = dateFormat.parse(strDate);
			calendar.setTime(date);
			calendar.add(Calendar.SECOND, seconds);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dateFormat.format(calendar.getTime());
	}
	
	public static String getNowTime() {
		TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		
		return dateFormat.format(calendar.getTime());
	}
	
	public static String randomString(int len)
	{
		return RandomStringUtils.randomAlphanumeric(12);
	}
	
	public static String randomNumeric(int len)
	{
		return RandomStringUtils.randomNumeric(len);
	}
	
	public static void main(String[] args) throws Exception {
		//System.out.println(RandomStringUtils.randomAlphanumeric(12));
		System.out.println(getNowTime());
	}
	
    
    
    
    
}
