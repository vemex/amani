package com.amani.model;

/**
 * CardaccountchangehistoryId entity. @author MyEclipse Persistence Tools
 */

public class CardaccountchangehistoryId implements java.io.Serializable {

	// Fields

	private String changecompid;//公司编号
	private String changecardno;//会员卡号
	private Integer changeaccounttype;//账户类型
	private Integer changeseqno;//序号

	// Constructors

	/** default constructor */
	public CardaccountchangehistoryId() {
	}

	/** full constructor */
	public CardaccountchangehistoryId(String changecompid, String changecardno,
			Integer changeaccounttype, Integer changeseqno) {
		this.changecompid = changecompid;
		this.changecardno = changecardno;
		this.changeaccounttype = changeaccounttype;
		this.changeseqno = changeseqno;
	}

	// Property accessors

	public String getChangecompid() {
		return this.changecompid;
	}

	public void setChangecompid(String changecompid) {
		this.changecompid = changecompid;
	}

	public String getChangecardno() {
		return this.changecardno;
	}

	public void setChangecardno(String changecardno) {
		this.changecardno = changecardno;
	}

	public Integer getChangeaccounttype() {
		return this.changeaccounttype;
	}

	public void setChangeaccounttype(Integer changeaccounttype) {
		this.changeaccounttype = changeaccounttype;
	}

	public Integer getChangeseqno() {
		return this.changeseqno;
	}

	public void setChangeseqno(Integer changeseqno) {
		this.changeseqno = changeseqno;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CardaccountchangehistoryId))
			return false;
		CardaccountchangehistoryId castOther = (CardaccountchangehistoryId) other;

		return ((this.getChangecompid() == castOther.getChangecompid()) || (this
				.getChangecompid() != null
				&& castOther.getChangecompid() != null && this
				.getChangecompid().equals(castOther.getChangecompid())))
				&& ((this.getChangecardno() == castOther.getChangecardno()) || (this
						.getChangecardno() != null
						&& castOther.getChangecardno() != null && this
						.getChangecardno().equals(castOther.getChangecardno())))
				&& ((this.getChangeaccounttype() == castOther
						.getChangeaccounttype()) || (this
						.getChangeaccounttype() != null
						&& castOther.getChangeaccounttype() != null && this
						.getChangeaccounttype().equals(
								castOther.getChangeaccounttype())))
				&& ((this.getChangeseqno() == castOther.getChangeseqno()) || (this
						.getChangeseqno() != null
						&& castOther.getChangeseqno() != null && this
						.getChangeseqno().equals(castOther.getChangeseqno())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getChangecompid() == null ? 0 : this.getChangecompid()
						.hashCode());
		result = 37
				* result
				+ (getChangecardno() == null ? 0 : this.getChangecardno()
						.hashCode());
		result = 37
				* result
				+ (getChangeaccounttype() == null ? 0 : this
						.getChangeaccounttype().hashCode());
		result = 37
				* result
				+ (getChangeseqno() == null ? 0 : this.getChangeseqno()
						.hashCode());
		return result;
	}

}