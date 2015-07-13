package com.amani.services;

import java.math.BigDecimal; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap; 
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.jws.WebService;

import net.sf.json.JsonConfig;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DataAccessException;

import com.amani.bean.RepsonBean;
import com.amani.bean.SpadDconsumeInfo;
import com.amani.bean.SpadMconsumeInfo;
import com.amani.dao.AMN_Dao;
import com.amani.model.Cardaccount;
import com.amani.model.Cardaccountchangehistory;
import com.amani.model.Cardinfo;
import com.amani.model.CardinfoId;
import com.amani.model.CategoryinfoId;
import com.amani.model.Companyinfo;
import com.amani.model.Dgoodsbarinfo;
import com.amani.model.Dnointernalcardinfo;
import com.amani.model.DnointernalcardinfoId;
import com.amani.model.Evaluation;
import com.amani.model.Goodsinfo;
import com.amani.model.Inventory;
import com.amani.model.InventoryId;
import com.amani.model.Inventorydetal;
import com.amani.model.InventorydetalId;
import com.amani.model.Nointernalcardinfo;
import com.amani.model.NointernalcardinfoId;
import com.amani.model.Orders;
import com.amani.model.OrdersEmpinfo;
import com.amani.model.OredersPrjinfo;
import com.amani.model.Projectinfo;
import com.amani.model.Roominfo;
import com.amani.model.Staffinfo;
import com.amani.model.Vouchers;
import com.amani.model.Vouchersdetal;
import com.amani.model.Weixinclent;
import com.amani.model.Wxbandcard;
import com.amani.spring.SpringDBInit;
import com.amani.tools.CommonTool;
import com.amani.tools.DESPlus;
import com.amani.tools.DataTool;
import com.amani.tools.HttpClientUtil;
@WebService(endpointInterface="com.amani.services.ICommonService")
public class CommonService implements ICommonService {
	public static final Log LOG = LogFactory.getLog(ICommonService.class);
	private static final String String = null;

	public Companyinfo loadCompanyinfo(String strCompId) {
		 AMN_Dao amn_Dao=null;
		 Companyinfo companyinfo=null;
		 SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		 amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		 try {
			List<Companyinfo> lsCompanyinfos=amn_Dao.findByHql(" From Companyinfo where compstate<>3 and compno='"+strCompId+"' ");
			if(lsCompanyinfos!=null && lsCompanyinfos.size()>0)
			{
				companyinfo=lsCompanyinfos.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return companyinfo;
		 
	}

	public List<Companyinfo> loadAllCompanyinfo() {
		AMN_Dao amn_Dao=null;
		List<Companyinfo> lsCompanyinfos=new ArrayList<Companyinfo>();
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		try {
			lsCompanyinfos=amn_Dao.findByHql("select c From Companyinfo c,Compchainstruct d where curcompno=compno and complevel=4 and compstate<>3");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lsCompanyinfos;
	}

	public List<Projectinfo> loadProjectinfo(String strCompId) {
		DataTool dataTool=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		dataTool=(DataTool)sdbinit.getInstance().getBean("dataTool");
		List<Projectinfo> lsProjectinfos=dataTool.loadProjectinfoByCompId(strCompId);
		return lsProjectinfos;
	}
	
	public List<Goodsinfo> loadAllGoodinfo()
	{
		AMN_Dao amn_Dao=null;
		List<Goodsinfo> lsgGoodsinfos=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance();
		amn_Dao=amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		try {
			lsgGoodsinfos=amn_Dao.findByHql(" From Goodsinfo where isnull(goodsusetype,0) in(1,3) and goodswarehouse in('01','02')");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lsgGoodsinfos;
	}

	public String loadStaffinfo(String strCompId,String strType) {
		AMN_Dao amn_Dao=null;
		List<Staffinfo> lsStaffinfos=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance();
		amn_Dao=amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		try {
			if("1".equals(strType))
			{
				lsStaffinfos=amn_Dao.findByHql(" From Staffinfo where isnull(businessflag,0)=1 and position in('003','006','007','00701','00702') and compno='"+strCompId+"' " +
						" and isnull(curstate,'')='2' and substring(staffno,4,6)<>'003' ");
			}
			else 
			{
				lsStaffinfos=amn_Dao.findByHql(" From Staffinfo where isnull(businessflag,0)=1 and position in('004','00401','00402','00103') and compno='"+strCompId+"' " +
						" and isnull(curstate,'')='2' and substring(staffno,4,6)<>'004' ");
			}
			
			if(lsStaffinfos!=null && lsStaffinfos.size()>0)
			{
				for(int i=0;i<lsStaffinfos.size();i++)
				{
					lsStaffinfos.get(i).getId().setStaffno(lsStaffinfos.get(i).getId().getStaffno().substring(3));
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(lsStaffinfos);  
		return jsonarray.toString();
	}

	public List<CategoryinfoId> loadCategory(String strCompId) {
		AMN_Dao amn_Dao=null;
		List<CategoryinfoId> lsCategoryinfos=new ArrayList<CategoryinfoId>();
		SpringDBInit sdbinit = SpringDBInit.getInstance();
		amn_Dao=amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		ResultSet rs=null;
		try {
			rs=amn_Dao.executeQuery(" select b.*,categoryname from categoryinfo a,categoryinfoid b where a.compno=b.compno and a.categoryno=b.categoryno and a.compno='"+strCompId+"'");
			if(rs!=null)
			{
				while(rs.next())
				{
					CategoryinfoId categoryinfoId=new CategoryinfoId();
					categoryinfoId.setCategoryno(rs.getString("categoryno"));
					categoryinfoId.setCompno(rs.getString("compno"));
					categoryinfoId.setCategoryname(rs.getString("categoryname"));
					categoryinfoId.setPostationid(rs.getString("postationid"));
					lsCategoryinfos.add(categoryinfoId);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(rs!=null)
				{
					rs.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return lsCategoryinfos;
	}

	public List<Roominfo> loadRoomInfo(String strCompId) {
		AMN_Dao amn_Dao=null;
		List<Roominfo> lsRoominfos=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance();
		amn_Dao=amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		try {
			lsRoominfos=amn_Dao.findByHql(" From Roominfo where compno='"+strCompId+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lsRoominfos;
	}

	public List<String> loadMirror(String strCompId) {
		Companyinfo companyinfo=loadCompanyinfo(strCompId);
		List<String> lsStrings=new ArrayList<String>();
		if(companyinfo==null)
		{
			return null;
		}
		else
		{
			if(companyinfo.getMirrornumber()!=null)
			{
				if(CommonTool.FormatInteger(companyinfo.getMirrornumber().intValue())>0)
				{
					for(int i=0;i<companyinfo.getMirrornumber().intValue();i++)
					{
						lsStrings.add((i+1)+"号镜台");
					}
					return lsStrings;
				}
			}
		}
		return null;
	}

	public List<Cardinfo> loadCardInfos(String strPhone,
			String strCardNo) {
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strSql="select top 25 a.cardvesting,a.cardno,a.cardtype, b.membername,b.membermphone " +
				" from  cardinfo a left join memberinfo b on  a.cardno=b.memberno" +
				" where   " +
				"   (cardno='"+strCardNo+"' or '"+strCardNo+"' ='' ) "+
				//" and  (membername like '%"+searchMemberNameKey+"%' or '"+searchMemberNameKey+"' ='' ) "+
				" and  (membermphone='"+strPhone+"' or '"+strPhone+"' ='' ) "+
				//" and  (memberpaperworkno='"+searchMemberPCIDKey+"' or '"+searchMemberPCIDKey+"' ='' )" +
				" group by a.cardvesting,a.cardno,a.cardtype, b.membername,b.membermphone   ";
		List<Cardinfo> lsCardinfos=new ArrayList<Cardinfo>();
		ResultSet rs=null;
		try {
			rs=amn_Dao.executeQuery(strSql);
			if(rs!=null)
			{
				Cardinfo record=null;
				while(rs.next())
				{
					record=new Cardinfo();
					record.setBcardvesting(CommonTool.FormatString(rs.getString("cardvesting")));
					record.setBcardno(CommonTool.FormatString(rs.getString("cardno")));
					record.setCardtype(CommonTool.FormatString(rs.getString("cardtype")));
					record.setMembername(CommonTool.FormatString(rs.getString("membername")));
					record.setMemberphone(CommonTool.FormatString(rs.getString("membermphone")));
					lsCardinfos.add(record);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return lsCardinfos;
	}

	public Cardinfo loadCardInfo(String strCompId,String strCardNo) {
		AMN_Dao amn_Dao=null;
		Cardinfo returnValue=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strModeId=this.loadSysParam(strCompId,"SP063");
	     String strFristModeId="";//第一级模板Id
		 String strSecondModeId="";//第2级模板ID
		 String strThirthModeId="";//第三级模板Id
		 //先定位模板门店的连锁级别(暂时支持4级连锁)
		 int compLvl=this.loadCompLvl(strCompId);
	     if(compLvl==2)
		 {
			strFristModeId=this.loadparentModeId(strModeId);
		 }
		 else if(compLvl==3)
		 {
			strSecondModeId=this.loadparentModeId(strModeId);
			if(!strSecondModeId.equals(""))
				strFristModeId=this.loadparentModeId(strSecondModeId);
		 }
		 else if(compLvl==4)
		 {
			strThirthModeId=this.loadparentModeId(strModeId);
			if(!strThirthModeId.equals(""))
				strSecondModeId=this.loadparentModeId(strThirthModeId);
			if(!strSecondModeId.equals(""))
				strFristModeId=this.loadparentModeId(strSecondModeId);
		 }
   	String strSql="select a.cardvesting,a.cardno,a.cardstate,a.salecarddate,a.cutoffdate,a.cardsource,membersex,a.cardtype,cardtypename,membername,membermphone,memberpaperworkno,lowopenamt,lowfillamt,openflag,fillflag,changeflag,sendamtflag,slaeproerate,changerule, " +
   			" accountbalance2=sum(case when isnull(accounttype,0)=2 then accountbalance else 0 end ),accountdebts2=sum(case when isnull(accounttype,0)=2 then accountdebts else 0 end ), " +
   			" accountbalance3=sum(case when isnull(accounttype,0)=3 then accountbalance else 0 end ),accountdebts3=sum(case when isnull(accounttype,0)=3 then accountdebts else 0 end ), " +
   			" accountbalance4=sum(case when isnull(accounttype,0)=4 then accountbalance else 0 end ),accountdebts4=sum(case when isnull(accounttype,0)=4 then accountdebts else 0 end ), " +
   			" accountbalance5=sum(case when isnull(accounttype,0)=5 then accountbalance else 0 end ),accountdebts5=sum(case when isnull(accounttype,0)=5 then accountdebts else 0 end ), " +
   			" accountbalance6=sum(case when isnull(accounttype,0)=6 then accountbalance else 0 end ),accountdebts6=sum(case when isnull(accounttype,0)=6 then accountdebts else 0 end ) " +
   			" from cardaccount c with(nolock),cardtypeinfo d with(nolock), cardinfo a with(nolock) left join memberinfo b with(nolock) on  a.cardno=b.memberno  " +
   			" where a.cardno=c.cardno and a.cardno='"+strCardNo+"'" +
   			"   and cardstate in(4,5) " +
   			" and a.cardtype=d.cardtypeno and  cardtypemodeid  in ('"+strModeId+"','"+strFristModeId+"','"+strSecondModeId+"','"+strThirthModeId+"') " +
   			" group by   a.cardvesting,a.cardno,a.cardstate,a.salecarddate,a.cutoffdate,a.cardsource,membersex,a.cardtype,cardtypename,membername,membermphone,memberpaperworkno,lowopenamt,lowfillamt,openflag,fillflag,changeflag,sendamtflag,slaeproerate,changerule ";
   			ResultSet rs=null; 
   			try {
   				rs=amn_Dao.executeQuery(strSql);
				if(rs!=null)
				{
					while(rs.next())
					{
						returnValue= new Cardinfo();
						returnValue.setId(new CardinfoId(rs.getString("cardvesting"),rs.getString("cardno")));
						returnValue.setCardstate(CommonTool.FormatInteger(rs.getInt("cardstate")));
						returnValue.setSalecarddate(CommonTool.getDateMask(rs.getString("salecarddate")));
						returnValue.setCutoffdate(CommonTool.getDateMask(rs.getString("cutoffdate")));
						returnValue.setCardtype(CommonTool.FormatString(rs.getString("cardtype")));
						returnValue.setCardsource(CommonTool.FormatInteger(rs.getInt("cardsource")));
						returnValue.setCardtypeName(CommonTool.FormatString(rs.getString("cardtypename")));
						returnValue.setMembername(CommonTool.FormatString(rs.getString("membername")));
						returnValue.setMembersex(CommonTool.FormatInteger(rs.getInt("membersex")));
						returnValue.setMemberphone(CommonTool.FormatString(rs.getString("membermphone")));
						returnValue.setMemberpaperworkno(CommonTool.FormatString(rs.getString("memberpaperworkno")));
						returnValue.setAccount2Amt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("accountbalance2"))));
						returnValue.setAccount3Amt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("accountbalance3"))));
						returnValue.setAccount4Amt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("accountbalance4"))));
						returnValue.setAccount5Amt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("accountbalance5"))));
						returnValue.setAccount6Amt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("accountbalance6"))));
						returnValue.setAccount2debtAmt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("accountdebts2"))));
						returnValue.setAccount3debtAmt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("accountdebts3"))));
						returnValue.setAccount4debtAmt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("accountdebts4"))));
						returnValue.setAccount5debtAmt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("accountdebts5"))));
						returnValue.setAccount6debtAmt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("accountdebts6"))));
						returnValue.setSlaeproerate(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("slaeproerate"))));
						
						returnValue.setDSaleLowAmt(CommonTool.FormatBigDecimal(new BigDecimal(CommonTool.FormatDouble(rs.getDouble("lowopenamt")))));
						
						returnValue.setDFillLowAmt(CommonTool.FormatBigDecimal(new BigDecimal(CommonTool.FormatDouble(rs.getDouble("lowfillamt")))));
						returnValue.setOpenflag(CommonTool.FormatInteger(rs.getInt("openflag")));
						returnValue.setFillflag(CommonTool.FormatInteger(rs.getInt("fillflag")));
						returnValue.setChangeflag(CommonTool.FormatInteger(rs.getInt("changeflag")));
						returnValue.setSendamtflag(CommonTool.FormatInteger(rs.getInt("sendamtflag")));
						returnValue.setChangerule(CommonTool.FormatInteger(rs.getInt("changerule")));
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
   			finally
   			{
   				if(rs!=null)
   				{
   					try {
						rs.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
   				}
   			}
		double saleamt=this.loadSaleCardNoPromotions(strCompId, strCardNo);
		if(CommonTool.FormatDouble(saleamt)!=0)
		{
			returnValue.setDSaleLowAmt(new BigDecimal(saleamt));
		}
		saleamt=this.loadFillCardNoPromotions(strCompId, strCardNo);
		if(CommonTool.FormatDouble(saleamt)!=0)
		{
			returnValue.setDFillLowAmt(new BigDecimal(saleamt));
		}
		return returnValue;
	}
	
	public String loadSysParam(String strCompId,String strValue)
	{
		
		String strField = "";
		String strSql = "";
		String strReturnValue = "";
		if(strValue == null || strValue.equals(""))
		{
			return strReturnValue;
		}
		else
		{
			AMN_Dao amn_Dao=null;
			SpringDBInit sdbinit = SpringDBInit.getInstance(); 
			amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
			strSql = "select paramid,paramvalue from sysparaminfo where compid = '"+strCompId+"' and paramid = "+CommonTool.quotedStr(strValue);
			ResultSet rs=null;
			try {
				rs=amn_Dao.executeQuery(strSql);
				if(rs!=null)
				{
					while(rs.next())
					{
						strReturnValue =  CommonTool.FormatString(rs.getString("paramvalue"));
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally
			{
				if(rs!=null)
				{
					try {
						rs.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return strReturnValue;
	}
	
	public String loadparentModeId(String strCurModeId)
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strSql="  select parentmodeid from syscommoninfomode where  isnull(modeid,'')='"+strCurModeId+"' ";
		ResultSet rs=null;
		String parentmodeid="";
		try
		{
			rs=amn_Dao.executeQuery(strSql);
			if(rs!=null)
			{
				while(rs.next())
				{
					parentmodeid=CommonTool.FormatString(rs.getString("parentmodeid"));
				}
			}
					
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return parentmodeid;
	}
	
	
	public int loadCompLvl(String strCompId)
	{
		
		String strSql=" select complevel from compchainstruct where curcompno='"+strCompId+"' ";
    	AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		ResultSet rs=null;
		int returnValue=0;
		try {
			if(rs!=null)
			{
				while(rs.next())
				{
					returnValue =  CommonTool.FormatInteger(rs.getInt("complevel"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return returnValue;
	}
	
	
	public double loadSaleCardNoPromotions(String strCompId,String strCardNo)
	{
		String strSql=" select promotionsvalue from promotionsinfo where promotionsstore='"+strCompId+"' and promotionstype=4 and promotionscode='"+strCardNo+"' and startdate<='"+CommonTool.getCurrDate()+"'  and enddate>='"+CommonTool.getCurrDate()+"' and isnull(invalid,0)=0 "; 
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		ResultSet rs=null;
		double returnValue = 0.0;
		try {
			rs=amn_Dao.executeQuery(strSql);
			if(rs!=null)
			{
				while(rs.next())
				{
					returnValue=CommonTool.FormatDouble(rs.getDouble("promotionsvalue"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return returnValue;
	}
	
	public double loadFillCardNoPromotions(String strCompId,String strCardNo)
	{
		String strSql=" select promotionsvalue from promotionsinfo where promotionsstore='"+strCompId+"' and promotionstype=5 and promotionscode='"+strCardNo+"' and startdate<='"+CommonTool.getCurrDate()+"'  and enddate>='"+CommonTool.getCurrDate()+"' and isnull(invalid,0)=0 "; 
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		ResultSet rs=null;
		double returnValue = 0.0;
		
		try {
			if(rs != null && rs.next()==true)
			{
				returnValue=CommonTool.FormatDouble(rs.getDouble("promotionsvalue"));
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return returnValue;			
	}

	public boolean saveIPADBillInfo(SpadMconsumeInfo spadMconsumeInfo,
			List<SpadDconsumeInfo> spadDconsumeInfo) {
		try {
			AMN_Dao amn_Dao=null;
			SpringDBInit sdbinit = SpringDBInit.getInstance(); 
			amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
			amn_Dao.save(spadDconsumeInfo);
			amn_Dao.saveOrUpdateAll(spadDconsumeInfo);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	public String loadVouchers() {
		String strSql=" From Vouchers ";
		ArrayList<Vouchers> lsVouchers=new ArrayList<Vouchers>();
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		try {
			lsVouchers=(ArrayList<Vouchers>)amn_Dao.findAll(Vouchers.class);
			if(lsVouchers!=null && lsVouchers.size()>0)
			{
				for(Vouchers vouchers:lsVouchers)
				{
					if(vouchers.getVchtype()==1)
					{
						vouchers.setVchname("项目抵用券");
					}
					if(vouchers.getVchtype()==2)
					{
						vouchers.setVchname("现金抵用券");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(lsVouchers);  
		return jsonarray.toString();
	}
	
	public Vouchers loadVoucher(String strVchNo)
	{
		String strSql=" From Vouchers where vchno='"+strVchNo+"' ";
		AMN_Dao amn_Dao=null;
		Vouchers voucher=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		try {
			List<Vouchers> lsVouchers=amn_Dao.findByHql(strSql);
			if(lsVouchers!=null && lsVouchers.size()>0)
			{
				voucher=lsVouchers.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return voucher;
	}
	
	public List<Vouchersdetal> loadVouchersdetals()
	{
		String strSql=" From Vouchersdetal ";
		List<Vouchersdetal> lsVouchersdetals=new ArrayList<Vouchersdetal>();
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		try {
			lsVouchersdetals=amn_Dao.findByHql(strSql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lsVouchersdetals;
	}
	
	public List<Vouchersdetal> loadVouchersdetalsById(String strVchNo)
	{
		String strSql=" From Vouchersdetal where vchno='"+strVchNo+"' ";
		List<Vouchersdetal> lsVouchersdetals=new ArrayList<Vouchersdetal>();
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		try {
			lsVouchersdetals=amn_Dao.findByHql(strSql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lsVouchersdetals;
	}
	
	public boolean checkDyqNo(String strDyqNo)
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strSql="select 1 from nointernalcardinfo where cardno='"+strDyqNo+"'";
		try {
			if(amn_Dao.getRowsCount_Ex(strSql)>0)
			{
				return false;
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Nointernalcardinfo loadNointernalcardinfo(String strDyqNo)
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strSql=" From Nointernalcardinfo where cardno='"+strDyqNo+"' ";
		Nointernalcardinfo nointernalcardinfo=null;
		try {
			List<Nointernalcardinfo> lsNointernalcardinfos=amn_Dao.findByHql(strSql);
			if(lsNointernalcardinfos!=null && lsNointernalcardinfos.size()>0)
			{
				nointernalcardinfo=lsNointernalcardinfos.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return nointernalcardinfo;
	}

	public String loadDqyNo(String strOpenId,String strClientName, String strMobile,String strVchNo,String strBillId) {
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		Vouchers vouchers=loadVoucher(strVchNo);
		if(vouchers==null)
		{
			return "false";
		}
		String dyqNo="RP"+CommonTool.randomString(12).toUpperCase();
		while(checkDyqNo(dyqNo)==false)
		{
			dyqNo="RP"+CommonTool.randomString(12);
		}
		List<Dnointernalcardinfo> lsDnointernalcardinfos=new ArrayList<Dnointernalcardinfo>();
		Weixinclent weixinclent=new Weixinclent();
		weixinclent.setClientname(strClientName);
		weixinclent.setCreatedate(CommonTool.getCurrDate());
		weixinclent.setMobile(strMobile);
		weixinclent.setOperid(strOpenId);
		weixinclent.setQdyno(dyqNo);
		weixinclent.setVchno(strVchNo);
		weixinclent.setBillid(strBillId);
		
		Nointernalcardinfo nointernalcardinfo=new Nointernalcardinfo();
		NointernalcardinfoId id=new NointernalcardinfoId();
		id.setCardvesting("001");
		id.setCardno(dyqNo);
		id.setCreatecardtype("");
		id.setCreatecardtypename("");
		nointernalcardinfo.setId(id);
		nointernalcardinfo.setCardfaceamt(BigDecimal.valueOf(vouchers.getAmt()));
		nointernalcardinfo.setCarduseflag(vouchers.getVchtype());
		nointernalcardinfo.setEntrytype(0);
		nointernalcardinfo.setCardstate(1);
		//nointernalcardinfo.setUsedate(CommonTool.getCurrDate());
		nointernalcardinfo.setOldvalidate(CommonTool.getCurrDate());
		nointernalcardinfo.setEnabledate(CommonTool.getCurrDate());
		nointernalcardinfo.setLastvalidate(CommonTool.addMonth(CommonTool.getCurrDate(),6));
		nointernalcardinfo.setBillid(strBillId);
		nointernalcardinfo.setPhone(strMobile);
		nointernalcardinfo.setCardtype(1);
		if(vouchers.getVchtype()==1)
		{
			List<Vouchersdetal> lsVouchersdetals=loadVouchersdetalsById(strVchNo);
			if(lsVouchersdetals!=null && lsVouchersdetals.size()>0)
			{
				for(int i=0;i<lsVouchersdetals.size();i++)
				{
					Dnointernalcardinfo dnointernalcardinfo=new Dnointernalcardinfo();
					DnointernalcardinfoId dnoId=new DnointernalcardinfoId();
					dnoId.setCardvesting("001");
					dnoId.setCardno(dyqNo);
					dnoId.setSeqno((double)i);
					dnointernalcardinfo.setId(dnoId);
					dnointernalcardinfo.setIneritemno(lsVouchersdetals.get(i).getId().getItemno());
					dnointernalcardinfo.setEntrycount(BigDecimal.valueOf(1));
					dnointernalcardinfo.setUsecount(BigDecimal.valueOf(0));
					dnointernalcardinfo.setLastcount(BigDecimal.valueOf(1));
					dnointernalcardinfo.setEntryamt(BigDecimal.valueOf(vouchers.getAmt()));
					dnointernalcardinfo.setUseamt(BigDecimal.valueOf(0));
					dnointernalcardinfo.setLastamt(BigDecimal.valueOf(vouchers.getAmt()));
					lsDnointernalcardinfos.add(dnointernalcardinfo);
				}
			}
		}
		try {
			amn_Dao.save(nointernalcardinfo);
			amn_Dao.save(weixinclent);
			amn_Dao.saveOrUpdateAll(lsDnointernalcardinfos);
			return dyqNo;
		} catch (Exception e) {
			e.printStackTrace();
			return "false";
		}
	}

	public String loadCardAccount(String strCardNo) {
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strsql="From Cardaccount where cardno='"+strCardNo+"' ";
		List<Cardaccount> lsCardaccounts=null;
		try {
			lsCardaccounts=amn_Dao.findByHql(strsql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(lsCardaccounts);  
		return jsonarray.toString();
		//return lsCardaccounts;
	}
	
	public String loadCardproaccounts(String strCompId,String strCardNo)
	{
		/*AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strsql="From Cardproaccount where cardno='"+strCardNo+"' ";
		List<Cardproaccount> lsCardproaccounts=null;
		try {
			lsCardproaccounts=amn_Dao.findByHql(strsql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lsCardproaccounts;*/
		try
		{
			DataTool dataTool=null;
			SpringDBInit sdbinit = SpringDBInit.getInstance(); 
			dataTool=(DataTool)sdbinit.getInstance().getBean("dataTool");
			strCompId=dataTool.LoadCardVestingByCardNo(strCardNo);
			
			net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(dataTool.loadProInfosByCardNo(strCompId,strCardNo));  
			return jsonarray.toString();
			//return dataTool.loadProInfosByCardNo(strCompId,strCardNo);
			 
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return "";
		}
	}

	public String loadcCardaccountchangehistories(String strCardNo) {
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strsql="select top 3 * From Cardaccountchangehistory left join commoninfo a on(infotype='ZHLX' and changeaccounttype=parentcodekey) where changecardno='"+strCardNo+"' and changeaccounttype<>9 and changebilltype<>'NK' order by chagedate desc";
		List<Cardaccountchangehistory> lsCardaccountchangehistories=new ArrayList<Cardaccountchangehistory>();
		ResultSet rs=null;
		try {
			rs=amn_Dao.executeQuery(strsql);
			if(rs!=null)
			{
				while(rs.next())
				{
					Cardaccountchangehistory cardaccountchangehistory=new Cardaccountchangehistory();
					cardaccountchangehistory.setStrAccountTypeName(rs.getString("parentcodevalue"));
					if("SY".equalsIgnoreCase(rs.getString("changebilltype")))
					{
						cardaccountchangehistory.setChangebilltype("消费");
					}
					else if("CZ".equalsIgnoreCase(rs.getString("changebilltype")))
					{
						cardaccountchangehistory.setChangebilltype("充值");
					}
					else if("SK".equalsIgnoreCase(rs.getString("changebilltype")))
					{
						cardaccountchangehistory.setChangebilltype("售卡");
					}
					cardaccountchangehistory.setChagedate(rs.getString("chagedate"));
					cardaccountchangehistory.setChangeamt(rs.getDouble("changeamt"));
					lsCardaccountchangehistories.add(cardaccountchangehistory);
				}
			}
			//lsCardaccountchangehistories=amn_Dao.findByPage(3, 0,strsql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(lsCardaccountchangehistories);  
		return jsonarray.toString();
		//return lsCardaccountchangehistories;
	}
	
	public Wxbandcard loadWxbandcard(String strCardNo,String operId)
	{
		Wxbandcard wxbandcard=loadWxBandCards(strCardNo);
		if(wxbandcard==null)
		{
			if(saveWxBandCard(strCardNo,operId))
			{
				wxbandcard=loadWxBandCards(strCardNo);
			}
		}
		return wxbandcard;
	}
	
	public boolean saveWxBandCard(String strCardNo,String openid)
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		Wxbandcard wxbandcard=new Wxbandcard();
		wxbandcard.setUuid(UUID.randomUUID().toString());
		wxbandcard.setCardno(strCardNo);
		wxbandcard.setCreatedate(CommonTool.getNowTime());
		wxbandcard.setRandomno(CommonTool.randomNumeric(18));
		wxbandcard.setOpenid(openid);
		wxbandcard.setValidate(CommonTool.addSeconds(wxbandcard.getCreatedate(), 60));
		try {
			amn_Dao.save(wxbandcard);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Wxbandcard loadWxBandCards(String strCardNo)
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strSql=" From Wxbandcard where cardno='"+strCardNo+"' and validate>='"+CommonTool.getNowTime()+"' ";
		Wxbandcard wxbandcard=null;
		try {
			List<Wxbandcard> lsWxbandcards=amn_Dao.findByHql(strSql);
			if(lsWxbandcards!=null && lsWxbandcards.size()>0)
			{
				wxbandcard=lsWxbandcards.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return wxbandcard;
	}

	public boolean updateCardPassword(String strCardNo,String strPassword) 
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		try {
			DESPlus desPlus=new DESPlus();
			Cardinfo cardinfo=null;
			List<Cardinfo> lsCardinfos=amn_Dao.findByHql("From Cardinfo where cardno='"+strCardNo+"' ");
			if(lsCardinfos!=null&& lsCardinfos.size()>0)
			{
				cardinfo=lsCardinfos.get(0);
				cardinfo.setCostpassword(desPlus.encrypt(strPassword));
				amn_Dao.saveOrUpdate(cardinfo);
			}
			return true;
			//String strSql="update cardinfo set costpassword='"+desPlus.encrypt(strPassword)+"' where cardno='"+strCardNo+"' ";
			//return amn_Dao.executeQuery(strSql);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean checkCardPassword(String strCardNo,String strPassword)
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		try {
			DESPlus desPlus=new DESPlus();
			String strSql=" select 1 from cardinfo where cardno='"+strCardNo+"' and costpassword='"+desPlus.encrypt(strPassword)+"' ";
			if(amn_Dao.getRowsCount_Ex(strSql)>0)
			{
				return true;
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public String lsDnointernalcardinfos(String strDyqNo) {
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strsql="From Dnointernalcardinfo where cardno='"+strDyqNo+"' ";
		List<Dnointernalcardinfo> lsDnointernalcardinfos=null;
		try {
			lsDnointernalcardinfos=amn_Dao.findByHql(strsql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(lsDnointernalcardinfos);  
		return jsonarray.toString();
		//return lsDnointernalcardinfos;
	}
	
	
	public String loadwWeixinclents(String strOperId)
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strSql="select * from Weixinclent a with(nolock),nointernalcardinfo with(nolock),Vouchers b with(nolock)  where a.vchno=b.vchno and qdyno=cardno and operid='"+strOperId+"'";
		ResultSet rs=null;
		List<Weixinclent> lsWeixinclents=new ArrayList<Weixinclent>();
		try {
			rs=amn_Dao.executeQuery(strSql);
			if(rs!=null)
			{
				while(rs.next())
				{
					Weixinclent weixinclent=new Weixinclent();
					weixinclent.setBillid(rs.getString("billid"));
					weixinclent.setClientname(rs.getString("clientname"));
					weixinclent.setMobile(rs.getString("mobile"));
					weixinclent.setOperid(rs.getString("operid"));
					weixinclent.setCreatedate(rs.getString("enabledate"));
					weixinclent.setDyqName(rs.getString("vchname"));
					weixinclent.setQdyno(rs.getString("qdyno"));
					if(rs.getInt("cardstate")==1)
					{
						weixinclent.setStrState("正常");
					}
					else if(rs.getInt("cardstate")==2)
					{
						weixinclent.setStrState("已使用");
					}
					lsWeixinclents.add(weixinclent);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(lsWeixinclents);  
		return jsonarray.toString();
		//return lsWeixinclents;
	}

	public boolean wxPost(String strCompId,String strBillId, String strDate) {
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strSql=" exec upg_handconsumbill_card '"+strCompId+"','"+strBillId+"','"+strDate+"',2 ";
		Map<String, String> mapParam=new HashMap<String, String>();
		mapParam.put("orderid", strBillId);
		try {
			String strRep=HttpClientUtil.postMap("http://amani.chinamani.com/api/sendmsg", mapParam);
			//System.out.println(strRep);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return amn_Dao.executeSql(strSql);
	}

	public boolean saveEvaluation(String billid,String operid,double discount,String content,double amt){
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		Evaluation evaluation=new Evaluation();
		try {
			evaluation.setUuid(UUID.randomUUID().toString());
			evaluation.setBillid(billid);
			evaluation.setOperid(operid);
			evaluation.setDiscount(discount);
			evaluation.setContent(content);
			evaluation.setAmt(amt);
			amn_Dao.save(evaluation);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Evaluation loadEvaluation(String operid,String billid) {
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		Evaluation evaluation=null;
		try {
			List<Evaluation> lsEvaluations=amn_Dao.findByHql(" From Evaluation where billid='"+billid+"' and operid='"+operid+"'");
			if(lsEvaluations!=null && lsEvaluations.size()>0)
			{
				evaluation=lsEvaluations.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return evaluation;
	}

	public boolean saveOrders(String strCompId,String strBillId,String strCardNo,String orderPhone,String strDate,String strTime,String openid,int billType,String complydetail) {
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		try {
			Orders orders=new Orders();
			orders.setCallbillid(strBillId);
			orders.setOrderconply(strCompId);
			orders.setOrderphone(orderPhone);
			orders.setCardno(strCardNo);
			orders.setOrderfactdate(strDate);
			orders.setOrderfacttime(strTime);
			orders.setConfirmdate(CommonTool.getCurrDate());
			orders.setOpenid(openid);
			orders.setOrderstate(2);
			orders.setComplydetail(complydetail);
			orders.setBilltype(billType);
			orders.setOrdersid(UUID.randomUUID().toString());
			amn_Dao.saveOrUpdate(orders);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public String loadOrders(String openid) {
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		List<Orders> lsOrders=new ArrayList<Orders>();
		String strSql=" select orderfactdate,orderfacttime,orderstate,compaddress,complydetail,cardno,callbillid,orderconply,compname from orders with(nolock),companyinfo with(nolock) where compno=orderconply and openid='"+openid+"' and confirmdate between '"+CommonTool.addMonth(CommonTool.getCurrDate(), -3)+"' and '"+CommonTool.getCurrDate()+"' ";
		ResultSet rs=null;
		try {
			rs=amn_Dao.executeQuery(strSql);
			while(rs.next())
			{
				Orders orders=new Orders();
				orders.setCallbillid(rs.getString("callbillid"));
				orders.setOrderconply(rs.getString("orderconply"));
				orders.setOrderfactdate(rs.getString("orderfactdate"));
				orders.setComplydetail(rs.getString("complydetail"));
				orders.setOrderfacttime(rs.getString("orderfacttime"));
				orders.setStrCompName(rs.getString("compname"));
				orders.setAddress(rs.getString("compaddress"));
				orders.setOrderstate(rs.getInt("orderstate"));
				List<OrdersEmpinfo> lsEmpinfos=loadOrdersEmpinfo(rs.getString("orderconply"), rs.getString("callbillid"));
				if(lsEmpinfos!=null && lsEmpinfos.size()>0)
				{
					for(OrdersEmpinfo orEmpinfo:lsEmpinfos)
					{
						if(orders.getConfirmemp()==null)
						{
							orders.setConfirmemp(orEmpinfo.getEmpname());
						}
						else
						{
							orders.setConfirmemp(orders.getConfirmemp()+","+orEmpinfo.getEmpname());
						}		
					}
				}
				
				List<OredersPrjinfo> lsOredersPrjinfos=loadOredersPrjinfo(rs.getString("orderconply"), rs.getString("callbillid"));
				if(lsOredersPrjinfos!=null && lsOredersPrjinfos.size()>0)
				{
					for(OredersPrjinfo orPrjinfo:lsOredersPrjinfos)
					{
						if(orders.getOrderproject()==null)
						{
							orders.setOrderproject(orPrjinfo.getPrjname());
						}
						else
						{
							orders.setOrderproject(orders.getOrderproject()+","+orPrjinfo.getPrjname());
						}
					}
				}
				lsOrders.add(orders);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(lsOrders);  
		return jsonarray.toString();
	}

	public String loadCompByCardNo(String strCardNo) {
		List<Companyinfo> lsCompanyinfos=null;
		lsCompanyinfos=loadCompanysByCard(strCardNo);
		if(lsCompanyinfos==null || lsCompanyinfos.size()<1)
		{
			lsCompanyinfos=new ArrayList<Companyinfo>();
			lsCompanyinfos.add(loadCompanyByCardNo(strCardNo));
		}
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(lsCompanyinfos);  
		return jsonarray.toString();
	}
	
	
	public List<Companyinfo> loadCompanysByCard(String strCardNo)
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		ResultSet rs=null;
		StringBuffer sqlBuffer=new StringBuffer();
		sqlBuffer.append(" select changecompid,compname ");
		sqlBuffer.append(" from( select top 3 changecompid ");
		sqlBuffer.append(" from cardaccountchangehistory  ");
		sqlBuffer.append(" where chagedate between '"+CommonTool.addMonth(CommonTool.getCurrDate(), -3)+"' and '"+CommonTool.getCurrDate()+"' ");
		sqlBuffer.append(" and changecardno='"+strCardNo+"' ");
		sqlBuffer.append(" group by changecompid) a,companyinfo b ");
		sqlBuffer.append(" where changecompid=compno ");
		List<Companyinfo> lsCompanyinfos=new ArrayList<Companyinfo>();
		try {
			rs=amn_Dao.executeQuery(sqlBuffer.toString());
			if(rs!=null)
			{
				while(rs.next())
				{
					Companyinfo companyinfo=new Companyinfo();
					companyinfo.setCompno(rs.getString("changecompid"));
					companyinfo.setCompname(rs.getString("compname"));
					lsCompanyinfos.add(companyinfo);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return lsCompanyinfos;
	}
	
	public Companyinfo loadCompanyByCardNo(String strCardNo)
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		ResultSet rs=null;
		StringBuffer sqlbuBuffer=new StringBuffer();
		sqlbuBuffer.append(" select cardvesting,compname  ");
		sqlbuBuffer.append(" from cardinfo,companyinfo  ");
		sqlbuBuffer.append(" where cardvesting=compno ");
		sqlbuBuffer.append(" and cardno='"+strCardNo+"' ");
		Companyinfo companyinfo=new Companyinfo();
		try {
			rs=amn_Dao.executeQuery(sqlbuBuffer.toString());
			if(rs!=null)
			{
				while(rs.next())
				{
					companyinfo.setCompno(rs.getString("changecompid"));
					companyinfo.setCompname(rs.getString("compname"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return companyinfo;
	}

	public String loadEmpInfoByComp(String strCompId,String strCardNo) {
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strBeforDate=CommonTool.datePlusDay(CommonTool.getCurrDate(), -92);
		String strSql="select substring(staffno,4,3) staffno,staffname,manageno ,ccount=COUNT(distinct b.csbillid)" +
				" from staffinfo a with(nolock),mconsumeinfo b with(nolock),dconsumeinfo c with(nolock)" +
				" where b.cscompid=c.cscompid and b.csbillid=c.csbillid" +
				" and b.financedate between '"+strBeforDate+"' and '"+CommonTool.getCurrDate()+"' " +
				" and b.cscardno='"+strCardNo+"' " +
				" and ((c.csfirstinid=a.manageno and csfirsttype=1 ) " +
				" or (c.cssecondinid=a.manageno and cssecondtype=1 )" +
				" or (c.csthirdinid=a.manageno and csthirdtype=1)) " +
				" and position in ('003','004','00401','00402','006','007','00701','00702','00103') and  a.compno='"+strCompId+"' " +
				" group by staffno,staffname,manageno ";
		
		/*strSql+=" union all  select staffno,staffname,manageno ,ccount=COUNT(distinct b.csbillid)" +
				" from staffinfo a with(nolock),mconsumeinfo b with(nolock),dconsumeinfo c with(nolock)" +
				" where b.cscompid=c.cscompid and b.csbillid=c.csbillid" +
				" and b.financedate between '"+strBeforDate+"' and '"+CommonTool.getCurrDate()+"' " +
				" and b.cscardno='"+strCardNo+"' " +
				" and ((c.csfirstinid=a.manageno and csfirsttype=1) " +
				" or (c.cssecondinid=a.manageno and cssecondtype=1)" +
				" or (c.csthirdinid=a.manageno and csthirdtype=1)) " +
				" and position in ('003','004','00401','00402','006','007','00701','00702','00103') " +
				" group by staffno,staffname,manageno ";*/
		ResultSet rs=null;
		List<Staffinfo> lsStaffinfos=new ArrayList<Staffinfo>();
		try {
			rs=amn_Dao.executeQuery(strSql);
			if(rs!=null)
			{
				while(rs.next())
				{
					Staffinfo staffinfo=new Staffinfo();
					staffinfo.setBstaffno(rs.getString("staffno"));
					staffinfo.setStaffename(rs.getString("staffname"));
					staffinfo.setManageno(rs.getString("manageno"));
					lsStaffinfos.add(staffinfo);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(lsStaffinfos);  
		return jsonarray.toString();
	}

	public String loadEmpInfoByDept(String strCompId) {
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strSql=" From Staffinfo where compno='"+strCompId+"' and department in('004','003') ";
		List<Staffinfo> lsStaffinfos=null;
		try {
			lsStaffinfos=amn_Dao.findByHql(strSql);
			if(lsStaffinfos!=null && lsStaffinfos.size()>0)
			{
				for(int i=0;i<lsStaffinfos.size();i++)
				{
					lsStaffinfos.get(i).getId().setStaffno(lsStaffinfos.get(i).getId().getStaffno().substring(3));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(lsStaffinfos);  
		return jsonarray.toString();
	}


	public boolean saveOrderPrjInfo(String strCompId,
			String strBillId, String strPrjInfo,
			String strPrjName) {
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		OredersPrjinfo orPrjinfo=new OredersPrjinfo();
		orPrjinfo.setBillid(strBillId);
		orPrjinfo.setCompid(strCompId);
		orPrjinfo.setPrjno(strPrjInfo);
		orPrjinfo.setPrjname(strPrjName);
		orPrjinfo.setUuid(UUID.randomUUID().toString());
		try {
			amn_Dao.saveOrUpdate(orPrjinfo);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean saveOrderEmpInfo(String strCompId,
			String strBillId, String strEmpNo,
			String strEmpName,String strEmpInid) {
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		OrdersEmpinfo ordersEmp=new OrdersEmpinfo();
		ordersEmp.setBillid(strBillId);
		ordersEmp.setCompid(strCompId);
		ordersEmp.setEmpno(strEmpNo);
		ordersEmp.setEmpname(strEmpName);
		ordersEmp.setEmpinid(strEmpInid);
		ordersEmp.setUuid(UUID.randomUUID().toString());
		try {
			amn_Dao.saveOrUpdate(ordersEmp);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public List<OrdersEmpinfo> loadOrdersEmpinfo(String strCompId,String strBillId)
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strSql="select * from orders_empinfo where compid='"+strCompId+"' and billid='"+strBillId+"' ";
		ResultSet rs=null;
		List<OrdersEmpinfo> lsEmpinfos=new ArrayList<OrdersEmpinfo>();
		try {
			rs=amn_Dao.executeQuery(strSql);
			while(rs.next())
			{
				OrdersEmpinfo orEmpinfo=new OrdersEmpinfo();
				orEmpinfo.setBillid(rs.getString("billid"));
				orEmpinfo.setCompid(rs.getString("compid"));
				orEmpinfo.setEmpinid(rs.getString("empinid"));
				orEmpinfo.setEmpno(rs.getString("empno"));
				orEmpinfo.setEmpname(rs.getString("empname"));
				orEmpinfo.setUuid(rs.getString("uuid"));
				lsEmpinfos.add(orEmpinfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return lsEmpinfos;
	}
	
	public List<OredersPrjinfo> loadOredersPrjinfo(String strCompId,String strBillId)
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strSql="select * from oreders_prjinfo where compid='"+strCompId+"' and billid='"+strBillId+"' ";
		ResultSet rs=null;
		List<OredersPrjinfo> lsOredersPrjinfos=new ArrayList<OredersPrjinfo>();
		try {
			rs=amn_Dao.executeQuery(strSql);
			while(rs.next())
			{
				OredersPrjinfo oredersPrjinfo=new OredersPrjinfo();
				oredersPrjinfo.setBillid(rs.getString("billid"));
				oredersPrjinfo.setCompid(rs.getString("compid"));
				oredersPrjinfo.setPrjno(rs.getString("prjno"));
				oredersPrjinfo.setPrjname(rs.getString("prjname"));
				oredersPrjinfo.setUuid(rs.getString("uuid"));
				lsOredersPrjinfos.add(oredersPrjinfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return lsOredersPrjinfos;
	}
	
	public boolean updBillState(String strCompId,String strBillId)
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		try {
			return amn_Dao.executeSql(" update billstate set state=2 where compid='"+strCompId+"' and billid='"+strBillId+"' ");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public String checkBillState(String strBillId){
		String state="";
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strSql="select state from billstate where billid='"+strBillId+"'";
		ResultSet rs=null;
		try {
			rs=amn_Dao.executeQuery(strSql);
			if(rs.next()){
				state=rs.getString("state");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(rs!=null){
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return state;
	}
	
	public boolean updOrderState(String strBillId) {
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		try {
			return amn_Dao.executeSql(" update orders set orderstate=3  where callbillid='"+strBillId+"' ");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	//格式    	YGBD#身份证号码#工号#openid#
	public boolean bandStaffInfo(String strParams) {
		if(CommonTool.checkStr(strParams))
		{
			String arrayParams[]=strParams.split("#");
			if(arrayParams==null || arrayParams.length<4)
			{
				return false;
			}
			else 
			{
				AMN_Dao amn_Dao=null;
				SpringDBInit sdbinit = SpringDBInit.getInstance(); 
				amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
				ResultSet rs=null;
				try {
					
					if(amn_Dao.getRowsCount_Ex(" select count(staffno) from staffinfo where staffno='"+arrayParams[2]+"' and pccid='"+arrayParams[1]+"' ")>0)
					{
						return amn_Dao.executeSql(" update staffinfo set staffopenid='"+arrayParams[3]+"' where staffno='"+arrayParams[2]+"' and pccid='"+arrayParams[1]+"' ");
					}
					return false;
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}
			}
		}
		return false;
	}
	
	public String saveNewOrders(String strCompId,String strBillId,String strItemNo,String strEmpNo,int ispz,String strDate,String strTime,String orderPhone,String strCardNo,String openid,String strEmpName)
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		
		try {
			//判断是否已经预约
			String strSql=" select count(confirmemp) from orders with(nolock) where orderstate<>2 and confirmemp='"+strEmpNo+"'"+
					" and confirmdate='"+ strDate +"' and orderfacttime='"+ strTime +"' ";
			if(amn_Dao.getRowsCount_Ex(strSql)>0){
				return "3";
			}else{
				Orders orders=new Orders();
				orders.setCallbillid(strBillId);
				orders.setOrderconply(strCompId);
				orders.setOrderphone(orderPhone);
				orders.setCardno(strCardNo);
				orders.setOrderfactdate(strDate);
				orders.setOrderfacttime(strTime);
				orders.setConfirmdate(CommonTool.getCurrDate());
				orders.setOpenid(openid);
				//orders.setOrderstate(1);
				orders.setOrderstate(0);//确认中
				orders.setOrderproject(strItemNo);
				orders.setIspz(ispz);
				orders.setConfirmemp(strEmpNo);
				orders.setOrdersid(UUID.randomUUID().toString());
				orders.setStaffname(strEmpName);
				amn_Dao.saveOrUpdate(orders);
				net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(loadOrdersEmpInfo(strCompId,strEmpNo));
				return jsonarray.toString();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "";
		}
	}
	
	public List<Staffinfo> loadOrdersEmpInfo(String strCompId,String strEmpNo)
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		ResultSet rs=null;
		List<Staffinfo> lStaffinfos=new ArrayList<Staffinfo>();
		String strSql=" select staffno,staffname,manageno,staffopenid from staffinfo where staffno='"+strCompId+strEmpNo+"' and compno='"+strCompId+"'";
			   strSql+=" union all select staffno,staffname,manageno,staffopenid from staffinfo where compno='"+strCompId+"' and position in('00101','00104') ";
		try {
			rs=amn_Dao.executeQuery(strSql);
			if(rs!=null)
			{
				while(rs.next())
				{
					Staffinfo staffinfo=new Staffinfo();
					staffinfo.setBstaffno(rs.getString("staffno"));
					staffinfo.setStaffename(rs.getString("staffname"));
					staffinfo.setStaffopenid(rs.getString("staffopenid"));
					staffinfo.setManageno(rs.getString("manageno"));
					lStaffinfos.add(staffinfo);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return lStaffinfos;
	}
	
	
	public String loadOrderDetal(String openid)
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		List<Orders> lsOrders=new ArrayList<Orders>();
		String strSql=" select orderfactdate,orderfacttime,orderstate,compaddress,complydetail,cardno,callbillid,orderconply,staffname,compname from orders with(nolock),companyinfo with(nolock) where compno=orderconply and openid='"+openid+"' and confirmdate between '"+CommonTool.addMonth(CommonTool.getCurrDate(), -3)+"' and '"+CommonTool.getCurrDate()+"' ";
		ResultSet rs=null;
		try {
			rs=amn_Dao.executeQuery(strSql);
			while(rs.next())
			{
				Orders orders=new Orders();
				orders.setCallbillid(rs.getString("callbillid"));
				orders.setOrderconply(rs.getString("orderconply"));
				orders.setOrderfactdate(rs.getString("orderfactdate"));
				orders.setComplydetail(rs.getString("complydetail"));
				orders.setOrderfacttime(rs.getString("orderfacttime"));
				orders.setStrCompName(rs.getString("compname"));
				orders.setAddress(rs.getString("compaddress"));
				orders.setOrderstate(rs.getInt("orderstate"));
				orders.setStaffname(rs.getString("staffname"));
				lsOrders.add(orders);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(lsOrders);
		return jsonarray.toString();
	}
	
	public String loadOrderById(String callbillid)
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		Orders orders=new Orders();
		String strSql=" select callbillid,orderfactdate,orderfacttime,orderstate,cardno,orderconply,staffname,openid,orderphone,orderproject from orders with(nolock) where callbillid='"+callbillid+"'";
		ResultSet rs=null;
		try {
			rs=amn_Dao.executeQuery(strSql);
			while(rs.next())
			{
				orders.setCallbillid(rs.getString("callbillid"));
				orders.setOrderfactdate(rs.getString("orderfactdate"));
				orders.setOrderfacttime(rs.getString("orderfacttime"));
				orders.setOrderstate(rs.getInt("orderstate"));
				orders.setCardno(rs.getString("cardno"));
				orders.setOrderconply(rs.getString("orderconply"));
				orders.setStaffname(rs.getString("staffname"));
				orders.setOpenid(rs.getString("openid"));
				orders.setOrderphone(rs.getString("orderphone"));
				orders.setOrderproject(rs.getString("orderproject"));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(orders);
		return jsonarray.toString();
	}
	
	public String loadOrderByEmp(String strCompId,String strEmpNo, String orderDate, String orderTime)
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		List<Orders> list=new ArrayList<Orders>();
		String date = "convert(datetime,'"+ orderDate +"'+' '+'"+ orderTime +"',20)";
		String strSql=" select callbillid,orderfactdate,orderfacttime,confirmemp,staffname,openid from orders with(nolock) where confirmemp='"+strCompId+strEmpNo+"'"+
		" and convert(datetime,orderfactdate+' '+orderfacttime,20) between "+ date +" and dateadd(hour,2,"+ date +")";//查询前选择时间两个小时之内的
		ResultSet rs=null;
		try {
			rs=amn_Dao.executeQuery(strSql);
			while(rs.next())
			{
				Orders orders=new Orders();
				orders.setCallbillid(rs.getString("callbillid"));
				orders.setOrderfactdate(rs.getString("orderfactdate"));
				orders.setOrderfacttime(rs.getString("orderfacttime"));
				orders.setConfirmemp(rs.getString("confirmemp"));
				orders.setStaffname(rs.getString("staffname"));
				orders.setOpenid(rs.getString("openid"));
				list.add(orders);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(list);
		return jsonarray.toString();
	}
	
	public String loadOrderByOpenId(String openId, String orderDate, String orderTime)
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		List<Orders> list=new ArrayList<Orders>();
		String strSql=" select callbillid,orderfactdate,orderfacttime,confirmemp,staffname,openid,orderconply from orders with(nolock) where openid='"+openId+"'"+
				" and confirmdate ='"+ orderDate +"' and orderfacttime='"+ orderTime +"' ";
		ResultSet rs=null;
		try {
			rs=amn_Dao.executeQuery(strSql);
			while(rs.next())
			{
				Orders orders=new Orders();
				orders.setCallbillid(rs.getString("callbillid"));
				orders.setOrderfactdate(rs.getString("orderfactdate"));
				orders.setOrderfacttime(rs.getString("orderfacttime"));
				orders.setConfirmemp(rs.getString("confirmemp"));
				orders.setStaffname(rs.getString("staffname"));
				orders.setOpenid(rs.getString("openid"));
				orders.setOrderconply(rs.getString("orderconply"));
				list.add(orders);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(list);
		return jsonarray.toString();
	}
	
	public String loadNewEmpInfoByComp(String strCompId,String strCardNo,int billtype) {
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strBeforDate=CommonTool.datePlusDay(CommonTool.getCurrDate(), -92);
		String strSql="";
		//美发
		if(billtype==1)
		{
			strSql="select substring(staffno,4,3) staffno,staffname,manageno ,ccount=COUNT(distinct b.csbillid)" +
				" from staffinfo a with(nolock),mconsumeinfo b with(nolock),dconsumeinfo c with(nolock)" +
				" where b.cscompid=c.cscompid and b.csbillid=c.csbillid" +
				" and b.financedate between '"+strBeforDate+"' and '"+CommonTool.getCurrDate()+"' " +
				" and b.cscardno='"+strCardNo+"' " +
				" and ((c.csfirstinid=a.manageno and csfirsttype=1 ) " +
				" or (c.cssecondinid=a.manageno and cssecondtype=1 )" +
				" or (c.csthirdinid=a.manageno and csthirdtype=1)) " +
				" and position in ('003','006','007','00701','00702') and  a.compno='"+strCompId+"' " +
				" and subtring(staffno,4,6)<>'300' "+
				" group by staffno,staffname,manageno ";
		}
		else 
		{
			//美容
			strSql="select substring(staffno,4,3) staffno,staffname,manageno ,ccount=COUNT(distinct b.csbillid)" +
					" from staffinfo a with(nolock),mconsumeinfo b with(nolock),dconsumeinfo c with(nolock)" +
					" where b.cscompid=c.cscompid and b.csbillid=c.csbillid" +
					" and b.financedate between '"+strBeforDate+"' and '"+CommonTool.getCurrDate()+"' " +
					" and b.cscardno='"+strCardNo+"' " +
					" and ((c.csfirstinid=a.manageno and csfirsttype=1 ) " +
					" or (c.cssecondinid=a.manageno and cssecondtype=1 )" +
					" or (c.csthirdinid=a.manageno and csthirdtype=1)) " +
					" and position in ('004','00401','00402','00103') and  a.compno='"+strCompId+"' " +
					" and subtring(staffno,4,6)<>'400' "+
					" group by staffno,staffname,manageno ";
		}
		/*strSql+=" union all  select staffno,staffname,manageno ,ccount=COUNT(distinct b.csbillid)" +
				" from staffinfo a with(nolock),mconsumeinfo b with(nolock),dconsumeinfo c with(nolock)" +
				" where b.cscompid=c.cscompid and b.csbillid=c.csbillid" +
				" and b.financedate between '"+strBeforDate+"' and '"+CommonTool.getCurrDate()+"' " +
				" and b.cscardno='"+strCardNo+"' " +
				" and ((c.csfirstinid=a.manageno and csfirsttype=1) " +
				" or (c.cssecondinid=a.manageno and cssecondtype=1)" +
				" or (c.csthirdinid=a.manageno and csthirdtype=1)) " +
				" and position in ('003','004','00401','00402','006','007','00701','00702','00103') " +
				" group by staffno,staffname,manageno ";*/
		ResultSet rs=null;
		List<Staffinfo> lsStaffinfos=new ArrayList<Staffinfo>();
		try {
			rs=amn_Dao.executeQuery(strSql);
			if(rs!=null)
			{
				while(rs.next())
				{
					Staffinfo staffinfo=new Staffinfo();
					staffinfo.setBstaffno(rs.getString("staffno"));
					staffinfo.setStaffename(rs.getString("staffname"));
					staffinfo.setManageno(rs.getString("manageno"));
					lsStaffinfos.add(staffinfo);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(lsStaffinfos);  
		return jsonarray.toString();
	}
	
	
	public String loadStartHairInfo(String strCompId)
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strSql=" select top 3 *,newid() random from staffinfo where position in('006','007','00701','00702') and curstate='2' and compno='"+strCompId+"' order by random ";
		ResultSet rs=null;
		List<Staffinfo> lsStaffinfos=new ArrayList<Staffinfo>();
		try {
			rs=amn_Dao.executeQuery(strSql);
			if(rs!=null)
			{
				while(rs.next())
				{
					Staffinfo staffinfo=new Staffinfo();
					staffinfo.setBstaffno(rs.getString("staffno"));
					staffinfo.setStaffename(rs.getString("staffname"));
					staffinfo.setManageno(rs.getString("manageno"));
					lsStaffinfos.add(staffinfo);
				}
			}
			if(lsStaffinfos!=null && lsStaffinfos.size()>0)
			{
				for(int i=0;i<lsStaffinfos.size();i++)
				{
					lsStaffinfos.get(i).setBstaffno(lsStaffinfos.get(i).getBstaffno().substring(3));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(lsStaffinfos);  
		return jsonarray.toString();
	}
	
	
	public String loadStartBeautyInfo(String strCompId)
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strSql=" select top 3 *,newid() random from staffinfo where position in('004','00401','00103') and curstate='2' and compno='"+strCompId+"' and substring(staffno,4,6)<>'400' order by random ";
		ResultSet rs=null;
		List<Staffinfo> lsStaffinfos=new ArrayList<Staffinfo>();
		try {
			rs=amn_Dao.executeQuery(strSql);
			if(rs!=null)
			{
				while(rs.next())
				{
					Staffinfo staffinfo=new Staffinfo();
					staffinfo.setBstaffno(rs.getString("staffno"));
					staffinfo.setStaffename(rs.getString("staffname"));
					staffinfo.setManageno(rs.getString("manageno"));
					lsStaffinfos.add(staffinfo);
				}
			}
			if(lsStaffinfos!=null && lsStaffinfos.size()>0)
			{
				for(int i=0;i<lsStaffinfos.size();i++)
				{
					lsStaffinfos.get(i).setBstaffno(lsStaffinfos.get(i).getBstaffno().substring(3));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(lsStaffinfos);  
		return jsonarray.toString();
	}
	
	
	public String checkUser(String strCompId,String userName,String pwd)
	{
		
		RepsonBean req = new RepsonBean(false);
		AMN_Dao amn_Dao = null;
		SpringDBInit sdbinit = SpringDBInit.getInstance();
		amn_Dao = (AMN_Dao) sdbinit.getInstance().getBean("amn_Dao");
		DESPlus desPlus;
		String strPwd = "";
		try {
			desPlus = new DESPlus();
			strPwd = desPlus.encrypt(pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (checkCompId(strCompId)) {

			String strSql = "select count(userno) from sysuserinfo where userno='"
					+ userName + "' and userpwd='" + strPwd + "' ";
			try {
				if (amn_Dao.getRowsCount_Ex(strSql) > 0) {
					req.setbRet(true);
				}
			} catch (DataAccessException e) {
				e.printStackTrace();
			} catch (RuntimeException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(req);
		return jsonarray.toString();

	}
	
	
	public String saveInventory(String strCompId,String userId,String strParams)
	{
		RepsonBean req=new RepsonBean(false);
		if(CommonTool.checkStr(strCompId)==false || CommonTool.checkStr(strParams)==false)
		{
			
		}
		else
		{
			AMN_Dao amn_Dao=null;
			SpringDBInit sdbinit = SpringDBInit.getInstance(); 
			amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
			net.sf.json.JSONArray jsonArray = net.sf.json.JSONArray.fromObject(strParams); 
			List<Inventorydetal> lsInventorydetals=net.sf.json.JSONArray.toList(jsonArray, Inventorydetal.class);
			try {
				InventoryId id=new InventoryId();
				Inventory inventory=new Inventory();
				id.setCompid(strCompId);
				id.setBillid(UUID.randomUUID().toString());
				id.setInvenbill(createInvBill(strCompId));
				inventory.setId(id);
				inventory.setCreatedate(CommonTool.getCurrDate());
				inventory.setState(1);
				inventory.setUserid(userId);
				for(Inventorydetal inventorydetal:lsInventorydetals)
				{
					InventorydetalId detalId=new InventorydetalId();
					detalId.setBillid(id.getBillid());
					detalId.setSerial(UUID.randomUUID().toString());
					detalId.setCompid(strCompId);
					inventorydetal.setId(detalId);
				}
				amn_Dao.save(inventory);
				amn_Dao.saveOrUpdateAll(lsInventorydetals);
				req.setbRet(true);
			} catch (Exception e) {
				req.setbRet(false);
				e.printStackTrace();
			}
		}
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(req);  
		return jsonarray.toString();
	}
	
	
	public String addInventory(String strCompId)
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strSql=" select invenbill from inventory where compid='"+strCompId+"' and state=1 group by invenbill ";
		ResultSet rs=null;
		String invenbill="";
		try {
			rs=amn_Dao.executeQuery(strSql);
			if(rs!=null)
			{
				while(rs.next())
				{
					invenbill=rs.getString("invenbill");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return invenbill;
	}
	
	
	public String createInvBill(String strCompId)
	{
		String invBill=addInventory(strCompId);
		if(CommonTool.checkStr(invBill))
		{
			return invBill;
		}
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strSql=" select count(ccount) num from( select invenbill,count(invenbill) ccount from inventory where compid='"+strCompId+"' group by invenbill) b  ";
		ResultSet rs=null;
		
		try {
			rs=amn_Dao.executeQuery(strSql);
			if(rs!=null)
			{
				while(rs.next())
				{
					invBill=strCompId+(rs.getInt("num")+1);
				}
			}
			if(CommonTool.checkStr(invBill)==false)
			{
				invBill=strCompId+"1";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return invBill;
	}
	
	
	public String checkGoodBar(String strCompId,String strGoodBar)
	{
		RepsonBean req=new RepsonBean(false);
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strSql=" select * from dgoodsbarinfo where goodsbarno='"+strGoodBar+"' and receivestore='"+strCompId+"' and barnostate=2 ";
		Dgoodsbarinfo dgoodsbarinfo=null;
		ResultSet rs=null;
		try {
			rs=amn_Dao.executeQuery(strSql);
			if(rs!=null)
			{
				while(rs.next())
				{
					
					dgoodsbarinfo=new Dgoodsbarinfo();
					dgoodsbarinfo.setBgoodsbarno(rs.getString("goodsbarno"));
					dgoodsbarinfo.setBgoodsno(rs.getString("goodsno"));
					req.setbRet(true);
					req.setObjJson(net.sf.json.JSONArray.fromObject(dgoodsbarinfo).toString());
				}
			}
			if(dgoodsbarinfo==null)
			{
				req.setStrMessage("物品条码不存在或者是状态不对，或者是不是本店的条形码");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		JsonConfig config=new JsonConfig();
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(req);  
		return jsonarray.toString();
	}
	
	public String deleteInventoryByInventBill(String strCompId,String inventBill)
	{
		RepsonBean req=new RepsonBean(false);
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strSql=" delete inventory where invenbill='"+inventBill+"' and compid='"+strCompId+"' ";
		try {
			req.setbRet(amn_Dao.executeSql(strSql));
		} catch (Exception e) {
			e.printStackTrace();
		}
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(req);  
		return jsonarray.toString();
	}
	
	
	public String deleteInventoryByBill(String strCompId,String bill)
	{
		RepsonBean req=new RepsonBean(false);
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strSql=" delete inventory where billid='"+bill+"' and compid='"+strCompId+"' ";
		try {
			req.setbRet(amn_Dao.executeSql(strSql));
		} catch (Exception e) {
			e.printStackTrace();
		}
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(req);  
		return jsonarray.toString();
	}
	
	public String loadGoodsBarInfo(String goodsBar)
	{
		RepsonBean req=new RepsonBean(false);
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strSql=" select * from dgoodsbarinfo where goodsbarno='"+goodsBar+"' ";
		Dgoodsbarinfo dgoodsbarinfo=null;
		ResultSet rs=null;
		try {
			rs=amn_Dao.executeQuery(strSql);
			if(rs!=null)
			{
				while(rs.next())
				{
					
					dgoodsbarinfo=new Dgoodsbarinfo();
					dgoodsbarinfo.setBgoodsbarno(rs.getString("goodsbarno"));
					dgoodsbarinfo.setBgoodsno(rs.getString("goodsno"));
					dgoodsbarinfo.setBarnostate(rs.getInt("barnostate"));
					req.setbRet(true);
					req.setObjJson(net.sf.json.JSONArray.fromObject(dgoodsbarinfo).toString());
				}
			}
			if(dgoodsbarinfo==null)
			{
				req.setStrMessage("物品条码不存在或者是状态不对，或者是不是本店的条形码");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		net.sf.json.JSONArray jsonarray = net.sf.json.JSONArray.fromObject(req);  
		return jsonarray.toString();
	}
	
	
	public boolean checkCompId(String strCompId)
	{
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strSql=" select count(compno) from Companyinfo where compno='"+strCompId+"' ";
		try {
			if(amn_Dao.getRowsCount_Ex(strSql)>0)
			{
				return true;
			}
		} catch (DataAccessException e) {
			e.printStackTrace();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public String findGoodBarInfo(String goodBarNo)
	{
		RepsonBean req=new RepsonBean(false);
		AMN_Dao amn_Dao=null;
		SpringDBInit sdbinit = SpringDBInit.getInstance(); 
		amn_Dao=(AMN_Dao)sdbinit.getInstance().getBean("amn_Dao");
		String strSql="select * from dgoodsbarinfo a,goodsnameinfo b where a.goodsno=b.goodsno and a.goodsbarno='"+goodBarNo+"' ";
		ResultSet rs=null;
		Dgoodsbarinfo dgoodsbarinfo=null;
		
		try {
			rs=amn_Dao.executeQuery(strSql);
			if(rs!=null)
			{
				while(rs.next())
				{
					dgoodsbarinfo=new Dgoodsbarinfo();
					switch(rs.getInt("barnostate"))
					{
						case 0:
							dgoodsbarinfo.setBarnostateText("生成");
							break;
						case 1:
							dgoodsbarinfo.setBarnostateText("入库");
							break;
						case 2:
							dgoodsbarinfo.setBarnostateText("发货/出库");
							break;
						case 3:
							dgoodsbarinfo.setBarnostateText("销售");
							break;
						case 4:
							dgoodsbarinfo.setBarnostateText("消耗");
							break;
						case 5:
							dgoodsbarinfo.setBarnostateText("损坏");
							break;
						case 6:
							dgoodsbarinfo.setBarnostateText("退货中");
							break;
					}
					dgoodsbarinfo.setBgoodsbarno(rs.getString("goodsbarno"));
					dgoodsbarinfo.setCreatedate(CommonTool.getDateMask(rs.getString("createdate")));
					dgoodsbarinfo.setCreatestaffno(rs.getString("createstaffno"));
					dgoodsbarinfo.setInserdate(CommonTool.getDateMask(rs.getString("inserdate")));
					dgoodsbarinfo.setInserbillno(rs.getString("inserbillno"));
					dgoodsbarinfo.setOuterdate(CommonTool.getDateMask(rs.getString("outerdate")));
					dgoodsbarinfo.setOuterbill(rs.getString("outerbill"));
					dgoodsbarinfo.setReceivestore(rs.getString("receivestore"));
					dgoodsbarinfo.setCostdate(CommonTool.getDateMask(rs.getString("costdate")));
					dgoodsbarinfo.setCostbillo(rs.getString("costbillo"));
					dgoodsbarinfo.setCoststore(rs.getString("coststore"));
					dgoodsbarinfo.setProddate(CommonTool.getDateMask(rs.getString("proddate")));
					dgoodsbarinfo.setGoodsText(rs.getString("goodsname"));
					dgoodsbarinfo.setBgoodsno(rs.getString("goodsno"));
					req.setbRet(true);
					req.setObjJson(net.sf.json.JSONArray.fromObject(dgoodsbarinfo).toString());
					
				}
				
			}
			if(dgoodsbarinfo==null)
			{
				req.setStrMessage("该条形码不存在");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return net.sf.json.JSONArray.fromObject(req).toString();
	}
	
	
}
