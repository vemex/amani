package amani.wechat.platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  VIP预约
 *  
 *  
 * @author VV
 *
 */
@Controller
@RequestMapping("/Orders")
public class OrdersController {
	@RequestMapping("/Step1")
	public String step1() {
		return "orders/step1";
	}
}
