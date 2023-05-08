import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
// import java.sql.ResultSet;

public class Lab8 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password = "fame270547";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connected");
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM student";
            statement.executeQuery(sql);
            ResultSet results = statement.getResultSet();

            while (results.next()){
                System.out.println(results.getString(1) + " " + results.getString(2));
            }
        } catch (ClassNotFoundException ex){
            Logger.getLogger(dbprogramming2class6.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex){
            Logger.getLogger(dbprogramming2class6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
