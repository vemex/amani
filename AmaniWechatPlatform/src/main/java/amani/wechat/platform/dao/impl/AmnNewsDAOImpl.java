package amani.wechat.platform.dao.impl;

import org.springframework.stereotype.Repository;

import amani.wechat.platform.dao.entities.AmnNews;

@Repository("amnNewsDAO")
class AmnNewsDAOImpl extends HibernateBaseGenericDAOImpl<AmnNews, Integer> {

}
