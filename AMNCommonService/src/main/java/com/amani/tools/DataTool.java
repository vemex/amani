package com.amani.tools;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import net.sf.ezmorph.bean.MorphDynaBean;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.amani.action.AnlyResultSet;
import com.amani.bean.HzSpadCardInfoBean;
import com.amani.bean.HzSpadCardProInfo;
import com.amani.bean.SpadBillInfo;
import com.amani.bean.SpadClassInfo;
import com.amani.bean.SpadDconsumeInfo;
import com.amani.bean.SpadGoodsInfo;
import com.amani.bean.SpadMconsumeInfo;
import com.amani.bean.SpadProjectInfo;
import com.amani.bean.SpadStaffInfo;

import com.amani.dao.AMN_DaoImp;
import com.amani.dao.AMN_PADDaoImp;
import com.amani.model.Cardaccount;
import com.amani.model.Cardaccountchangehistory;
import com.amani.model.Cardchangehistory;
import com.amani.model.Cardinfo;
import com.amani.model.CardinfoId;
import com.amani.model.Cardproaccount;
import com.amani.model.CardproaccountId;
import com.amani.model.Cardtransactionhistory;
import com.amani.model.Companyinfo;
import com.amani.model.Goodsinfo;
import com.amani.model.Memberinfo;
import com.amani.model.Projectinfo;
import com.amani.model.Staffinfo;





@Repository("dataTool")
public class DataTool extends HibernateDaoSupport
{

	private AMN_DaoImp amn_Dao;
	
	private AMN_PADDaoImp amn_PADDao;
	private SysSendMsg sysSendMsg;
	
	public AMN_DaoImp getAmn_Dao() {
		return amn_Dao;
	}

	public void setAmn_Dao(AMN_DaoImp amn_Dao) {
		this.amn_Dao = amn_Dao;
	}
	
	//--BandUserInfoService ---绑定会员
	
	//sendMessageTone发送验证码
	public boolean sendMessageTone(String strPhoneNo,String strSeqno)
	{
		try
		{
			String msgText="您正在申请阿玛尼公众账户绑定,需要绑定该手机号,本次验证码为："+strSeqno+".如非本人操作,请忽略.【阿玛尼护肤造型】";
			String sendflag=this.sysSendMsg.sendMsg("001",strPhoneNo, msgText);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}
	//loadMemberNoByPhone获取会员手机号码和会员卡号
	 public boolean loadMemberNoByPhone(String strPhoneNo,String strUserCardno)
		{
			try
			{ 
	    			String strSql="select 1 from memberinfo where memberno='"+strUserCardno+"' and membermphone='"+strPhoneNo+"' ";
	    			AnlyResultSet<Boolean> analysis = new AnlyResultSet<Boolean>() {
					public Boolean anlyResultSet(ResultSet rs) {
			
						boolean returnValue = false;
						try {
							if (rs != null && rs.next() == true) {
								returnValue = true;
							} else {
								returnValue = false;
							}
						} catch (Exception e) {
							e.printStackTrace();
							returnValue = false;
						}
						return returnValue;
					}
				};
				return (Boolean) this.amn_Dao.executeQuery_ex(strSql, analysis);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return false;
			}
		}
	
	 
	 
	//--------------------------------------
	
	//----CardInfoService--------
	 
	 
	 
	 //----------------------------------
	 //获取会员信息
		public Memberinfo loadMemberinfoByCompId(String strCompId,String strMemberId)
		{
			try
			{
				String strSql=" select membervesting,memberno,membername,membermphone" +
						" from Memberinfo where membervesting='"+strCompId+"' and memberno='"+strMemberId+"' ";
				AnlyResultSet<Memberinfo> analysis = new AnlyResultSet<Memberinfo>()
				{
					public Memberinfo anlyResultSet(ResultSet rs)
					{
						Memberinfo returnValue = new Memberinfo();
						try
						{
							if(rs != null && rs.next()==true)
							{
								returnValue.setBmembervesting(rs.getString("membervesting"));
								returnValue.setBmemberno(rs.getString("memberno"));
								returnValue.setMembername(CommonTool.FormatString(rs.getString("membername")));
								returnValue.setMembermphone(CommonTool.FormatString(rs.getString("membermphone")));
	
							}				
						}
						catch(Exception e)
						{
							e.printStackTrace();
							returnValue =  null;
						}
						return returnValue;
					}
				};
				Memberinfo bean= (Memberinfo)this.amn_Dao.executeQuery_ex(strSql,analysis);		
				analysis=null;
				return bean;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return  null;
			}
		}
	 
	 
	 
		
	//获得门店名称
	public String loadCompNameById()
	{
		String strSql = "select compno,compname from companyinfo,compchainstruct where compno=curcompno and complevel=4 order by compno";
		AnlyResultSet<String> analysis = new AnlyResultSet<String>() {
			public String anlyResultSet(ResultSet rs) {
				String returnValue = "";
				try {
					if (rs != null && rs.next() == true) {
						returnValue = rs.getString("compname");
					} else {
						returnValue = "";
					}
				} catch (Exception e) {
					e.printStackTrace();
					returnValue = "";
				}
				return returnValue;
			}
		};
		String strCompname= (String) this.amn_Dao.executeQuery_ex(strSql, analysis);
		analysis=null;
		return strCompname;
	}

	
	
	public List<Companyinfo> loadCompanyName()//获取门店名称
	{
		try
		{
			String strSql=" select compno,compname from companyinfo,compchainstruct where compno=curcompno and complevel=4 order by compno ";
			AnlyResultSet<List<Companyinfo>> analysis = new AnlyResultSet<List<Companyinfo>>()
			{
				public List<Companyinfo>  anlyResultSet(ResultSet rs)
				{
					List<Companyinfo>  returnValue = new ArrayList() ;
					Companyinfo record=null;	
					try
					{
						while(rs != null && rs.next()==true)
						{
							record=new Companyinfo();
							record.setCompno(CommonTool.FormatString(rs.getString("compno")));
							record.setCompname(CommonTool.FormatString(rs.getString("compname")));
							returnValue.add(record);
						}
					
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					return returnValue;
				}
			};
			List<Companyinfo> ls= (List<Companyinfo> )this.amn_Dao.executeQuery_ex(strSql,analysis);
			analysis=null;
			return ls;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}
	
	
	//
	//	获得系统参数的值 
	//
	//String strValue   要获得参数值 传值格式 "SP001-2"
	//返回值:   如果存在就返回参数值，否则返回的"";
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
			strSql = "select paramid,paramvalue from sysparaminfo where compid = '"+strCompId+"' and paramid = "+CommonTool.quotedStr(strValue);
			AnlyResultSet<String> analysis = new AnlyResultSet<String>() 
			{
				public String anlyResultSet(ResultSet rs) 
				{
					String bReturnValue = "";
					try 
					{
						if( rs != null && rs.next())
						{
							bReturnValue =  CommonTool.FormatString(rs.getString("paramvalue"));
						}
					} catch (Exception e) {
						e.printStackTrace();
						bReturnValue = "";
					}
					return bReturnValue;
				}
			};
			return (String) this.amn_Dao.executeQuery_ex(strSql, analysis);
		}
	
	}
	/**
	 * 添加积分
	 * @param strCardNo卡号 accountbalandce 账户余额 cardvesting 归属门店
	 * @return
	 */
	public boolean UpdatAaccountdebts(String strCardNo,double strAccountbalance,String strCardvesting){
		
		try
		{
			
			
			String strSql="if exists(select 1 from cardaccount where cardno='"+strCardNo+"' and accounttype=3) update cardaccount set  accountbalance = isnull(accountbalance,0)+"+CommonTool.GetGymAmt(strAccountbalance,2)+" where cardno='"+strCardNo+"' and accounttype = 3 else" +
					" begin insert cardaccount(cardvesting,cardno,accounttype,accountbalance) values('"+strCardvesting+"','"+strCardNo+"',3,'"+strAccountbalance+"') end";
			return this.amn_Dao.executeSql(strSql);
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}

	}
	//获得卡号
	 public Cardinfo loadCardinfo( String strCardNo)
	    {
		 	String strCompId="001";
	    	 boolean flag=this.bandcardinfo(strCardNo);
	    	 if(flag==false)
	    		 return null;
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
	    	String strSql="select a.cardvesting,a.cardno,a.cardstate,a.salecarddate,a.cutoffdate,a.cardsource,membersex,a.cardtype,cardtypename,membername,membermphone,memberpaperworkno,lowopenamt,lowfillamt,openflag,fillflag,changeflag,slaeproerate,changerule, " +
	    			" accountbalance2=sum(case when isnull(accounttype,0)=2 then accountbalance else 0 end ),accountdebts2=sum(case when isnull(accounttype,0)=2 then accountdebts else 0 end ), " +
	    			" accountbalance3=sum(case when isnull(accounttype,0)=3 then accountbalance else 0 end ),accountdebts3=sum(case when isnull(accounttype,0)=3 then accountdebts else 0 end ), " +
	    			" accountbalance4=sum(case when isnull(accounttype,0)=4 then accountbalance else 0 end ),accountdebts4=sum(case when isnull(accounttype,0)=4 then accountdebts else 0 end ), " +
	    			" accountbalance5=sum(case when isnull(accounttype,0)=5 then accountbalance else 0 end ),accountdebts5=sum(case when isnull(accounttype,0)=5 then accountdebts else 0 end ) " +
	    			" from cardaccount c with(nolock),cardtypeinfo d with(nolock), cardinfo a with(nolock) left join memberinfo b with(nolock) on  a.cardno=b.memberno  " +
	    			" where a.cardno=c.cardno and a.cardno='"+strCardNo+"' " +
	    			" and a.cardtype=d.cardtypeno and  cardtypemodeid  in ('"+strModeId+"','"+strFristModeId+"','"+strSecondModeId+"','"+strThirthModeId+"') " +
	    			" group by   a.cardvesting,a.cardno,a.cardstate,a.salecarddate,a.cutoffdate,a.cardsource,membersex,a.cardtype,cardtypename,membername,membermphone,memberpaperworkno,lowopenamt,lowfillamt,openflag,fillflag,changeflag,slaeproerate,changerule ";
	    	AnlyResultSet<Cardinfo> analysis = new AnlyResultSet<Cardinfo>()
			{
				public Cardinfo anlyResultSet(ResultSet rs)
				{
					Cardinfo returnValue=null ;
					try
					{
						if(rs != null && rs.next()==true)
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
							returnValue.setAccount2debtAmt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("accountdebts2"))));
							returnValue.setAccount3debtAmt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("accountdebts3"))));
							returnValue.setAccount4debtAmt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("accountdebts4"))));
							returnValue.setAccount5debtAmt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("accountdebts5"))));
							returnValue.setSlaeproerate(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("slaeproerate"))));
							
							returnValue.setDSaleLowAmt(CommonTool.FormatBigDecimal(new BigDecimal(CommonTool.FormatDouble(rs.getDouble("lowopenamt")))));
							
							returnValue.setDFillLowAmt(CommonTool.FormatBigDecimal(new BigDecimal(CommonTool.FormatDouble(rs.getDouble("lowfillamt")))));
							returnValue.setOpenflag(CommonTool.FormatInteger(rs.getInt("openflag")));
							returnValue.setFillflag(CommonTool.FormatInteger(rs.getInt("fillflag")));
							returnValue.setChangeflag(CommonTool.FormatInteger(rs.getInt("changeflag")));
							returnValue.setChangerule(CommonTool.FormatInteger(rs.getInt("changerule")));
						}				
					}
					catch(Exception e)
					{
						e.printStackTrace();
						returnValue =  null;
					}
					return returnValue;
				}
			};
			Cardinfo record= (Cardinfo)this.amn_Dao.executeQuery_ex(strSql,analysis);
			analysis=null;
			
			
			return record;
	    }
	 
	 //获得卡账户列表
	 /*public List<Cardaccount> loadCardaccountInfo(String strCardNo)
		{
			try
			{
				String strSql="select cardvesting,cardno,accounttype,parentcodevalue,accountbalance,accountdebts,accountdatefrom,accountdateend,accountremark " +
						" from cardaccount ,commoninfo " +
						" where cardno='"+strCardNo+"' and 'ZHLX'=infotype and parentcodekey=accounttype ";
				AnlyResultSet<List<Cardaccount>> analysis = new AnlyResultSet<List<Cardaccount>>()
				{
					public List<Cardaccount> anlyResultSet(ResultSet rs)
					{
						List<Cardaccount> returnValue = new ArrayList();
						Cardaccount record=null;
						try
						{
							while(rs != null && rs.next()==true)
							{
								record=new Cardaccount();
								record.setCardvesting(rs.getString("cardvesting"));
								record.setCardno(rs.getString("cardno"));
								record.setAccounttype(CommonTool.FormatInteger(rs.getInt("accounttype")));
								record.setAccounttypeText(CommonTool.FormatString(rs.getString("parentcodevalue")));
								record.setAccountbalance(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("accountbalance"))));
								record.setAccountdebts(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("accountdebts"))));
								record.setAccountdatefrom(CommonTool.getDateMask(rs.getString("accountdatefrom")));
								record.setAccountdateend(CommonTool.getDateMask(rs.getString("accountdateend")));
								record.setAccountremark(rs.getString("accountremark"));
								returnValue.add(record);
							}				
						}
						catch(Exception e)
						{
							e.printStackTrace();
							returnValue =  null;
						}
						return returnValue;
					}
				};
				List<Cardaccount> ls= (List<Cardaccount>)this.amn_Dao.executeQuery_ex(strSql,analysis);		
				analysis=null;
				return ls;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
		}*/
		

		
		//获得卡异动历史
		public List<Cardchangehistory> loadCardchangehistory(String strCardNo)
		{
			try
			{
				String strSql=" select changetype,changebillid,beforestate,afterstate,chagedate,targetcardno from  cardchangehistory where changecardno='"+strCardNo+"'  order by changeseqno desc  ";
				AnlyResultSet<List<Cardchangehistory>> analysis = new AnlyResultSet<List<Cardchangehistory>>()
				{
					public List<Cardchangehistory> anlyResultSet(ResultSet rs)
					{
						List<Cardchangehistory> returnValue = new ArrayList();
						Cardchangehistory record=null;
						try
						{
							while(rs != null && rs.next()==true)
							{
								record=new Cardchangehistory();
								record.setChangetype(CommonTool.FormatInteger(rs.getInt("changetype")));
								record.setChangebillid(CommonTool.FormatString(rs.getString("changebillid")));
								record.setBeforestate(CommonTool.FormatInteger(rs.getInt("beforestate")));
								record.setAfterstate(CommonTool.FormatInteger(rs.getInt("afterstate")));
								record.setChagedate(CommonTool.getDateMask(rs.getString("chagedate")));
								record.setTargetcardno(CommonTool.FormatString(rs.getString("targetcardno")));
								returnValue.add(record);
							}				
						}
						catch(Exception e)
						{
							e.printStackTrace();
							returnValue =  null;
						}
						return returnValue;
					}
				};
				List<Cardchangehistory> ls= (List<Cardchangehistory>)this.amn_Dao.executeQuery_ex(strSql,analysis);		
				analysis=null;
				return ls;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
		}
		/**
		 * 获得账户列表
		 */
		/*public List<Cardaccountchangehistory> loadCardaccountchangehistory(String strCardNo)
		{
			try
			{
				String strSql=" select changecompid,compname,changeaccounttype,changeseqno,changetype,parentcodevalue,changeamt,changebilltype,changebillno,chagedate,changebeforeamt " +
						"from cardaccountchangehistory,companyinfo,commoninfo " +
						" where changecardno='"+strCardNo+"' and compno=changecompid " +
					" and infotype='ZHYD'  and parentcodekey=changetype and changeaccounttype<>4  order by changeaccounttype,changeseqno desc  ";
				System.out.println(strSql);
				AnlyResultSet<List<Cardaccountchangehistory>> analysis = new AnlyResultSet<List<Cardaccountchangehistory>>()
				{
					public List<Cardaccountchangehistory> anlyResultSet(ResultSet rs)
					{
						List<Cardaccountchangehistory> returnValue = new ArrayList();
						Cardaccountchangehistory record=null;
						try
						{
							while(rs != null && rs.next()==true)
							{
								record=new Cardaccountchangehistory();
								record.setChangecompname(CommonTool.FormatString(rs.getString("compname")));
								record.setChangecompid(CommonTool.FormatString(rs.getString("changecompid")));
								record.setChangeaccounttype(CommonTool.FormatInteger(rs.getInt("changeaccounttype")));
								record.setChangeseqno(CommonTool.FormatInteger(rs.getInt("changeseqno")));
								record.setChangetype(CommonTool.FormatInteger(rs.getInt("changetype")));
								record.setChangetypeName(CommonTool.FormatString(rs.getString("parentcodevalue"))); 
								record.setChangebilltype(CommonTool.FormatString(rs.getString("changebilltype")));
								record.setChangebillno(CommonTool.FormatString(rs.getString("changebillno")));
								record.setChagedate(CommonTool.getDateMask(rs.getString("chagedate")));
								record.setChangeamt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("changeamt"))));
								record.setChangebeforeamt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("changebeforeamt"))));
								if(rs.getInt("changetype") == 0 || rs.getInt("changetype") == 6
										|| rs.getInt("changetype") == 7 || rs.getInt("changetype") == 8 
										|| rs.getInt("changetype") == 9 || rs.getInt("changetype") == 10 || rs.getInt("changetype") == 11  )
								{
									record.setLastamt(CommonTool.FormatBigDecimal(new BigDecimal(CommonTool.FormatDouble(rs.getDouble("changebeforeamt"))+ CommonTool.FormatDouble(rs.getDouble("changeamt")))));
								}
								else
								{
									record.setLastamt(CommonTool.FormatBigDecimal(new BigDecimal(CommonTool.FormatDouble(rs.getDouble("changebeforeamt"))- CommonTool.FormatDouble(rs.getDouble("changeamt")))));
								}
								returnValue.add(record);
							}				
						}
						catch(Exception e)
						{
							e.printStackTrace();
							returnValue =  null;
						}
						return returnValue;
					}
				};
				List<Cardaccountchangehistory> ls= (List<Cardaccountchangehistory>)this.amn_Dao.executeQuery_ex(strSql,analysis);		
				analysis=null;
				return ls;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
		}*/
		/**
		 * 获得交易历史列表
		 * @param strCardNo
		 * @return
		 */
		public List<Cardtransactionhistory> loadTransHistoryByCardNo(String strCardNo)
		{
			try
			{
				String strSql=" select top 3 transactioncardno,transactiondate,transactiontype,codeno,codename,ccount,price,firstempid,secondempid,thirthempid,a.paymode" +
						" from  cardtransactionhistory a " +
						" where transactioncardno='"+strCardNo+"' and isnull(a.paymode,'')<>'9' order by transactionseqno desc ";
				AnlyResultSet<List<Cardtransactionhistory>> analysis = new AnlyResultSet<List<Cardtransactionhistory>>()
				{
					public List<Cardtransactionhistory> anlyResultSet(ResultSet rs)
					{
						List<Cardtransactionhistory> returnValue = new ArrayList();
						Cardtransactionhistory record=null;
						try
						{
							while(rs != null && rs.next()==true)
							{
								record=new Cardtransactionhistory();
								record.setTransactioncardno(CommonTool.FormatString(rs.getString("transactioncardno")));
								record.setTransactiondate(CommonTool.getDateMask(rs.getString("transactiondate")));
								record.setTransactiontype(CommonTool.FormatString(rs.getString("transactiontype")));
								if(CommonTool.FormatString(rs.getString("transactiontype")).equals("1"))
								{
									record.setTransactiontypeText("卡销售");
								}
								else if(CommonTool.FormatString(rs.getString("transactiontype")).equals("3"))
								{
									record.setTransactiontypeText("项目消耗");
								}
								else if(CommonTool.FormatString(rs.getString("transactiontype")).equals("4"))
								{
									record.setTransactiontypeText("产品销售");
								}
								else if(CommonTool.FormatString(rs.getString("transactiontype")).equals("5"))
								{
									record.setTransactiontypeText("卡充值");
								}
								else if(CommonTool.FormatString(rs.getString("transactiontype")).equals("6"))
								{
									record.setTransactiontypeText("疗程销售");
								}
								record.setCodeno(CommonTool.FormatString(rs.getString("codeno")));
								record.setCodename(CommonTool.FormatString(rs.getString("codename")));
								record.setFirstempid(CommonTool.FormatString(rs.getString("firstempid")));
								record.setSecondempid(CommonTool.FormatString(rs.getString("secondempid")));
								record.setThirthempid(CommonTool.FormatString(rs.getString("thirthempid")));
								record.setPaymode(CommonTool.FormatString(rs.getString("paymode")));
								record.setCcount(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("ccount"))));
								record.setPrice(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("price"))));
								returnValue.add(record);
							}				
						}
						catch(Exception e)
						{
							e.printStackTrace();
							returnValue =  null;
						}
						return returnValue;
					}
				};
				List<Cardtransactionhistory> ls= (List<Cardtransactionhistory>)this.amn_Dao.executeQuery_ex(strSql,analysis);		
				analysis=null;
				return ls;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
		}
		
		 //--------------------------根据会员卡号获得会员疗程信息
		public List<Cardproaccount> loadProInfosByCardNo(String strCompId,String strCardNo)
		{
			try
			{
				 String strModeId=this.loadSysParam(strCompId,"SP059");
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
			     String strSql=" select cardvesting,cardno,projectno,proseqno,prjname,propricetype,saledate,cutoffdate,salecount,costcount,lastcount,saleamt,costamt,lastamt,proremark " +
			     		" from cardproaccount,projectinfo " +
			     		" where cardno='"+strCardNo+"'  and isnull(lastcount,0)>0 and  projectno=prjno and  prjmodeId  in ('"+strModeId+"','"+strFristModeId+"','"+strSecondModeId+"','"+strThirthModeId+"') ";
			     AnlyResultSet<List<Cardproaccount>> analysis = new AnlyResultSet<List<Cardproaccount>>()
					{
						public List<Cardproaccount> anlyResultSet(ResultSet rs)
						{
							List<Cardproaccount> returnValue=new ArrayList() ;
							Cardproaccount record=null;
							try
							{
								while(rs != null && rs.next()==true)
								{
									record= new Cardproaccount();
									record.setId(new CardproaccountId(rs.getString("cardvesting"),rs.getString("cardno"),rs.getString("projectno"),rs.getDouble("proseqno")));
									record.setBprojectno(CommonTool.FormatString(rs.getString("projectno")));
									record.setBproseqno(CommonTool.FormatDouble(rs.getDouble("proseqno")));
									record.setBprojectname(CommonTool.FormatString(rs.getString("prjname")));
									record.setPropricetype(CommonTool.FormatInteger(rs.getInt("propricetype")));
									record.setSalecount(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("salecount"))));
									record.setCostcount(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("costcount"))));
									record.setLastcount(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("lastcount"))));
									record.setSaleamt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("saleamt"))));
									record.setCostamt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("costamt"))));
									record.setLastamt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("lastamt"))));
									record.setSaledate(CommonTool.getDateMask(rs.getString("saledate")));
									record.setCutoffdate(CommonTool.getDateMask(rs.getString("cutoffdate")));
									record.setProremark(CommonTool.FormatString(rs.getString("proremark")));
									returnValue.add(record);
								}				
							}
							catch(Exception e)
							{
								e.printStackTrace();
								returnValue =  null;
							}
							return returnValue;
						}
					};
					List<Cardproaccount> ls=(List<Cardproaccount>)this.amn_Dao.executeQuery_ex(strSql,analysis);
					analysis=null;
					return ls;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
		}
		
		
		
		
		/**
		 * 获得交易历史列表
		 * @param strCardNo
		 * @return
		 */
		public Cardtransactionhistory loadTransHistoryByCardNo(String strCardNo,String strBillType,String strBillId,String strAccountType)
		{
			try
			{
				String strSql=" select transactioncardno,transactiondate,transactiontype,codeno,codename,ccount,price,firstempid,secondempid,thirthempid,a.paymode from  cardtransactionhistory a, sysaccountforpaymode b" +
						" where transactioncardno='"+strCardNo+"' and billtype='"+strBillType+"' and billno='"+strBillId+"' " +
						"  and a.paymode=b.paymode and b.accounttype='"+strAccountType+"' ";
				AnlyResultSet<List<Cardtransactionhistory>> analysis = new AnlyResultSet<List<Cardtransactionhistory>>()
				{
					public List<Cardtransactionhistory> anlyResultSet(ResultSet rs)
					{
						List<Cardtransactionhistory> returnValue = new ArrayList();
						Cardtransactionhistory record=null;
						try
						{
							while(rs != null && rs.next()==true)
							{
								record=new Cardtransactionhistory();
								record.setTransactioncardno(CommonTool.FormatString(rs.getString("transactioncardno")));
								record.setTransactiondate(CommonTool.getDateMask(rs.getString("transactiondate")));
								record.setTransactiontype(CommonTool.FormatString(rs.getString("transactiontype")));
								if(CommonTool.FormatString(rs.getString("transactiontype")).equals("1"))
								{
									record.setTransactiontypeText("卡销售");
								}
								else if(CommonTool.FormatString(rs.getString("transactiontype")).equals("3"))
								{
									record.setTransactiontypeText("项目消耗");
								}
								else if(CommonTool.FormatString(rs.getString("transactiontype")).equals("4"))
								{
									record.setTransactiontypeText("产品销售");
								}
								else if(CommonTool.FormatString(rs.getString("transactiontype")).equals("5"))
								{
									record.setTransactiontypeText("卡充值");
								}
								else if(CommonTool.FormatString(rs.getString("transactiontype")).equals("6"))
								{
									record.setTransactiontypeText("疗程销售");
								}
								record.setCodeno(CommonTool.FormatString(rs.getString("codeno")));
								record.setCodename(CommonTool.FormatString(rs.getString("codename")));
								record.setFirstempid(CommonTool.FormatString(rs.getString("firstempid")));
								record.setSecondempid(CommonTool.FormatString(rs.getString("secondempid")));
								record.setThirthempid(CommonTool.FormatString(rs.getString("thirthempid")));
								record.setPaymode(CommonTool.FormatString(rs.getString("paymode")));
								record.setCcount(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("ccount"))));
								record.setPrice(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("price"))));
								returnValue.add(record);
							}				
						}
						catch(Exception e)
						{
							e.printStackTrace();
							returnValue =  null;
						}
						return returnValue;
					}
				};
				Cardtransactionhistory   ls= (Cardtransactionhistory)this.amn_Dao.executeQuery_ex(strSql,analysis);		
				analysis=null;
				return ls;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
		}
		
	 	//获得门店连锁级别
		public int loadCompLvl(String  strCompId)
		{
			String strSql=" select complevel from compchainstruct where curcompno='"+strCompId+"' ";
			AnlyResultSet<Integer> analysis = new AnlyResultSet<Integer>() 
			{
				public Integer anlyResultSet(ResultSet rs) 
				{
					int bReturnValue = 0;
					try 
					{
						if( rs != null && rs.next())
						{
							bReturnValue =  CommonTool.FormatInteger(rs.getInt("complevel"));
						}
					} catch (Exception e) {
						e.printStackTrace();
						bReturnValue = 0;
					}
					return bReturnValue;
				}
			};
			return (Integer) this.amn_Dao.executeQuery_ex(strSql, analysis);
		}
		
		//是否是屏蔽卡
		public boolean bandcardinfo(String strCardNo)
		{
			try
			{
				String strSql=" select count(1) from oldcardinfo where cardno='"+strCardNo+"' ";
				int ccount=this.amn_Dao.getRowsCount_Ex(strSql);
				if(ccount>0)
				{
					strSql=" insert cardinfo(cardvesting,cardno,cardtype,membernotocard,salecarddate,cutoffdate,cardstate,salebillno,costpassword,searchpassword,cardremark,cardsource,costcountbydebts,costamtbydebts,costamt)" +
							" select cardvesting,cardno,cardtype,membernotocard,salecarddate,cutoffdate,cardstate,salebillno,costpassword,searchpassword,cardremark,cardsource,costcountbydebts,costamtbydebts,costamt " +
							" from oldcardinfo where cardno='"+strCardNo+"' ";
					strSql=strSql+" delete oldcardinfo where cardno='"+strCardNo+"' ";
					return this.amn_Dao.executeSql(strSql);
				}
				return true;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return false;
			}
		}
		
	   //获得父类模板
	   public String loadparentModeId(String strCurModeId)
		{
			String strSql="  select parentmodeid from syscommoninfomode where  isnull(modeid,'')='"+strCurModeId+"' ";
			try
			{
				AnlyResultSet<String> analysis = new AnlyResultSet<String>() {
					public String anlyResultSet(ResultSet rs) {
						String returnValue = "";
						try {
							if (rs != null && rs.next() == true) {
								returnValue=CommonTool.FormatString(rs.getString("parentmodeid"));
							}
						} catch (Exception e) {
							e.printStackTrace();
							returnValue ="";
						}
						return returnValue;
					}
				};
				String parentmodeid= (String) this.amn_Dao.executeQuery_ex(strSql, analysis);
				analysis=null;
				return parentmodeid;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
		}
	 
	   
	   	//获得疗程信息
		public List<Cardproaccount> loadAllProInfosByCardNo(String strCompId,String strCardNo)
		{
			try
			{
				 String strModeId=this.loadSysParam(strCompId,"SP059");
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
			     String strSql=" select cardvesting,cardno,projectno,proseqno,prjname,propricetype,saledate,cutoffdate,salecount,costcount,lastcount,saleamt,costamt,lastamt,proremark " +
			     		" from cardproaccount,projectinfo " +
			     		" where cardno='"+strCardNo+"' " +
			     		" and  projectno=prjno and  prjmodeId  in ('"+strModeId+"','"+strFristModeId+"','"+strSecondModeId+"','"+strThirthModeId+"')" +
			     		" order by projectno,isnull(lastcount,0) desc ";
			     AnlyResultSet<List<Cardproaccount>> analysis = new AnlyResultSet<List<Cardproaccount>>()
					{
						public List<Cardproaccount> anlyResultSet(ResultSet rs)
						{
							List<Cardproaccount> returnValue=new ArrayList() ;
							Cardproaccount record=null;
							try
							{
								while(rs != null && rs.next()==true)
								{
									record= new Cardproaccount();
									record.setId(new CardproaccountId(rs.getString("cardvesting"),rs.getString("cardno"),rs.getString("projectno"),rs.getDouble("proseqno")));
									record.setBcardvesting(CommonTool.FormatString(rs.getString("cardvesting")));
									record.setBprojectno(CommonTool.FormatString(rs.getString("projectno")));
									record.setBproseqno(CommonTool.FormatDouble(rs.getDouble("proseqno")));
									record.setBprojectname(CommonTool.FormatString(rs.getString("prjname")));
									record.setPropricetype(CommonTool.FormatInteger(rs.getInt("propricetype")));
									record.setSalecount(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("salecount"))));
									record.setCostcount(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("costcount"))));
									record.setLastcount(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("lastcount"))));
									record.setSaleamt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("saleamt"))));
									record.setCostamt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("costamt"))));
									record.setLastamt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("lastamt"))));
									record.setSaledate(CommonTool.getDateMask(rs.getString("saledate")));
									record.setCutoffdate(CommonTool.getDateMask(rs.getString("cutoffdate")));
									record.setProremark(CommonTool.FormatString(rs.getString("proremark")));
									returnValue.add(record);
								}				
							}
							catch(Exception e)
							{
								e.printStackTrace();
								returnValue =  null;
							}
							return returnValue;
						}
					};
					List<Cardproaccount> ls=(List<Cardproaccount>)this.amn_Dao.executeQuery_ex(strSql,analysis);
					analysis=null;
					return ls;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return null;
			}
		}
		/**
		 * 获取卡信息
		 * @param strCompId
		 * @param strCardNo
		 * @return
		 */
		  public Cardinfo loadCardinfobyCardNo(String strCompId, String strCardNo)
		    {
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
		    	String strSql="select a.cardvesting,a.cardno,a.cardstate,a.salecarddate,a.cutoffdate,a.cardsource,membersex,a.cardtype,cardtypename,membername,membermphone,memberpaperworkno,lowopenamt,lowfillamt,openflag,fillflag,slaeproerate,changerule, " +
		    			" accountbalance2=sum(case when isnull(accounttype,0)=2 then accountbalance else 0 end ),accountdebts2=sum(case when isnull(accounttype,0)=2 then accountdebts else 0 end ), " +
		    			" accountbalance3=sum(case when isnull(accounttype,0)=3 then accountbalance else 0 end ),accountdebts3=sum(case when isnull(accounttype,0)=3 then accountdebts else 0 end ), " +
		    			" accountbalance4=sum(case when isnull(accounttype,0)=4 then accountbalance else 0 end ),accountdebts4=sum(case when isnull(accounttype,0)=4 then accountdebts else 0 end ), " +
		    			" accountbalance5=sum(case when isnull(accounttype,0)=5 then accountbalance else 0 end ),accountdebts5=sum(case when isnull(accounttype,0)=5 then accountdebts else 0 end ) " +
		    			" from cardaccount c with(nolock),cardtypeinfo d with(nolock), cardinfo a with(nolock) left join memberinfo b with(nolock) on  a.cardno=b.memberno  " +
		    			" where a.cardno=c.cardno and a.cardno='"+strCardNo+"' " +
		    			" and a.cardtype=d.cardtypeno and  cardtypemodeid  in ('"+strModeId+"','"+strFristModeId+"','"+strSecondModeId+"','"+strThirthModeId+"') " +
		    			" group by   a.cardvesting,a.cardno,a.cardstate,a.salecarddate,a.cutoffdate,a.cardsource,membersex,a.cardtype,cardtypename,membername,membermphone,memberpaperworkno,lowopenamt,lowfillamt,openflag,fillflag,slaeproerate,changerule ";
		    	System.out.println(strSql);
		    	AnlyResultSet<Cardinfo> analysis = new AnlyResultSet<Cardinfo>()
				{
					public Cardinfo anlyResultSet(ResultSet rs)
					{
						Cardinfo returnValue=null ;
						try
						{
							if(rs != null && rs.next()==true)
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
								returnValue.setAccount2debtAmt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("accountdebts2"))));
								returnValue.setAccount3debtAmt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("accountdebts3"))));
								returnValue.setAccount4debtAmt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("accountdebts4"))));
								returnValue.setAccount5debtAmt(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("accountdebts5"))));
								returnValue.setSlaeproerate(CommonTool.FormatBigDecimal(new BigDecimal(rs.getDouble("slaeproerate"))));
								returnValue.setDSaleLowAmt(CommonTool.FormatBigDecimal(new BigDecimal(CommonTool.FormatDouble(rs.getDouble("lowopenamt")))));
								returnValue.setDFillLowAmt(CommonTool.FormatBigDecimal(new BigDecimal(CommonTool.FormatDouble(rs.getDouble("lowfillamt")))));
								returnValue.setOpenflag(CommonTool.FormatInteger(rs.getInt("openflag")));
								returnValue.setFillflag(CommonTool.FormatInteger(rs.getInt("fillflag")));
								returnValue.setChangerule(CommonTool.FormatInteger(rs.getInt("changerule")));
							}				
						}
						catch(Exception e)
						{
							e.printStackTrace();
							returnValue =  null;
						}
						return returnValue;
					}
				};
				Cardinfo record= (Cardinfo)this.amn_Dao.executeQuery_ex(strSql,analysis);
				analysis=null;
				return record;
		    }	
		  
		  //判断卡类型
		  public boolean validataCardType(){
			try {
				String strSql ="select 1 from cardinfo where cardtype ='MF' or cardtype='MR'";
				return this.amn_Dao.executeSql(strSql);
				
			} catch (Exception e) {
				e.printStackTrace(); 
				return false; 
			}
			
			  
		  }
		  
		  
		  
		
		  //收索卡基本信息
			public List<Cardinfo> searchCardinfo(String searchMemberCompIdKey,String searchMemberNoKey, String searchMemberNameKey,String searchMemberPhoneKey,String searchMemberPCIDKey)
			{	
				try
				{
					String strSql="select a.cardvesting,a.cardno,a.cardtype, b.membername,b.membermphone " +
							" from  cardinfo a left join memberinfo b on  a.cardno=b.cardnotomemberno" +
							" where   " +
							"   (cardno='"+searchMemberNoKey+"' or '"+searchMemberNoKey+"' ='' ) "+
							" and  (membername like '%"+searchMemberNameKey+"%' or '"+searchMemberNameKey+"' ='' ) "+
							" and  (membermphone='"+searchMemberPhoneKey+"' or '"+searchMemberPhoneKey+"' ='' ) "+
							" and  (memberpaperworkno='"+searchMemberPCIDKey+"' or '"+searchMemberPCIDKey+"' ='' ) ";
					AnlyResultSet<List<Cardinfo>> analysis = new AnlyResultSet<List<Cardinfo>>()
					{
						public List<Cardinfo> anlyResultSet(ResultSet rs)
						{
							List<Cardinfo> returnValue = new ArrayList();
							Cardinfo record=null;
							try
							{
								while(rs != null && rs.next()==true)
								{
									record=new Cardinfo();
									record.setBcardvesting(CommonTool.FormatString(rs.getString("cardvesting")));
									record.setBcardno(CommonTool.FormatString(rs.getString("cardno")));
									record.setCardtype(CommonTool.FormatString(rs.getString("cardtype")));
									record.setMembername(CommonTool.FormatString(rs.getString("membername")));
									record.setMemberphone(CommonTool.FormatString(rs.getString("membermphone")));
									returnValue.add(record);
								}				
							}
							catch(Exception e)
							{
								e.printStackTrace();
								returnValue =  null;
							}
							return returnValue;
						}
					};
					List<Cardinfo> ls= (List<Cardinfo>)this.amn_Dao.executeQuery_ex(strSql,analysis);	
					analysis=null;
					return ls;
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
					return null;
				}
				
			}	  
			//写入预约信息到主数据库
			public boolean Addyuyueinfo(String userid,String orderconply,String orderphone,String orderuser,String orderusertrh,
					String orderproject,String ordertime,String ordertimes,String complydetail){
			
			String mfEmp="";
			String mremp="";
			String trhemo="";
			if(CommonTool.FormatString(orderproject).equals("300"))
			{
				mfEmp=orderuser;
			}
			else if(CommonTool.FormatString(orderproject).equals("400"))
			{
				mremp=orderuser;
			}
			else if(CommonTool.FormatString(orderproject).equals("600"))
			{
				trhemo=orderuser;
			}
				String strSql="insert orders(calluserid,callbillid,orderphone,orderconply,orderusermf,orderusermr,orderusertrh,orderproject," +
				"ordertime,ordertimes,orderdetail,complydetail,orderstate) values("
			+CommonTool.quotedStr("微信")
			+","
				+CommonTool.quotedStr("")
			+","
			+CommonTool.quotedStr(orderphone)
			+","
			+CommonTool.quotedStr(orderconply)
			+","
			+CommonTool.quotedStr(mfEmp)
			+","
			+CommonTool.quotedStr(mremp)
			+","
			+CommonTool.quotedStr(trhemo)
			+","
			+CommonTool.quotedStr(orderproject)
			+","
			+CommonTool.quotedStr(ordertime)
			+","
			+CommonTool.quotedStr(ordertimes)
			+","
			+CommonTool.quotedStr("微信确认预约")
			+","
			+CommonTool.quotedStr(complydetail)
			+","
			+CommonTool.FormatInteger(0) +")";
			strSql= strSql+"insert callwaiting (callbillid,calluserid,callon,calledon,agentnum,offertime,calltype,callstate) values("
		    	+CommonTool.quotedStr("")
				+","
				+CommonTool.quotedStr(userid)
				+","
		    	+CommonTool.quotedStr(orderphone)
				+","
				+CommonTool.quotedStr("")
				+","
				+CommonTool.quotedStr("")
				+","
				+CommonTool.quotedStr("")
				+","
				+CommonTool.getCurrDate()
				+","
				+CommonTool.FormatInteger(5) +")";
		    try {
		    
		    	this.amn_Dao.executeQuery(strSql);
		    		System.out.println(strSql);
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			return true;
			}
			
		/**
		 * 查找公司的坐标
		 * @return
		 */
	
//		public List<Companyinfo> loadCompCoord()// 查找公司的坐标，
//			{	
//				try {
//					String strSql = "select compname,xcoordinate,ycoordinate from companyinfo where compstate= 1 ";
//					AnlyResultSet<Companyinfo> analysis = new AnlyResultSet<Companyinfo>(){
//						@Override
//						public Companyinfo anlyResultSet(ResultSet rs) {
//							Companyinfo returnValue = new Companyinfo();
//								try {
//									if(rs != null && rs.next()==true)
//									{
//										returnValue.setCompname(CommonTool.FormatString(rs.getString("compname")));
//										returnValue.setXcoordinate(CommonTool.FormatString(rs.getString("xcoordinate")));
//										returnValue.setYcoordinate(CommonTool.FormatString(rs.getString("ycoordinate")));
//									}
//								} catch (Exception e) {
//									e.printStackTrace();
//									returnValue= null;
//								}
//								return returnValue;
//							}
//						};	
//						Companyinfo bean=(Companyinfo) this.amn_Dao.executeQuery_ex(strSql, analysis);
//						analysis=null;
//						return null;
//					} catch (Exception ex) {
//						ex.printStackTrace();
//						return null; 
//					}
//				} 	
	

		public List<Companyinfo> loadCompCoord()// 查找公司的坐标，
		{
			String strSql = "select compname,xcoordinate,ycoordinate from companyinfo where compstate= 1 ";
			AnlyResultSet<List<Companyinfo>> analysis = new AnlyResultSet<List<Companyinfo>>()
			{
				List<Companyinfo> lsCompanyinfo = new ArrayList();
				public List<Companyinfo> anlyResultSet(ResultSet rs)
				{
					Companyinfo record=null ;
					try
					{
						while(rs != null && rs.next()==true)
						{
							record=new Companyinfo();
							record.setCompname(CommonTool.FormatString(rs.getString("compname")));
							//record.setXcoordinate(CommonTool.FormatString(rs.getString("xcoordinate")));
							//record.setYcoordinate(CommonTool.FormatString(rs.getString("ycoordinate")));
							lsCompanyinfo.add(record);
						}				
					}
					catch(Exception e)
					{
						e.printStackTrace();
						lsCompanyinfo =  null;
					}
					return lsCompanyinfo;
				}
			};
			List<Companyinfo> lsRecord= (List<Companyinfo>)this.amn_Dao.executeQuery_ex(strSql,analysis);
			analysis=null;
			return lsRecord;
		}
		
		//获取会员信息
		 public String loadCardinfoToSpad( String strCardNo,String strMemberPhone)
		 {
			 	if(strCardNo.equals("") && strMemberPhone.equals(""))
		    	{
		    		return "";
		    	}
			 	String strCompId="001";
		    	 boolean flag=this.bandcardinfo(strCardNo);
		    	 if(flag==false)
		    		 return null;
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
		    	String strSql="";
		    	
		    	if(strCardNo.equals(""))
		    	{
		    		strSql="select a.cardvesting,a.cardno,a.cardstate,a.salecarddate,a.cutoffdate,a.cardsource,membersex,a.cardtype,cardtypename,membername,membermphone,memberpaperworkno,lowopenamt,lowfillamt,openflag,fillflag,changeflag,slaeproerate,changerule, " +
		    			" accountbalance2=sum(case when isnull(accounttype,0)=2 then accountbalance else 0 end ),accountdebts2=sum(case when isnull(accounttype,0)=2 then accountdebts else 0 end ), " +
		    			" accountbalance3=sum(case when isnull(accounttype,0)=3 then accountbalance else 0 end ),accountdebts3=sum(case when isnull(accounttype,0)=3 then accountdebts else 0 end ), " +
		    			" accountbalance4=sum(case when isnull(accounttype,0)=4 then accountbalance else 0 end ),accountdebts4=sum(case when isnull(accounttype,0)=4 then accountdebts else 0 end ), " +
		    			" accountbalance5=sum(case when isnull(accounttype,0)=5 then accountbalance else 0 end ),accountdebts5=sum(case when isnull(accounttype,0)=5 then accountdebts else 0 end ) " +
		    			" from cardaccount c with(nolock),cardtypeinfo d with(nolock), cardinfo a with(nolock) left join memberinfo b with(nolock) on  a.cardno=b.memberno  " +
		    			" where a.cardno=c.cardno and  isnull(membermphone,'')='"+strMemberPhone+"'  " +
		    			" and a.cardtype=d.cardtypeno and  cardtypemodeid  in ('"+strModeId+"','"+strFristModeId+"','"+strSecondModeId+"','"+strThirthModeId+"') " +
		    			" group by   a.cardvesting,a.cardno,a.cardstate,a.salecarddate,a.cutoffdate,a.cardsource,membersex,a.cardtype,cardtypename,membername,membermphone,memberpaperworkno,lowopenamt,lowfillamt,openflag,fillflag,changeflag,slaeproerate,changerule ";
		    	
		    	}
		    	else
		    	{
		    		strSql="select a.cardvesting,a.cardno,a.cardstate,a.salecarddate,a.cutoffdate,a.cardsource,membersex,a.cardtype,cardtypename,membername,membermphone,memberpaperworkno,lowopenamt,lowfillamt,openflag,fillflag,changeflag,slaeproerate,changerule, " +
	    				" accountbalance2=sum(case when isnull(accounttype,0)=2 then accountbalance else 0 end ),accountdebts2=sum(case when isnull(accounttype,0)=2 then accountdebts else 0 end ), " +
	    				" accountbalance3=sum(case when isnull(accounttype,0)=3 then accountbalance else 0 end ),accountdebts3=sum(case when isnull(accounttype,0)=3 then accountdebts else 0 end ), " +
	    				" accountbalance4=sum(case when isnull(accounttype,0)=4 then accountbalance else 0 end ),accountdebts4=sum(case when isnull(accounttype,0)=4 then accountdebts else 0 end ), " +
	    				" accountbalance5=sum(case when isnull(accounttype,0)=5 then accountbalance else 0 end ),accountdebts5=sum(case when isnull(accounttype,0)=5 then accountdebts else 0 end ) " +
	    				" from cardaccount c with(nolock),cardtypeinfo d with(nolock), cardinfo a with(nolock) left join memberinfo b with(nolock) on  a.cardno=b.memberno  " +
	    				" where a.cardno=c.cardno and  a.cardno='"+strCardNo+"'   " +
	    				" and a.cardtype=d.cardtypeno and  cardtypemodeid  in ('"+strModeId+"','"+strFristModeId+"','"+strSecondModeId+"','"+strThirthModeId+"') " +
	    				" group by   a.cardvesting,a.cardno,a.cardstate,a.salecarddate,a.cutoffdate,a.cardsource,membersex,a.cardtype,cardtypename,membername,membermphone,memberpaperworkno,lowopenamt,lowfillamt,openflag,fillflag,changeflag,slaeproerate,changerule ";
	    	
		    	}
		    	AnlyResultSet<HzSpadCardInfoBean> analysis = new AnlyResultSet<HzSpadCardInfoBean>()
				{
					public HzSpadCardInfoBean anlyResultSet(ResultSet rs)
					{
						HzSpadCardInfoBean returnValue=null ;
						try
						{
							if(rs != null && rs.next()==true)
							{
								returnValue=new HzSpadCardInfoBean();
								returnValue.setCard_name(CommonTool.FormatString(rs.getString("cardtypename")));
								returnValue.setCardvesting(CommonTool.FormatString(rs.getString("cardvesting")));
								returnValue.setCardNo(rs.getString("cardno"));
								returnValue.setKye(CommonTool.GetGymAmt(rs.getDouble("accountbalance2"),2)+"");
								returnValue.setKjf(CommonTool.GetGymAmt(rs.getDouble("accountbalance3"),2)+"");
								returnValue.setErrorno(0);
								returnValue.setName(CommonTool.FormatString(rs.getString("membername")));
								int cardstate=CommonTool.FormatInteger(rs.getInt("cardstate"));
								if(cardstate==1)
									returnValue.setKst("0");
								else if(cardstate==4)
									returnValue.setKst("1");
								else if(cardstate==9)
									returnValue.setKst("2");
							}				
						}
						catch(Exception e)
						{
							e.printStackTrace();
							returnValue =  null;
						}
						return returnValue;
					}
				};
				HzSpadCardInfoBean record= (HzSpadCardInfoBean)this.amn_Dao.executeQuery_ex(strSql,analysis);
				analysis=null;
				if(record!=null && !CommonTool.FormatString(record.getCardNo()).equals(""))
				{
					List<Cardproaccount> lsPro=this.loadProInfosByCardNo(record.getCardvesting(),record.getCardNo());
					if(lsPro!=null && lsPro.size()>0)
					{
						List<HzSpadCardProInfo> lsSpadPro=new ArrayList();
						HzSpadCardProInfo srecord=null;
						for(int i=0;i<lsPro.size();i++)
						{
							
							srecord=new HzSpadCardProInfo();
							srecord.setAmount(CommonTool.FormatBigDecimal(lsPro.get(i).getLastcount()).doubleValue());
							srecord.setDeposit("0");
							srecord.setName(CommonTool.FormatString(lsPro.get(i).getBprojectname()));
							srecord.setCode(CommonTool.FormatDouble(lsPro.get(i).getBproseqno())+"_"+CommonTool.FormatString(lsPro.get(i).getBprojectno()));
							//srecord.setCode(CommonTool.FormatString(lsPro.get(i).getBprojectno()));
							srecord.setCsproseqno(lsPro.get(i).getBproseqno());
							lsSpadPro.add(srecord);
						}
						if(lsSpadPro!=null && lsSpadPro.size()>0)
						{
							record.setList(lsSpadPro);
						}
					}
					return JSONArray.fromObject(record).toString();
				}				
				return "";
		    }
		 
		 
		   public boolean handSpadBillInfo(String strMBillInfo,String strDBillInfo)
		   {
			   try
			   {
				   if(strMBillInfo.equals("") || strDBillInfo.equals(""))
					   return false;
				   List<SpadMconsumeInfo> lsMaster=(List<SpadMconsumeInfo> )this.loadDTOList(strMBillInfo, SpadMconsumeInfo.class);
				   if(lsMaster!=null && lsMaster.size()>0)
				   {
					   List<SpadDconsumeInfo> lsDetial=(List<SpadDconsumeInfo> )this.loadDTOList(strMBillInfo, SpadDconsumeInfo.class);
					   if(lsDetial!=null && lsDetial.size()>0)
					   {
						   String strSql="insert spadMconsumeInfo(ID,SMALL_NO,EMPLOYEE_NO,CUSTOM,STATUS,CDATE,SUMMARY,PSMALL_NO,SMERGE)" +
						   		" values("+lsMaster.get(0).getId()+",'"+lsMaster.get(0).getSmall_no()+"','"+lsMaster.get(0).getEmployee_no()+"','"+lsMaster.get(0).getCustom()+"',"+lsMaster.get(0).getStatus()+",'"+lsMaster.get(0).getCdate()+"','"+lsMaster.get(0).getSummary()+"','"+lsMaster.get(0).getPsmall_no()+"',"+lsMaster.get(0).getSmerge()+")";
						   for(int i=0;i<lsDetial.size();i++)
						   {
							   strSql=strSql+" insert spadDconsumeInfo(ID,SMALL_NO,SORTID,CODE,PRODUCT,AMOUNT,PRICE,COST,CDATE,ISDELETED,ISFORTREATMENT,EMPLOYEE_NO,EMPLOYEE_NO2,EMPLOYEE_NO3,ISNEW,ISNEW2,ISNEW3) " +
							   		" values("+lsDetial.get(i).getId()+",'"+lsDetial.get(i).getSmall_no()+"',"+lsDetial.get(i).getSortid()+",'"+lsDetial.get(i).getCode()+"','"+lsDetial.get(i).getProduct()+"',"+Double.parseDouble(lsDetial.get(i).getAmount())+","+Double.parseDouble(lsDetial.get(0).getPrice())+","+CommonTool.FormatDouble(lsDetial.get(i).getCost())+",'"+lsDetial.get(i).getCdate()+"',"+CommonTool.FormatInteger(lsDetial.get(i).getIsdeleted())+","+CommonTool.FormatInteger(lsDetial.get(i).getIsfortreatment())+",'"+lsDetial.get(i).getEmployee_no()+"','"+lsDetial.get(i).getEmployee_no2()+"','"+lsDetial.get(i).getEmployee_no3()+"',"+lsDetial.get(i).getIsnew()+","+lsDetial.get(i).getIsnew2()+","+lsDetial.get(i).getIsnew3()+") ";
						   }
						   System.out.println(strSql);
						   return this.amn_Dao.executeSql(strSql);
					   }
					   return false;
				   }
				   return false;
			   }
			   catch(Exception ex)
			   {
				   ex.printStackTrace();
				   return false;
			   }
		   }
		   
		   public boolean handSpadBillInfo(String strBillInfo)
		   {
			   if(strBillInfo.equals("") || strBillInfo.equals(""))
				   return false;
			   List<SpadBillInfo> lsBillInfo=(List<SpadBillInfo> )this.loadDTOList(strBillInfo, SpadBillInfo.class);
			   if(lsBillInfo!=null && lsBillInfo.size()>0)
			   {
				   //List<SpadMconsumeInfo> lsMaster=lsBillInfo.get(0).getSmallinfo();
				   List<MorphDynaBean> lsMapResultBean = (List<MorphDynaBean>)lsBillInfo.get(0).getSmallinfo();
				   String strSql="insert spadMconsumeInfo(brachcode,SMALL_NO,EMPLOYEE_NO,CUSTOM,STATUS,CDATE,SUMMARY,PSMALL_NO,SMERGE)" +
			   		" values('"+CommonTool.FormatString(lsBillInfo.get(0).getBrachcode())+"','"+lsMapResultBean.get(0).get("small_no")+"','"+lsMapResultBean.get(0).get("employee_no")+"','"+lsMapResultBean.get(0).get("custom")+"',"+lsMapResultBean.get(0).get("status")+",'"+lsMapResultBean.get(0).get("cdate")+"','"+lsMapResultBean.get(0).get("summary")+"','"+lsMapResultBean.get(0).get("psmall_no")+"',"+lsMapResultBean.get(0).get("smerge")+")";
				  
				   List<MorphDynaBean> lsDetial=(List<MorphDynaBean>)lsBillInfo.get(0).getSmallconsume();
				   if(lsDetial!=null && lsDetial.size()>0)
				   {
					   for(int i=0;i<lsDetial.size();i++)
					   {
//						   strSql=strSql+" insert spadDconsumeInfo(brachcode,SMALL_NO,SORTID,CODE,PRODUCT,AMOUNT,PRICE,COST,CDATE,ISDELETED,ISFORTREATMENT,EMPLOYEE_NO,EMPLOYEE_NO2,EMPLOYEE_NO3,ISNEW,ISNEW2,ISNEW3,CSPROSEQNO) " +
//						   		" values('"+CommonTool.FormatString(lsBillInfo.get(0).getBrachcode())+"','"+lsDetial.get(i).get("small_no")+"',"+lsDetial.get(i).get("sortid")+",'"+lsDetial.get(i).get("code")+"','"+lsDetial.get(i).get("product")+"',"+Double.parseDouble(lsDetial.get(i).get("amount").toString())+","+Double.parseDouble(lsDetial.get(i).get("price").toString())+","+Double.parseDouble(lsDetial.get(i).get("cost").toString())+",'"+lsDetial.get(i).get("cdate")+"',"+Integer.parseInt(lsDetial.get(i).get("isdeleted").toString())+","+Integer.parseInt(lsDetial.get(i).get("isfortreatment").toString())+",'"+lsDetial.get(i).get("employee_no")+"','"+lsDetial.get(i).get("employee_no2")+"','"+lsDetial.get(i).get("employee_no3")+"',"+lsDetial.get(i).get("isnew")+","+lsDetial.get(i).get("isnew2")+","+lsDetial.get(i).get("isnew3")+","+Double.parseDouble(lsDetial.get(i).get("csproseqno").toString())+") ";
						   strSql=strSql+" insert spadDconsumeInfo(brachcode,SMALL_NO,SORTID,CODE,PRODUCT,AMOUNT,PRICE,COST,CDATE,ISDELETED,ISFORTREATMENT,EMPLOYEE_NO,EMPLOYEE_NO2,EMPLOYEE_NO3,ISNEW,ISNEW2,ISNEW3) " +
					   		" values('"+CommonTool.FormatString(lsBillInfo.get(0).getBrachcode())+"','"+lsDetial.get(i).get("small_no")+"',"+lsDetial.get(i).get("sortid")+",'"+lsDetial.get(i).get("code")+"','"+lsDetial.get(i).get("product")+"',"+Double.parseDouble(lsDetial.get(i).get("amount").toString())+","+Double.parseDouble(lsDetial.get(i).get("price").toString())+","+Double.parseDouble(lsDetial.get(i).get("cost").toString())+",'"+lsDetial.get(i).get("cdate")+"',"+Integer.parseInt(lsDetial.get(i).get("isdeleted").toString())+","+Integer.parseInt(lsDetial.get(i).get("isfortreatment").toString())+",'"+lsDetial.get(i).get("employee_no")+"','"+lsDetial.get(i).get("employee_no2")+"','"+lsDetial.get(i).get("employee_no3")+"',"+lsDetial.get(i).get("isnew")+","+lsDetial.get(i).get("isnew2")+","+lsDetial.get(i).get("isnew3")+" ) ";
			  }
					   System.out.println(strSql);
					  return this.amn_Dao.executeSql(strSql);
				   }
				   return false;
			   }
			   return false;
		   }
		  //获取门店业务人员信息
		 	public List<Staffinfo> loadStaff(String strCompId)
			{
				String strSql=" select staffno from staffinfo where compno='"+strCompId+"' and isnull(businessflag,0)=1  ";
					AnlyResultSet<List<Staffinfo>> analysis = new AnlyResultSet<List<Staffinfo>>()
					{
						public List<Staffinfo>  anlyResultSet(ResultSet rs)
						{
							List<Staffinfo>  returnValue = new ArrayList() ;
							Staffinfo record=null;	
							try
							{
								while(rs != null && rs.next()==true)
								{
									record=new Staffinfo();
									record.setBstaffno(CommonTool.FormatString(rs.getString("staffno")));
								//  record.setStaffname(CommonTool.FormatString(rs.getString("staffname")));
									returnValue.add(record);
								}
							
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
							return returnValue;
						}
					};
					List<Staffinfo> ls= (List<Staffinfo> )this.amn_Dao.executeQuery_ex(strSql,analysis);
					analysis=null;
					return ls;
			}
		 	
		 	
		 	//JSONArray.fromObject(lsDataSet).toString()
			public  List loadDTOList(String jsonString ,Class obj){ 
				if(jsonString==null || jsonString.equals(""))
					return null;
				JSONArray array = JSONArray.fromObject(jsonString); 
				List list = new ArrayList(); 
				for(
						Iterator iter = array.iterator();
						iter.hasNext();){ 
						JSONObject jsonObject = (JSONObject)iter.next(); 
						if(jsonObject!=null)
						{
							jsonObject.remove("__id");
							jsonObject.remove("__previd");
							jsonObject.remove("__index");
							jsonObject.remove("__nextid");
							jsonObject.remove("__status");
						}
						list.add(JSONObject.toBean(jsonObject, obj)); 
				} 
			
				return list; 
				}
			
			public String loadStaffinfoByCompId(String strCompId)
			{
				String strSql=" select staffno=replace(staffno,compno,'') ,staffname,position from staffinfo where compno='"+strCompId+"' and isnull(businessflag,0)=1 and isnull(curstate,0)=2  ";
				AnlyResultSet<List<SpadStaffInfo>> analysis = new AnlyResultSet<List<SpadStaffInfo>>()
				{
					public List<SpadStaffInfo>  anlyResultSet(ResultSet rs)
					{
						List<SpadStaffInfo>  returnValue = new ArrayList() ;
						SpadStaffInfo record=null;	
						try
						{
							while(rs != null && rs.next()==true)
							{
								record=new SpadStaffInfo();
								record.setEmployee_no(CommonTool.FormatString(rs.getString("staffno")));
								record.setPassword(Integer.parseInt(CommonTool.FormatString(rs.getString("staffno"))));
								record.setUsername(CommonTool.FormatString(rs.getString("staffname")));
								record.setPositionid(CommonTool.FormatString(rs.getString("position")));
								returnValue.add(record);
							}
						
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
						return returnValue;
					}
				};
				List<SpadStaffInfo> ls= (List<SpadStaffInfo> )this.amn_Dao.executeQuery_ex(strSql,analysis);
				analysis=null;
				if(ls==null || ls.size()==0)
					return "";
				return JSONArray.fromObject(ls).toString();
			}
		 
			public String loadCommonInfoByCompId(String strTypeCode)
			{
				String strSql=" select parentcodekey ,parentcodevalue from commoninfo where infotype='"+strTypeCode+"'  ";
				AnlyResultSet<List<SpadClassInfo>> analysis = new AnlyResultSet<List<SpadClassInfo>>()
				{
					public List<SpadClassInfo>  anlyResultSet(ResultSet rs)
					{
						List<SpadClassInfo>  returnValue = new ArrayList() ;
						SpadClassInfo record=null;	
						try
						{
							while(rs != null && rs.next()==true)
							{
								record=new SpadClassInfo();
								record.setCode(Integer.parseInt(CommonTool.FormatString(rs.getString("parentcodekey"))));
								record.setCname(CommonTool.FormatString(rs.getString("parentcodevalue")));
								returnValue.add(record);
							}
						
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
						return returnValue;
					}
				};
				List<SpadClassInfo> ls= (List<SpadClassInfo> )this.amn_Dao.executeQuery_ex(strSql,analysis);
				analysis=null;
				if(ls==null || ls.size()==0)
					return "";
				return JSONArray.fromObject(ls).toString();
			}
			
		
			
			
			public List<Projectinfo> loadProjectinfoByCompId(String strCompId )
			{
				try
				{
					String strModeId=this.loadSysParam(strCompId,"SP059");
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
						strSecondModeId=loadparentModeId(strModeId);
						if(!strSecondModeId.equals(""))
							strFristModeId=loadparentModeId(strSecondModeId);
					}
					else if(compLvl==4)
					{
						strThirthModeId=loadparentModeId(strModeId);
						if(!strThirthModeId.equals(""))
							strSecondModeId=loadparentModeId(strThirthModeId);
						if(!strSecondModeId.equals(""))
							strFristModeId=loadparentModeId(strSecondModeId);
					}
					String strSql=" select a From Projectinfo a,Compchaininfo Compchaininfo where prjmodeId in ('"+strModeId+"','"+strFristModeId+"','"+strSecondModeId+"','"+strThirthModeId+"')  and curcomp=prisource and relationcomp='"+strCompId+"' and isnull(useflag,1)=1  ";
					
					List<Projectinfo> ls= (List<Projectinfo> )this.amn_Dao.findByHql(strSql);
					return ls;
					//if(ls==null || ls.size()==0)
						//return "";
					//return JSONArray.fromObject(ls).toString();
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
					return null;
				}
			}
			
			
			public String loadGoodsinfoByCompId(String strCompId )
			{
				try
				{
					String strModeId=this.loadSysParam(strCompId,"SP061");
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
						strSecondModeId=loadparentModeId(strModeId);
						if(!strSecondModeId.equals(""))
							strFristModeId=loadparentModeId(strSecondModeId);
					}
					else if(compLvl==4)
					{
						strThirthModeId=loadparentModeId(strModeId);
						if(!strThirthModeId.equals(""))
							strSecondModeId=loadparentModeId(strThirthModeId);
						if(!strSecondModeId.equals(""))
							strFristModeId=loadparentModeId(strSecondModeId);
					}
					String strSql=" select goodsno,goodsname,goodspricetype=case when isnull(goodspricetype,'')='' then '0' else goodspricetype end  ,storesalseprice From Goodsinfo goodsinfo,Compchaininfo compchaininfo where goodsmodeid in ('"+strModeId+"','"+strFristModeId+"','"+strSecondModeId+"','"+strThirthModeId+"')  and curcomp=goodssource and relationcomp='"+strCompId+"'  and isnull(useflag,0) =0  and isnull(goodsusetype,1) =1  ";
					AnlyResultSet<List<SpadGoodsInfo>> analysis = new AnlyResultSet<List<SpadGoodsInfo>>()
					{
						public List<SpadGoodsInfo>  anlyResultSet(ResultSet rs)
						{
							List<SpadGoodsInfo>  returnValue = new ArrayList() ;
							SpadGoodsInfo record=null;	
							try
							{
								while(rs != null && rs.next()==true)
								{
									record=new SpadGoodsInfo();
									record.setCode(CommonTool.FormatString(rs.getString("goodsno")));
									record.setPname(CommonTool.FormatString(rs.getString("goodsname")));
									record.setCategory(Integer.parseInt(CommonTool.FormatString(rs.getString("goodspricetype"))));
									record.setPrice(CommonTool.GetGymAmt(CommonTool.FormatDouble(rs.getDouble("storesalseprice")), 2));
									returnValue.add(record);
								}
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
							return returnValue;
						}
					};
					List<SpadGoodsInfo> ls= (List<SpadGoodsInfo> )this.amn_Dao.executeQuery_ex(strSql,analysis);
					analysis=null;
					if(ls==null || ls.size()==0)
						return "";
					return JSONArray.fromObject(ls).toString();
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
					return null;
				}
			}
			
			
			public String LoadCardVestingByCardNo(String strCardNo)
			{
				try
				{
					String strSql=" select cardvesting from cardinfo where cardno='"+strCardNo+"' ";
					AnlyResultSet<String> analysis = new AnlyResultSet<String>() 
					{
						public String anlyResultSet(ResultSet rs) 
						{
							String returnValue = "";
							try 
							{
								if( rs != null && rs.next())
								{
									returnValue =  CommonTool.FormatString(rs.getString("cardvesting"));
								}
							} catch (Exception e) {
								e.printStackTrace();
								returnValue = "";
							}
							return returnValue;
						}
					};
					return (String) this.amn_Dao.executeQuery_ex(strSql, analysis);
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
					return "001";
				}
			}
			
			
			public List loadFaceCompIp()
			{
				try
				{
					String strSql=" select compid,paramvalue from  sysparaminfo where paramid='SP073' and compid in (select compid from  sysparaminfo where paramid='SP096' and paramvalue='1') and compid<>'001'  ";
					AnlyResultSet<List> analysis = new AnlyResultSet<List>() {
						public List anlyResultSet(ResultSet rs) {
							List returnValue = new ArrayList();
							try {
								while (rs != null && rs.next() == true) {
									
									returnValue.add(CommonTool.FormatString(rs.getString("compid")));
									returnValue.add(CommonTool.FormatString(rs.getString("paramvalue")));
								}
							} catch (Exception e) {
								e.printStackTrace();
								returnValue =null;
							}
							return returnValue;
						}
					};
					List ls= (List) this.amn_Dao.executeQuery_ex(strSql, analysis);
					analysis=null;
					return ls;
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
					return null;
				}
			}
			
	public AMN_PADDaoImp getAmn_PADDao() {
		return amn_PADDao;
	}

	public void setAmn_PADDao(AMN_PADDaoImp amn_PADDao) {
		this.amn_PADDao = amn_PADDao;
	}

	public SysSendMsg getSysSendMsg() {
		return sysSendMsg;
	}

	public void setSysSendMsg(SysSendMsg sysSendMsg) {
		this.sysSendMsg = sysSendMsg;
	}		

}