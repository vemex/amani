package anmani.wechat.platform.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ��̨Ĭ�϶����ActionController
 * 
 * 
 * @author VV
 *
 */
@Controller
public class DashboardController {
	@RequestMapping("/Login")
	public String Login() {
		return "Login";
	}

	@RequestMapping("/Index")
	public String Index() {
		return "Index";
	}
}
