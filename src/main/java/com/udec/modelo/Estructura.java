package com.udec.modelo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Michael Cardenas
 * clase modelo que contiene toda la logica
 */
public class Estructura {
    
    /**
     * variable que regista el correo
     */
    private String nombres;
    /**
     * expresion regular para validar que el formato de correo es correcto
     */
    private String patronCorrecto = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    /**
     * constructor vacio de la clase
     */
    public Estructura(){
    }
    
    /**
     * valida que lo ingresado sea un correo correcto
     * @return un true si es correcto false si no lo es
     */
    public boolean validarIngresos(){
        Pattern pattern = Pattern.compile(patronCorrecto);
        Matcher matcher = pattern.matcher(nombres);        
        boolean resultado = matcher.matches();
        return resultado;
    }
    
   
    /**
     * metodos publicos 
     * @return 
     */
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPatronCorrecto() {
        return patronCorrecto;
    }

    public void setPatronCorrecto(String patronCorrecto) {
        this.patronCorrecto = patronCorrecto;
    }
    
    
}
