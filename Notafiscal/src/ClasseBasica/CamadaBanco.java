/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasseBasica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author SAFADO
 */
public class CamadaBanco {
    
    PreparedStatement callBd;
    
    // possui as mesmas funcao do Statement  a diferenca que é pré copilado
    Connection con;
    
    // Conection realiza a conexao com banco da qual 'con' é a vareavel declarada
    
    
   public Connection conectar() throws ClassNotFoundException, SQLException{
      
       
       String url ="jdbc:sqlserver://localhost;databaseName=camadaBanco";
            String user ="camadaBanco";
                String password="34262672";
      
               
                
       con = DriverManager.getConnection(url, user, password);
       
       return con;
   }
       
   public void desconectar() throws SQLException{
       
       con.close();
   }
   
   
   
    
}
