package amani.wechat.platform.dao.entities;

// Generated 2015-6-28 1:25:02 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AmnProductKeys generated by hbm2java
 */
@Entity
@Table(name = "amn_product_keys", catalog = "amn")
public class AmnProductKeys implements java.io.Serializable {

	private Integer id;
	private float freight;
	private String keys;

	public AmnProductKeys() {
	}

	public AmnProductKeys(float freight) {
		this.freight = freight;
	}

	public AmnProductKeys(float freight, String keys) {
		this.freight = freight;
		this.keys = keys;
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

	@Column(name = "freight", nullable = false, precision = 11)
	public float getFreight() {
		return this.freight;
	}

	public void setFreight(float freight) {
		this.freight = freight;
	}

	@Column(name = "keys", length = 16777215)
	public String getKeys() {
		return this.keys;
	}

	public void setKeys(String keys) {
		this.keys = keys;
	}

}
