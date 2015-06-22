package anmani.wechat.platform.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import anmani.webchat.platform.core.mvc.BaseController;

@Controller
@RequestMapping("/News")
public class NewsController extends BaseController {
	@RequestMapping("/CompanyNewsIndex")
	public String CompanyNewsIndex(Model model) {
		return "news/company_index";
	}
	@RequestMapping("/MarketingActivityNewsIndex")
	public String MarketingActivityNewsIndex(Model model) {
		return "news/marketingactivity_index";
	}
	
	@RequestMapping("/HairshowNewsIndex")
	public String HairShowNewsIndex(Model model) {
		return "news/hairshow_index";
	}
	
	@RequestMapping("/HairshowNews/{operationType}")
	public String HairShowNews(@PathVariable String operationType,Model model) {
		model.addAttribute("Operator", operationType);
		if(operationType.equals("add"))
			return "news/hairshow_news_add";
		else if(operationType.equals("list"))
			return "news/hairshow_news_list";
		else	
			return "news/hairshow_news_edit"; 
	} 
	
	
	@RequestMapping("/CompanyNews/{operationType}")
	public String CompanyNews(@PathVariable String operationType,Model model) {
		model.addAttribute("Operator", operationType);
		if(operationType.equals("add"))
			return "news/company_news_add";
		else if(operationType.equals("list"))
			return "news/company_news_list";
		else	
			return "news/company_news_edit"; 
	} 
	
	@RequestMapping("/MarketingActivityNews/{operationType}")
	public String MarketingActivityNews(@PathVariable String operationType,Model model) {
		model.addAttribute("Operator", operationType);
		if(operationType.equals("add"))
			return "news/marketingactivity_news_add";
		else if(operationType.equals("list"))
			return "news/marketingactivity_news_list";
		else	
			return "news/marketingactivity_news_edit"; 
	} 
}
