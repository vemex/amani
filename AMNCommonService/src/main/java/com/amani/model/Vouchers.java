package com.amani.model;

/**
 * Vouchers entity. @author MyEclipse Persistence Tools
 */

public class Vouchers implements java.io.Serializable {

	// Fields

	private VouchersId id;
	private String vchname;//大类名称
	private Integer vchtype;//抵用券类型
	private String typename;//类型名称
	private Double amt;//金额

	// Constructors

	public Double getAmt() {
		return amt;
	}

	public void setAmt(Double amt) {
		this.amt = amt;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	/** default constructor */
	public Vouchers() {
	}

	/** minimal constructor */
	public Vouchers(VouchersId id) {
		this.id = id;
	}

	/** full constructor */
	public Vouchers(VouchersId id, String vchname, Integer vchtype) {
		this.id = id;
		this.vchname = vchname;
		this.vchtype = vchtype;
	}

	// Property accessors

	public VouchersId getId() {
		return this.id;
	}

	public void setId(VouchersId id) {
		this.id = id;
	}

	public String getVchname() {
		return this.vchname;
	}

	public void setVchname(String vchname) {
		this.vchname = vchname;
	}

	public Integer getVchtype() {
		return this.vchtype;
	}

	public void setVchtype(Integer vchtype) {
		this.vchtype = vchtype;
	}

}