package amani.wechat.platform.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import amani.wechat.platform.core.mvc.BaseController;

/**
 * 后台默认顶层的ActionController
 * 
 * 
 * @author VV
 *
 */
@Controller
public class DashboardController  extends BaseController{
	@RequestMapping("/Login")
	public String Login() {
		return "Login";
	}

	@RequestMapping("/Index")
	public String Index() {
		return "Index";
	}
}
