/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasseBasica;

/**
 *
 * @author NeGo
 */
public class ItensNota {
    
   private double valorUnit;
    private int qtdComprada;
      private Produto produto;
      private Notaf notaf;
      

    /**
     * @return the valorUnit
     */
    public double getValorUnit() {
        return valorUnit;
    }

    /**
     * @param valorUnit the valorUnit to set
     */
    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }

    /**
     * @return the qtdComprada
     */
    public int getQtdComprada() {
        return qtdComprada;
    }

    /**
     * @param qtdComprada the qtdComprada to set
     */
    public void setQtdComprada(int qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the notaf
     */
    public Notaf getNotaf() {
        return notaf;
    }

    /**
     * @param notaf the notaf to set
     */
    public void setNotaf(Notaf notaf) {
        this.notaf = notaf;
    }
    
}
