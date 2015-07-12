package com.amani.model;

/**
 * VouchersId entity. @author MyEclipse Persistence Tools
 */

public class VouchersId implements java.io.Serializable {

	// Fields

	private String compid;//公司编号
	private String vchno;//抵用券大类

	// Constructors

	/** default constructor */
	public VouchersId() {
	}

	/** full constructor */
	public VouchersId(String compid, String vchno) {
		this.compid = compid;
		this.vchno = vchno;
	}

	// Property accessors

	public String getCompid() {
		return this.compid;
	}

	public void setCompid(String compid) {
		this.compid = compid;
	}

	public String getVchno() {
		return this.vchno;
	}

	public void setVchno(String vchno) {
		this.vchno = vchno;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VouchersId))
			return false;
		VouchersId castOther = (VouchersId) other;

		return ((this.getCompid() == castOther.getCompid()) || (this
				.getCompid() != null && castOther.getCompid() != null && this
				.getCompid().equals(castOther.getCompid())))
				&& ((this.getVchno() == castOther.getVchno()) || (this
						.getVchno() != null && castOther.getVchno() != null && this
						.getVchno().equals(castOther.getVchno())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCompid() == null ? 0 : this.getCompid().hashCode());
		result = 37 * result
				+ (getVchno() == null ? 0 : this.getVchno().hashCode());
		return result;
	}

}