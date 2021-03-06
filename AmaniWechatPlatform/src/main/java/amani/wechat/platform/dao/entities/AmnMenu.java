package amani.wechat.platform.dao.entities;

// Generated 2015-6-28 1:25:02 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AmnMenu generated by hbm2java
 */
@Entity
@Table(name = "amn_menu", catalog = "amn")
public class AmnMenu implements java.io.Serializable {

	private Integer id;
	private int parent;
	private String type;
	private String key;
	private String name;
	private int sort;
	private boolean isopen;

	public AmnMenu() {
	}

	public AmnMenu(int parent, int sort, boolean isopen) {
		this.parent = parent;
		this.sort = sort;
		this.isopen = isopen;
	}

	public AmnMenu(int parent, String type, String key, String name, int sort,
			boolean isopen) {
		this.parent = parent;
		this.type = type;
		this.key = key;
		this.name = name;
		this.sort = sort;
		this.isopen = isopen;
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

	@Column(name = "parent", nullable = false)
	public int getParent() {
		return this.parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	@Column(name = "type", length = 8)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "key")
	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "sort", nullable = false)
	public int getSort() {
		return this.sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	@Column(name = "isopen", nullable = false)
	public boolean isIsopen() {
		return this.isopen;
	}

	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}

}
