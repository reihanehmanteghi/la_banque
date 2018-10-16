/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;

/**
 *
 * @author Ouissal
 */
public interface UtilisateurDAO {
    public void ajouterCompte(UtilisateurEntity u, CompteEntity c);
    public void modifierInfo(UtilisateurEntity u, String info, String valeur );
    public ArrayList<CompteEntity> consulterComptes(UtilisateurEntity u);
}
