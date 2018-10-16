/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author reyhaneh
 */
@Repository
public class HelloDAOImpl implements HelloDAO
{
@PersistenceContext(unitName="HelloPU")
private EntityManager em;
public EntityManager getEm() {
return em;
} public void setEm(EntityManager em) {
this.em = em;
}
    @Transactional
    @Override
    public void save(HelloEntity h) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    h = em.merge(h);
    em.persist(h);
    }
    
    @Transactional
    @Override
    public void update(HelloEntity h) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    em.merge(h);
    }
    @Transactional
    @Override
    public void delete(HelloEntity h) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    h = em.merge(h);
    em.remove(h);
    }
    
    @Transactional(readOnly = true)
    @Override
    public HelloEntity find(long id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return em.find(HelloEntity.class, id);
    }
       
    @Transactional(readOnly = true)
    @Override
    public List<HelloEntity> findAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     Query q = em.createQuery("SELECT h FROM HelloEntity h");
    return q.getResultList();
    }
    
    @Transactional(readOnly = true)
    @Override
    public List<HelloEntity> findByName(String nom) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     Query q = em.createQuery("SELECT h FROM HelloEntity h WHERE h.nom = ?").setParameter(1,nom);
    return q.getResultList();
    }

    @Override
    public List<HelloEntity> findByName(HelloEntity h, String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
