package com.amani.model;

import java.math.BigDecimal;

import com.amani.tools.CommonTool;

/**
 * 
 * @author LiuJie Jul 1, 2013 12:37:06 PM
 * @version: 1.0
 * @Copyright: AMN
 */
public class Projectinfo  implements java.io.Serializable {


	private ProjectinfoId id;
	private String prjname;//项目简称
	private String prjtype;//项目类别
	private Integer prjpricetype;//项目项别--常用资料类别  1大项 2小项
	private String prjreporttype;//统计分类 
	private String saleunit; //计价单位
	private BigDecimal saleprice; //标准价格
    private BigDecimal msalecount;//价格1次数,月
    private BigDecimal msaleprice;//价格1金额,月
    private BigDecimal rsalecount;//价格2次数,季度
    private BigDecimal rsaleprice;//价格2金额,季度
    private BigDecimal hsalecount;//价格3次数,半年
    private BigDecimal hsaleprice;//价格3金额,半年
    private BigDecimal ysalecount;//价格4次数,年
    private BigDecimal ysaleprice;//价格4金额,年
    private BigDecimal onecountprice;//单次价
    private BigDecimal onepageprice;//体验价格(散客价)
    private BigDecimal memberprice;//体验价格(会员价)
    private BigDecimal salelowprice;//最低价 
    private Integer needhairflag;//是否需要洗头费 	1是  2否
    private Integer useflag;//启用标志			 1正常 2停用
    private Integer saleflag;//购买是否启售   1是  2否
    private Integer rateflag;//购买是否打折		 1是  2否
    private Integer prjsaletype;//是否是疗程	 1是  2否
    private Integer editflag;//可否编辑价格		 1是  2否
    private Integer pointtype;//积分方式
    private BigDecimal pointvalue;//积分或比率
    private Integer costtype;// 项目是否必须现金支付，1为必须现金支付，0为未必
    private BigDecimal costprice;//成本
    private BigDecimal kyjrate;//业绩比率
    private BigDecimal ktcrate;//工资比率
    private BigDecimal lyjrate;//疗程业绩比率
    private BigDecimal ltcrate;//疗程工资比率
    private String bprisource;//
    private String bprjno;
    private String bprjmodeId;
    private Integer finaltype;//固有资料  0 附加 1固有
    private String prjabridge;//项目缩写
    private BigDecimal newcosttc;//新客提成数
    private BigDecimal oldcosttc;//老客提成数
    private Integer markflag;//疗程兑换是否需要备注
    private Integer morelongflag;//是否有超长价
	private int selfFlag;//是否输入自己的附属部分
	private String ipadname;//IPAD显示名称
	private String ipddl;//IPAD大类
	public String getIpddl() {
		return ipddl;
	}
	public void setIpddl(String ipddl) {
		this.ipddl = ipddl;
	}
	public Integer getFinaltype() {
		return finaltype;
	}
	public void setFinaltype(Integer finaltype) {
		this.finaltype = finaltype;
	}
	public String getBprjno() {
		return bprjno;
	}
	public void setBprjno(String bprjno) {
		this.bprjno = bprjno;
	}
	public String getBprjmodeId() {
		return bprjmodeId;
	}
	public void setBprjmodeId(String bprjmodeId) {
		this.bprjmodeId = bprjmodeId;
	}
	public ProjectinfoId getId() {
		return id;
	}
	public void setId(ProjectinfoId id) {
		this.id = id;
	}
	public String getPrjname() {
		return prjname;
	}
	public void setPrjname(String prjname) {
		this.prjname = prjname;
	}
	public String getPrjtype() {
		return prjtype;
	}
	public void setPrjtype(String prjtype) {
		this.prjtype = prjtype;
	}
	public Integer getPrjpricetype() {
		return prjpricetype;
	}
	public void setPrjpricetype(Integer prjpricetype) {
		this.prjpricetype = prjpricetype;
	}
	public String getPrjreporttype() {
		return prjreporttype;
	}
	public void setPrjreporttype(String prjreporttype) {
		this.prjreporttype = prjreporttype;
	}
	public String getSaleunit() {
		return saleunit;
	}
	public void setSaleunit(String saleunit) {
		this.saleunit = saleunit;
	}
	public BigDecimal getSaleprice() {
		return CommonTool.FormatBigDecimal(saleprice).setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	public void setSaleprice(BigDecimal saleprice) {
		this.saleprice = saleprice;
	}
	public BigDecimal getMsalecount() {
		return CommonTool.FormatBigDecimal(msalecount).setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	public void setMsalecount(BigDecimal msalecount) {
		this.msalecount = msalecount;
	}
	public BigDecimal getMsaleprice() {
		return CommonTool.FormatBigDecimal(msaleprice).setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	public void setMsaleprice(BigDecimal msaleprice) {
		this.msaleprice = msaleprice;
	}
	public BigDecimal getRsalecount() {
		return CommonTool.FormatBigDecimal(rsalecount).setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	public void setRsalecount(BigDecimal rsalecount) {
		this.rsalecount = rsalecount;
	}
	public BigDecimal getRsaleprice() {
		return CommonTool.FormatBigDecimal(rsaleprice).setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	public void setRsaleprice(BigDecimal rsaleprice) {
		this.rsaleprice = rsaleprice;
	}
	public BigDecimal getHsalecount() {
		return CommonTool.FormatBigDecimal(hsalecount).setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	public void setHsalecount(BigDecimal hsalecount) {
		this.hsalecount = hsalecount;
	}
	public BigDecimal getHsaleprice() {
		return CommonTool.FormatBigDecimal(hsaleprice).setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	public void setHsaleprice(BigDecimal hsaleprice) {
		this.hsaleprice = hsaleprice;
	}
	public BigDecimal getYsalecount() {
		return CommonTool.FormatBigDecimal(ysalecount).setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	public void setYsalecount(BigDecimal ysalecount) {
		this.ysalecount = ysalecount;
	}
	public BigDecimal getYsaleprice() {
		return CommonTool.FormatBigDecimal(ysaleprice).setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	public void setYsaleprice(BigDecimal ysaleprice) {
		this.ysaleprice = ysaleprice;
	}
	public BigDecimal getOnecountprice() {
		return CommonTool.FormatBigDecimal(onecountprice).setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	public void setOnecountprice(BigDecimal onecountprice) {
		this.onecountprice = onecountprice;
	}
	public BigDecimal getSalelowprice() {
		return CommonTool.FormatBigDecimal(salelowprice).setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	public void setSalelowprice(BigDecimal salelowprice) {
		this.salelowprice = salelowprice;
	}
	public Integer getNeedhairflag() {
		return needhairflag;
	}
	public void setNeedhairflag(Integer needhairflag) {
		this.needhairflag = needhairflag;
	}
	public Integer getUseflag() {
		return useflag;
	}
	public void setUseflag(Integer useflag) {
		this.useflag = useflag;
	}
	public Integer getSaleflag() {
		return saleflag;
	}
	public void setSaleflag(Integer saleflag) {
		this.saleflag = saleflag;
	}
	public Integer getRateflag() {
		return rateflag;
	}
	public void setRateflag(Integer rateflag) {
		this.rateflag = rateflag;
	}
	public Integer getPrjsaletype() {
		return prjsaletype;
	}
	public void setPrjsaletype(Integer prjsaletype) {
		this.prjsaletype = prjsaletype;
	}
	public Integer getEditflag() {
		return editflag;
	}
	public void setEditflag(Integer editflag) {
		this.editflag = editflag;
	}
	public Integer getPointtype() {
		return pointtype;
	}
	public void setPointtype(Integer pointtype) {
		this.pointtype = pointtype;
	}
	public BigDecimal getPointvalue() {
		return CommonTool.FormatBigDecimal(pointvalue).setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	public void setPointvalue(BigDecimal pointvalue) {
		this.pointvalue = pointvalue;
	}
	public Integer getCosttype() {
		return costtype;
	}
	public void setCosttype(Integer costtype) {
		this.costtype = costtype;
	}
	public BigDecimal getCostprice() {
		return costprice;
	}
	public void setCostprice(BigDecimal costprice) {
		this.costprice = costprice;
	}
	public BigDecimal getKyjrate() {
		return kyjrate;
	}
	public void setKyjrate(BigDecimal kyjrate) {
		this.kyjrate = kyjrate;
	}
	public BigDecimal getKtcrate() {
		return ktcrate;
	}
	public void setKtcrate(BigDecimal ktcrate) {
		this.ktcrate = ktcrate;
	}
	public BigDecimal getLyjrate() {
		return lyjrate;
	}
	public void setLyjrate(BigDecimal lyjrate) {
		this.lyjrate = lyjrate;
	}
	public BigDecimal getLtcrate() {
		return ltcrate;
	}
	public void setLtcrate(BigDecimal ltcrate) {
		this.ltcrate = ltcrate;
	}
	
	public String getBprisource() {
		return bprisource;
	}
	public void setBprisource(String bprisource) {
		this.bprisource = bprisource;
	}
	public BigDecimal getOnepageprice() {
		return onepageprice;
	}
	public void setOnepageprice(BigDecimal onepageprice) {
		this.onepageprice = onepageprice;
	}
	public int getSelfFlag() {
		return selfFlag;
	}
	public void setSelfFlag(int selfFlag) {
		this.selfFlag = selfFlag;
	}
	public String getPrjabridge() {
		return prjabridge;
	}
	public void setPrjabridge(String prjabridge) {
		this.prjabridge = prjabridge;
	}
	public BigDecimal getMemberprice() {
		return memberprice;
	}
	public void setMemberprice(BigDecimal memberprice) {
		this.memberprice = memberprice;
	}
	public BigDecimal getNewcosttc() {
		return newcosttc;
	}
	public void setNewcosttc(BigDecimal newcosttc) {
		this.newcosttc = newcosttc;
	}
	public BigDecimal getOldcosttc() {
		return oldcosttc;
	}
	public void setOldcosttc(BigDecimal oldcosttc) {
		this.oldcosttc = oldcosttc;
	}
	public Integer getMarkflag() {
		return markflag;
	}
	public void setMarkflag(Integer markflag) {
		this.markflag = markflag;
	}
	public Integer getMorelongflag() {
		return morelongflag;
	}
	public void setMorelongflag(Integer morelongflag) {
		this.morelongflag = morelongflag;
	}
	/**
	 *  @BareFieldName : ipadname
	 *
	 *  @return  the ipadname
	 *
	 *
	 **/
	
	public String getIpadname() {
		return ipadname;
	}
	/**
	 *  @BareFieldName : ipadname
	 *
	 *  @return  the ipadname
	 *
	 *  @param ipadname the ipadname to set
	 *
	 **/
	
	public void setIpadname(String ipadname) {
		this.ipadname = ipadname;
	}

	
}