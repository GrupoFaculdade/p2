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
public class NotaFiscalProduto {
    
    private Produto produto;
    private Notaf nf;
    private int qtdComprada;
    private double valorUnitario;

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
     * @return the nf
     */
    public Notaf getNf() {
        return nf;
    }

    /**
     * @param nf the nf to set
     */
    public void setNf(Notaf nf) {
        this.nf = nf;
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
     * @return the valorUnitario
     */
    public double getValorUnitario() {
        return valorUnitario;
    }

    /**
     * @param valorUnitario the valorUnitario to set
     */
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    
}
