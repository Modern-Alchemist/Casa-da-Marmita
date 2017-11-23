/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import casadamarmita.jPrincipal;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;
/**
 *
 * @author a16041967
 */
public class JPrincipalTest {
        
    public JPrincipalTest(){}
    
    @Test
    public void deveriaRetornar1aoReceber1(){
        int esperado = 1;
        int retornado;
        jPrincipal principal = new jPrincipal();
        retornado = principal.jPrincipal(esperado);
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarMetodoTesteAoReceberMetodoTeste(){
        String[] esperado = null;
        String retornado;
        jPrincipal principal= new jPrincipal();
        retornado = principal.Teste(esperado);
        assertNull(retornado);
        
    }
}
