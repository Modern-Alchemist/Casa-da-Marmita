package casadamarmita;

/**
 *
 * @author felipeborges
 */
public class Pedido {

    private boolean arroz;
    private boolean feijao;
    private boolean carne;
    private boolean macarrao;
    private boolean batata_frita;
    private boolean legumes;
    private boolean lasanha;
    private boolean ovo_frito;
    private boolean torresmo;
    private String tamanho;
    private int quantidade;
    private float valor;

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
        if (macarrao == true) {
            pedido = pedido + "Macarrao, ";
        }
        if (batata_frita == true) {
            pedido = pedido + "Batata Frita, ";
        }
        if (legumes == true) {
            pedido = pedido + "Legumes, ";
        }
        if (lasanha == true) {
            pedido = pedido + "Lasanha, ";
        }
        if (ovo_frito == true) {
            pedido = pedido + "Ovo Frito, ";
        }
        if (torresmo == true) {
            pedido = pedido + "Torresmo, ";
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
    
    public void setMacarrao(boolean macarrao) {
        this.macarrao = macarrao;
    }
    
    public void setBatata_frita(boolean batata_frita) {
        this.batata_frita = batata_frita;
    }
    
    public void setLegumes(boolean legumes) {
        this.legumes = legumes;
    }
    
    public void setLasanha(boolean lasanha) {
        this.lasanha = lasanha;
    }
    
    public void setOvo_frito(boolean ovo_frito) {
        this.ovo_frito = ovo_frito;
    }
    
    public void setTorresmo(boolean torresmo) {
        this.torresmo = torresmo;
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

    public boolean isMacarrao() {
        return macarrao;
    }
    
    public boolean isBatata_frita() {
        return batata_frita;
    }
    
    public boolean isLegumes() {
        return legumes;
    }
    
    public boolean isLasanha() {
        return lasanha;
    }
    
    public boolean isOvo_frito() {
        return ovo_frito;
    }
    
    public boolean isTorresmo() {
        return torresmo;
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
