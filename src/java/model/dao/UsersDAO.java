/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.dao;

import java.util.List;
import model.pojo.Users;
import model.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author hamza
 */
public class UsersDAO {
    public static List<Users> getUsers(){
        List<Users> lst =null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            
            String hql = "from Users";
            Query query= session.createQuery(hql);
            lst=query.list();
            
            session.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return lst;
    }
}
