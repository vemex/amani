package com.amani.spring;

public class SpringDBUtil {
	private static SpringDBInit sdb = SpringDBInit.getInstance();
	public static Object getBean(String name)
	{
		return sdb.getBean(name);
	}
}
