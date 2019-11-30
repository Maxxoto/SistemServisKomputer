/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamlet.sistemserviskomputer.Controllers;

import com.hamlet.sistemserviskomputer.Model.User;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author hamlet
 */

public class UserControllers {
    String username,password,roles;
    static ArrayList<User> dataUser = new ArrayList<>();
    
    public void registerNew(JFrame jframe,String user,String pass){
        String role = "Pelanggan";
        
        boolean find = findUser(user);
        
        if(find){
            JOptionPane.showMessageDialog(jframe, "Username telah terdaftar ! silahkan gunakan username lain .");
        }else{
            dataUser.add(new User(user,pass,role));
            JOptionPane.showMessageDialog(jframe, "Telah berhasil mendaftar !");
        }
        
    }
    
    public boolean findUser(String user){
        for(User list : dataUser){
            if(list.getUsername().equals(user)){
                return true;
            }
        }
        
        return false;
    }
    
    public void loginNew(JFrame jframe,String user,String pass){
        String role = "Pelanggan";
        
        boolean find = findUser(user);
        
        if(find){
            boolean findpass = checkPass(user,pass);
            if(findpass){
                JOptionPane.showMessageDialog(jframe, "Selamat datang " + user);
            }else{
                JOptionPane.showMessageDialog(jframe, "Username atau password salah !");
            }
        }else{            
            JOptionPane.showMessageDialog(jframe, "Username tidak terdaftar !");
        }
    }
    
    public boolean checkPass(String user,String pass){
        for(User list : dataUser){
            if(list.getUsername().equals(user) && list.getPassword().equals(pass)){
                return true;
            }
        }
        return false;
    }
    
}
