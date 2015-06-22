package amani.wechat.platform.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import amani.wechat.platform.core.mvc.BaseController;

@Controller
@RequestMapping("/Sms")
public class SmsController extends BaseController {
	@RequestMapping("/Index")
	public String Index(Model model) {
		return "sms/index";
	}
	
	@RequestMapping("/Sms/{operationType}")
	public String WelcomeMsg(@PathVariable String operationType,Model model) {
		model.addAttribute("Operator", operationType);
		if(operationType.equals("add"))
			return "sms/sms_add";
		else if(operationType.equals("index"))
			return "sms/sms_index";
		else	
			return "sms/sms_edit"; 
	}
	 
}
