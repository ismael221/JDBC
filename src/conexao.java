//import java.sql.Connection;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;


public class conexao {

   
    public static void main(String[] args) {
       
       
        try {
            Connection conectar = new Connection();
            conectar.conectar();
            
            Statement st = conectar.conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM produtos"); //variavel da classe ResultSet para receber o valor da consulta
            rs.next();
            System.out.println(rs.getInt("COUNT(*)"));
        } catch (SQLException ex) {
            Logger.getLogger(conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
