/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ouissal
 */
@Repository
@Entity
public class CompteDAOImpl implements CompteDAO {

    @PersistenceContext(unitName = "HelloPU") // à modifier
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    // à modifier le ID
    @Id
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Transactional
    @Override
    public void telechargerReleveCompte(CompteEntity c) {
        //rendre le numéro et montnat 
        // chercher qlq chose qui génére des fichiers PDF
    }
    @Transactional
    @Override
    public double consulterSolde(CompteEntity c) {
        return c.getMontant();
    }
    
    

}
