/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author reyhaneh
 */
public interface HelloService {
    public void add(String nom, String message);
    public void remove(String nom);
    public String getNomsMessages();
}
