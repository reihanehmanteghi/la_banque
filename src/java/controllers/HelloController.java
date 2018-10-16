/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author reyhaneh
 */
public class HelloController extends AbstractController {
    
    public HelloController() {
    }
    
    @Override
public ModelAndView handleRequestInternal(HttpServletRequest request,HttpServletResponse response) throws Exception
    {
       String result;
       ModelAndView mv = new ModelAndView("message");
       String nom = request.getParameter("nom");
       if (nom!=null && nom.length()>0)
       result = "Bonjour, Bienvenue "+nom;
       else
       result = "Error";
       mv.addObject("helloMessage",result);
       return mv;
    }
    
}
