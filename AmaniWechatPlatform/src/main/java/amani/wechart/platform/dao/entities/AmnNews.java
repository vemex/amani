package amani.wechart.platform.dao.entities;

// Generated 2015-6-23 2:29:39 by Hibernate Tools 4.3.1

/**
 * AmnNews generated by hbm2java
 */
public class AmnNews implements java.io.Serializable {

	private Integer id;
	private Integer uid;
	private Integer cid;
	private Boolean type;
	private String title;
	private String subtitle;
	private String path;
	private String descr;
	private String content;
	private String sourceFrom;
	private String author;
	private String link;
	private String videopath;
	private Integer hits;
	private String tags;
	private Boolean isrec;
	private Boolean hot;
	private Boolean new_;
	private Integer praise;
	private Integer fav;
	private Boolean isopen;
	private Integer uptime;
	private Integer createtime;
	private Integer sort;

	public AmnNews() {
	}

	public AmnNews(Integer uid, Integer cid, Boolean type, String title,
			String subtitle, String path, String descr, String content,
			String sourceFrom, String author, String link, String videopath,
			Integer hits, String tags, Boolean isrec, Boolean hot,
			Boolean new_, Integer praise, Integer fav, Boolean isopen,
			Integer uptime, Integer createtime, Integer sort) {
		this.uid = uid;
		this.cid = cid;
		this.type = type;
		this.title = title;
		this.subtitle = subtitle;
		this.path = path;
		this.descr = descr;
		this.content = content;
		this.sourceFrom = sourceFrom;
		this.author = author;
		this.link = link;
		this.videopath = videopath;
		this.hits = hits;
		this.tags = tags;
		this.isrec = isrec;
		this.hot = hot;
		this.new_ = new_;
		this.praise = praise;
		this.fav = fav;
		this.isopen = isopen;
		this.uptime = uptime;
		this.createtime = createtime;
		this.sort = sort;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Boolean getType() {
		return this.type;
	}

	public void setType(Boolean type) {
		this.type = type;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return this.subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSourceFrom() {
		return this.sourceFrom;
	}

	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getVideopath() {
		return this.videopath;
	}

	public void setVideopath(String videopath) {
		this.videopath = videopath;
	}

	public Integer getHits() {
		return this.hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public Boolean getIsrec() {
		return this.isrec;
	}

	public void setIsrec(Boolean isrec) {
		this.isrec = isrec;
	}

	public Boolean getHot() {
		return this.hot;
	}

	public void setHot(Boolean hot) {
		this.hot = hot;
	}

	public Boolean getNew_() {
		return this.new_;
	}

	public void setNew_(Boolean new_) {
		this.new_ = new_;
	}

	public Integer getPraise() {
		return this.praise;
	}

	public void setPraise(Integer praise) {
		this.praise = praise;
	}

	public Integer getFav() {
		return this.fav;
	}

	public void setFav(Integer fav) {
		this.fav = fav;
	}

	public Boolean getIsopen() {
		return this.isopen;
	}

	public void setIsopen(Boolean isopen) {
		this.isopen = isopen;
	}

	public Integer getUptime() {
		return this.uptime;
	}

	public void setUptime(Integer uptime) {
		this.uptime = uptime;
	}

	public Integer getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Integer createtime) {
		this.createtime = createtime;
	}

	public Integer getSort() {
		return this.sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

}