package anmani.wechat.platform.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import anmani.webchat.platform.core.mvc.BaseController;

@Controller
@RequestMapping("/CustomerMenu")
public class CustomerMenuController extends BaseController {
	@RequestMapping("/MenuList")
	public String MenuList(Model model) {
		return "customermenu/menulist";
	}
	@RequestMapping("/Index")
	public String Index(Model model) {
		return "customermenu/index";
	}
 
}
