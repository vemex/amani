package amani.wechat.platform.services;

import amani.wechat.platform.exceptions.BussinessDataException;
import amani.wechat.platform.services.model.WXConfiguration;

/**
 * 基础配置服务
 * 
 * @author VV
 *
 */
public interface IConfigurationService {
	/**
	 * 获取微信配置数据
	 * @return WXConfiguration  
	 * @throws BussinessDataException 
	 */
	WXConfiguration resolveWxConfiguration() throws BussinessDataException;
	
	Boolean saveWxConfiguration( WXConfiguration congConfiguration);
	
}
 
