/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Ouissal
 */
public interface CompteDAO {
     public void telechargerReleveCompte(CompteEntity c);
      public double consulterSolde(CompteEntity c);
}
