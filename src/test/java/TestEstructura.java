/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.corba.se.impl.util.PackagePrefixChecker;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.udec.modelo.Estructura;

/**
 *
 * @author Michael Cardenas
 */
public class TestEstructura {
   
    public TestEstructura() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testValidarIngresos(){
         Estructura logica = new Estructura();
         String correovalido = "ejemplo2_21@gmail.com";
         logica.setNombres(correovalido);
         boolean resultado = logica.validarIngresos();
         assertEquals(true,resultado);
    }
}
