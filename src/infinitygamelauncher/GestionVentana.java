/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infinitygamelauncher;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Miquel Vidal
 */
public class GestionVentana implements WindowListener{
    public void windowClosing(WindowEvent e){
        System.out.println("Exit");
        System.exit(0);
    }
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
}
