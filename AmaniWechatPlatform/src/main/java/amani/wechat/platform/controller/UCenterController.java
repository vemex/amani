package amani.wechat.platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/UCenter")
public class UCenterController {

@RequestMapping("/Index")
	public String Index() {
		return "ucenter/index";
	}
}
