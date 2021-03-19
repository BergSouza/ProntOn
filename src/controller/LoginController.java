/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import DAO.LoginDAO;

/**
 *
 * @author vitor
 */
public class LoginController {
    
    LoginDAO loginDAO = new LoginDAO();
    
    public int loginUser(String login, String senha){
        return loginDAO.loginUser(login, senha);
    }
    
}
