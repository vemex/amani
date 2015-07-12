package com.amani.bean;

import java.util.List;

public class HzSpadCardInfoBean {
	private String 		cardvesting;	//卡归属
	private String 		card_name;		//卡类型名称
	private String 		cardNo;			//卡号
	private String 		kye;			//卡余额
	private String			kst;			//卡状态		0 未启用 1 启用 2 挂失  3销卡
	private String 		kjf;			//积分
	private int			errorno;		
	private String 		name;			//会员姓名
	private List<HzSpadCardProInfo> list;
	public String getCard_name() {
		return card_name;
	}
	public void setCard_name(String card_name) {
		this.card_name = card_name;
	}
	public String getCardNo() {
		return cardNo;
	}
	public String getKst() {
		return kst;
	}
	public void setKst(String kst) {
		this.kst = kst;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getKye() {
		return kye;
	}
	public void setKye(String kye) {
		this.kye = kye;
	}

	
	public String getKjf() {
		return kjf;
	}
	public void setKjf(String kjf) {
		this.kjf = kjf;
	}
	public int getErrorno() {
		return errorno;
	}
	public void setErrorno(int errorno) {
		this.errorno = errorno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<HzSpadCardProInfo> getList() {
		return list;
	}
	public void setList(List<HzSpadCardProInfo> list) {
		this.list = list;
	}
	public String getCardvesting() {
		return cardvesting;
	}
	public void setCardvesting(String cardvesting) {
		this.cardvesting = cardvesting;
	}
}
