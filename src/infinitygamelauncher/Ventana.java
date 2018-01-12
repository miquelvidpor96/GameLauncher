/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infinitygamelauncher;

import java.awt.*;
import gestores.GestorBoton;

/**
 *
 * @author Miquel Vidal
 */
public class Ventana extends Frame{
    public Button bt01;
    public TextField tf01;
    public Label lb01;
    
    public Ventana(String titulo, int x, int y, int ancho, int alto){
        super(titulo); //Invoca el contructor de Frame
        this.setBounds(x, y, ancho, alto);//Establece parametros ventana
        this.setLayout(null);//Elimina layout
        crearElementos();
        GestionVentana gv = new GestionVentana(); //crear instancia de la clase GestionVentana
        GestorBoton gb = new GestorBoton(this);
        bt01.addActionListener(gb);
        this.addWindowListener(gv);//Asociar el listener con el item
        this.setVisible(true);//hacer visible
    }
    
    public void crearElementos(){
        crearBoton();//metodo
        crearCajaTexto();
        crearLabel();
    }
    public void crearBoton(){
        bt01 =  new Button("Pulsar aquí"); //Crear boton
        bt01.setBounds(640,360,100,30); //Posicion y tamaño desde esquina sup izq de la ventana
        this.add(bt01); //Añade el boton 
    }
    
    public void crearCajaTexto(){
        tf01 = new TextField();
        tf01.setBounds(640, 320, 100, 30);
        this.add(tf01);
    }
    
    public void crearLabel(){
        lb01=new Label("hola");
        lb01.setBounds(640, 400, 100, 30);
        this.add(lb01);
    }
}
