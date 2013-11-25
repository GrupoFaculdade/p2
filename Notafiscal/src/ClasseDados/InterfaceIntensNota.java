/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasseDados;

import ClasseBasica.ItensNota;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author NeGo
 */
public interface InterfaceIntensNota {
    
    public void cadastarIntNota( ItensNota cadastarIntN) throws ClassNotFoundException,SQLException,Exception;
    public void alterarIntNota(ItensNota alterarIntN) throws ClassNotFoundException,SQLException,Exception;
    public void removerIntNota(ItensNota removerIntN) throws ClassNotFoundException,SQLException,Exception;
    public ArrayList<ItensNota> listarIntNota(ItensNota listaIntN) throws ClassNotFoundException,SQLException,Exception;
}
