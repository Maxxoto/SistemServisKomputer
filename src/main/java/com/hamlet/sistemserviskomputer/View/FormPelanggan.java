package com.hamlet.sistemserviskomputer.View;

/**
 *
 * @author hamlet
 */
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

public class FormPelanggan {
    JFrame jframe;
    JTable jtable;
    
    JLabel jlblnama;
    JLabel jlblalamat;
    JLabel jlblnohp;
    
    

    public FormPelanggan() {
        jframe = new JFrame();
        jframe.setTitle("Form Pelanggan");
        
        
        String[][] data = {
            { "1","Dummy1","Alamat1","085" },
            { "2","Dummy2","Alamat2","081" }
        };
        
        String[] columnNames = {"ID","Nama Pelanggan","Alamat","No HP"} ;
        
        jtable = new JTable(data,columnNames);
        DefaultTableCellRenderer centerRender =  new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        
        jtable.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        jtable.getColumnModel().getColumn(1).setCellRenderer(centerRender);
        jtable.getColumnModel().getColumn(2).setCellRenderer(centerRender);
        jtable.getColumnModel().getColumn(3).setCellRenderer(centerRender);
        jtable.setBounds(30, 40, 200, 300);
        
        JScrollPane jsp = new JScrollPane(jtable);
        
        jframe.add(jsp);//Menambahkan komponen ke dalam jframe
        jframe.setSize(800,600);
        jframe.setVisible(true);
    }
    
    
}
