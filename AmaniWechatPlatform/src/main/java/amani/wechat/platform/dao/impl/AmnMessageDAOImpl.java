package amani.wechat.platform.dao.impl;

import org.springframework.stereotype.Repository;

import amani.wechat.platform.dao.entities.AmnMessage;

@Repository("amnMessageDAO")
public class AmnMessageDAOImpl extends HibernateBaseGenericDAOImpl<AmnMessage, Integer> {

}
