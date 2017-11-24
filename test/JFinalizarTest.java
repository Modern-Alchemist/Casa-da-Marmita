/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import casadamarmita.jFinalizar;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;
/**
 *
 * @author a16041967
 */
public class JFinalizarTest {
    
    public JFinalizarTest(){}
    
    @Test
    public void deveriaRetornar1aoReceber1(){
        int esperado = 1;
        int retornado;
        jFinalizar finalizar = new jFinalizar();
        retornado = finalizar.jFinalizar(esperado);
        assertEquals(esperado,retornado);
        
    }

    
    @Test
    public void deveriaRetornarMetodoTesteAoReceberMetodoTeste(){
        String[] esperado = null;
        String retornado;
        jFinalizar finalizar = new jFinalizar();
        retornado = finalizar.Teste(esperado);
        assertNull(retornado);
        
    }
    
    /*
    @Test
    public void deveriaRetornarNotNullAoReceberValorQualquer(){
        String[] esperado = null;
        String retornado;
        jFinalizar finalizar = new jFinalizar();
        retornado = finalizar.main(esperado);
        assertNull(retornado);
        
    }*/

}
