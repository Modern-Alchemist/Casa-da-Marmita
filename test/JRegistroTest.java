/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import casadamarmita.jRegistro ;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;
/**
 *
 * @author YURI
 */
public class JRegistroTest {
    
    public JRegistroTest(){}
    
    @Test
    public void deveriaRetornar1aoReceber1(){
        int esperado = 1;
        int retornado;
        jRegistro registrar = new jRegistro();
        retornado = registrar.jRegistro(esperado);
        assertEquals(esperado,retornado);
        
    }

    @Test
    public void deveriaRetornarMetodoTesteAoReceberMetodoTeste(){
        String[] esperado = null;
        String retornado;
        jRegistro registrar= new jRegistro();
        retornado = registrar.Teste(esperado);
        assertNull(retornado);
        
    }    
}
