/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FachadaNota;

import ClasseBasica.ItensNota;
import ClasseBasica.NotaFiscalException;
import ClasseBasica.Notaf;
import ClasseBasica.Produto;
import ClasseDados.InterfaceIntensNota;
import ClasseDados.InterfaceNotaFiscal;
import ClasseDados.InterfaceProduto;
import ClasseNegocios.NegociosItensNota;
import ClasseNegocios.NegociosProduto;
import Negocio.NegocioNotaFiscal;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author NeGo
 */
public class Fachada implements InterfaceIntensNota,InterfaceNotaFiscal,InterfaceProduto {

    NegocioNotaFiscal nota;
    NegociosProduto prod;
    NegociosItensNota itensN;
    
    public Fachada(){
        nota = new NegocioNotaFiscal();
        prod = new NegociosProduto();
        itensN = new NegociosItensNota();
    }
    
    @Override
    public void cadastarIntNota(ItensNota cadastarIntN) throws ClassNotFoundException, SQLException, Exception {
       itensN.alterarIntNota(cadastarIntN);
    }

    @Override
    public void alterarIntNota(ItensNota alterarIntN) throws ClassNotFoundException, SQLException, Exception {
        
    }

    @Override
    public void removerIntNota(ItensNota removerIntN) throws ClassNotFoundException, SQLException, Exception {
        
    }

    @Override
    public ArrayList<ItensNota> listarIntNota(ItensNota listaIntN) throws ClassNotFoundException, SQLException, Exception {
        
        
    }

    @Override
    public void listaNotaFiscal(int codNotaFiscal) throws ClassNotFoundException, SQLException, NotaFiscalException {
        
    }

    @Override
    public void RemoverNotaFiscal(int codNotaFiscal) throws ClassNotFoundException, SQLException, NotaFiscalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterNotaFiscal(int NotaFiscal, Notaf notaf) throws ClassNotFoundException, SQLException, NotaFiscalException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cadastrarProd(Produto prod) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterarProd(int p, Produto prod) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerProd(int prod) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Produto> listarProd(String listProd) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
