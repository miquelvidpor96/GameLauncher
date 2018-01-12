package gestores;

import infinitygamelauncher.Ventana;
import java.awt.event.*;


/**
 *
 * @author Miquel Vidal
 */
public class GestorBoton implements ActionListener{
    Ventana vent;
    public GestorBoton(Ventana v){
        vent = v;
    }
    
    public void actionPerformed(ActionEvent e){
        //recupera el conteindo del textField
        System.out.println("Has llegado a GestorBoton.java");
        String tx = vent.tf01.getText();
        //lo imprime
        vent.lb01.setText(tx);
    }
}
