package com.amani.model;

/**
 * InventorydetalId entity. @author MyEclipse Persistence Tools
 */

public class InventorydetalId implements java.io.Serializable {

	// Fields

	private String compid;
	private String billid;
	private String serial;

	// Constructors

	/** default constructor */
	public InventorydetalId() {
	}

	/** full constructor */
	public InventorydetalId(String compid, String billid, String serial) {
		this.compid = compid;
		this.billid = billid;
		this.serial = serial;
	}

	// Property accessors

	public String getCompid() {
		return this.compid;
	}

	public void setCompid(String compid) {
		this.compid = compid;
	}

	public String getBillid() {
		return this.billid;
	}

	public void setBillid(String billid) {
		this.billid = billid;
	}

	public String getSerial() {
		return this.serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof InventorydetalId))
			return false;
		InventorydetalId castOther = (InventorydetalId) other;

		return ((this.getCompid() == castOther.getCompid()) || (this
				.getCompid() != null && castOther.getCompid() != null && this
				.getCompid().equals(castOther.getCompid())))
				&& ((this.getBillid() == castOther.getBillid()) || (this
						.getBillid() != null && castOther.getBillid() != null && this
						.getBillid().equals(castOther.getBillid())))
				&& ((this.getSerial() == castOther.getSerial()) || (this
						.getSerial() != null && castOther.getSerial() != null && this
						.getSerial().equals(castOther.getSerial())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCompid() == null ? 0 : this.getCompid().hashCode());
		result = 37 * result
				+ (getBillid() == null ? 0 : this.getBillid().hashCode());
		result = 37 * result
				+ (getSerial() == null ? 0 : this.getSerial().hashCode());
		return result;
	}

}