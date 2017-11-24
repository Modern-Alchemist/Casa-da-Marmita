
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
    private float qtde1; 
    private float qtde2; 
    private float qtde3;
    
    private boolean arroz;
    private boolean feijao;
    private boolean carne;
    private String tamanho;
    private int quantidade;
    private float valor;


     public void setIdMarmitex(int novo) {
        idMarmitex = novo;
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
    
    public float getQtde1() {
        return qtde1;
    }    
    
    public float getQtde2() {
        return qtde2;
    }    
    
    public float getQtde3() {
        return qtde3;
    }
    
    public float calculaSubTotal(String tamanho, int quant) {
        if (tamanho.equals("Grande")) {
            valor = ((12 * quant));
        }
        if (tamanho.equals("Media")) {
            valor = ((10 * quant));
        }
        if (tamanho.equals("Pequeno")) {
            valor = ((7 * quant));
        }
        return valor;
    }

    public String listaPedido() {
        String pedido = "";
        if (arroz == true) {
            pedido = pedido + "Arroz, ";
        }
        if (feijao == true) {
            pedido = pedido + "Feijao, ";
        }
        if (carne == true) {
            pedido = pedido + "Carne " ;
        }
        return pedido;
    }

    public float calculaTotal(float subtotal) {
        float total = 0;

        total = subtotal + 5;

        return total;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setArroz(boolean arroz) {
        this.arroz = arroz;
    }

    public void setFeijao(boolean feijao) {
        this.feijao = feijao;
    }

    public void setCarne(boolean carne) {
        this.carne = carne;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isArroz() {
        return arroz;
    }

    public boolean isFeijao() {
        return feijao;
    }

    public boolean isCarne() {
        return carne;
    }

    public String getTamanho() {
        return tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    
}

