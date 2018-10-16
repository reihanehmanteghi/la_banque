/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Ouissal
 */
@Entity
public class UtilisateurEntity implements Serializable {

    @Id
    private int id;
    private String password;
    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private String tel;
    private ArrayList<CompteEntity> comptes;

    public UtilisateurEntity(int id, String password, String nom, String prenom, String email, String adresse, String tel, ArrayList<CompteEntity> comptes) {
        this.id = id;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
        this.tel = tel;
        this.comptes = comptes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public ArrayList<CompteEntity> getComptes() {
        return comptes;
    }

    public void setComptes(ArrayList<CompteEntity> comptes) {
        this.comptes = comptes;
    }
    
    
    
    
}
