package com.amani.bean;

public class SpadGoodsInfo {
	private		String		code;		//产品编码
	private		String 	pname;		//产品名称
	private 	int 	category; 	//产品大类
	private 	double 	price;		//产品价格
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
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
}
