/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_Archisoft;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.*;

/**
 *
 * @author prueba
 */


public class Archisoft {
  
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {  
    JFrame.setDefaultLookAndFeelDecorated(true);
    JDialog.setDefaultLookAndFeelDecorated(true);
    //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
    //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
    //UIManager.setLookAndFeel("com.sun.java.swing.plaf.multi.MultiLookAndFeel");

}  

catch (Exception e)  {  

e.printStackTrace();  

}
        /*
        Inicial inicio=new Inicial();
        inicio.setExtendedState(inicio.MAXIMIZED_BOTH);
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
        */
    }
}
