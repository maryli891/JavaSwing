/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;
import grafica.Ventana1;//Import paquete.clase
import javax.swing.JFrame;

/**
 *
 * @author LC22
 */
public class JavaSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
        
        Ventana1 ventana = new Ventana1();// Creo un objeto TIPO Window
        ventana.setVisible(true);
        ventana.setBounds(0, 0, 600, 600);
        //La  siguiente intruccion le pone el nombre a la ventana
        ventana.setTitle("Mi primer Interfaz Grafica");
        //La siguiente sentencia es para finalizar el proyecto al cerrar la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
