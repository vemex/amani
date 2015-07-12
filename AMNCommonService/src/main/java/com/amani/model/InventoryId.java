package com.amani.model;

/**
 * InventoryId entity. @author MyEclipse Persistence Tools
 */

public class InventoryId implements java.io.Serializable {

	// Fields

	private String compid;
	private String billid;
	private String invenbill;

	// Constructors

	/** default constructor */
	public InventoryId() {
	}

	/** full constructor */
	public InventoryId(String compid, String billid, String invenbill) {
		this.compid = compid;
		this.billid = billid;
		this.invenbill = invenbill;
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

	public String getInvenbill() {
		return this.invenbill;
	}

	public void setInvenbill(String invenbill) {
		this.invenbill = invenbill;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof InventoryId))
			return false;
		InventoryId castOther = (InventoryId) other;

		return ((this.getCompid() == castOther.getCompid()) || (this
				.getCompid() != null && castOther.getCompid() != null && this
				.getCompid().equals(castOther.getCompid())))
				&& ((this.getBillid() == castOther.getBillid()) || (this
						.getBillid() != null && castOther.getBillid() != null && this
						.getBillid().equals(castOther.getBillid())))
				&& ((this.getInvenbill() == castOther.getInvenbill()) || (this
						.getInvenbill() != null
						&& castOther.getInvenbill() != null && this
						.getInvenbill().equals(castOther.getInvenbill())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCompid() == null ? 0 : this.getCompid().hashCode());
		result = 37 * result
				+ (getBillid() == null ? 0 : this.getBillid().hashCode());
		result = 37 * result
				+ (getInvenbill() == null ? 0 : this.getInvenbill().hashCode());
		return result;
	}

}