/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

//import Entities.User;
//import Sessions.UserFacade;
//import java.util.List;
//import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author Raf
 */
@ManagedBean (eager = true)
@SessionScoped
public class Login {

//    @EJB
//    UserFacade user;
    
    private String login;
    private String password; 
    
    /**
     * Creates a new instance of Login
     * @param login
     * @param password
     */
    public Login(){}
    
    public Login(String login,String password) 
    {
        this.login=login;
        this.password=password;
    }
    
    public String validar()
    {
//        user= new UserFacade();
//        List<User> users = user.findAll();
//        for(User u : users)
//        {
//            if(u.getLogin().equals(login))
//                if(u.getPassword().equals(password))
//                {
//                    if(u.getIdRelationship().getIdRelationship()==1)
//                        return "vista1";
//                    else    
//                        return "vista2";
//                }
//                    
//        }
        return null; 
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
