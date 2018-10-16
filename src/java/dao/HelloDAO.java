/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author reyhaneh
 */
public interface HelloDAO {
    
    
    
public void save(HelloEntity h);
public void update(HelloEntity h);
public void delete(HelloEntity h);
public HelloEntity find(long id);
public List<HelloEntity> findAll();

    /**
     *
     * @param h
     * @param nom
     * @return
     */
    public List<HelloEntity> findByName(HelloEntity h, String nom);

    public List<HelloEntity> findByName(String nom);
}
