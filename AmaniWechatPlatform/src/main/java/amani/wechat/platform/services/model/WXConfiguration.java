package amani.wechat.platform.services.model;

 
/**
 * 微信基本配置数据实体
 * @author VV
 *
 */
public class WXConfiguration {
	private String token;
	private String appid;
	private String appsecret;
	private String accessToken;
	private int expiresIn;
	private int tokentime;
	private String mchid;
	private String key;
	private String jsTicket;
	private int jsExpires;
	public WXConfiguration() {
	}
	 
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}
 
	public String getAppid() {
		return this.appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}
 
	public String getAppsecret() {
		return this.appsecret;
	}

	public void setAppsecret(String appsecret) {
		this.appsecret = appsecret;
	}
 
	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
 
	public int getExpiresIn() {
		return this.expiresIn;
	}

	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}
 
	public int getTokentime() {
		return this.tokentime;
	}

	public void setTokentime(int tokentime) {
		this.tokentime = tokentime;
	}
 
	public String getMchid() {
		return this.mchid;
	}

	public void setMchid(String mchid) {
		this.mchid = mchid;
	}
 
	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}
 
	public String getJsTicket() {
		return this.jsTicket;
	}

	public void setJsTicket(String jsTicket) {
		this.jsTicket = jsTicket;
	}
 
	public int getJsExpires() {
		return this.jsExpires;
	}

	public void setJsExpires(int jsExpires) {
		this.jsExpires = jsExpires;
	}
}
