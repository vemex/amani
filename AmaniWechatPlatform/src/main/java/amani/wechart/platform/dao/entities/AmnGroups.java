package amani.wechart.platform.dao.entities;

// Generated 2015-6-23 2:29:39 by Hibernate Tools 4.3.1

/**
 * AmnGroups generated by hbm2java
 */
public class AmnGroups implements java.io.Serializable {

	private Short groupid;
	private String grouptitle;
	private boolean ifdefault;
	private String adminright;

	public AmnGroups() {
	}

	public AmnGroups(String grouptitle, boolean ifdefault) {
		this.grouptitle = grouptitle;
		this.ifdefault = ifdefault;
	}

	public AmnGroups(String grouptitle, boolean ifdefault, String adminright) {
		this.grouptitle = grouptitle;
		this.ifdefault = ifdefault;
		this.adminright = adminright;
	}

	public Short getGroupid() {
		return this.groupid;
	}

	public void setGroupid(Short groupid) {
		this.groupid = groupid;
	}

	public String getGrouptitle() {
		return this.grouptitle;
	}

	public void setGrouptitle(String grouptitle) {
		this.grouptitle = grouptitle;
	}

	public boolean isIfdefault() {
		return this.ifdefault;
	}

	public void setIfdefault(boolean ifdefault) {
		this.ifdefault = ifdefault;
	}

	public String getAdminright() {
		return this.adminright;
	}

	public void setAdminright(String adminright) {
		this.adminright = adminright;
	}

}