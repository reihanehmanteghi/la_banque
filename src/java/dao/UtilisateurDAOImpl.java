/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.ArrayList;
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
public class UtilisateurDAOImpl implements UtilisateurDAO {

    @PersistenceContext(unitName = "HelloPU")
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    /**
     * * generated auto **
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UtilisateurDAOImpl)) {
            return false;
        }
        UtilisateurDAOImpl other = (UtilisateurDAOImpl) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.UtilisateurDAOImpl[ id=" + id + " ]";
    }

    /**
     * ***fin generated auto***
     */
    @Transactional
    @Override
    public void ajouterCompte(UtilisateurEntity u, CompteEntity c) {
        //on doit créer un compte avant
        u.getComptes().add(c);

    }

    @Transactional
    @Override
    public void modifierInfo(UtilisateurEntity u, String info, String valeur ) {
        if (info=="email")
            u.setEmail(valeur);
        else if (info=="password")
            u.setPrenom(valeur);
        else if (info=="adresse")
            u.setAdresse(valeur);
        else if (info=="tel")
            u.setAdresse(valeur);
        
    }
    
    // peut etre on doit l'ajouter au compteEntity
    @Transactional
    @Override
    public ArrayList<CompteEntity> consulterComptes(UtilisateurEntity u) {
        return u.getComptes();
    }
}
