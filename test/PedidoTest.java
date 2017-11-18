/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import casadamarmita.Pedido;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *
 * @author YURI
 */
public class PedidoTest {
    
    public PedidoTest(){}
    
    
    @Test
    public void deveriaRetornarNomeAoReceberNome(){
        String esperado = "Nome";
        String retornado;
        Pedido pedido = new Pedido();
        pedido.setNome("Nome");
        retornado = pedido.getNome();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarIdMarmitexIgualA01AoReceber01(){
        Integer esperado = 01;
        Integer retornado;
        Pedido pedido = new Pedido();
        pedido.setIdMarmitex(01);
        retornado = pedido.getIdMarmitex();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarPrecoUnitarioIgualA50AoReceber50(){
        double esperado = 50.0;
        double retornado;
        double delta = 0;
        Pedido pedido = new Pedido();
        pedido.setPrecoUnitario(50.0);
        retornado = pedido.getPrecoUnitario();
        assertEquals(esperado,retornado,delta);
        
    }
    
    @Test
    public void deveriaRetornarPrecoTotalIgualA100AoReceber50e50(){
        double esperado = 100.0;
        double retornado;
        double delta = 0;
        Pedido pedido = new Pedido();
        pedido.setPrecoTotal(50.0,50.0);
        retornado = pedido.getPrecoTotal();
        assertEquals(esperado,retornado,delta);
        
    }
}
