package com.amani.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.amani.bean.RepsonBean;
import com.amani.dao.AMN_Dao;
import com.amani.tools.DESPlus;

@Service
public class InventoryService {
	@Autowired
	AMN_Dao amn_Dao;
	
	public RepsonBean checkUser(String userName,String pwd)
	{
		RepsonBean req = new RepsonBean(false);
		DESPlus desPlus;
		String strPwd = "";
		try {
			desPlus = new DESPlus();
			strPwd = desPlus.encrypt(pwd);
			String strSql = "select count(userno) from sysuserinfo where userno='"
					+ userName + "' and userpwd='" + strPwd + "' ";
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
		return req;
	}
	
}
