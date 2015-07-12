package com.amani.bean;

public class SpadStaffInfo {
	private 	String 		employee_no;	//员工号
	private 	String		username;		//姓名
	private 	int			password;		//密码
	private 	String 		positionid;		//职位
	public String getEmployee_no() {
		return employee_no;
	}
	public void setEmployee_no(String employee_no) {
		this.employee_no = employee_no;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getPositionid() {
		return positionid;
	}
	public void setPositionid(String positionid) {
		this.positionid = positionid;
	}
}
