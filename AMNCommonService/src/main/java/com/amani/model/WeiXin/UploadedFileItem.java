package com.amani.model.WeiXin;

import java.io.Serializable;

public class UploadedFileItem implements Serializable {
	
	private static final long serialVersionUID = 4147953714883841566L;
	private boolean isOk;
	public boolean getIsOk() {
		return isOk;
	}
	public void setIsOk(boolean isOk) {
		this.isOk=isOk;
	}

	private String url;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url=url;
	}
	
	private String errorMsg;
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg=errorMsg;
	}
}
