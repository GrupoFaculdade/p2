/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasseDados;

import ClasseBasica.CamadaBanco;
import ClasseBasica.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author NeGo
 */
public class DadosProduto implements InterfaceProduto{

   private CamadaBanco banco;
    private PreparedStatement stmt; 
    
    public DadosProduto(){
         banco = new CamadaBanco();
    }
    
    @Override
    public void cadastrarProd(Produto prod) throws ClassNotFoundException, SQLException {
    stmt = banco.conectar().prepareStatement("INSERT INTO produto VALUES(?, ?, ?, ?)");
    stmt.setInt(1, prod.getCodProduto());
    stmt.setInt(2, prod.getQtdProduto());
    stmt.setString(3, prod.getDescricao());
    stmt.setString(4, prod.getSetor().getCodigoSetor());
    stmt.execute();
     banco.desconectar();
    }

    @Override
    public void alterarProd(int codProduto, Produto prod) throws ClassNotFoundException, SQLException {
    stmt = banco.conectar().prepareStatement("update produto  set qtdproduto=?,descricao=?,codSetor=? where codProduto=?");
      
    stmt.setInt(1, prod.getQtdProduto());
    stmt.setString(2, prod.getDescricao());
    stmt.setString(3, prod.getSetor().getCodigoSetor());
     stmt.setInt(4, prod.getCodProduto());
        stmt.executeUpdate();
         banco.desconectar();
    }
        

    @Override
    public void removerProd(int codProduto) throws ClassNotFoundException, SQLException {
      stmt = banco.conectar().prepareStatement("delete from produto where codProduto=?");
    stmt.setInt(1, codProduto);
     banco.desconectar();
    }
//Create table produto( CodProduto int primary key,qtdproduto int,descricao varchar (50), codSetor int references setor(codSetor));

    @Override
    public ArrayList<Produto> listarProd(String list) throws ClassNotFoundException, SQLException {
      ArrayList<Produto> listagem = new ArrayList<>();
      
      stmt = banco.conectar().prepareStatement("SELECT * FROM produto WHERE descricao like ?");
      stmt.setString(1, "%"+list+"%");
        ResultSet resultado = stmt.executeQuery();
        while(resultado.next()){
            Produto produto = new Produto();
            produto.setCodProduto(resultado.getInt(1));
            produto.setQtdProduto(resultado.getInt(2));
            produto.setDescricao(resultado.getString(3));
            produto.getSetor().setCodigoSetor(resultado.getString(4)); // testar
            listagem.add(produto);
         banco.desconectar();
        }
      return listagem;    
    }

   
    
}
