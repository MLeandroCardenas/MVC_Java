/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.controlador;
import com.udec.vista.Ventana;
import com.udec.modelo.Estructura;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 *
 * @author Michael Cardenas
 * clase que maneja los eventos de las vistas
 */
public class Eventos implements ActionListener{
    private Estructura modelo;
    private Ventana vista;
    
    /**
     * constructor que recibe el modelo y la vista para servir de intermediario
     * @param modelo
     * @param vista 
     */
    public Eventos(Estructura modelo, Ventana vista){
        this.vista = vista;
        this.modelo = modelo;
        this.vista.getAñadir().addActionListener(this);
    }
    
    /**
     * inicia la parte grafica
     */
    public void iniciar(){
        vista.setTitle("Grafica Usuarios");
        vista.setLocationRelativeTo(null);
        vista.setResizable(false);
        vista.setVisible(true);
    }

    /**
     * evento especializado que captura la accion del boton
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setNombres(vista.getNombre().getText());
        boolean resultado = modelo.validarIngresos();
        if(resultado==true){
            vista.getUsers().addElement(modelo.getNombres());
            vista.getNombre().setText("");
        }else{
            vista.mensaje("CORREO NO VALIDO");
        }
    }
}