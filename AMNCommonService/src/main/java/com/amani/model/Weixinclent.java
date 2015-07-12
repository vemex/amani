package com.amani.model;

/**
 * Weixinclent entity. @author MyEclipse Persistence Tools
 */

public class Weixinclent implements java.io.Serializable {

	// Fields

	private String qdyno;
	private String operid;
	private String clientname;
	private String mobile;
	private String vchno;
	private String billid;
	private String strState;
	private String dyqName;
	public String getDyqName() {
		return dyqName;
	}

	public void setDyqName(String dyqName) {
		this.dyqName = dyqName;
	}

	public String getStrState() {
		return strState;
	}

	public void setStrState(String strState) {
		this.strState = strState;
	}

	public String getBillid() {
		return billid;
	}

	public void setBillid(String billid) {
		this.billid = billid;
	}

	private String createdate;

	// Constructors

	/** default constructor */
	public Weixinclent() {
	}

	/** minimal constructor */
	public Weixinclent(String qdyno) {
		this.qdyno = qdyno;
	}

	/** full constructor */
	public Weixinclent(String qdyno, String operid, String clientname,
			String mobile, String vchno, String createdate) {
		this.qdyno = qdyno;
		this.operid = operid;
		this.clientname = clientname;
		this.mobile = mobile;
		this.vchno = vchno;
		this.createdate = createdate;
	}

	// Property accessors

	public String getQdyno() {
		return this.qdyno;
	}

	public void setQdyno(String qdyno) {
		this.qdyno = qdyno;
	}

	public String getOperid() {
		return this.operid;
	}

	public void setOperid(String operid) {
		this.operid = operid;
	}

	public String getClientname() {
		return this.clientname;
	}

	public void setClientname(String clientname) {
		this.clientname = clientname;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getVchno() {
		return this.vchno;
	}

	public void setVchno(String vchno) {
		this.vchno = vchno;
	}

	public String getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

}