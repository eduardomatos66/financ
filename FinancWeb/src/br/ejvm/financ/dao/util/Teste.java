package br.ejvm.financ.dao.util;

import java.util.Date;

import br.ejvm.financ.dao.GastoDao;
import br.ejvm.financ.dao.TipoGastoDao;
import br.ejvm.financ.entity.GastoEntity;
import br.ejvm.financ.entity.TipoGastoEntity;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;

public class Teste {

    public static void main(String[] args) {
//        Session sessao = HibernateUtil.getSessionFactory();
//        Transaction t = sessao.beginTransaction();
//    	
//    	EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("money");
//		EntityManager entityManager = managerFactory.createEntityManager();

        GastoEntity gasto = new GastoEntity(new Date(), new TipoGastoEntity("Eletrônico"), "McDonalds", "BigMac", true, 30.0f, 10.0f, null);
//        
//		entityManager.getTransaction().begin();
//		
//		
//		entityManager.persist(gasto.getType());
//		entityManager.persist(gasto);
//		
//		entityManager.getTransaction().commit();
//        
//
        TipoGastoEntity tipoGasto = new TipoGastoEntity("Eletrônico");
        TipoGastoDao tipoGastoDao = new TipoGastoDao();
        
        tipoGastoDao.create(tipoGasto);
        
        GastoDao gastoDao = new GastoDao();
        gastoDao.create(gasto);
//        gastoDao.commit();
        
//        sessao.save(gasto);
//        t.commit();
//        sessao.close();
    }
}
