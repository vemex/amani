package com.amani.model;

import java.math.BigDecimal;

import com.amani.tools.CommonTool;

/**
 * 
 * @author LiuJie Jul 1, 2013 12:37:06 PM
 * @version: 1.0
 * @Copyright: AMN
 */
public class Cardproaccount  implements java.io.Serializable {


	private CardproaccountId id;
	private Integer propricetype;//疗程类型
    private BigDecimal salecount;//购买总次数
    private BigDecimal costcount;//已经使用次数
    private BigDecimal lastcount;//剩余次数
    private BigDecimal saleamt;//疗程金额
    private BigDecimal costamt;//已经使用金额
    private BigDecimal lastamt;//剩余金额
	private String saledate;//账户开立日
	private String cutoffdate;//账户截至日
	private String proremark;//疗程备注
	private Integer prostopeflag;//是否停用
	private BigDecimal exchangeseqno;//疗程兑换序号
	private String bcardvesting;
	private String bprojectno;
	private String bprojectname;
	private String changecompid;//兑换门店
	private String changebillid;//兑换单号
	private double bproseqno;
	private String createbilltype;
	private String createbillno;
	private double createseqno;
	public double getCreateseqno() {
		return createseqno;
	}
	public void setCreateseqno(double createseqno) {
		this.createseqno = createseqno;
	}
	public double getBproseqno() {
		return bproseqno;
	}
	public void setBproseqno(double bproseqno) {
		this.bproseqno = bproseqno;
	}
	public CardproaccountId getId() {
		return id;
	}
	public void setId(CardproaccountId id) {
		this.id = id;
	}
	public Integer getPropricetype() {
		return propricetype;
	}
	public void setPropricetype(Integer propricetype) {
		this.propricetype = propricetype;
	}
	public BigDecimal getSalecount() {
		return salecount;
	}
	public void setSalecount(BigDecimal salecount) {
		this.salecount = salecount;
	}
	public BigDecimal getCostcount() {
		return costcount;
	}
	public void setCostcount(BigDecimal costcount) {
		this.costcount = costcount;
	}
	public BigDecimal getLastcount() {
		return lastcount;
	}
	public void setLastcount(BigDecimal lastcount) {
		this.lastcount = lastcount;
	}
	public BigDecimal getSaleamt() {
		return saleamt;
	}
	public void setSaleamt(BigDecimal saleamt) {
		this.saleamt = saleamt;
	}
	public BigDecimal getCostamt() {
		return costamt;
	}
	public void setCostamt(BigDecimal costamt) {
		this.costamt = costamt;
	}
	public BigDecimal getLastamt() {
		return lastamt;
	}
	public void setLastamt(BigDecimal lastamt) {
		this.lastamt = lastamt;
	}
	public String getSaledate() {
		return saledate;
	}
	public void setSaledate(String saledate) {
		this.saledate = saledate;
	}
	public String getCutoffdate() {
		return cutoffdate;
	}
	public void setCutoffdate(String cutoffdate) {
		this.cutoffdate = cutoffdate;
	}
	public String getProremark() {
		return proremark;
	}
	public void setProremark(String proremark) {
		this.proremark = proremark;
	}
	public Integer getProstopeflag() {
		return prostopeflag;
	}
	public void setProstopeflag(Integer prostopeflag) {
		this.prostopeflag = prostopeflag;
	}
	public BigDecimal getExchangeseqno() {
		return exchangeseqno;
	}
	public void setExchangeseqno(BigDecimal exchangeseqno) {
		this.exchangeseqno = exchangeseqno;
	}
	public String getBprojectno() {
		return bprojectno;
	}
	public void setBprojectno(String bprojectno) {
		this.bprojectno = bprojectno;
	}
	public String getBprojectname() {
		return bprojectname;
	}
	public void setBprojectname(String bprojectname) {
		this.bprojectname = bprojectname;
	}
	public String getChangecompid() {
		return changecompid;
	}
	public void setChangecompid(String changecompid) {
		this.changecompid = changecompid;
	}
	public String getCreatebilltype() {
		return createbilltype;
	}
	public void setCreatebilltype(String createbilltype) {
		this.createbilltype = createbilltype;
	}
	public String getCreatebillno() {
		return createbillno;
	}
	public void setCreatebillno(String createbillno) {
		this.createbillno = createbillno;
	}
	public String getChangebillid() {
		return changebillid;
	}
	public void setChangebillid(String changebillid) {
		this.changebillid = changebillid;
	}
	public String getBcardvesting() {
		return bcardvesting;
	}
	public void setBcardvesting(String bcardvesting) {
		this.bcardvesting = bcardvesting;
	}	
}