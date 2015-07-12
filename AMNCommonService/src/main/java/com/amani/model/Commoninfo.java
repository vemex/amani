package com.amani.model;

/**
 * 
 * @author LiuJie Jul 1, 2013 12:37:06 PM
 * @version: 1.0
 * @Copyright: AMN
 */
public class Commoninfo  implements java.io.Serializable {


	private CommoninfoId id;
	private String infoname;//类型代码
	private String codevalue;//类型名称
	private String parentcodevalue;//二级代码 职位编号
	private String codesource;// 
	private String binfotype; //配合前端GRID显示
    private String bcodekey; //配合前端GRID显示
    private String bparentcodekey; //配合前端GRID显示   二级名称
    private String userphone;
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public CommoninfoId getId() {
		return id;
	}
	public void setId(CommoninfoId id) {
		this.id = id;
	}
	public String getInfoname() {
		return infoname;
	}
	public void setInfoname(String infoname) {
		this.infoname = infoname;
	}
	public String getCodevalue() {
		return codevalue;
	}
	public void setCodevalue(String codevalue) {
		this.codevalue = codevalue;
	}
	public String getCodesource() {
		return codesource;
	}
	public void setCodesource(String codesource) {
		this.codesource = codesource;
	}
	public String getBinfotype() {
		return binfotype;
	}
	public void setBinfotype(String binfotype) {
		this.binfotype = binfotype;
	}
	public String getBcodekey() {
		return bcodekey;
	}
	public void setBcodekey(String bcodekey) {
		this.bcodekey = bcodekey;
	}
	public String getBparentcodekey() {
		return bparentcodekey;
	}
	public void setBparentcodekey(String bparentcodekey) {
		this.bparentcodekey = bparentcodekey;
	}
	public String getParentcodevalue() {
		return parentcodevalue;
	}
	public void setParentcodevalue(String parentcodevalue) {
		this.parentcodevalue = parentcodevalue;
	}
	
}