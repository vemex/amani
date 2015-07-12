package com.amani.model;

import java.math.BigDecimal;

/**
 * 
 * @author LiuJie Jul 1, 2013 12:37:06 PM
 * @version: 1.0
 * @Copyright: AMN
 */
public class Staffinfo  implements java.io.Serializable {


	private StaffinfoId id;
	private String bstaffno;
	private String staffname;
	private String staffename;
	private Integer staffsex;
	private String department; 
	private String departmentText; 
    private String position;
    private String positionText;
    private String arrivaldate; 
    private String leavedate;
    private String contractdate; 
    private String pccid; 
    private String educational; 
    private String birthdate; 
    private BigDecimal height; 
    private BigDecimal bodyweight; 
    private String aaddress; 
    private String qqno; 
    private String mobilephone; 
    private String email; 
    private String healthno; 
    private String healthdate; 
    private String curstate; 
    private BigDecimal socialsecurity; 
    private String remark; 
    private String searchpassword; 
    private String staffpassword; 
    private String manageno; 
    private String reservecontect; 
    private String reservephone; 
    private String reserveaddress; 
    private String introductioner; 
    private Integer leveltype; 
    private BigDecimal basesalary; 
    private Integer businessflag; 
    private String banktype; 
    private String banktypeText;
    private String bankno; 
    private String resulttye; 
    private String resulttyeText; 
    private BigDecimal resultrate; 
    private BigDecimal baseresult; 
    private Integer salaryflag;
    private String staffopenid;

	public String getStaffopenid() {
		return staffopenid;
	}
	public void setStaffopenid(String staffopenid) {
		this.staffopenid = staffopenid;
	}
	public StaffinfoId getId() {
		return id;
	}
	public void setId(StaffinfoId id) {
		this.id = id;
	}

	public String getBstaffno() {
		return bstaffno;
	}
	public void setBstaffno(String bstaffno) {
		this.bstaffno = bstaffno;
	}
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	public String getStaffename() {
		return staffename;
	}
	public void setStaffename(String staffename) {
		this.staffename = staffename;
	}
	public Integer getStaffsex() {
		return staffsex;
	}
	public void setStaffsex(Integer staffsex) {
		this.staffsex = staffsex;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getArrivaldate() {
		return arrivaldate;
	}
	public void setArrivaldate(String arrivaldate) {
		this.arrivaldate = arrivaldate;
	}
	public String getContractdate() {
		return contractdate;
	}
	public void setContractdate(String contractdate) {
		this.contractdate = contractdate;
	}
	public String getPccid() {
		return pccid;
	}
	public void setPccid(String pccid) {
		this.pccid = pccid;
	}
	public String getEducational() {
		return educational;
	}
	public void setEducational(String educational) {
		this.educational = educational;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public BigDecimal getHeight() {
		return height;
	}
	public void setHeight(BigDecimal height) {
		this.height = height;
	}
	public BigDecimal getBodyweight() {
		return bodyweight;
	}
	public void setBodyweight(BigDecimal bodyweight) {
		this.bodyweight = bodyweight;
	}
	public String getAaddress() {
		return aaddress;
	}
	public void setAaddress(String aaddress) {
		this.aaddress = aaddress;
	}
	public String getQqno() {
		return qqno;
	}
	public void setQqno(String qqno) {
		this.qqno = qqno;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHealthno() {
		return healthno;
	}
	public void setHealthno(String healthno) {
		this.healthno = healthno;
	}
	public String getHealthdate() {
		return healthdate;
	}
	public void setHealthdate(String healthdate) {
		this.healthdate = healthdate;
	}
	public String getCurstate() {
		return curstate;
	}
	public void setCurstate(String curstate) {
		this.curstate = curstate;
	}
	public BigDecimal getSocialsecurity() {
		return socialsecurity;
	}
	public void setSocialsecurity(BigDecimal socialsecurity) {
		this.socialsecurity = socialsecurity;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getSearchpassword() {
		return searchpassword;
	}
	public void setSearchpassword(String searchpassword) {
		this.searchpassword = searchpassword;
	}
	public String getStaffpassword() {
		return staffpassword;
	}
	public void setStaffpassword(String staffpassword) {
		this.staffpassword = staffpassword;
	}
	public String getManageno() {
		return manageno;
	}
	public void setManageno(String manageno) {
		this.manageno = manageno;
	}
	public String getReservecontect() {
		return reservecontect;
	}
	public void setReservecontect(String reservecontect) {
		this.reservecontect = reservecontect;
	}
	public String getReservephone() {
		return reservephone;
	}
	public void setReservephone(String reservephone) {
		this.reservephone = reservephone;
	}
	public String getReserveaddress() {
		return reserveaddress;
	}
	public void setReserveaddress(String reserveaddress) {
		this.reserveaddress = reserveaddress;
	}
	public String getIntroductioner() {
		return introductioner;
	}
	public void setIntroductioner(String introductioner) {
		this.introductioner = introductioner;
	}
	public Integer getLeveltype() {
		return leveltype;
	}
	public void setLeveltype(Integer leveltype) {
		this.leveltype = leveltype;
	}
	public BigDecimal getBasesalary() {
		return basesalary;
	}
	public void setBasesalary(BigDecimal basesalary) {
		this.basesalary = basesalary;
	}
	public Integer getBusinessflag() {
		return businessflag;
	}
	public void setBusinessflag(Integer businessflag) {
		this.businessflag = businessflag;
	}
	public String getBanktype() {
		return banktype;
	}
	public void setBanktype(String banktype) {
		this.banktype = banktype;
	}
	public String getBankno() {
		return bankno;
	}
	public void setBankno(String bankno) {
		this.bankno = bankno;
	}
	public String getResulttye() {
		return resulttye;
	}
	public void setResulttye(String resulttye) {
		this.resulttye = resulttye;
	}
	public BigDecimal getResultrate() {
		return resultrate;
	}
	public void setResultrate(BigDecimal resultrate) {
		this.resultrate = resultrate;
	}
	public BigDecimal getBaseresult() {
		return baseresult;
	}
	public void setBaseresult(BigDecimal baseresult) {
		this.baseresult = baseresult;
	}
	public Integer getSalaryflag() {
		return salaryflag;
	}
	public void setSalaryflag(Integer salaryflag) {
		this.salaryflag = salaryflag;
	}
	public String getLeavedate() {
		return leavedate;
	}
	public void setLeavedate(String leavedate) {
		this.leavedate = leavedate;
	}
	public String getDepartmentText() {
		return departmentText;
	}
	public void setDepartmentText(String departmentText) {
		this.departmentText = departmentText;
	}
	public String getPositionText() {
		return positionText;
	}
	public void setPositionText(String positionText) {
		this.positionText = positionText;
	}
	public String getBanktypeText() {
		return banktypeText;
	}
	public void setBanktypeText(String banktypeText) {
		this.banktypeText = banktypeText;
	}
	public String getResulttyeText() {
		return resulttyeText;
	}
	public void setResulttyeText(String resulttyeText) {
		this.resulttyeText = resulttyeText;
	} 
}