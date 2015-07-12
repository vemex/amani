package com.amani.model;

import java.math.BigDecimal;


public class Nointernalcardinfo  implements java.io.Serializable {


    // Fields    

     private NointernalcardinfoId id;
     private Integer cardtype;//卡类型 -- 1 抵用券，2条码卡 3活动券(项目+产品)
     private BigDecimal cardfaceamt;//面值
     private Integer carduseflag;//使用类型 1 项目  2 现金 (抵用券有效,条码卡默认项目)
     private Integer entrytype;//登记类型  // 0  正常登记,1 赠送
     private Integer cardstate;//卡状态  //0 登记     1，正常使用  2 已用
     private String usedate;//--使用日期  
     private String useinproject;//抵用项目(现金券有效)  
     private String oldvalidate;//原始有效日期  
     private String lastvalidate;//最新有效日期
     private String enabledate;//启用日期
     private String bcardvesting;
     private String bcardno;
     private String carduseflagText;
     private String cardstateText;
     private String entrytypeText;
     private Integer uespassward;//--是否需要密码  -- 0 不需要 1 需要
     private String cardpassward;//消费密码
     private Integer createtype;//-- 0普通券 1 五一活动券
     private Integer createcardtype;
     private String createcardtypename;
     private String phone;
     private String billid;
	public String getBillid() {
		return billid;
	}
	public void setBillid(String billid) {
		this.billid = billid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getCreatecardtype() {
		return createcardtype;
	}
	public void setCreatecardtype(Integer createcardtype) {
		this.createcardtype = createcardtype;
	}
	public Integer getUespassward() {
		return uespassward;
	}
	public void setUespassward(Integer uespassward) {
		this.uespassward = uespassward;
	}
	public String getCardpassward() {
		return cardpassward;
	}
	public void setCardpassward(String cardpassward) {
		this.cardpassward = cardpassward;
	}
	public String getCardstateText() {
		return cardstateText;
	}
	public void setCardstateText(String cardstateText) {
		this.cardstateText = cardstateText;
	}
	public String getCarduseflagText() {
		return carduseflagText;
	}
	public void setCarduseflagText(String carduseflagText) {
		this.carduseflagText = carduseflagText;
	}
	public NointernalcardinfoId getId() {
		return id;
	}
	public void setId(NointernalcardinfoId id) {
		this.id = id;
	}

	public Integer getCardtype() {
		return cardtype;
	}
	public void setCardtype(Integer cardtype) {
		this.cardtype = cardtype;
	}
	
	public Integer getCarduseflag() {
		return carduseflag;
	}
	public void setCarduseflag(Integer carduseflag) {
		this.carduseflag = carduseflag;
	}
	public Integer getEntrytype() {
		return entrytype;
	}
	public void setEntrytype(Integer entrytype) {
		this.entrytype = entrytype;
	}
	public Integer getCardstate() {
		return cardstate;
	}
	public void setCardstate(Integer cardstate) {
		this.cardstate = cardstate;
	}
	public String getUsedate() {
		return usedate;
	}
	public void setUsedate(String usedate) {
		this.usedate = usedate;
	}
	public String getUseinproject() {
		return useinproject;
	}
	public void setUseinproject(String useinproject) {
		this.useinproject = useinproject;
	}
	public String getOldvalidate() {
		return oldvalidate;
	}
	public void setOldvalidate(String oldvalidate) {
		this.oldvalidate = oldvalidate;
	}
	public String getLastvalidate() {
		return lastvalidate;
	}
	public void setLastvalidate(String lastvalidate) {
		this.lastvalidate = lastvalidate;
	}
	public BigDecimal getCardfaceamt() {
		return cardfaceamt;
	}
	public void setCardfaceamt(BigDecimal cardfaceamt) {
		this.cardfaceamt = cardfaceamt;
	}
	public String getBcardvesting() {
		return bcardvesting;
	}
	public void setBcardvesting(String bcardvesting) {
		this.bcardvesting = bcardvesting;
	}
	public String getBcardno() {
		return bcardno;
	}
	public void setBcardno(String bcardno) {
		this.bcardno = bcardno;
	}
	public String getEntrytypeText() {
		return entrytypeText;
	}
	public void setEntrytypeText(String entrytypeText) {
		this.entrytypeText = entrytypeText;
	}
	public String getEnabledate() {
		return enabledate;
	}
	public void setEnabledate(String enabledate) {
		this.enabledate = enabledate;
	}
	public Integer getCreatetype() {
		return createtype;
	}
	public void setCreatetype(Integer createtype) {
		this.createtype = createtype;
	}
	public String getCreatecardtypename() {
		return createcardtypename;
	}
	public void setCreatecardtypename(String createcardtypename) {
		this.createcardtypename = createcardtypename;
	}
   
    
}