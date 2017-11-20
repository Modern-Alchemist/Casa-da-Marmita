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
import casadamarmita.Cadastro;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CadastroTest {
    
    public CadastroTest(){}
    
    
    @Test
    public void deveriaRetornarNomeAoReceberNome(){
        String esperado = "Nome";
        String retornado;
        Cadastro cadastro = new Cadastro();
        cadastro.setNome("Nome");
        retornado = cadastro.getNome();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarRuaAoReceberRua(){
        String esperado = "Rua";
        String retornado;
        Cadastro cadastro = new Cadastro();
        cadastro.setLogradouro("Rua");
        retornado = cadastro.getLogradouro();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornar471AoReceber471(){
        Integer esperado = 471;
        Integer retornado;
        Cadastro cadastro = new Cadastro();
        cadastro.setNumero(471);
        retornado = cadastro.getNumero();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarComplementoAoReceberComplemento(){
        String esperado = "Complemento";
        String retornado;
        Cadastro cadastro = new Cadastro();
        cadastro.setComplemento("Complemento");
        retornado = cadastro.getComplemento();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarBairroAoReceberBairro(){
        String esperado = "Bairro";
        String retornado;
        Cadastro cadastro = new Cadastro();
        cadastro.setBairro("Bairro");
        retornado = cadastro.getBairro();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarCidadeAoReceberCidade(){
        String esperado = "Cidade";
        String retornado;
        Cadastro cadastro = new Cadastro();
        cadastro.setCidade("Cidade");
        retornado = cadastro.getCidade();
        assertEquals(esperado,retornado);
        
    }
    
    @Test
    public void deveriaRetornarUFAoReceberUF(){
        String esperado = "UF";
        String retornado;
        Cadastro cadastro = new Cadastro();
        cadastro.setUf("UF");
        retornado = cadastro.getUf();
        assertEquals(esperado,retornado);
        
    }
    
}
