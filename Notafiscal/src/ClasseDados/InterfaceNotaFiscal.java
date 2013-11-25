/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasseDados;

import ClasseBasica.NotaFiscalException;
import ClasseBasica.Notaf;
import java.sql.SQLException;

/**
 *
 * @author NeGo
 */
public interface InterfaceNotaFiscal {
    public void listaNotaFiscal(int codNotaFiscal) throws ClassNotFoundException, SQLException, NotaFiscalException;
    public void RemoverNotaFiscal(int codNotaFiscal)throws ClassNotFoundException, SQLException, NotaFiscalException;
    public void alterNotaFiscal(int NotaFiscal, Notaf notaf)throws ClassNotFoundException, SQLException, NotaFiscalException;
}
