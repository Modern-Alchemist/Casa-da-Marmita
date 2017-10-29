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
public class Pedido {
    
    int idMarmitex;
    private String nome;
    private float preco;

     public void setIdMarmitex(int novo) {
        idMarmitex = novo;
    }
     
     public void setNome(String novo){
         nome = novo;
     }
     
     public void setPreco(float novo){
         preco = novo;
     }

    public int getIdMarmitex() {
        return idMarmitex;
    }    
    
    public String getNome() {
        return nome;
    }   
    
    public float getPreco() {
        return preco;
    }   
}
