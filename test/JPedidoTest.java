/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import casadamarmita.jPedido;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *
 * @author a16041967
 */
public class JPedidoTest {
    
    public JPedidoTest(){}
    
    @Test
    public void deveriaRetornar1aoReceber1(){
        int esperado = 1;
        int retornado;
        jPedido pedido = new jPedido();
        retornado = pedido.jPedido(esperado);
        assertEquals(esperado,retornado);
        
    }
}
