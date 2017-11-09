/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

import javax.swing.*;//Importamos TODO de swing
import java.awt.*;
/**
 *
 * @author LC22
 */
public class Ventana1 extends JFrame
{
    
    JPanel panel;
    JLabel label;
    JTextField text;
    JButton boton;
    JCheckBox caja;
    JRadioButton radio;
    
    
    public Ventana1() 
    {
      
        panel = new JPanel();
        label = new JLabel();
        text = new JTextField(20);
        boton = new JButton();
        caja = new JCheckBox();
        radio = new JRadioButton();
        
        
        
        this.add(panel);
        panel.add(label);
        panel.add(text);
        panel.add(boton);
        panel.add(caja);
        panel.add(radio);
      
        
        label.setText("Nombre");
        boton.setText("Enviar");
        panel.setBackground(Color.orange);
        
    }
    
}
