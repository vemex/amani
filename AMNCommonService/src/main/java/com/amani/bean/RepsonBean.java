package com.amani.bean;

public class RepsonBean {
	public boolean isbRet() {
		return bRet;
	}
	public void setbRet(boolean bRet) {
		this.bRet = bRet;
	}
	private boolean bRet;
	private String strMessage;
	private int state;
	private String objJson;
	public String getObjJson() {
		return objJson;
	}
	public void setObjJson(String objJson) {
		this.objJson = objJson;
	}
	public String getStrMessage() {
		return strMessage;
	}
	public void setStrMessage(String strMessage) {
		this.strMessage = strMessage;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public RepsonBean(boolean bRet)
	{
		this.bRet=bRet;
	}

	public RepsonBean()
	{
		
	}
}
