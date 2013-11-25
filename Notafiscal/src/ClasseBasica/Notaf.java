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
public class Notaf {
    
    private String valorTotal;
    private String dataNotafiscal;
    private int codNotaFiscal;
    private Cliente cli;
    private Funcionario func;

    /**
     * @return the valorTotal
     */
    public String getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the dataNotafiscal
     */
    public String getDataNotafiscal() {
        return dataNotafiscal;
    }

    /**
     * @param dataNotafiscal the dataNotafiscal to set
     */
    public void setDataNotafiscal(String dataNotafiscal) {
        this.dataNotafiscal = dataNotafiscal;
    }

    /**
     * @return the codNotaFiscal
     */
    public int getCodNotaFiscal() {
        return codNotaFiscal;
    }

    /**
     * @param codNotaFiscal the codNotaFiscal to set
     */
    public void setCodNotaFiscal(int codNotaFiscal) {
        this.codNotaFiscal = codNotaFiscal;
    }

    /**
     * @return the cli
     */
    public Cliente getCli() {
        return cli;
    }

    /**
     * @param cli the cli to set
     */
    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    /**
     * @return the func
     */
    public Funcionario getFunc() {
        return func;
    }

    /**
     * @param func the func to set
     */
    public void setFunc(Funcionario func) {
        this.func = func;
    }
}
   