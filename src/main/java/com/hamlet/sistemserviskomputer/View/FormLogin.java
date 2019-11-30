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
import javax.swing.*;

public class FormLogin {
    JFrame jframe;
    JPanel jpanel;
    JTextField jtxtuser;
    JPasswordField jtxtpass;
    JLabel jlbluser;
    JLabel jlblpass;
    JButton jbtnlogin;
    JLabel jnotif;
    UserControllers uc = new UserControllers();
    
    public FormLogin() {
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
        
        jbtnlogin = new JButton("Login");
        jbtnlogin.setBounds(55, 150, 150, 20);
        jbtnlogin.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = jtxtuser.getText();
                String pass = String.valueOf(jtxtpass.getPassword());
                uc.loginNew(jframe, user, pass);
            }
        });
        
        jnotif = new JLabel("Belum mendaftar ? Klik disini.");
        jnotif.setBounds(55, 175, 150, 20);
        jnotif.setSize(500,20);
        jnotif.setForeground(Color.BLUE.darker());
        jnotif.setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });
        jnotif.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                jframe.dispose();
                new FormRegister();
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
        jpanel.add(jnotif);
        
        
        
        
        jframe.setSize(450,250);
        jframe.setVisible(true);
        
               
        
    }
    
    
    
}


