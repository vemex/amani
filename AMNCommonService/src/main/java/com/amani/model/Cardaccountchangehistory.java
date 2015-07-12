package com.amani.model;

/**
 * Cardaccountchangehistory entity. @author MyEclipse Persistence Tools
 */

public class Cardaccountchangehistory implements java.io.Serializable {

	// Fields

	private CardaccountchangehistoryId id;
	private Integer changetype;//异动类型
	private Double changeamt;//异动金额
	private String changebilltype;//异动单据类型
	private String changebillno;//异动单据编号
	private String chagedate;//异动日期
	private Double changebeforeamt;//前次金额
	private String changemark;//异动备注
	private String strAccountTypeName;
	

	// Constructors

	public String getStrAccountTypeName() {
		return strAccountTypeName;
	}

	public void setStrAccountTypeName(String strAccountTypeName) {
		this.strAccountTypeName = strAccountTypeName;
	}

	/** default constructor */
	public Cardaccountchangehistory() {
	}

	/** minimal constructor */
	public Cardaccountchangehistory(CardaccountchangehistoryId id) {
		this.id = id;
	}

	/** full constructor */
	public Cardaccountchangehistory(CardaccountchangehistoryId id,
			Integer changetype, Double changeamt, String changebilltype,
			String changebillno, String chagedate, Double changebeforeamt,
			String changemark) {
		this.id = id;
		this.changetype = changetype;
		this.changeamt = changeamt;
		this.changebilltype = changebilltype;
		this.changebillno = changebillno;
		this.chagedate = chagedate;
		this.changebeforeamt = changebeforeamt;
		this.changemark = changemark;
	}

	// Property accessors

	public CardaccountchangehistoryId getId() {
		return this.id;
	}

	public void setId(CardaccountchangehistoryId id) {
		this.id = id;
	}

	public Integer getChangetype() {
		return this.changetype;
	}

	public void setChangetype(Integer changetype) {
		this.changetype = changetype;
	}

	public Double getChangeamt() {
		return this.changeamt;
	}

	public void setChangeamt(Double changeamt) {
		this.changeamt = changeamt;
	}

	public String getChangebilltype() {
		return this.changebilltype;
	}

	public void setChangebilltype(String changebilltype) {
		this.changebilltype = changebilltype;
	}

	public String getChangebillno() {
		return this.changebillno;
	}

	public void setChangebillno(String changebillno) {
		this.changebillno = changebillno;
	}

	public String getChagedate() {
		return this.chagedate;
	}

	public void setChagedate(String chagedate) {
		this.chagedate = chagedate;
	}

	public Double getChangebeforeamt() {
		return this.changebeforeamt;
	}

	public void setChangebeforeamt(Double changebeforeamt) {
		this.changebeforeamt = changebeforeamt;
	}

	public String getChangemark() {
		return this.changemark;
	}

	public void setChangemark(String changemark) {
		this.changemark = changemark;
	}

}