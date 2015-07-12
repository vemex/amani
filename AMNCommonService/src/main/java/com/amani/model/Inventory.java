package com.amani.model;

/**
 * Inventory entity. @author MyEclipse Persistence Tools
 */

public class Inventory implements java.io.Serializable {

	// Fields

	private InventoryId id;
	private String createdate;
	private String userid;
	private String remark;
	private Integer state;

	// Constructors

	/** default constructor */
	public Inventory() {
	}

	/** minimal constructor */
	public Inventory(InventoryId id) {
		this.id = id;
	}

	/** full constructor */
	public Inventory(InventoryId id, String createdate, String userid,
			String remark, Integer state) {
		this.id = id;
		this.createdate = createdate;
		this.userid = userid;
		this.remark = remark;
		this.state = state;
	}

	// Property accessors

	public InventoryId getId() {
		return this.id;
	}

	public void setId(InventoryId id) {
		this.id = id;
	}

	public String getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}