package com.amani.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.AbstractController;

import com.amani.bean.RepsonBean;
import com.amani.services.InventoryService;

@Controller
@Namespace("/gba01i")
@ParentPackage("default")
public class InventoryAction {
	@Autowired
	private InventoryService inventoryService;
	RepsonBean repsonBean;
	private String userName;
	private String pwd;
	
	public RepsonBean getRepsonBean() {
		return repsonBean;
	}

	public void setRepsonBean(RepsonBean repsonBean) {
		this.repsonBean = repsonBean;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setInventoryService(InventoryService inventoryService) {
		this.inventoryService = inventoryService;
	}

	@Action( value="checkhurlComp", results={ @Result( type="json", name="check_success"),
			  @Result( type="json", name="check_faile")})
	public String checkUser()
	{
		repsonBean=inventoryService.checkUser(userName, pwd);
		return "load_success";
	}
	
}
