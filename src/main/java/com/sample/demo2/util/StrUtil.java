package com.sample.demo2.util;

public class StrUtil {
	public static int ObjToInt(Object obj,int defult)
	{
		if(obj==null)
		{
			return defult;
		}
		return Integer.parseInt(obj.toString());
	}
	
	public static int ObjToInt(Object obj)
	{
		if(obj==null)
		{
			return 0;
		}
		return Integer.parseInt(obj.toString());
	}
	
	public static String ObjToStr(Object obj)
	{
		if(obj==null)
		{
			return "";
		}
		return obj.toString();
	}
	public static float ObjToFloat(Object obj)
	{
		if(obj==null)
		{
			return 0;
		}
		return Float.parseFloat(obj.toString());
	}
}
