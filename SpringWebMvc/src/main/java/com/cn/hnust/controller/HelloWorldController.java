package com.cn.hnust.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.cn.hnust.service.ITestService;

@Controller
public class HelloWorldController {
	@Resource
	private ITestService testService;  
	
	@RequestMapping("/hello")
	public String hello(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {
		ModelAndView dd=new ModelAndView();  
		model.addAttribute("name", testService.Test());
		return "helloworld";
	}

}