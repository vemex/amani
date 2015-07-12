package com.amani.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.amani.bean.SpadDconsumeInfo;
import com.amani.bean.SpadMconsumeInfo;
import com.amani.model.Cardinfo;
import com.amani.model.CategoryinfoId;
import com.amani.model.Companyinfo;
import com.amani.model.Evaluation;
import com.amani.model.Goodsinfo;
import com.amani.model.Nointernalcardinfo;
import com.amani.model.Projectinfo;
import com.amani.model.Roominfo;
import com.amani.model.Vouchersdetal;
import com.amani.model.Wxbandcard;


@WebService
public interface ICommonService {
 
		@WebMethod(operationName="loadCompanyinfo")	//获取单个门店的所有信息
		@WebResult(name = "result")
		public Companyinfo loadCompanyinfo(String strCompId);
		
		
		@WebMethod(operationName="loadAllCompanyinfo")	//获取所有的门店信息所有信息
		@WebResult(name = "result")
		public List<Companyinfo> loadAllCompanyinfo();
		
		
		@WebMethod(operationName="loadProjectinfo")	//获取单个门店的项目信息
		@WebResult(name = "result")
		public List<Projectinfo> loadProjectinfo(String strCompId);
		
		
		@WebMethod(operationName="loadAllGoodinfo")	//获取所有门店的产品信息
		@WebResult(name = "result")
		public List<Goodsinfo> loadAllGoodinfo();
		
		
		@WebMethod(operationName="loadStaffinfo")	//获取单个门店的员工信息
		@WebResult(name = "result")
		public String loadStaffinfo(String strCompId,String itemNo);
		
		
		@WebMethod(operationName="loadCategory")	//获取单个门店的排班信息
		@WebResult(name = "result")
		public List<CategoryinfoId> loadCategory(String strCompId);
		
		@WebMethod(operationName="loadRoomInfo")	//获取单个门店的房间信息
		@WebResult(name = "result")
		public List<Roominfo> loadRoomInfo(String strCompId);
		
		@WebMethod(operationName="loadMirror")	//获取单个门店的镜台信息
		@WebResult(name = "result")
		public List<String> loadMirror(String strCompId);
		
		@WebMethod(operationName="loadCardInfos")	//获取会员信息
		@WebResult(name = "result")
		public List<Cardinfo> loadCardInfos(String strPhone,String strCardNo);
		
		@WebMethod(operationName="loadCardInfo")//获取单个会员卡信息
		@WebResult(name = "result")
		public Cardinfo loadCardInfo(String strCompId,String strCardNo);
		
		@WebMethod(operationName="saveIPADBillInfo")//保存开单信息
		@WebResult(name = "result")
		public boolean saveIPADBillInfo(SpadMconsumeInfo spadMconsumeInfo,List<SpadDconsumeInfo> spadDconsumeInfo);
		
		@WebMethod(operationName="loadVouchers")//保存开单信息
		@WebResult(name = "result")
		public String loadVouchers();
		
		@WebMethod(operationName="loadDqyNo")//保存开单信息
		@WebResult(name = "result")
		public String loadDqyNo(String strOpenId,String strClientName,String strMobile,String strVchNo,String strBillId);
		
		@WebMethod(operationName="loadCardAccount")//保存开单信息
		@WebResult(name = "result")
		public String loadCardAccount(String strCardNo);
		
		
		@WebMethod(operationName="loadCardproaccounts")//保存开单信息
		@WebResult(name = "result")
		public String loadCardproaccounts(String strCompId,String strCardNo);
		
		
		@WebMethod(operationName="loadcCardaccountchangehistories")//保存开单信息
		@WebResult(name = "result")
		public String loadcCardaccountchangehistories(String strCardNo);
		
		
		@WebMethod(operationName="updateCardPassword")//保存开单信息
		@WebResult(name = "result")
		public boolean updateCardPassword(String strCardNo,String strPassword);
		
		@WebMethod(operationName="checkCardPassword")//保存开单信息
		@WebResult(name = "result")
		public boolean checkCardPassword(String strCardNo,String strPassword);
		
		
		@WebMethod(operationName="loadVouchersdetalsById")//保存开单信息
		@WebResult(name = "result")
		public List<Vouchersdetal> loadVouchersdetalsById(String strVchNo);
		
		@WebMethod(operationName="loadWxbandcard")//保存开单信息
		@WebResult(name = "result")
		public Wxbandcard loadWxbandcard(String strCardNo,String strOperId);
		
		@WebMethod(operationName="checkDyqNo")//保存开单信息
		@WebResult(name = "result")
		public boolean checkDyqNo(String strDyqNo);
		
		@WebMethod(operationName="lsDnointernalcardinfos")//保存开单信息
		@WebResult(name = "result")
		public String lsDnointernalcardinfos(String strDyqNo);
		
		@WebMethod(operationName="loadNointernalcardinfo")//保存开单信息
		@WebResult(name = "result")
		public Nointernalcardinfo loadNointernalcardinfo(String strDyqNo);
		
		@WebMethod(operationName="loadwWeixinclents")//保存开单信息
		@WebResult(name = "result")
		public String loadwWeixinclents(String strOperId);
		
		
		@WebMethod(operationName="wxPost")//保存开单信息
		@WebResult(name = "result")
		public boolean wxPost(String strCompId,String strBillId, String strDate);
		
		
		@WebMethod(operationName="saveEvaluations")//保存开单信息
		@WebResult(name = "result")
		public boolean saveEvaluation(String billid,String operid,double discount,String content,double amt);
		
		
		@WebMethod(operationName="loadEvaluation")//保存开单信息
		@WebResult(name = "result")
		public Evaluation loadEvaluation(String operid,String billid);
		
		@WebMethod(operationName="saveOrders")//保存预约主档
		@WebResult(name = "result")
		public boolean saveOrders(String strCompId,String strBillId,String strCardNo,String orderPhone,String strDate,String strTime,String openid,int billType,String complydetail);
		
		@WebMethod(operationName="saveOrderPrjInfo")//保存预约主档
		@WebResult(name = "result")
		public boolean saveOrderPrjInfo(String strCompId,String strBillId,String strPrjInfo,String strPrjName);
		
		@WebMethod(operationName="saveOrderEmpInfo")//保存预约主档
		@WebResult(name = "result")
		public boolean saveOrderEmpInfo(String strCompId,String strBillId,String strEmpNo,String strEmpName,String strEmpInid);
		
		@WebMethod(operationName="loadOrders")//查询预约
		@WebResult(name = "result")
		public String loadOrders(String openid);
		
		@WebMethod(operationName="loadCompByCardNo")//查询推荐店面
		@WebResult(name = "result")
		public String loadCompByCardNo(String strCardNo);
		
		@WebMethod(operationName="loadEmpInfoByComp")//查询推荐员工
		@WebResult(name = "result")
		public String loadEmpInfoByComp(String strCompId,String strCardNo);
		
		@WebMethod(operationName="loadEmpInfoByDept")//查询店面所有的美容师和美发师
		@WebResult(name = "result")
		public String loadEmpInfoByDept(String strCompId);
		
		@WebMethod(operationName="updBillState")//单据作废
		@WebResult(name = "result")
		public boolean updBillState(String strCompId,String strBillId);
		
		@WebMethod(operationName="updOrderState")//修改单据状态
		@WebResult(name = "result")
		public boolean updOrderState(String strBillId);
		
		@WebMethod(operationName="checkBillState")//查询单据状态
		@WebResult(name = "result")
		public String checkBillState(String strBillId);
		
		//绑定员工的OPID
		@WebMethod(operationName="bandStaffInfo")//修改单据状态
		public boolean bandStaffInfo(String strParams);
		
		//保存预约主档
		@WebMethod(operationName="saveNewOrders")
		public String saveNewOrders(String strCompId,String strBillId,String strItemNo,String strEmpNo,int ispz,String strDate,String strTime,String orderPhone,String strCardNo,String openid,String strEmpName);
		
		//查询预约
		@WebMethod(operationName="loadOrderDetal")
		public String loadOrderDetal(String openid);
		
		//根据预约单号查询预约
		@WebMethod(operationName="loadOrderById")
		public String loadOrderById(String callbillid);
		
		//根据员工工号查询预约
		@WebMethod(operationName="loadOrderByEmp")
		public String loadOrderByEmp(String strCompId,String strEmpNo, String orderDate, String orderTime);
		
		//根据OpenId查询预约
		@WebMethod(operationName="loadOrderByOpenId")
		public String loadOrderByOpenId(String openId, String orderDate, String orderTime);
		
		//推荐员工
		@WebMethod(operationName="loadNewEmpInfoByComp")
		public String loadNewEmpInfoByComp(String strCompId,String strCardNo,int billtype);
		
		/**
		 * 推荐明星发型师
		 * @param strCompId
		 * @return
		 */
		public String loadStartHairInfo(String strCompId);
		
		/**
		 * 推荐明星美容师
		 * @param strCompId
		 * @return
		 */
		public String loadStartBeautyInfo(String strCompId);
		
		
		/**
		 * 检查用户名密码
		 * @param userName
		 * @param pwd
		 * @return
		 */
		public String checkUser(String strCompId,String userName,String pwd);
		
		/**
		 * 保存盘点信息
		 * @param inventory
		 * @param lsInventorydetals
		 * @return
		 */
		public String saveInventory(String strCompId,String userId,String strParams);
		
		/**
		 * 增加盘点主档
		 * @param strCompId
		 * @return
		 */
		public String addInventory(String strCompId);
		
		/**
		 * 检查条形码的状态
		 * @param strCompId
		 * @param strGoodBar
		 * @return
		 */
		public String checkGoodBar(String strCompId,String strGoodBar);
		
		/**
		 * 删除盘点信息
		 * @param inventBill
		 * @return
		 */
		public String deleteInventoryByInventBill(String strCompId,String inventBill);
		
		/**
		 * 删除盘点信息
		 * @param inventBill
		 * @return
		 */
		public String deleteInventoryByBill(String strCompId,String bill);
		
		
		/**
		 * 查询条形码信息
		 * @param goodBarNo
		 * @return
		 */
		public String findGoodBarInfo(String goodBarNo);
		
}
