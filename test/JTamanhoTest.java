/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import casadamarmita.jTamanho;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;
/**
 *
 * @author a16041967
 */
public class JTamanhoTest {
            
    public JTamanhoTest(){}
    
    @Test
    public void deveriaRetornar1aoReceber1(){
        int esperado = 1;
        int retornado;
        jTamanho tamanho = new jTamanho();
        retornado = tamanho.jTamanho(esperado);
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarMetodoTesteAoReceberMetodoTeste(){
        String[] esperado = null;
        String retornado;
        jTamanho tamanho = new jTamanho();
        retornado = tamanho.Teste(esperado);
        assertNull(retornado);
        
    } 
}
