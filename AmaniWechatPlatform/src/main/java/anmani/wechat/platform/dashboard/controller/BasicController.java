package anmani.wechat.platform.dashboard.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import anmani.webchat.platform.core.mvc.BaseController;

@Controller
@RequestMapping("/Basic")
public class BasicController extends BaseController {
	@RequestMapping("/Index")
	public String Index(Model model) {
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
