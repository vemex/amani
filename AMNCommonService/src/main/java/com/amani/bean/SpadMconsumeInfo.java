package com.amani.bean;

public class SpadMconsumeInfo {
	private int 		id;
	private String 		brachcode;
	private String 		small_no;			//小单号
	private String 		employee_no;		//员工号 
	private String 		custom;				//手牌号
	private int			status;				//小单状态
	private String		cdate;				//开单时间
	private String 		summary;			//备注
	private String 		psmall_no;			//合并单 付款小单号
	private int			smerge;				// 1 合并到其他小
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSmall_no() {
		return small_no;
	}
	public void setSmall_no(String small_no) {
		this.small_no = small_no;
	}
	public String getEmployee_no() {
		return employee_no;
	}
	public void setEmployee_no(String employee_no) {
		this.employee_no = employee_no;
	}
	public String getCustom() {
		return custom;
	}
	public void setCustom(String custom) {
		this.custom = custom;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getPsmall_no() {
		return psmall_no;
	}
	public void setPsmall_no(String psmall_no) {
		this.psmall_no = psmall_no;
	}
	public int getSmerge() {
		return smerge;
	}
	public void setSmerge(int smerge) {
		this.smerge = smerge;
	}
	public String getBrachcode() {
		return brachcode;
	}
	public void setBrachcode(String brachcode) {
		this.brachcode = brachcode;
	}
	
}
