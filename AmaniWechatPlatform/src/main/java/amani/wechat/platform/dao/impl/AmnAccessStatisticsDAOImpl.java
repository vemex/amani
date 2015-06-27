package amani.wechat.platform.dao.impl;

import org.springframework.stereotype.Repository;

import amani.wechat.platform.dao.entities.AmnAccessStatistics; 

@Repository("amnAccessStatisticsDAO")
public class AmnAccessStatisticsDAOImpl extends  HibernateBaseGenericDAOImpl<AmnAccessStatistics,Integer> {

}
