package com.amani.model;

/**
 * Cardaccount entity. @author MyEclipse Persistence Tools
 */

public class Cardaccount implements java.io.Serializable {

	// Fields

	private CardaccountId id;
	private Double accountbalance;//余额
	private Double accountdebts;//欠款
	private String accountdatefrom;//账号开立日期
	private String accountdateend;//账号截至日期
	private String accountremark;//账号备注

	// Constructors

	/** default constructor */
	public Cardaccount() {
	}

	/** minimal constructor */
	public Cardaccount(CardaccountId id) {
		this.id = id;
	}

	/** full constructor */
	public Cardaccount(CardaccountId id, Double accountbalance,
			Double accountdebts, String accountdatefrom, String accountdateend,
			String accountremark) {
		this.id = id;
		this.accountbalance = accountbalance;
		this.accountdebts = accountdebts;
		this.accountdatefrom = accountdatefrom;
		this.accountdateend = accountdateend;
		this.accountremark = accountremark;
	}

	// Property accessors

	public CardaccountId getId() {
		return this.id;
	}

	public void setId(CardaccountId id) {
		this.id = id;
	}

	public Double getAccountbalance() {
		return this.accountbalance;
	}

	public void setAccountbalance(Double accountbalance) {
		this.accountbalance = accountbalance;
	}

	public Double getAccountdebts() {
		return this.accountdebts;
	}

	public void setAccountdebts(Double accountdebts) {
		this.accountdebts = accountdebts;
	}

	public String getAccountdatefrom() {
		return this.accountdatefrom;
	}

	public void setAccountdatefrom(String accountdatefrom) {
		this.accountdatefrom = accountdatefrom;
	}

	public String getAccountdateend() {
		return this.accountdateend;
	}

	public void setAccountdateend(String accountdateend) {
		this.accountdateend = accountdateend;
	}

	public String getAccountremark() {
		return this.accountremark;
	}

	public void setAccountremark(String accountremark) {
		this.accountremark = accountremark;
	}

}