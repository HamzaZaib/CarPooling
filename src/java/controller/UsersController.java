/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.UsersDAO;
import model.pojo.Users;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author hamza
 */
public class UsersController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv= new ModelAndView("Users");
        try {
            System.out.println("hahahahahaha");
            List<Users> lst = UsersDAO.getUsers();
            mv.addObject("Users",lst);
            System.out.println("hahahahahaha");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }
    
}
