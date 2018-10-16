/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.HelloDAO;
import dao.HelloEntity;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author reyhaneh
 */@Service
public class HelloServiceImpl implements HelloService {

    @Resource
    HelloDAO dao;
    
    @Override
    public void add(String nom, String message) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    dao.save(new HelloEntity(nom,message));
    }

    @Override
    public void remove(String nom) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    List<HelloEntity> entities = dao.findByName(nom);
    for(int i=0;i<entities.size();i++)
    dao.delete(entities.get(i));
    }

    @Override
    public String getNomsMessages() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String result="";
    List<HelloEntity> entities = dao.findAll();
    for(int i=0;i<entities.size();i++)
    result += entities.get(i).getMessage()+" "+entities.get(i).getNom();
    return result;
    
    }
    
}
