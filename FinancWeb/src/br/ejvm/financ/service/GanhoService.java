package br.ejvm.financ.service;

import java.util.List;
import java.util.Map;

import br.ejvm.financ.dao.GanhoDaoImpl;
import br.ejvm.financ.dao.GenericDao;

public class GanhoService implements GenericService<GanhoDaoImpl>{

	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see br.com.money.model.dao.GenericDao#countAll(java.util.Map)
	 */
	@Override
	public long countAll(Map<String, Object> params) {
		return this.getDao().countAll(params);
	}

	/* (non-Javadoc)
	 * @see br.com.money.model.dao.GenericDao#create(java.lang.Object)
	 */
	@Override
	public GanhoDaoImpl create(GanhoDaoImpl t) {
		return this.getDao().create(t);
	}

	/* (non-Javadoc)
	 * @see br.com.money.model.dao.GenericDao#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object id) {
		this.getDao().delete(id);
		
	}

	/* (non-Javadoc)
	 * @see br.com.money.model.dao.GenericDao#find(java.lang.Object)
	 */
	@Override
	public GanhoDaoImpl find(Object id) {
		return this.getDao().find(id);
	}

	/* (non-Javadoc)
	 * @see br.com.money.model.dao.GenericDao#update(java.lang.Object)
	 */
	@Override
	public GanhoDaoImpl update(GanhoDaoImpl t) {
		return this.getDao().update(t);
	}

	/* (non-Javadoc)
	 * @see br.com.money.model.dao.GenericDao#list()
	 */
	@Override
	public List<GanhoDaoImpl> list() {
		return this.getDao().list();
	}

	/* (non-Javadoc)
	 * @see br.com.money.model.dao.GenericDao#commit()
	 */
	@Override
	public void commit() {
		this.getDao().commit();		
	}

	/* (non-Javadoc)
	 * @see br.com.money.model.service.GenericService#getDao()
	 */
	@Override
	public GenericDao<GanhoDaoImpl> getDao() {
		return this.getDao();
	}

	/* (non-Javadoc)
	 * @see br.com.money.model.service.GenericService#setDao(br.com.money.model.dao.GenericDao)
	 */
	@Override
	public void setDao(GenericDao<GanhoDaoImpl> dao) {
		this.setDao(dao);
	}

}
