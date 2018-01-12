/**
 *
 * @author Miquel Vidal
 */
package infinitygamelauncher;

//Imports
import java.awt.*;
import java.util.Scanner;

//Clases Generales


public class InfinityGameLauncher {
 
static Scanner kb = new Scanner(System.in);
    
    public static void main(String[] args) {
        //Declaracion variables main
        String titulo; //Titulo de la ventana
        
        //Iniciación de las variables
        System.out.print("Elije un titulo para la ventana: ");
        titulo = kb.next();
        
        crearVentana(titulo);
        
    }
    
    public static void crearVentana(String nombre){//IcrearVentana
        Frame f = new Frame(nombre);
        f.setBounds(100, 100, 400, 250);
        f.setVisible(true);
    }//FcrearVentana
    
}
