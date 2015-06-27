package amani.wechat.platform.dao.impl;

import org.springframework.stereotype.Repository;

import amani.wechat.platform.dao.entities.AmnUser;

@Repository("amnUserDAO")
public class AmnUserDAOImpl extends HibernateBaseGenericDAOImpl<AmnUser, Integer> {

}
