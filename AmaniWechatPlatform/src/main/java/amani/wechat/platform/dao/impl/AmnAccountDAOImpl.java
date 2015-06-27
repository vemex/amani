package amani.wechat.platform.dao.impl;

import org.springframework.stereotype.Repository;

import amani.wechat.platform.dao.entities.AmnAccount;

@Repository("amnAccountDAO")
public class AmnAccountDAOImpl extends HibernateBaseGenericDAOImpl<AmnAccount,Integer> {

}
