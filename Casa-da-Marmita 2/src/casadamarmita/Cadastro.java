/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casadamarmita;

/**
 *
 * @author Luiz
 */
public class Cadastro {

    private String nome;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    
    public void setNumero(int novo) {
        numero = novo;
    }
    public void setNome(String novo) {
        nome = novo;
    }
    
    public void setLogradouro(String novo) {
        logradouro = novo;
    }
    
    public void setComplemento(String novo) {
        complemento = novo;
    }

        
    public void setCidade(String novo) {
        cidade = novo;
    }
    
    public void setUf(String novo) {
        uf = novo;
    }
    
    public void setBairro(String novo){
        bairro = novo;
    }
    
    public String getBairro(){
        return bairro;
    }
    
    public int getNumero() {
        return numero;
    } 
    
    public String getNome() {
        return nome;
    }
    
    public String getLogradouro() {
        return logradouro;
    }
    
    public String getComplemento() {
        return complemento;
    }
    
    public String getCidade() {
        return cidade;
    }
    
    public String getUf() {
        return uf;
    }
    
}
