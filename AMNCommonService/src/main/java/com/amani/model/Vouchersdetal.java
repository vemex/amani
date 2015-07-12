package com.amani.model;

/**
 * Vouchersdetal entity. @author MyEclipse Persistence Tools
 */

public class Vouchersdetal implements java.io.Serializable {

	// Fields

	private VouchersdetalId id;
	private Integer vchtype;//抵用券类型
	private Double amt;//金额

	// Constructors

	/** default constructor */
	public Vouchersdetal() {
	}

	/** minimal constructor */
	public Vouchersdetal(VouchersdetalId id) {
		this.id = id;
	}

	/** full constructor */
	public Vouchersdetal(VouchersdetalId id, Integer vchtype, Double amt) {
		this.id = id;
		this.vchtype = vchtype;
		this.amt = amt;
	}

	// Property accessors

	public VouchersdetalId getId() {
		return this.id;
	}

	public void setId(VouchersdetalId id) {
		this.id = id;
	}

	public Integer getVchtype() {
		return this.vchtype;
	}

	public void setVchtype(Integer vchtype) {
		this.vchtype = vchtype;
	}

	public Double getAmt() {
		return this.amt;
	}

	public void setAmt(Double amt) {
		this.amt = amt;
	}

}