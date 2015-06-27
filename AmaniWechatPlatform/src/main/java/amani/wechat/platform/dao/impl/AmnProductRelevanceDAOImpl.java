package amani.wechat.platform.dao.impl;

import org.springframework.stereotype.Repository;

import amani.wechat.platform.dao.entities.AmnProductRelevance;
import amani.wechat.platform.dao.entities.AmnProductRelevanceId;

@Repository("amnProductRelevanceDAO")
public class AmnProductRelevanceDAOImpl extends
		HibernateBaseGenericDAOImpl<AmnProductRelevance, AmnProductRelevanceId> {

}
