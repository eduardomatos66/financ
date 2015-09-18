package br.ejvm.financ.service;

public abstract class GenericServiceImp<T> implements GenericService<T> {

	private static final long serialVersionUID = 1L;
//	@Override
//	@Transactional(readOnly = true)
//	public int count() {
//		return this.getDao().count();
//	}
//
//	@Override
//	@Transactional(readOnly = true)
//	public List<T> findAll() {
//		return this.getDao().findAll();
//	}
//
//	@Override
//	@Transactional(readOnly = true)
//	public T find(Long id) {
//		return (T) this.getDao().find(id);
//	}
//
//	@Override
//	@Transactional
//	public void create(T entity) {
//		this.getDao().create(entity);
//	}
//
//	@Override
//	@Transactional
//	public void delete(T entity) {
//		this.getDao().delete(entity);
//	}
//
//	@Override
//	@Transactional
//	public void edit(T entity) {
//		this.getDao().edit(entity);
//	}
//
//	@Override
//	@Transactional
//	public void remove(Long id) {
//		this.getDao().remove(id);
//	}
}
