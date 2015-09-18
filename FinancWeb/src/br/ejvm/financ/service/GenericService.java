package br.ejvm.financ.service;

import br.ejvm.financ.dao.GenericDao;

public interface GenericService<T> extends GenericDao<T> {
    
	public GenericDao<T> getDao();
    
	public void setDao(GenericDao<T> dao);

}