package br.ejvm.financ.dao;

import br.ejvm.financ.entity.TipoGastoEntity;


/**
 * @author EduardoMatos
 *
 */
public class TipoGastoDao extends GenericDao<TipoGastoEntity> {
	
	
//    private Session session = null;
//    
//    @SuppressWarnings("unused")
//    private TipoGastoDao() {}
//    
//    /**
//     * @param session
//     */
//    public TipoGastoDao(Session session) {
//        setSession(session);
//    }
//    
//    /* (non-Javadoc)
//     * @see br.ejvm.dinheiro.dao.GenericDao#findById(java.io.Serializable, boolean)
//     */
//    @Override
//    public TipoGasto findById(Long id, boolean lock) {
//        Object o = this.session.load(TipoGasto.class, id);
//        return (TipoGasto) o;
//    }
//
//    public TipoGasto findByName(String name, boolean lock) {
//        Query queryResult = this.session.createQuery("from tbl_tipo_gasto where name='" + name + "'");
//        return (TipoGasto) queryResult.list().get(0);
//    }
//
//    /* (non-Javadoc)
//     * @see br.ejvm.dinheiro.dao.GenericDao#findAll()
//     */
//    @SuppressWarnings("unchecked")
//    @Override
//    public List<TipoGasto> getList() {
//        Query queryResult = this.session.createQuery("from tbl_tipo_gasto");
//        return queryResult.list();
//    }
//
//    /* (non-Javadoc)
//     * @see br.ejvm.dinheiro.dao.GenericDao#save(java.lang.Object)
//     */
//    @Override
//    public TipoGasto save(TipoGasto tipoGasto) {
//        this.session.saveOrUpdate(tipoGasto);
//        this.session.getTransaction().commit();
//        this.session.getTransaction().begin();
//        return tipoGasto;
//    }
//
//    /* (non-Javadoc)
//     * @see br.ejvm.dinheiro.dao.GenericDao#delete(java.lang.Object)
//     */
//    @Override
//    public void delete(TipoGasto entity) {
//        this.session.delete(entity);        
//    }
//
//    /**
//     * @param session
//     */
//    public void setSession(Session session) {
//        this.session = session;
//    }
}
