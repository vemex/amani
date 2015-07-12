package com.amani.tools;

import java.util.*;

import com.amani.model.Sysmodeinfo;
import com.amani.model.Sysrolemode;
import com.amani.model.Useroverall;
public class UserInformation {
	private String compId;
	private String compName;
	private String userId;
	private String userName;
	private String password;
	private String userinnerId;
	private String depart;
	private int	   mangerFlag;//是否是管理员登录系统
	private List<Useroverall> lsUseroverall;
	private List<Sysrolemode> lsSysrolemode;
	private List<Sysmodeinfo> lsSysmodeinfo;
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getCompId() {
		return compId;
	}
	public void setCompId(String compId) {
		this.compId = compId;
	}
		
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	

	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserinnerId() {
		return userinnerId;
	}
	public void setUserinnerId(String userinnerId) {
		this.userinnerId = userinnerId;
	}
	public List<Useroverall> getLsUseroverall() {
		return lsUseroverall;
	}
	public void setLsUseroverall(List<Useroverall> lsUseroverall) {
		this.lsUseroverall = lsUseroverall;
	}
	public List<Sysrolemode> getLsSysrolemode() {
		return lsSysrolemode;
	}
	public void setLsSysrolemode(List<Sysrolemode> lsSysrolemode) {
		this.lsSysrolemode = lsSysrolemode;
	}
	public int getMangerFlag() {
		return mangerFlag;
	}
	public void setMangerFlag(int mangerFlag) {
		this.mangerFlag = mangerFlag;
	}
	public List<Sysmodeinfo> getLsSysmodeinfo() {
		return lsSysmodeinfo;
	}
	public void setLsSysmodeinfo(List<Sysmodeinfo> lsSysmodeinfo) {
		this.lsSysmodeinfo = lsSysmodeinfo;
	}


	
}
