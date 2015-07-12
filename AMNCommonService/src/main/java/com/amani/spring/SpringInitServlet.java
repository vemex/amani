package com.amani.spring;

import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class SpringInitServlet extends HttpServlet{
	private SpringDBInit sdbinit = SpringDBInit.getInstance();
	public void init(ServletConfig config) throws ServletException
	{  
		super.init(config);  
		Properties props = new Properties();  
		props.put("APP_CONTEXT", config.getServletContext());  
		// 文件路径  
		String prefix = getServletContext().getRealPath("/");  
		// web应用路径  
		props.put("APP_PATH", prefix);  
		try  
		{  
			sdbinit.init(props);  
		}  
		catch (Exception e)  
		{  
			e.printStackTrace();
		}  

	}  
}
