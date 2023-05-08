import java.util.logging.Level;
import java.util.logging.Logger;
//import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class Lab14 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password = "fame270547";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            DatabaseMetaData dbMataData = connection.getMetaData();
            System.out.println("database URL: " + dbMataData.getURL());
            System.out.println("database product name: " + dbMataData.getDatabaseProductName());
            System.out.println("database product version: " + dbMataData.getDatabaseProductVersion());
            System.out.println("JDBC driver name: " + dbMataData.getDriverName());
            System.out.println("JDBC driver version: " + dbMataData.getDriverVersion());
            System.out.println("JDBC deiver major version: " + dbMataData.getDriverMajorVersion());
            System.out.println("JDBC deiver minoe version: " + dbMataData.getDriverMinorVersion());
            System.out.println("Max number of connections: " + dbMataData.getMaxConnections());
        } catch (ClassNotFoundException ex){
            Logger.getLogger(dbprogramming2class6.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex){
            Logger.getLogger(dbprogramming2class6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
