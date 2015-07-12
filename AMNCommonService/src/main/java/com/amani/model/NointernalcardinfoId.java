package com.amani.model;



public class NointernalcardinfoId  implements java.io.Serializable {


    // Fields    

     private String cardvesting;//公司编号
     private String cardno;//抵用券编号
     private String createcardtype;//券1 券2 券3
     private String createcardtypename;//名称


    // Constructors

    public String getCreatecardtype() {
		return createcardtype;
	}


	public void setCreatecardtype(String createcardtype) {
		this.createcardtype = createcardtype;
	}


	/** default constructor */
    public NointernalcardinfoId() {
    }

    
    /** full constructor */
    public NointernalcardinfoId(String cardvesting, String cardno) {
        this.cardvesting = cardvesting;
        this.cardno = cardno;
    }


	public String getCardvesting() {
		return cardvesting;
	}


	public void setCardvesting(String cardvesting) {
		this.cardvesting = cardvesting;
	}


	public String getCardno() {
		return cardno;
	}


	public void setCardno(String cardno) {
		this.cardno = cardno;
	}


	public String getCreatecardtypename() {
		return createcardtypename;
	}


	public void setCreatecardtypename(String createcardtypename) {
		this.createcardtypename = createcardtypename;
	}


}