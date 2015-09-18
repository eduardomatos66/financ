package br.ejvm.financ.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface GenericDao<T> extends Serializable {

	public long countAll(Map<String, Object> params);
	
	public T create(T t);
	
	public void delete(Object id);
	
	public T find(Object id);
	
	public T update(T t);
	
	public List<T> list();
	
	public void commit();

//	public void create(T entity);
//
//	public void edit(T entity);
//
//	public void delete(T entity);
//
//	public void remove(Long id);
//
//	public T find(Long id);
//
//	public List<T> findAll();
//
//	public int count();
}