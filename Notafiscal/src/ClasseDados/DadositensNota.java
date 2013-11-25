/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasseDados;

import ClasseBasica.CamadaBanco;
import ClasseBasica.ItensNota;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author NeGo
 */
public class DadositensNota  implements InterfaceIntensNota{

    CamadaBanco banco;
    private PreparedStatement stmt;
    
    public DadositensNota(){
        banco= new CamadaBanco();
    
}
    
    //(valorUnit decimal(10,2), qtdComprada int, codProduto int references produto(codProduto),codNf int references Nf(codNf));
    
    @Override
    public void cadastarIntNota(ItensNota intensNot) throws ClassNotFoundException, SQLException {
        stmt = banco.conectar().prepareStatement("INSERT INTO  itensNota values(?,?,?)");
        stmt.setDouble(1,intensNot.getValorUnit() );
        stmt.setInt(2, intensNot.getQtdComprada());
        stmt.setInt(3, intensNot.getProduto().getCodProduto());
        stmt.execute();
         banco.desconectar();
        
    }

    @Override
    public void alterarIntNota(ItensNota intensNot) throws ClassNotFoundException, SQLException {
        
        stmt = banco.conectar().prepareStatement("update ItensNota set valorUnit=?,qtdComprada=? where codProduto=? and codNotaFiscal=?");
        stmt.setDouble(1,intensNot.getValorUnit() );
        stmt.setInt(2, intensNot.getQtdComprada());
        stmt.setInt(3, intensNot.getProduto().getCodProduto());
        stmt.setInt(4,intensNot.getNotaf().getCodNotaFiscal());
        stmt.executeUpdate();
         banco.desconectar();
    }

    @Override
    public void removerIntNota(ItensNota intensNot) throws ClassNotFoundException, SQLException {
        stmt = banco.conectar().prepareStatement("delete from itensNota where codProduto=?");
        stmt.setInt(3, intensNot.getProduto().getCodProduto());
        stmt.execute();
         banco.desconectar();
    }

    @Override
    
    public  ArrayList<ItensNota> listarIntNota(ItensNota intensNot) throws ClassNotFoundException, SQLException {    
      ArrayList<ItensNota> listagem = new ArrayList<>();    
      stmt = banco.conectar().prepareStatement("SELECT * FROM ItensNota WHERE descricao like ?");
      stmt.setString(1, "%"+intensNot+"%");
        ResultSet resultado = stmt.executeQuery();
        while(resultado.next()){
            ItensNota itensnota = new ItensNota();
            
          
            itensnota.setQtdComprada(resultado.getInt(1));
            itensnota.setValorUnit(resultado.getDouble(2));
             itensnota.getProduto().setCodProduto(resultado.getInt(3));
             
            listagem.add(itensnota);
            banco.desconectar();
        }
      return listagem;
    }
}