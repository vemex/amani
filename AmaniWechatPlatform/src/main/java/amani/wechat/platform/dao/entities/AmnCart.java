package amani.wechat.platform.dao.entities;

// Generated 2015-6-28 1:25:02 by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AmnCart generated by hbm2java
 */
@Entity
@Table(name = "amn_cart", catalog = "amn")
public class AmnCart implements java.io.Serializable {

	private Integer id;
	private int pid;
	private String name;
	private BigDecimal price;
	private String coupontype;
	private String icon;
	private int num;
	private String openid;

	public AmnCart() {
	}

	public AmnCart(int pid, int num) {
		this.pid = pid;
		this.num = num;
	}

	public AmnCart(int pid, String name, BigDecimal price, String coupontype,
			String icon, int num, String openid) {
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.coupontype = coupontype;
		this.icon = icon;
		this.num = num;
		this.openid = openid;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "pid", nullable = false)
	public int getPid() {
		return this.pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "price", precision = 11)
	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Column(name = "coupontype")
	public String getCoupontype() {
		return this.coupontype;
	}

	public void setCoupontype(String coupontype) {
		this.coupontype = coupontype;
	}

	@Column(name = "icon")
	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Column(name = "num", nullable = false)
	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Column(name = "openid")
	public String getOpenid() {
		return this.openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

}
