package br.ejvm.financ.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public abstract class GenericDaoImpl<T> implements GenericDao<T> {

	private static final long serialVersionUID = 1L;

	@PersistenceContext
	protected EntityManager em;
	
	private Class<T> type;

	/**
	 * Constructor.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public GenericDaoImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class) pt.getActualTypeArguments()[0];
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("money");
		this.em = managerFactory.createEntityManager();
	}

	/* (non-Javadoc)
	 * @see br.com.money.model.dao.GenericDao#countAll(java.util.Map)
	 */
	@Override
	public long countAll(final Map<String, Object> params) {

		final StringBuffer queryString = new StringBuffer("SELECT count(o) from ");

		queryString.append(type.getSimpleName()).append(" o ");
		queryString.append(this.getQueryClauses(params, null));

		final Query query = this.em.createQuery(queryString.toString());

		return (Long) query.getSingleResult();

	}

	/* (non-Javadoc)
	 * @see br.com.money.model.dao.GenericDao#create(java.lang.Object)
	 */
	@Override
	public T create(final T t) {
		this.em.persist(t);
		return t;
	}

	/* (non-Javadoc)
	 * @see br.com.money.model.dao.GenericDao#delete(java.lang.Object)
	 */
	@Override
	public void delete(final Object id) {
		this.em.remove(this.em.getReference(type, id));
	}

	/* (non-Javadoc)
	 * @see br.com.money.model.dao.GenericDao#find(java.lang.Object)
	 */
	@Override
	public T find(final Object id) {
		return (T) this.em.find(type, id);
	}

	/* (non-Javadoc)
	 * @see br.com.money.model.dao.GenericDao#update(java.lang.Object)
	 */
	@Override
	public T update(final T t) {
		return this.em.merge(t);
	}

	/* (non-Javadoc)
	 * @see br.com.money.model.dao.GenericDao#commit()
	 */
	@Override
	public void commit() {
//		if (this.em.getEntityManagerFactory().isOpen()) {
//			this.em.getEntityManagerFactory().close();
//		}
	}

	/**
	 * @param params
	 * @param orderParams
	 * @return
	 */
	private String getQueryClauses(final Map<String, Object> params, final Map<String, Object> orderParams) {
		final StringBuffer queryString = new StringBuffer();
		if ((params != null) && !params.isEmpty()) {
			queryString.append(" where ");
			for (final Iterator<Map.Entry<String, Object>> it = params.entrySet().iterator(); it.hasNext();) {
				final Map.Entry<String, Object> entry = it.next();
				if (entry.getValue() instanceof Boolean) {
					queryString.append(entry.getKey()).append(" is ").append(entry.getValue()).append(" ");
				} else {
					if (entry.getValue() instanceof Number) {
						queryString.append(entry.getKey()).append(" = ").append(entry.getValue());
					} else {
						// string equality
						queryString.append(entry.getKey()).append(" = '").append(entry.getValue()).append("'");
					}
				}
				if (it.hasNext()) {
					queryString.append(" and ");
				}
			}
		}
		if ((orderParams != null) && !orderParams.isEmpty()) {
			queryString.append(" order by ");
			for (final Iterator<Map.Entry<String, Object>> it = orderParams.entrySet().iterator(); it.hasNext();) {
				final Map.Entry<String, Object> entry = it.next();
				queryString.append(entry.getKey()).append(" ");
				if (entry.getValue() != null) {
					queryString.append(entry.getValue());
				}
				if (it.hasNext()) {
					queryString.append(", ");
				}
			}
		}
		return queryString.toString();
	}

	/* (non-Javadoc)
	 * @see br.com.money.model.dao.GenericDao#list()
	 */
	@Override
	public List<T> list() {
		final StringBuffer queryString = new StringBuffer("SELECT o from ");

		queryString.append(type.getSimpleName()).append(" o ");

//		EntityManager em = this.em.getEntityManagerFactory().createEntityManager();

		final Query query = this.em.createQuery(queryString.toString());
		// final Query query = this.em.createQuery(queryString.toString());

		@SuppressWarnings("unchecked")
		List<T> resultList = query.getResultList();
		this.em.close();
		return resultList;
	}
}
