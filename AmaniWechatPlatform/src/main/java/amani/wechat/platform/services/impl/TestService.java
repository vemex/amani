package amani.wechat.platform.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import amani.wechat.platform.dao.IBaseGenericDAO;
import amani.wechat.platform.dao.entities.AmnAccount; 
import amani.wechat.platform.services.ITestService;

@Service("testService")
public class TestService implements ITestService{

	@Resource(name="amnAccountDAO")
	IBaseGenericDAO baseGenericDAO ;
	
	@Override
	public List<AmnAccount> getAllAccount() {
		// TODO Auto-generated method stub
		List<AmnAccount> loadAll = (List<AmnAccount>)baseGenericDAO.loadAll();
		return loadAll;
	}

}
