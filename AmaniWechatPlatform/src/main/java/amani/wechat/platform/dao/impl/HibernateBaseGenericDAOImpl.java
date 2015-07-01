/*
 * 
 * @author zyong
 *
 * @date 2009-9-19 ����11:02:34
 *
 * @action һ���򵥹�����hibernateͨ��daoʵ����
 */
package amani.wechat.platform.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import amani.wechat.platform.dao.IBaseGenericDAO;;

/**
 * 
 * @author zyong
 * 
 * @action һ��������Hibernateͨ��daoʵ����<br>
 *         ��ݿ���ʲ�,ÿһ��ʵ���඼Ӧ�����̳и���<br>
 *         ��Ӧ����д����ķ���,��Ҫ��Ӧ�ķ���,ֱ�ӵ���ݷ��ʲ�ÿ�����Ӧ�Ľӿ������
 */
public class HibernateBaseGenericDAOImpl<E extends Serializable, PK extends Serializable>
		extends HibernateDaoSupport implements IBaseGenericDAO<E, PK> {

	@Resource(name = "sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory){
	
		super.setSessionFactory(sessionFactory);
	}
	
	
	/**
	 * ΪE��Ӧ��ʵ������
	 */
	private Class<?> entityClass;

	/**
	 * ��ȡEʵ���������
	 */
	public HibernateBaseGenericDAOImpl() {
		Class<?> c = this.getClass();
		Type t = c.getGenericSuperclass();
		if (t instanceof ParameterizedType) {
			this.entityClass = (Class<?>) ((ParameterizedType) t)
					.getActualTypeArguments()[0];
		}
	}

	@SuppressWarnings("unchecked")
	public E get(PK id) {
		return (E) this.getHibernateTemplate().get(this.entityClass, id);
	}

	@SuppressWarnings("unchecked")
	public E get(PK id, LockMode lock) {
		E entity = (E) this.getHibernateTemplate().get(this.entityClass, id,
				lock);
		if (entity != null) {
			this.flush();// ���ʵ�岻Ϊnull,����ˢ��,���������Ч
		}
		return entity;
	}

	public Object getStackValue(DetachedCriteria criteria, String propertyName,
			Stack value) {
		switch (value) {
		case MAX:
			criteria.setProjection(Projections.max(propertyName));
			break;
		case MIN:
			criteria.setProjection(Projections.min(propertyName));
			break;
		case AVG:
			criteria.setProjection(Projections.avg(propertyName));
			break;
		default:
			criteria.setProjection(Projections.sum(propertyName));
			break;
		}
		return this.findByCriteria(criteria, 0, 1).get(0);
	}

	public Integer getRowCount(DetachedCriteria criteria) {
		criteria.setProjection(Projections.rowCount());
		return (Integer) this.findByCriteria(criteria, 0, 1).get(0);
	}

	@SuppressWarnings("unchecked")
	public E load(PK id) {
		return (E) this.getHibernateTemplate().load(this.entityClass, id);
	}

	@SuppressWarnings("unchecked")
	public E load(PK id, LockMode lock) {
		E entity = (E) this.getHibernateTemplate().load(this.entityClass, id,
				lock);
		if (entity != null) {
			this.flush();// ���ʵ�岻Ϊnull,����ˢ��,���������Ч
		}
		return entity;
	}

	@SuppressWarnings("unchecked")
	public List<E> loadAll() {
		return (List<E>) this.getHibernateTemplate().loadAll(entityClass);
	}

	@SuppressWarnings("unchecked")
	public List<E> find(String hql) {
		return (List<E>) this.getHibernateTemplate().find(hql);
	}

	@SuppressWarnings("unchecked")
	public List<E> find(String hql, Object... values) {
		return (List<E>) this.getHibernateTemplate().find(hql, values);
	}

	@SuppressWarnings("unchecked")
	public List<E> findByNamedQuery(String queryName, Object... values) {
		return (List<E>) this.getHibernateTemplate().findByNamedQuery(queryName, values);
	}

	@SuppressWarnings("unchecked")
	public List<E> findByNamedQuery(String queryName) {
		return (List<E>) this.getHibernateTemplate().findByNamedQuery(queryName);
	}

	@SuppressWarnings("unchecked")
	public List<E> findByNamedQueryAndNamedParam(String queryName,
			Map<String, Object> params) {
		return (List<E>) this.getHibernateTemplate().findByNamedQueryAndNamedParam(
				queryName, (String[]) params.keySet().toArray(),
				params.values().toArray());
	}

	@SuppressWarnings("unchecked")
	public List<E> findByNamedParam(String queryName, Map<String, Object> params) {
		return (List<E>) this.getHibernateTemplate()
				.findByNamedParam(queryName,
						(String[]) params.keySet().toArray(),
						params.values().toArray());
	}

	@SuppressWarnings("unchecked")
	public List<E> findByCriteria(DetachedCriteria criteria) {
		return (List<E>) this.getHibernateTemplate().findByCriteria(criteria);
	}

	@SuppressWarnings("unchecked")
	public List<E> findByCriteria(DetachedCriteria criteria,
			Integer firstResult, Integer maxResults) {
		return (List<E>) this.getHibernateTemplate().findByCriteria(criteria,
				firstResult, maxResults);
	}

	public void save(E entity) throws HibernateException {
		this.getHibernateTemplate().save(entity);
	}

	public void saveOrUpdate(E entity) throws HibernateException {
		this.getHibernateTemplate().saveOrUpdate(entity);
	}

	public void saveOrUpdate(Collection<E> entitys) throws HibernateException {
		this.getHibernateTemplate().saveOrUpdate(entitys);
	}

	public void delete(E entity) throws HibernateException {
		this.getHibernateTemplate().delete(entity);
	}

	public void delete(E entity, LockMode lock) throws HibernateException {
		this.getHibernateTemplate().delete(entity, lock);
		this.flush();// ���ʵ�岻Ϊnull,����ˢ��,���������Ч
	}

	public void delete(Collection<E> entitys) throws HibernateException {
		this.getHibernateTemplate().deleteAll(entitys);
	}

	public void update(E entity) throws HibernateException {
		this.getHibernateTemplate().update(entity);
	}

	public void update(E entity, LockMode lock) throws HibernateException {
		this.getHibernateTemplate().update(entity, lock);
		this.flush();// ���ʵ�岻Ϊnull,����ˢ��,���������Ч
	}

	public Integer bulkUpdate(String hql) {
		return this.getHibernateTemplate().bulkUpdate(hql);
	}

	public Integer bulkUpdate(String hql, Object... values) {
		return this.getHibernateTemplate().bulkUpdate(hql, values);
	}

	public void flush() throws HibernateException {
		this.getHibernateTemplate().flush();
	}

	public void lock(E entity, LockMode lock) throws HibernateException {
		this.getHibernateTemplate().lock(entity, lock);
	}

	public DetachedCriteria createDetachedCriteria() {
		return DetachedCriteria.forClass(this.entityClass);
	}

	public DetachedCriteria createDetachedCriteria(
			Class<? extends Serializable> c) {
		return DetachedCriteria.forClass(c);
	}

	@SuppressWarnings("deprecation")
	public Criteria createCriteria() {
		return this.createDetachedCriteria().getExecutableCriteria(
				this.getSessionFactory().getCurrentSession());
	}

	@Override
	public Object getStackValue(DetachedCriteria criteria, String propertyName,
			String stackName) {
		// TODO Auto-generated method stub
		return null;
	}

}
