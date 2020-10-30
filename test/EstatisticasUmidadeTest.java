/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static junit.framework.TestCase.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author wesle
 */
public class EstatisticasUmidadeTest {
    
    public EstatisticasUmidadeTest() {
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

    /**
     * Test of setValor method, of class EstatisticasUmidade.
     */
    @Test
    public void testSetValor() {
      // Não há valor de retorno
    }

    /**
     * Test of media method, of class EstatisticasUmidade.
     */
    @Test
    public void testMedia() {
        EstatisticasUmidade e = new EstatisticasUmidade();
        e.setValor(5.2);
        e.setValor(7.0);
        e.setValor(1.3);
        e.setValor(6);
        e.setValor(0.87);
        //4,074
        double result = e.desvioPadrao(5);
        assertEquals("Erro de calculo de apenas uma amostra", 2.80622, result, 0.01);
    }

    /**
     * Test of desvioPadrao method, of class EstatisticasUmidade.
     */
    @Test
    public void testDesvioPadrao() {
        EstatisticasUmidade e = new EstatisticasUmidade();
        e.setValor(5.2);
        e.setValor(7.0);
        e.setValor(1.3);
        e.setValor(6);
        e.setValor(0.87);
        //2,80622
        double result = e.media(1);
        assertEquals("Erro de calculo de apenas uma amostra", 0, result, 0.01);
    }
    
}
