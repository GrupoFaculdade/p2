/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasseDados;

import ClasseBasica.Produto;
import java.sql.SQLException;
import java.util.ArrayList;





/**
 *
 * @author NeGo
 */
public interface InterfaceProduto {
    
    public void cadastrarProd(Produto prod) throws ClassNotFoundException,SQLException ;   
    public void alterarProd(int p, Produto prod)throws ClassNotFoundException,SQLException ;
    public void removerProd(int prod )throws ClassNotFoundException,SQLException ;
    public ArrayList<Produto> listarProd(String listProd)throws ClassNotFoundException,SQLException ;
    
}