package com.amani.model;



/**
 * Gfm01 generated by MyEclipse - Hibernate Tools
 */

public class Dgoodsbarinfo  implements java.io.Serializable {


    // Fields    

     
     private Integer barnostate  ;//条码状态 0:生成 1:入库 2:发货 3:销售 4:消耗 5:损坏
     private String createdate  ;//生成日期
     private String createstaffno  ;// 生成操作者
     private String inserdate  ;// 入库日期
     private String inserbillno  ;//入库单号
     private String outerdate  ;//发货日期
     private String outerbill  ;//发货单号
     private String receivestore  ;//收货门店
     private String costdate  ;//消费日期/消耗日期
     private String costbillo  ;//消费单号/消耗单号
     private String coststore  ;//消费门店
     private String goodsText  ;//产品名称
     private String bgoodsno;
     private String bgoodsbarno;
     private String barnostateText;  //状态名称
     private String proddate;
	public String getProddate() {
		return proddate;
	}
	public void setProddate(String proddate) {
		this.proddate = proddate;
	}
	public String getBarnostateText() {
		return barnostateText;
	}
	public void setBarnostateText(String barnostateText) {
		this.barnostateText = barnostateText;
	}
	public Integer getBarnostate() {
		return barnostate;
	}
	public void setBarnostate(Integer barnostate) {
		this.barnostate = barnostate;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public String getCreatestaffno() {
		return createstaffno;
	}
	public void setCreatestaffno(String createstaffno) {
		this.createstaffno = createstaffno;
	}
	public String getInserdate() {
		return inserdate;
	}
	public void setInserdate(String inserdate) {
		this.inserdate = inserdate;
	}
	public String getInserbillno() {
		return inserbillno;
	}
	public void setInserbillno(String inserbillno) {
		this.inserbillno = inserbillno;
	}
	public String getOuterdate() {
		return outerdate;
	}
	public void setOuterdate(String outerdate) {
		this.outerdate = outerdate;
	}
	public String getOuterbill() {
		return outerbill;
	}
	public void setOuterbill(String outerbill) {
		this.outerbill = outerbill;
	}
	public String getReceivestore() {
		return receivestore;
	}
	public void setReceivestore(String receivestore) {
		this.receivestore = receivestore;
	}
	public String getCostdate() {
		return costdate;
	}
	public void setCostdate(String costdate) {
		this.costdate = costdate;
	}
	public String getCostbillo() {
		return costbillo;
	}
	public void setCostbillo(String costbillo) {
		this.costbillo = costbillo;
	}
	public String getCoststore() {
		return coststore;
	}
	public void setCoststore(String coststore) {
		this.coststore = coststore;
	}
	public String getGoodsText() {
		return goodsText;
	}
	public void setGoodsText(String goodsText) {
		this.goodsText = goodsText;
	}
	public String getBgoodsno() {
		return bgoodsno;
	}
	public void setBgoodsno(String bgoodsno) {
		this.bgoodsno = bgoodsno;
	}
	public String getBgoodsbarno() {
		return bgoodsbarno;
	}
	public void setBgoodsbarno(String bgoodsbarno) {
		this.bgoodsbarno = bgoodsbarno;
	}
 	
}