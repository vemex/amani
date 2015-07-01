package amani.wechat.platform.dashboard.controller;
 
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import amani.wechat.platform.core.mvc.BaseController;
import amani.wechat.platform.core.mvc.RequestStatus;
import amani.wechat.platform.dao.entities.AmnAccount; 
import amani.wechat.platform.exceptions.BussinessDataException;
import amani.wechat.platform.services.IConfigurationService;
import amani.wechat.platform.services.ITestService;
import amani.wechat.platform.services.impl.ConfigurationService;
import amani.wechat.platform.services.model.WXConfiguration;

@Controller
@RequestMapping("/Basic")
public class BasicController extends BaseController { 

	private static Logger logger = Logger.getLogger(ConfigurationService.class);
	
	@Resource(name="configurationService")
	IConfigurationService configurationService;
	
	@RequestMapping("/Index")
	public String Index(Model model) {  
		return "basic/index";
	}  

	@RequestMapping(value="/AccountSet/Post",method = RequestMethod.POST) 
	@ResponseBody 
	public  RequestStatus AccountSet(String action,WXConfiguration configData, Model model)  {
		RequestStatus requestStatus=new RequestStatus();
		WXConfiguration cofig=null;
		try {
			cofig = configurationService.resolveWxConfiguration();
			if(action!=null &&action.equals("save")){
				cofig.setToken(configData.getToken());
				cofig.setAppid(configData.getAppid());
				cofig.setAppsecret(configData.getAppsecret());
				cofig.setMchid(configData.getMchid());
				cofig.setKey(configData.getKey());
				configurationService.saveWxConfiguration(cofig);
			}
			requestStatus.setIsSuccessed(true);
		} catch (BussinessDataException e) {
			logger.error(e);
			requestStatus.setIsSuccessed(false);
		} 
		return requestStatus;
	}
	 
	@RequestMapping("/AccountSet")
	public String AccountSet( Model model) throws BussinessDataException {
		WXConfiguration cofig= configurationService.resolveWxConfiguration(); 
		model.addAttribute("WXConfiguration", cofig);
		return "basic/accountset"; 
	}
	
	@RequestMapping("/Material/{operationType}")
	public String Basic_Material(@PathVariable String operationType,Model model) {
		model.addAttribute("Operator", operationType);
		if(operationType.equals("add"))
			return "basic/material_add";
		else if(operationType.equals("index"))
			return "basic/material_index";
		else	
			return "basic/material_edit";
	}
}
