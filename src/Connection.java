import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;



public class Connection {
    Connection conn;
    
    public String  url = "jdbc:mysql://localhost:3306/erpsl_novo";
    public String user = "root";
    public String password = "ismael";
    
    public boolean conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);
            System.out.println("Conexão realizada com sucesso");
    
            return true;
        }catch(ClassNotFoundException | SQLException ex){
             System.out.println("Falha na conexão com o banco " + ex.getMessage());
                return false;
        }
    }
    
    public void desconectar(){
        try{
            conn.close();
        }catch(SQLException ex){
           
        }
    }
}
