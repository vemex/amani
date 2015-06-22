package anmani.wechat.platform.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import anmani.webchat.platform.core.mvc.BaseController;

@Controller
@RequestMapping("/WechatMsg")
public class WechatMsgController extends BaseController {
	@RequestMapping("/Index")
	public String Index(Model model) {
		return "wechatmsg/index";
	}
	
	@RequestMapping("/WelcomeMsg/{operationType}")
	public String WelcomeMsg(@PathVariable String operationType,Model model) {
		model.addAttribute("Operator", operationType);
		if(operationType.equals("add"))
			return "wechatmsg/welcomemsg_add";
		else if(operationType.equals("index"))
			return "wechatmsg/welcomemsg_index";
		else	
			return "wechatmsg/welcomemsg_edit"; 
	}
	@RequestMapping("/AutoReplyMsg/{operationType}")
	public String AutoReplyMsg(@PathVariable String operationType,Model model) {
		model.addAttribute("Operator", operationType);
		if(operationType.equals("add"))
			return "wechatmsg/autoreplymsg_add";
		else if(operationType.equals("index"))
			return "wechatmsg/autoreplymsg_index";
		else	
			return "wechatmsg/autoreplymsg_edit";
	}
	
	@RequestMapping("/KeyWordMsg/{operationType}")
	public String KeyWordMsg(@PathVariable String operationType,Model model) {
		model.addAttribute("Operator", operationType);
		if(operationType.equals("add"))
			return "wechatmsg/keywordmsg_add";
		else if(operationType.equals("index"))
			return "wechatmsg/keywordmsg_index";
		else	
			return "wechatmsg/keywordmsg_edit";
	}
}
