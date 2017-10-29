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
    private float precoUnitario;
    private float precoTotal;

     public void setIdMarmitex(int novo) {
        idMarmitex = novo;
    }
     
     public void setNome(String novo){
         nome = novo;
     }
     
     public void setPrecoUnitario(float novo){
         precoUnitario = novo;
     }
     
     public void setPrecoTotal(float novo){
         precoTotal = novo;
     }

    public int getIdMarmitex() {
        return idMarmitex;
    }    
    
    public String getNome() {
        return nome;
    }   
    
    public float getPrecoUnitario() {
        return precoUnitario;
    }   
    
    public float getPrecoTotal() {
        return precoTotal;
    } 
}
