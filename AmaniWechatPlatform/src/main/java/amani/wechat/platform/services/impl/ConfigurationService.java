package amani.wechat.platform.services.impl;

import java.util.List;

import javax.annotation.Resource;
 

import org.springframework.stereotype.Service; 

import amani.wechat.platform.dao.IBaseGenericDAO;
import amani.wechat.platform.dao.entities.AmnConfigs;
import amani.wechat.platform.exceptions.BussinessDataException;
import amani.wechat.platform.services.IConfigurationService;
import amani.wechat.platform.services.model.WXConfiguration;

import org.apache.log4j.Logger;
import org.hibernate.criterion.Order;

@Service("configurationService")
public class ConfigurationService implements IConfigurationService {
	
	private static Logger logger = Logger.getLogger(ConfigurationService.class);

	@Resource(name="amnConfigsDAO")
	IBaseGenericDAO<AmnConfigs,Integer> amnConfigsDAO ;
	
	@Override
	public WXConfiguration resolveWxConfiguration() throws BussinessDataException {
		org.hibernate.criterion.DetachedCriteria detachedCriteria=amnConfigsDAO.createDetachedCriteria().addOrder(Order.asc("id"));
		List<AmnConfigs> datas= amnConfigsDAO.findByCriteria(detachedCriteria);
		if(datas.size()==0){
			throw new BussinessDataException("未初始化微信平台配置数据") ;
		}
		WXConfiguration wxConfiguration=new  WXConfiguration();
		AmnConfigs fistRecoder=datas.get(0);
		wxConfiguration.setAccessToken(fistRecoder.getAccessToken());
		wxConfiguration.setAppid(fistRecoder.getAppid());
		wxConfiguration.setAppsecret(fistRecoder.getAppsecret());
		wxConfiguration.setToken(fistRecoder.getToken());
		wxConfiguration.setExpiresIn(fistRecoder.getExpiresIn());
		wxConfiguration.setTokentime(fistRecoder.getTokentime());
		wxConfiguration.setMchid(fistRecoder.getMchid());
		wxConfiguration.setKey(fistRecoder.getKey());
		wxConfiguration.setJsTicket(fistRecoder.getJsTicket());
		wxConfiguration.setJsExpires(fistRecoder.getJsExpires());
		logger.info("输出获取成功");
		// TODO Auto-generated method stub
		return wxConfiguration;
	}

	@Override 
	public Boolean saveWxConfiguration(WXConfiguration congConfiguration) {
		org.hibernate.criterion.DetachedCriteria detachedCriteria=amnConfigsDAO.createDetachedCriteria().addOrder(Order.asc("id"));
		List<AmnConfigs> datas= amnConfigsDAO.findByCriteria(detachedCriteria);
		AmnConfigs fisltRecoder=null;
		if(datas.size()==0){ 
			fisltRecoder=new AmnConfigs();
		}else{
			fisltRecoder=datas.get(0);
			
		}
		fisltRecoder.setAccessToken(congConfiguration.getAccessToken());
		fisltRecoder.setAppid(congConfiguration.getAppid());
		fisltRecoder.setAppsecret(congConfiguration.getAppsecret());
		fisltRecoder.setToken(congConfiguration.getToken());
		fisltRecoder.setExpiresIn(congConfiguration.getExpiresIn());
		fisltRecoder.setTokentime(congConfiguration.getTokentime());
		fisltRecoder.setMchid(congConfiguration.getMchid());
		fisltRecoder.setKey(congConfiguration.getKey());
		fisltRecoder.setJsTicket(congConfiguration.getJsTicket());
		fisltRecoder.setJsExpires(congConfiguration.getJsExpires());
		amnConfigsDAO.saveOrUpdate(fisltRecoder);
		logger.info("保存成功");
		return null;
	}
 

}
