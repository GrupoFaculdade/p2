/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasseNegocios;
import ClasseBasica.CamadaBanco;
import ClasseBasica.Produto;
import ClasseDados.DadosProduto;
import ClasseDados.InterfaceProduto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Douglas
 */
public class NegociosProduto implements InterfaceProduto {
    
    private PreparedStatement stmt;
    private CamadaBanco banco;
    private DadosProduto dados;
    
    public NegociosProduto(){
        dados = new DadosProduto();
    }
    
    
    
    private boolean existe(int codProduto) throws ClassNotFoundException, SQLException{
        stmt = banco.conectar().prepareStatement("SELECT * FROM produto WHERE cod = ?");
        stmt.setInt(1, codProduto);
       return stmt.execute();
    }

    @Override
    public void cadastrarProd(Produto prod) throws ClassNotFoundException, SQLException {
        dados.cadastrarProd(prod);
    }

    @Override
    public void alterarProd(int p, Produto prod) throws ClassNotFoundException, SQLException {
       dados.alterarProd(p, prod);
    }

    @Override
    public void removerProd(int prod) throws ClassNotFoundException, SQLException {
       dados.removerProd(prod);
    }

    @Override
    public ArrayList<Produto> listarProd(String listProd) throws ClassNotFoundException, SQLException {
        return dados.listarProd(listProd);
    }
    
}

