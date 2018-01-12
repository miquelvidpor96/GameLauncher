/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infinitygamelauncher;

import java.awt.*;


/**
 *
 * @author Miquel Vidal
 */
public class Ventana extends Frame{
    Button bt01;
    
    public Ventana(String titulo, int x, int y, int ancho, int alto){
        super(titulo); //Invoca el contructor de Frame
        this.setBounds(x, y, ancho, alto);//Establece parametros ventana
        this.setLayout(null);//Elimina layout
        crearBoton();
        this.setVisible(true);
    }
    
    public void crearBoton(){
        bt01 =  new Button("Pulsar aquí"); //Crear boton
        bt01.setBounds(50,50,100,30); //Posicion y tamaño desde esquina sup izq de la ventana
        this.add(bt01); //Añade el boton 
    }
}
