package com.amani.model;

/**
 * CardaccountId entity. @author MyEclipse Persistence Tools
 */

public class CardaccountId implements java.io.Serializable {

	// Fields

	private String cardvesting;//归属公司
	private String cardno;//会员卡号
	private Integer accounttype;//账户类型

	// Constructors

	/** default constructor */
	public CardaccountId() {
	}

	/** full constructor */
	public CardaccountId(String cardvesting, String cardno, Integer accounttype) {
		this.cardvesting = cardvesting;
		this.cardno = cardno;
		this.accounttype = accounttype;
	}

	// Property accessors

	public String getCardvesting() {
		return this.cardvesting;
	}

	public void setCardvesting(String cardvesting) {
		this.cardvesting = cardvesting;
	}

	public String getCardno() {
		return this.cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public Integer getAccounttype() {
		return this.accounttype;
	}

	public void setAccounttype(Integer accounttype) {
		this.accounttype = accounttype;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CardaccountId))
			return false;
		CardaccountId castOther = (CardaccountId) other;

		return ((this.getCardvesting() == castOther.getCardvesting()) || (this
				.getCardvesting() != null && castOther.getCardvesting() != null && this
				.getCardvesting().equals(castOther.getCardvesting())))
				&& ((this.getCardno() == castOther.getCardno()) || (this
						.getCardno() != null && castOther.getCardno() != null && this
						.getCardno().equals(castOther.getCardno())))
				&& ((this.getAccounttype() == castOther.getAccounttype()) || (this
						.getAccounttype() != null
						&& castOther.getAccounttype() != null && this
						.getAccounttype().equals(castOther.getAccounttype())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCardvesting() == null ? 0 : this.getCardvesting()
						.hashCode());
		result = 37 * result
				+ (getCardno() == null ? 0 : this.getCardno().hashCode());
		result = 37
				* result
				+ (getAccounttype() == null ? 0 : this.getAccounttype()
						.hashCode());
		return result;
	}

}