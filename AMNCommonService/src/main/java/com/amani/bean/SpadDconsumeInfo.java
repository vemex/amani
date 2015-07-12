package com.amani.bean;

public class SpadDconsumeInfo {
	private int 			id;	
	private String 			brachcode;
	private String			small_no;		//小单号
	private int	 			sortid;			//类型
	private String 			code;			//项目编码
	private String 			product;		//项目名称
	private String 			amount;			//次数
	private	String			price;			//单价
	private String			cost;			//折扣率
	private String 			cdate;			//录入时间
	private int				isdeleted;		// 0正常 1删除
	private int				isfortreatment;	// 1疗程卡
	private String 			employee_no;	//员工号 1
	private String 			employee_no2;	//员工号 2
	private String			employee_no3;	//员工号 3
	private int 			isnew;			// 0非指定 1 指定
	private int				isnew2;			// 0非指定 1 指定
	private int 			isnew3;			// 0非指定 1 指定
	private double			score;			//业绩1
	private double			score2;			//业绩2
	private double 			score3;			//业绩3
	private double			reward;			//提成1
	private double          reward2;		//提成2
	private double 			reward3;		//提成3
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSmall_no() {
		return small_no;
	}
	public void setSmall_no(String small_no) {
		this.small_no = small_no;
	}
	public int getSortid() {
		return sortid;
	}
	public void setSortid(int sortid) {
		this.sortid = sortid;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	public int getIsdeleted() {
		return isdeleted;
	}
	public void setIsdeleted(int isdeleted) {
		this.isdeleted = isdeleted;
	}
	public int getIsfortreatment() {
		return isfortreatment;
	}
	public void setIsfortreatment(int isfortreatment) {
		this.isfortreatment = isfortreatment;
	}
	public String getEmployee_no() {
		return employee_no;
	}
	public void setEmployee_no(String employee_no) {
		this.employee_no = employee_no;
	}
	public String getEmployee_no2() {
		return employee_no2;
	}
	public void setEmployee_no2(String employee_no2) {
		this.employee_no2 = employee_no2;
	}
	public String getEmployee_no3() {
		return employee_no3;
	}
	public void setEmployee_no3(String employee_no3) {
		this.employee_no3 = employee_no3;
	}
	public int getIsnew() {
		return isnew;
	}
	public void setIsnew(int isnew) {
		this.isnew = isnew;
	}
	public int getIsnew2() {
		return isnew2;
	}
	public void setIsnew2(int isnew2) {
		this.isnew2 = isnew2;
	}
	public int getIsnew3() {
		return isnew3;
	}
	public void setIsnew3(int isnew3) {
		this.isnew3 = isnew3;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public double getScore2() {
		return score2;
	}
	public void setScore2(double score2) {
		this.score2 = score2;
	}
	public double getScore3() {
		return score3;
	}
	public void setScore3(double score3) {
		this.score3 = score3;
	}
	public double getReward() {
		return reward;
	}
	public void setReward(double reward) {
		this.reward = reward;
	}
	public double getReward2() {
		return reward2;
	}
	public void setReward2(double reward2) {
		this.reward2 = reward2;
	}
	public double getReward3() {
		return reward3;
	}
	public void setReward3(double reward3) {
		this.reward3 = reward3;
	}
	public String getBrachcode() {
		return brachcode;
	}
	public void setBrachcode(String brachcode) {
		this.brachcode = brachcode;
	}
}
