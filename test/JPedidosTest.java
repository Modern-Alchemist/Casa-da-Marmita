/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import casadamarmita.jPedidos;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;
/**
 *
 * @author YURI
 */
public class JPedidosTest {
    
    public JPedidosTest(){}
    
    @Test
    public void deveriaRetornar1aoReceber1(){
        int esperado = 1;
        int retornado;
        jPedidos pedidos = new jPedidos();
        retornado = pedidos.jPedidos(esperado);
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarMetodoTesteAoReceberMetodoTeste(){
        String[] esperado = null;
        String retornado;
        jPedidos pedidos= new jPedidos();
        retornado = pedidos.Teste(esperado);
        assertNull(retornado);
        
    }
}
