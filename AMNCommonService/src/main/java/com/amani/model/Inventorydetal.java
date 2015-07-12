package com.amani.model;

/**
 * Inventorydetal entity. @author MyEclipse Persistence Tools
 */

public class Inventorydetal implements java.io.Serializable {

	// Fields

	private InventorydetalId id;
	private String barcode;
	private String goodno;
	private Integer num;

	// Constructors

	/** default constructor */
	public Inventorydetal() {
	}

	/** minimal constructor */
	public Inventorydetal(InventorydetalId id, String barcode) {
		this.id = id;
		this.barcode = barcode;
	}

	/** full constructor */
	public Inventorydetal(InventorydetalId id, String barcode, String goodno,
			Integer num) {
		this.id = id;
		this.barcode = barcode;
		this.goodno = goodno;
		this.num = num;
	}

	// Property accessors

	public InventorydetalId getId() {
		return this.id;
	}

	public void setId(InventorydetalId id) {
		this.id = id;
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getGoodno() {
		return this.goodno;
	}

	public void setGoodno(String goodno) {
		this.goodno = goodno;
	}

	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

}