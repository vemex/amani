package amani.wechat.platform.dao.impl;

import org.springframework.stereotype.Repository;

import amani.wechat.platform.dao.entities.AmnOrders;

@Repository("amnOrdersDAO")
public class AmnOrdersDAOImpl extends HibernateBaseGenericDAOImpl<AmnOrders, Integer> {

}
