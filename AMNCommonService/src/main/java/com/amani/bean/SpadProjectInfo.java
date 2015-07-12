package com.amani.bean;

public class SpadProjectInfo {
	private 	String 		code;			//编码
	private 	String		sname;			//名称
	private 	int			category;		//大类编码
	private 	double		price;			//价格
	private 	int			isForTreatment;	//是否是疗程
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getIsForTreatment() {
		return isForTreatment;
	}
	public void setIsForTreatment(int isForTreatment) {
		this.isForTreatment = isForTreatment;
	}
}
