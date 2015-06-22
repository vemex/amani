package com.cn.hnust.service.impl;

import org.springframework.stereotype.Service;

import com.cn.hnust.service.ITestService;

@Service("testService")
public class TestImpl implements ITestService { 
	public String Test() {
		// TODO Auto-generated method stub
		return "1111";
	}

}
