package com.hamlet.sistemserviskomputer.View;

/**
 *
 * @author hamlet
 */


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.FlowLayout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FormLogin {
    JFrame jframe;
    JPanel jpanel;
    JTextField jtxtuser;
    JPasswordField jtxtpass;
    JLabel jlbluser;
    JLabel jlblpass;
    JButton jbtnlogin;
    
    
    
    public FormLogin() {
//        START OF COMPONENTS

        jlbluser = new JLabel("Username");
        jlbluser.setBounds(55, 50, 150, 20);
        
        jlblpass = new JLabel("Password");
        jlblpass.setBounds(55, 100, 150, 20);
        
        jtxtuser = new JTextField();
        jtxtuser.setSize(100,50);
        jtxtuser.setBounds(55, 75, 150, 20);
        
        jtxtpass = new JPasswordField();
        jtxtpass.setSize(100,50);
        jtxtpass.setBounds(55, 125, 150, 20);
        
        jbtnlogin = new JButton("Login");
        jbtnlogin.setBounds(55, 150, 150, 20);
        jbtnlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jframe, "Login masih dibetulkan !");
            }
        });
                                
//        END OF COMPONENTS
        
        jframe = new JFrame();               
        jframe.setTitle("Form Login");
        
        jpanel = new JPanel();                
        jframe.setContentPane(jpanel);        
        jframe.getContentPane().setLayout(null);
                
        jpanel.add(jlbluser);
        jpanel.add(jlblpass);
        jpanel.add(jtxtuser);
        jpanel.add(jtxtpass);
        jpanel.add(jbtnlogin);
        
        
        
        
        
        jframe.setSize(250,250);
        jframe.setVisible(true);
        
               
        
    }
    
    
    
}


