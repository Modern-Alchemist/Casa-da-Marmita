
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
    private float qtde1; 
    private float qtde2; 
    private float qtde3;


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
     
     public void setQtde1(float novo) {
        qtde1 = novo;
    }
     
     public void setQtde2(float novo) {
        qtde2 = novo;
    }
     
     public void setQtde3(float novo) {
        qtde3 = novo;
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
    
    public float getQtde1() {
        return qtde1;
    }    
    
    public float getQtde2() {
        return qtde2;
    }    
    
    public float getQtde3() {
        return qtde3;
    }

    
}

