package com.amani.model;

/**
 * VouchersdetalId entity. @author MyEclipse Persistence Tools
 */

public class VouchersdetalId implements java.io.Serializable {

	// Fields

	private String compid;//公司编号
	private String vchno;//抵用券大类
	private String itemno;//项目编号或者产品编号

	// Constructors

	/** default constructor */
	public VouchersdetalId() {
	}

	/** full constructor */
	public VouchersdetalId(String compid, String vchno, String itemno) {
		this.compid = compid;
		this.vchno = vchno;
		this.itemno = itemno;
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

	public String getItemno() {
		return this.itemno;
	}

	public void setItemno(String itemno) {
		this.itemno = itemno;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VouchersdetalId))
			return false;
		VouchersdetalId castOther = (VouchersdetalId) other;

		return ((this.getCompid() == castOther.getCompid()) || (this
				.getCompid() != null && castOther.getCompid() != null && this
				.getCompid().equals(castOther.getCompid())))
				&& ((this.getVchno() == castOther.getVchno()) || (this
						.getVchno() != null && castOther.getVchno() != null && this
						.getVchno().equals(castOther.getVchno())))
				&& ((this.getItemno() == castOther.getItemno()) || (this
						.getItemno() != null && castOther.getItemno() != null && this
						.getItemno().equals(castOther.getItemno())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCompid() == null ? 0 : this.getCompid().hashCode());
		result = 37 * result
				+ (getVchno() == null ? 0 : this.getVchno().hashCode());
		result = 37 * result
				+ (getItemno() == null ? 0 : this.getItemno().hashCode());
		return result;
	}

}