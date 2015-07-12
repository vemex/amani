package com.amani.services;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.codehaus.xfire.XFireFactory;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;

import com.amani.model.Cardaccountchangehistory;
import com.amani.model.Cardinfo;
import com.amani.model.CategoryinfoId;
import com.amani.model.Companyinfo;
import com.amani.model.Goodsinfo;
import com.amani.model.Memberinfo;
import com.amani.model.Projectinfo;
import com.amani.model.Roominfo;
import com.amani.model.Staffinfo;
import com.amani.tools.CommonTool;
import com.amani.tools.HttpClientUtil;
import com.amani.tools.SystemFinal;
public class Tservice {

	/**
	 * @param args
	 * Feb 20, 20149:55:31 AM
	 * Administrator
	 */
	public static void main(String[] args) throws MalformedURLException {
		Service service = new ObjectServiceFactory().create(ICommonService.class);  
		XFireProxyFactory factory = new XFireProxyFactory(XFireFactory.newInstance().getXFire());  
		//String url = "http://localhost:8080/AMNCommonService/services/CommonService";
		String url="http://10.0.0.10:8080/AMNCommonServicePad/services/CommonService";
		
		ICommonService commonService = (ICommonService) factory.create(service,url);
		try {
			//System.out.println(commonService.loadStartBeautyInfo("002"));
			//System.out.println(commonService.checkBillState("00120150614012"));
			//System.out.println("result "+ commonService.saveNewOrders("001", "123456", "123", "000", 1, "2015612", "120101", "15012345678", "-123", "abc", "qwer"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(commonService.saveOrderPrjInfo("002", "00220150318001", "444", "美容"));
		//System.out.println(commonService.saveOrderEmpInfo("002", "00220150318001", "002400", "美容部", "IC4000002"));
		//System.out.println(commonService.saveNewOrders("002", "00220150318001", "001", "002803", 1, "20150421", "221001", "15201983763", "F0002782", "orCjajnHnIqlcFzblz5jbz30_SZA", "第三方斯蒂芬"));
		//System.out.println(commonService.saveOrders("002", "00220150318001", "F0002782", "15201983763", "20150323", "230611", "orCjajnHnIqlcFzblz5jbz30_SZA", 2, "sadasdas"));
		//System.out.println(commonService.loadOrderDetal("orCjajnHnIqlcFzblz5jbz30_SZA"));
		//System.out.println(commonService.loadStartHairInfo("002"));
		//System.out.println(commonService.loadStartBeautyInfo("002"));
		//System.out.println(commonService.loadStaffinfo("002", "2"));
		/*Map<String, String> mapParam=new HashMap<String, String>();
		mapParam.put("openid", "");
		mapParam.put("cardcode", "");
		mapParam.put("uuid", "");
		mapParam.put("price", "");
		try {
			String strReps=HttpClientUtil.postMap("http://amn.55liketest.com/api/scancode", mapParam);
			System.out.println(strReps);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//ICommonService commonService = (ICommonService) factory.create(service,url);
		//System.out.println(commonService.loadWxbandcard("0138510000401", "").getRandomno());
		
		//System.out.println(commonService.loadNointernalcardinfo("A001600001").getId().getCardvesting());
		//System.out.println(commonService.loadCardInfos("15990196660", "").size());
		//System.out.println(commonService.loadCardInfo("001", "010208120002"));
		//System.out.println(commonService.saveIPADBillInfo(null, null));
		//产品接口测试成功
		//List<Goodsinfo> lsCompanyinfos=commonService.loadAllGoodinfo();
		//项目接口测试成功
		//List<Projectinfo> ls=commonService.loadProjectinfo("002");
		//System.out.println(ls.size());
		//员工接口测试成功
		//List<Staffinfo> lsStaffinfos=commonService.loadStaffinfo("002");;
		//System.out.println(lsStaffinfos.size());
		//排班系统成功
		//List<CategoryinfoId> lsCategoryinfoIds=commonService.loadCategory("004");
		//System.out.println(lsCategoryinfoIds.size());
		//Companyinfo companyinfo=commonService.loadCompanyinfo("001");
		//List<Companyinfo> companyinfo=commonService.loadAllCompanyinfo();
		//房间测试
		//List<Roominfo> lsList=commonService.loadRoomInfo("001");
		//List<String> lsStrings=commonService.loadMirror("001");
		//System.out.println(lsStrings.get(0));
		//System.out.println(companyinfo.getCompname());
		//ICommonService commonService = (ICommonService) factory.create(service,url);
		//System.out.println(commonService.loadCompNameById());
		/*int result=commonService.CKT_RegisterNet_local(99008,"10.0.1.25");
		System.out.println(result);
	
		String strresult=commonService.CKT_ListPersonInfoEx_local(99008);
		System.out.println("结果"+strresult);
		*/
		
//		result=commonService.CKT_DeletePersonInfo_local(99008,21009);
//		System.out.println(result);
//		result=commonService.CKT_DeletePersonInfo_local(99008,12039);
//		System.out.println(result);
//		String strBillInfo="[{\"brachcode\":\"006\",\"smallinfo\":[{\"tel\":\"\",\"sex\":\"鐢穃",\"usersign\":\"\",\"evaluate\":\"0\",\"status\":\"0\",\"custom\":\"1\",\"credits\":\"0\",\"isnew\":\"0\",\"closetime\":\"\",\"cardno\":\"\",\"customname\":\"\",\"summary\":\"\",\"smerge\":\"0\",\"employee_no\":\"48\",\"cdate\":\"2014/4/9 16:03:24\",\"small_no\":\"1201404090005\",\"psmall_no\":\"\"}],\"smallconsume\":[{\"isfortreatment\":\"0\",\"isdeleted\":\"0\",\"product\":\"娓愬彉鏌揬",\"employee_no3\":\"\",\"employee_no2\":\"\",\"amount\":\"1\",\"isnew\":\"0\",\"isnew3\":\"0\",\"isnew2\":\"0\",\"sortid\":\"1\",\"employee_no\":\"48\",\"cost\":\"0.88\",\"code\":\"1805\",\"cdate\":\"2014/4/9 16:03:35\",\"small_no\":\"1201404090005\",\"price\":\"1580\"}]}]";
//		System.out.println(strBillInfo);
//		String flag=commonService.loadCardInfoBySpad("XZ000020","");
//		System.out.println(flag);
		//		int result=commonService.CKT_RegisterNet_local(99008,"10.0.1.25");
//		System.out.println(result);
//		String strReturnValue=commonService.GetClockingRecordProgress_localbyDate(99008,CommonTool.getDateMask("20140302"));
////		String strReturnValue=commonService.downLoadSpadPostionInfo();
//		System.out.println(strReturnValue);
		
		
//		System.out.print("111111");
//		Tservice ts=new Tservice();
//		ts.createJpg("first", 640, 480);
//		//System.out.println(commonService.loadCompName("001"));
//		Cardinfo objcardinfo=commonService.loadCardinfo("0180310000086");
//		System.out.println(objcardinfo.getMembername());
//		System.out.println(objcardinfo.getMemberphone());
//		System.out.println(objcardinfo.getCardtypeName());
//		System.out.println(objcardinfo.getAccount2Amt()); //鍌ㄥ�间綑棰�
//		System.out.println(objcardinfo.getAccount3Amt()); //绉垎浣欓
//		System.out.println(objcardinfo.getBcardvesting());
//		
//		
//		
////		List<Companyinfo> compnanme=commonService.loadCompanyName();
////		System.out.println(compnanme);
//		
//		List<Cardaccountchangehistory> cardtype = commonService.loadCardaccountchangehistory("F0002782");
//		System.out.println(cardtype.get(1).toString());
		
//		
//		Memberinfo objmemberinfo=commonService.loadMemberinfoByCompId("001", "010208120267");
//		System.out.println(objmemberinfo.getMembername());	
//		System.out.println(objmemberinfo.getMembermphone());
//		System.out.println(objmemberinfo.getBmemberno());
//		Tservice te=new Tservice();
//		te.loadFingerDataSet();
	}

		//width 640,height 480
	   public void createJpg(String strImageName,int width,int height)
	   {
		   	String s = "鍩虹鍥�";
		   	File file = new File("D:/"+strImageName+".jpg");
		   	Font font = new Font("Serif", Font.BOLD, 10);
		   	//鍒涘缓涓�涓敾甯�
		   	BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		   	//鑾峰彇鐢诲竷鐨勭敾绗�
		   	Graphics2D g2 = (Graphics2D)bi.getGraphics();
		   	//寮�濮嬬粯鍥�
		   	g2.setBackground(Color.WHITE);
		   	g2.clearRect(0, 0, width, height);
		   	g2.setPaint(new Color(0,0,255));
		   	g2.fillRect(0, 0, 100, 10);
		   	g2.setPaint(new Color(253,2,0));
		   	g2.fillRect(0, 10, 100, 10);
		   	g2.setPaint(Color.red);
		   	FontRenderContext context = g2.getFontRenderContext();
		   	Rectangle2D bounds = font.getStringBounds(s, context);
		   	double x = (width - bounds.getWidth()) / 2; 
		   	double y = (height - bounds.getHeight()) / 2; 
		   	double ascent = -bounds.getY();
		   	double baseY = y + ascent; 
		   	//缁樺埗瀛楃涓� 
		   	g2.drawString(s, (int)x, (int)baseY);
		   	try
		   	{ 
		   			//灏嗙敓鎴愮殑鍥剧墖淇濆瓨涓簀pg鏍煎紡鐨勬枃浠躲�侷mageIO鏀寔jpg銆乸ng銆乬if绛夋牸寮� 
		   			ImageIO.write(bi, "jpg", file); 
		   	} 
		   	catch (IOException e)
		   	{ 
		   		System.out.println("鐢熸垚鍥剧墖鍑洪敊........");
		   		e.printStackTrace(); 
		   	}
	   } 

}
