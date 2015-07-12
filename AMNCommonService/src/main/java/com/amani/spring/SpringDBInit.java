package com.amani.spring;

import java.util.Locale;
import java.util.Properties;

import javax.servlet.ServletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class SpringDBInit {
	private static ApplicationContext ctx;
	private static SpringDBInit instance = null;
	private SpringDBInit()
	{
	}
	public static SpringDBInit getInstance()
    {
        if (instance == null)
        {
            synchronized (SpringDBInit.class)
            {
            	if (instance == null)
                {
                    instance = new SpringDBInit();
                }
            }
        }
        return instance;
    }
	
	public void init(Properties props) throws Exception
	{
		loadContextXML(props);
	}
	
	private void loadContextXML(Properties props) throws Exception
	{
		try
		{
			ServletContext servletContext = (ServletContext) props.get("APP_CONTEXT");
			if (servletContext != null)
				ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public Object getBean(String name)
    {
		if (ctx == null)
            return null;
        else 
            return ctx.getBean(name);
    }  
	
	public static String getMessage(String key, Object[] object, Locale locale)  
	 
    {  
		return ctx.getMessage(key, object, locale); 
    } 
		
}
