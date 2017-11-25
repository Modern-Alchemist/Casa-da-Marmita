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
import casadamarmita.Pedido;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PedidoTest {
    
    public PedidoTest(){}
    
    
    @Test
    public void deveriaRetornarSubTotalAoReceberTamanhoEQuant(){
        String tamanho = "Grande";
        int quant = 3;
        float esperado = 12 * quant;
        float retornado;
        float delta = 0;
        Pedido pedido = new Pedido();
        retornado = pedido.calculaSubTotal(tamanho, quant);
        assertEquals(esperado,retornado,delta);
        
    }
    
    @Test
    public void deveriaRetornarSubTotal2AoReceberTamanho2EQuant2(){
        String tamanho = "Media";
        int quant = 3;
        float esperado = 10 * quant;
        float retornado;
        float delta = 0;
        Pedido pedido = new Pedido();
        retornado = pedido.calculaSubTotal(tamanho, quant);
        assertEquals(esperado,retornado,delta);
        
    }
    
    @Test
    public void deveriaRetornarSubTotal3AoReceberTamanho3EQuant3(){
        String tamanho = "Pequeno";
        int quant = 3;
        float esperado = 7 * quant;
        float retornado;
        float delta = 0;
        Pedido pedido = new Pedido();
        retornado = pedido.calculaSubTotal(tamanho, quant);
        assertEquals(esperado,retornado,delta);
        
    }
    
    @Test
    public void deveriaRetornarTotalAoReceberSubTotal(){
        float subTotal = 55; 
        float esperado = subTotal + 5;
        float retornado;
        float delta = 0;
        Pedido pedido = new Pedido();
        retornado = pedido.calculaTotal(subTotal);
        assertEquals(esperado,retornado,delta);
        
    }
    
    @Test
    public void deveriaRetornarValorAoReceberValor(){
        float esperado = 50;
        float retornado;
        float delta = 0;
        Pedido pedido = new Pedido();
        pedido.setValor(50);
        retornado = pedido.getValor();
        assertEquals(esperado,retornado,delta);
        
    }
    
    @Test
    public void deveriaRetornarTamanhoAoReceberTamanho(){
        String esperado = "Grande";
        String retornado;
        Pedido pedido = new Pedido();
        pedido.setTamanho("Grande");
        retornado = pedido.getTamanho();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarQuantidadeAoReceberQuantidade(){
        int esperado = 3;
        int retornado;
        Pedido pedido = new Pedido();
        pedido.setQuantidade(3);
        retornado = pedido.getQuantidade();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarArrozAoReceberArroz(){
        boolean esperado = true;
        boolean retornado;
        Pedido pedido = new Pedido();
        pedido.setArroz(true);
        retornado = pedido.isArroz();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarFeijaoAoReceberFeijao(){
        boolean esperado = true;
        boolean retornado;
        Pedido pedido = new Pedido();
        pedido.setFeijao(true);
        retornado = pedido.isFeijao();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarCarneAoReceberCarne(){
        boolean esperado = true;
        boolean retornado;
        Pedido pedido = new Pedido();
        pedido.setCarne(true);
        retornado = pedido.isCarne();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarMacarraoAoReceberMacarrao(){
        boolean esperado = true;
        boolean retornado;
        Pedido pedido = new Pedido();
        pedido.setMacarrao(true);
        retornado = pedido.isMacarrao();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarBatataFritaAoReceberBatataFrita(){
        boolean esperado = true;
        boolean retornado;
        Pedido pedido = new Pedido();
        pedido.setBatata_frita(true);
        retornado = pedido.isBatata_frita();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarLegumesAoReceberLegumes(){
        boolean esperado = true;
        boolean retornado;
        Pedido pedido = new Pedido();
        pedido.setLegumes(true);
        retornado = pedido.isLegumes();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarLasanhaAoReceberLasanha(){
        boolean esperado = true;
        boolean retornado;
        Pedido pedido = new Pedido();
        pedido.setLasanha(true);
        retornado = pedido.isLasanha();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarOvoFritoAoReceberOvoFrito(){
        boolean esperado = true;
        boolean retornado;
        Pedido pedido = new Pedido();
        pedido.setOvo_frito(true);
        retornado = pedido.isOvo_frito();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarTorresmoAoReceberTorresmo(){
        boolean esperado = true;
        boolean retornado;
        Pedido pedido = new Pedido();
        pedido.setTorresmo(true);
        retornado = pedido.isTorresmo();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarListaPedidoAoReceberListaPedido(){
        String esperado = "Arroz, " ;
        String retornado;
        Pedido pedido = new Pedido();
        pedido.setArroz(true);
        retornado = pedido.listaPedido();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarListaPedido2AoReceberListaPedido2(){
        String esperado = "Feijao, " ;
        String retornado;
        Pedido pedido = new Pedido();
        pedido.setFeijao(true);
        retornado = pedido.listaPedido();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarListaPedido3AoReceberListaPedido3(){
        String esperado = "Carne, " ;
        String retornado;
        Pedido pedido = new Pedido();
        pedido.setCarne(true);
        retornado = pedido.listaPedido();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarListaPedido4AoReceberListaPedido4(){
        String esperado = "Macarrao, " ;
        String retornado;
        Pedido pedido = new Pedido();
        pedido.setMacarrao(true);
        retornado = pedido.listaPedido();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarListaPedido5AoReceberListaPedido5(){
        String esperado = "Batata Frita, " ;
        String retornado;
        Pedido pedido = new Pedido();
        pedido.setBatata_frita(true);
        retornado = pedido.listaPedido();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarListaPedido6AoReceberListaPedido6(){
        String esperado = "Legumes, " ;
        String retornado;
        Pedido pedido = new Pedido();
        pedido.setLegumes(true);
        retornado = pedido.listaPedido();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarListaPedido7AoReceberListaPedido7(){
        String esperado = "Lasanha, " ;
        String retornado;
        Pedido pedido = new Pedido();
        pedido.setLasanha(true);
        retornado = pedido.listaPedido();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarListaPedido8AoReceberListaPedido8(){
        String esperado = "Ovo Frito, " ;
        String retornado;
        Pedido pedido = new Pedido();
        pedido.setOvo_frito(true);
        retornado = pedido.listaPedido();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarListaPedido9AoReceberListaPedido9(){
        String esperado = "Torresmo, " ;
        String retornado;
        Pedido pedido = new Pedido();
        pedido.setTorresmo(true);
        retornado = pedido.listaPedido();
        assertEquals(esperado,retornado);
        
    }
    
    
}
