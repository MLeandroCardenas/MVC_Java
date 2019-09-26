/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.mvc;
import com.udec.modelo.Estructura;
import com.udec.vista.Ventana;
import com.udec.controlador.Eventos;
/**
 *
 * @author Michael Cardenas
 * Clase por donde arranca el programa
 */
public class main {
    /**
     *  metodo que crea las instancias y llama al metodo que arranca 
     * @param args 
     */
    public static void main(String[] args){
        Estructura modelo = new Estructura();
        Ventana vista = new Ventana();
        Eventos controlador = new Eventos(modelo,vista);
        controlador.iniciar();
    }
}
