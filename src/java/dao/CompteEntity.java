/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ouissal
 */
@Entity
public class CompteEntity implements Serializable {

    @Id
    private int numeroCompte;
    private double montant;

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public CompteEntity(int numeroCompte, double montant) {
        this.numeroCompte = numeroCompte;
        this.montant = montant;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
   
    
}
