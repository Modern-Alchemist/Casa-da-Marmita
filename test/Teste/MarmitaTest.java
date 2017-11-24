/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

/**
 *
 * @author YURI
 */
import casadamarmita.CasaDaMarmita;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class MarmitaTest {
    
     public MarmitaTest(){}
    
    
    @Test
    public void deveriaRetornarNomeAoReceberNome(){
        String esperado = "Nome";
        String retornado = "Nome";
        CasaDaMarmita marmita = new CasaDaMarmita();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarMetodoTesteAoReceberMetodoTeste(){
        String[] esperado = null;
        String retornado;
        CasaDaMarmita marmita= new CasaDaMarmita();
        retornado = marmita.Teste(esperado);
        assertNull(retornado);
        
    }
}
