package com.amani.bean;

import java.util.List;

import net.sf.ezmorph.bean.MorphDynaBean;

public class SpadBillInfo {
	private String errorno;
	private String brachcode;
	private List<MorphDynaBean> smallinfo;
	private List<MorphDynaBean>  smallconsume;
	public String getErrorno() {
		return errorno;
	}
	public void setErrorno(String errorno) {
		this.errorno = errorno;
	}
	
	public List<MorphDynaBean> getSmallinfo() {
		return smallinfo;
	}
	public void setSmallinfo(List<MorphDynaBean> smallinfo) {
		this.smallinfo = smallinfo;
	}
	public List<MorphDynaBean> getSmallconsume() {
		return smallconsume;
	}
	public void setSmallconsume(List<MorphDynaBean> smallconsume) {
		this.smallconsume = smallconsume;
	}
	public String getBrachcode() {
		return brachcode;
	}
	public void setBrachcode(String brachcode) {
		this.brachcode = brachcode;
	}
}
