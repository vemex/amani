package amani.wechat.platform.dao.entities;

// Generated 2015-6-28 1:25:02 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * AmnUser generated by hbm2java
 */
@Entity
@Table(name = "amn_user", catalog = "amn", uniqueConstraints = @UniqueConstraint(columnNames = "openid"))
public class AmnUser implements java.io.Serializable {

	private Integer id;
	private String openid;
	private String realname;
	private String nickname;
	private String mobile;
	private boolean sex;
	private String language;
	private String country;
	private String province;
	private String city;
	private String headimgurl;
	private int subscribeTime;
	private boolean subscribe;
	private String remark;
	private boolean isbinding;
	private String paypassword;
	private String random;

	public AmnUser() {
	}

	public AmnUser(boolean sex, int subscribeTime, boolean subscribe,
			boolean isbinding) {
		this.sex = sex;
		this.subscribeTime = subscribeTime;
		this.subscribe = subscribe;
		this.isbinding = isbinding;
	}

	public AmnUser(String openid, String realname, String nickname,
			String mobile, boolean sex, String language, String country,
			String province, String city, String headimgurl, int subscribeTime,
			boolean subscribe, String remark, boolean isbinding,
			String paypassword, String random) {
		this.openid = openid;
		this.realname = realname;
		this.nickname = nickname;
		this.mobile = mobile;
		this.sex = sex;
		this.language = language;
		this.country = country;
		this.province = province;
		this.city = city;
		this.headimgurl = headimgurl;
		this.subscribeTime = subscribeTime;
		this.subscribe = subscribe;
		this.remark = remark;
		this.isbinding = isbinding;
		this.paypassword = paypassword;
		this.random = random;
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

	@Column(name = "openid", unique = true, length = 50)
	public String getOpenid() {
		return this.openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	@Column(name = "realname")
	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	@Column(name = "nickname")
	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Column(name = "mobile")
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "sex", nullable = false)
	public boolean isSex() {
		return this.sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	@Column(name = "language", length = 10)
	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Column(name = "country", length = 50)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "province", length = 50)
	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Column(name = "city", length = 50)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "headimgurl")
	public String getHeadimgurl() {
		return this.headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	@Column(name = "subscribe_time", nullable = false)
	public int getSubscribeTime() {
		return this.subscribeTime;
	}

	public void setSubscribeTime(int subscribeTime) {
		this.subscribeTime = subscribeTime;
	}

	@Column(name = "subscribe", nullable = false)
	public boolean isSubscribe() {
		return this.subscribe;
	}

	public void setSubscribe(boolean subscribe) {
		this.subscribe = subscribe;
	}

	@Column(name = "remark")
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "isbinding", nullable = false)
	public boolean isIsbinding() {
		return this.isbinding;
	}

	public void setIsbinding(boolean isbinding) {
		this.isbinding = isbinding;
	}

	@Column(name = "paypassword", length = 50)
	public String getPaypassword() {
		return this.paypassword;
	}

	public void setPaypassword(String paypassword) {
		this.paypassword = paypassword;
	}

	@Column(name = "random", length = 6)
	public String getRandom() {
		return this.random;
	}

	public void setRandom(String random) {
		this.random = random;
	}

}
