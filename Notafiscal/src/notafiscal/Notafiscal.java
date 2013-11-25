/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package notafiscal;

import ClasseBasica.CamadaBanco;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NeGo
 */
public class Notafiscal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
      
             CamadaBanco banco = new CamadaBanco();
        try {
            
            banco.conectar();
            System.out.println("troloou");
            
        } catch (SQLException | ClassNotFoundException ex) {
           ex.printStackTrace();
        }
       finally{
                 try {
                     banco.desconectar();
                             System.out.println("Desconectou");
                 } catch (SQLException ex) {
                     ex.printStackTrace();
                     
                 }
        }
        
       
    }
   
}
