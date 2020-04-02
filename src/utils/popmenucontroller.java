/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author aryadanaraya
 */
public class popmenucontroller {
    JPopupMenu popup = new JPopupMenu();

    public int menu_customer=1;
    public void addmenu(String namamenu,int menu_type) {
        JMenuItem menuItem = new JMenuItem(namamenu);
        menuItem.addActionListener(menuListener(menu_type));
        menuItem.setFont(new Font("Dialog", Font.PLAIN, 10));
        popup.add(menuItem);
    }

    private ActionListener menuListener(int menu_type) {
        if (menu_type==menu_customer){
//            bukalayarcustomer
        }
        return null;
    }
        
}
