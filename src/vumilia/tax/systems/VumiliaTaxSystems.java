/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vumilia.tax.systems;

import com.bulenkov.darcula.DarculaLaf;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicLookAndFeel;

/**
 *
 * @author kmike
 */
public class VumiliaTaxSystems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            BasicLookAndFeel darcula = new DarculaLaf();
            UIManager.setLookAndFeel(darcula);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VumiliaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        VumiliaHome VumiliaHome=new VumiliaHome();
        VumiliaHome.setVisible(true);
    }
    
}
