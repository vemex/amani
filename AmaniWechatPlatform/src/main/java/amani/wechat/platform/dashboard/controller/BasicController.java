package amani.wechat.platform.dashboard.controller;
 
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import amani.wechat.platform.core.mvc.BaseController;
import amani.wechat.platform.dao.entities.AmnAccount; 
import amani.wechat.platform.dashboard.services.ITestService;

@Controller
@RequestMapping("/Basic")
public class BasicController extends BaseController {
	@Resource(name="testService")
	ITestService testService;
	
	@RequestMapping("/Index")
	public String Index(Model model) {
	 List<AmnAccount> list=	testService.getAllAccount();
	 
		return "basic/index";
	} 
	 
	@RequestMapping("/AccountSet")
	public String AccountSet(Model model) {
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
