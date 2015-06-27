package amani.wechat.platform.dao.impl;

import org.springframework.stereotype.Repository;

import amani.wechat.platform.dao.entities.AmnProduct;

@Repository("amnProductDAO")
public class AmnProductDAOImpl extends HibernateBaseGenericDAOImpl<AmnProduct, Integer> {

}
