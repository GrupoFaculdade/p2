/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import ClasseBasica.CamadaBanco;
import ClasseBasica.NotaFiscalException;
import ClasseBasica.Notaf;
import ClasseDados.DadosNotaf;
import ClasseDados.InterfaceNotaFiscal;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author João
 */
public class NegocioNotaFiscal implements InterfaceNotaFiscal {
    private CamadaBanco banco;
    private PreparedStatement stmt;
    private DadosNotaf dados;
    public NegocioNotaFiscal(){
         banco = new CamadaBanco();
       }
    
    
    @Override
    public void listaNotaFiscal(int codNotaFiscal) throws ClassNotFoundException, SQLException {
        dados.listaNotaFiscal(codNotaFiscal);
    }

    @Override
    public void RemoverNotaFiscal(int codNotaFiscal) throws ClassNotFoundException, SQLException, NotaFiscalException {
        if(codNotaFiscal <= 0){
            throw new NotaFiscalException("O codigo da nota fiscal nao pode ser menor ou igual a zero");
        }
                 
    }

    @Override
    public void alterNotaFiscal(int codNotaFiscal, Notaf notaf) throws ClassNotFoundException, SQLException {
    
    }
   public void existe(int codNotaFiscal) throws  ClassNotFoundException, SQLException{
     stmt = banco.conectar().prepareStatement("SELECT * FROM Nf where codNF = ?");
     stmt.setInt(1, codNotaFiscal);
       
   }
}
