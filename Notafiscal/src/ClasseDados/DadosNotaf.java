/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasseDados;

import ClasseBasica.CamadaBanco;
import ClasseBasica.Notaf;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 *
 * @author NeGo
 */
public class DadosNotaf implements InterfaceNotaFiscal{
        private CamadaBanco banco;
        private PreparedStatement stmt;
       public DadosNotaf(){
         banco = new CamadaBanco();
       }

    @Override
    public void listaNotaFiscal(int codNotaFiscal) throws ClassNotFoundException, SQLException {
     String Nota = codNotaFiscal +"";
        stmt = banco.conectar().prepareStatement("SELECT * FROM nf WHERE codNf= ?");
        ResultSet resultado = stmt.executeQuery();
        Notaf nota = new Notaf();
        nota.setCodNotaFiscal(resultado.getInt(1));
        nota.setValorTotal(resultado.getString(2));
        nota.setDataNotafiscal(resultado.getString(3));
        nota.getFunc().setMatricula(resultado.getInt(4));
        banco.desconectar();
    }
//(codNf int primary key identity,valortotal decimal(10,2),datanf smalldatetime,codCliente varchar(50) references cliente(codCliente), 
 //codFuncionario varchar(50) references funcionario(codFuncionario));
    @Override
    public void RemoverNotaFiscal(int codNotaFiscal) throws ClassNotFoundException, SQLException {
        stmt = banco.conectar().prepareStatement("delete from nf where codNf=?");
    stmt.setInt(1, codNotaFiscal);
     banco.desconectar();
    }

    @Override
    public void alterNotaFiscal(int codNotaFiscal, Notaf notaf) throws ClassNotFoundException, SQLException {
         stmt = banco.conectar().prepareStatement("update nf  set valortotal=?, datafn=?, codCliente=? where codNf=?");
         stmt.setString(1, notaf.getValorTotal());
         stmt.setString(2, notaf.getDataNotafiscal());
         stmt.setString(3, notaf.getCli().getCodCli());
         stmt.setInt(4, notaf.getCodNotaFiscal());
         stmt.executeUpdate();
 banco.desconectar();
    }
    private int gerarCod() throws SQLException, ClassNotFoundException{
        int codigo = 0;
        stmt = banco.conectar().prepareStatement("SELECT codnf FROM nf");
        ResultSet result = stmt.executeQuery();
        
        return codigo;
    }
}
