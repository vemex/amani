package com.amani.model.WeiXin;

import java.io.Serializable;
import java.util.ArrayList; 


public class UploadFileResult implements Serializable{
	public UploadFileResult() {
		items=new ArrayList<UploadedFileItem>();
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -3184770419848425059L;
	ArrayList<UploadedFileItem> items;
	public ArrayList<UploadedFileItem> getItems() {
		return items;
	}
	public void setItems(ArrayList<UploadedFileItem> items) {
		this.items=items;
	}
	
	private boolean isOk;
	public boolean getIsOk() {
		if (items.size()==0) {
			return false;
		}
		isOk=true;
		for (UploadedFileItem uploadFileItem : items) {
				isOk= uploadFileItem.getIsOk() & isOk;
		}
		return isOk;
	}
	public void setIsOk(boolean isOk) {
		this.isOk=isOk;
	}
	
	
	private String errorMsg;
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg=errorMsg;
	}
 
}
