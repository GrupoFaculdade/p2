/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasseNegocios;

import ClasseBasica.ItensNota;
import ClasseBasica.ItensNotaException;
import ClasseDados.DadositensNota;
import ClasseDados.InterfaceIntensNota;
import java.sql.SQLException;
import java.util.ArrayList;



/**
 *
 * @author NeGo
 */
public class NegociosItensNota implements InterfaceIntensNota{
    
    
    DadositensNota dados;
    
    public NegociosItensNota(){
        dados = new DadositensNota();
        
    }

   @Override
    
    public void cadastarIntNota(ItensNota intensNot) throws ClassNotFoundException, SQLException,Exception {
        dados.cadastarIntNota(intensNot);
  if(intensNot.getQtdComprada()<=0){
      throw new ItensNotaException("Quantidade Comprada nao pode ser menor ou igual zero");
  }
        
  if(intensNot.getValorUnit()<0){
       throw new ItensNotaException(" Valor unitario Não poder ser Zero");
        
    }
  if(intensNot.getProduto().getCodProduto()<0){
      throw new ItensNotaException(" o Codigo do Produto não Pode ser menor que zero");
      
  }
 
   
    }

    @Override
    public void alterarIntNota(ItensNota intensNot) throws ClassNotFoundException, SQLException, Exception {
       dados.alterarIntNota(intensNot );
  
            
  if(intensNot.getQtdComprada()<=0){
      throw new ItensNotaException("Quantidade Comprada nao pode ser menor ou igual zero");
  }
        
  if(intensNot.getValorUnit()<0){
       throw new ItensNotaException(" Valor unitario Não poder ser Zero");
        
    }
  if(intensNot.getProduto().getCodProduto()<0){
      throw new ItensNotaException(" o Codigo do Produto não Pode ser menor que zero");
      
  }
       
    }

    @Override
    public void removerIntNota(ItensNota intensNot) throws ClassNotFoundException, SQLException,Exception {
       dados.removerIntNota(intensNot);
       
         if(intensNot.getQtdComprada()<=0){
      throw new ItensNotaException("Quantidade Comprada nao pode ser menor ou igual zero");
  }
        
  if(intensNot.getValorUnit()<0){
       throw new ItensNotaException(" Valor unitario Não poder ser Zero");
        
    }
  if(intensNot.getProduto().getCodProduto()<0){
      throw new ItensNotaException(" o Codigo do Produto não Pode ser menor que zero");
      
  }
       

       
    }

    @Override
    public ArrayList<ItensNota> listarIntNota(ItensNota intensNot) throws ClassNotFoundException, SQLException,Exception {
        
          

  return dados.listarIntNota(intensNot);
     
    }
    
}
