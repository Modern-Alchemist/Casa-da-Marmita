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
    private double precoUnitario;
    private double precoTotal;

     public void setIdMarmitex(int novo) {
        idMarmitex = novo;
    }
     
     public void setNome(String novo){
         nome = novo;
     }
     
     public void setPrecoUnitario(double novo){
         precoUnitario = novo;
     }
     
     public void setPrecoTotal(double novo1, double novo2){
         double resultado = novo1 + novo2;
         precoTotal = resultado;
     }

    public int getIdMarmitex() {
        return idMarmitex;
    }    
    
    public String getNome() {
        return nome;
    }   
    
    public double getPrecoUnitario() {
        return precoUnitario;
    }   
    
    public double getPrecoTotal() {
        return precoTotal;
    } 
}
