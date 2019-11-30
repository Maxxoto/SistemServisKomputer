 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamlet.sistemserviskomputer.View;

/**
 *
 * @author hamlet
 */
import com.hamlet.sistemserviskomputer.Controllers.UserControllers;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.InputMismatchException;
import javax.swing.*;
public class FormRegister {
    JFrame jframe;
    JPanel jpanel;
    JTextField jtxtuser;
    JPasswordField jtxtpass;
    JPasswordField jtxtpass2;
    JLabel jlbluser;
    JLabel jlblpass;
    JLabel jlblpass2;
    JLabel jnotif;
    JButton jbtnregister;
    
    UserControllers uc = new UserControllers();
    
    public FormRegister(){
        //        START OF COMPONENTS

        jlbluser = new JLabel("Username");
        jlbluser.setBounds(55, 50, 150, 20);
        
        jtxtuser = new JTextField();
        jtxtuser.setSize(100,50);
        jtxtuser.setBounds(55, 75, 150, 20);
        
        jlblpass = new JLabel("Password");
        jlblpass.setBounds(55, 100, 150, 20);
        
        jtxtpass = new JPasswordField();
        jtxtpass.setSize(100,50);
        jtxtpass.setBounds(55, 125, 150, 20);
        
        jlblpass2 = new JLabel("Verify Password");
        jlblpass2.setBounds(55, 150, 150, 20);
        
        
        
        
        
        jtxtpass2 = new JPasswordField();
        jtxtpass2.setSize(100,50);
        jtxtpass2.setBounds(55, 175, 150, 20);
        
        jbtnregister = new JButton("Register");
        jbtnregister.setBounds(55, 200, 150, 20);
        jbtnregister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String pass1 = String.valueOf(jtxtpass.getPassword());
                    String pass2 = String.valueOf(jtxtpass2.getPassword()); 
                    String user = jtxtuser.getText();
                    
                    if(pass1.equals(pass2)){
                        uc.registerNew(jframe, user, pass2);
                        clearForm();                        
                    }else{
                        JOptionPane.showMessageDialog(jframe, "Kata sandi anda tidak cocok !");
                    }
                    
                }catch(InputMismatchException im){
                    JOptionPane.showMessageDialog(jframe, "Register masih dibetulkan !");
                }
                
            }
        });
        
        jnotif = new JLabel("Ke Halaman Login");
        jnotif.setBounds(55, 225, 150, 20);
        jnotif.setSize(500,20);
        jnotif.setForeground(Color.BLUE.darker());
        jnotif.setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });
        jnotif.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                jframe.dispose();
                new FormLogin();
            }
        });
        
        
        
        
                                
//        END OF COMPONENTS
        
        jframe = new JFrame();               
        jframe.setTitle("Form Register");
        
        jpanel = new JPanel();                
        jframe.setContentPane(jpanel);        
        jframe.getContentPane().setLayout(null);
                
        jpanel.add(jlbluser);
        jpanel.add(jlblpass);
        jpanel.add(jtxtuser);
        jpanel.add(jtxtpass);                
        jpanel.add(jlblpass2);
        jpanel.add(jtxtpass2);
        jpanel.add(jnotif);
        jpanel.add(jbtnregister);
        
        
        
        
        jframe.setSize(250,250);
        jframe.setVisible(true);
        
    }
    
    public void clearForm(){
        jtxtuser.setText("");
        jtxtpass.setText("");
        jtxtpass2.setText("");
    }
}
