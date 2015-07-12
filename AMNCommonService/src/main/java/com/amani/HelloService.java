package com.amani;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amani.tools.DataTool;
@WebService(endpointInterface="com.amani.IHelloService")
public class HelloService implements IHelloService {
	public static final Log LOG = LogFactory.getLog(IHelloService.class);

	
	@WebMethod
	public String sayHello(String name) {
		return name;
//		try
//		{
//			DataTool dataTool=null;
//			String[] confFile = {"daoContext.xml","dataToolContext.xml"};
//			ApplicationContext ctx = new ClassPathXmlApplicationContext(confFile);
//			dataTool=(DataTool)ctx.getBean("dataTool");
//		//	String strCompName=dataTool.loadCompNameById("001");
//		//	return "Hello22222, "+strCompName;
//		}
//		catch(Exception ex)
//		{
//			ex.printStackTrace();
//			return "";
//		}
	}

}
