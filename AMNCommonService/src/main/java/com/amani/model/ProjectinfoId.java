package com.amani.model;



/**
 * PapercardId generated by MyEclipse - Hibernate Tools
 */

public class ProjectinfoId  implements java.io.Serializable {


    // Fields    

     private String prjmodeId;//项目模板编号
     private String prjno;//项目编号
     private String prisource;//项目来源
     
     public ProjectinfoId(String prjmodeId, String prjno ,String prisource) {
         this.prjmodeId = prjmodeId;
         this.prjno = prjno;
         this.prisource=prisource;
     }
     public ProjectinfoId() {
     }
	public String getPrjmodeId() {
		return prjmodeId;
	}
	public void setPrjmodeId(String prjmodeId) {
		this.prjmodeId = prjmodeId;
	}
	public String getPrjno() {
		return prjno;
	}
	public void setPrjno(String prjno) {
		this.prjno = prjno;
	}
	public String getPrisource() {
		return prisource;
	}
	public void setPrisource(String prisource) {
		this.prisource = prisource;
	}
	
}