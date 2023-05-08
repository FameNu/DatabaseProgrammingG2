import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab15 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password = "fame270547";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM student");
            ResultSetMetaData rsMetaData = results.getMetaData();

            for (int i = 1; i <= rsMetaData.getColumnCount(); i++){
                System.out.printf("%-12s\t", rsMetaData.getColumnName(i));
            }

            while (results.next()){
                for (int i = 1; i <= rsMetaData.getColumnCount(); i++){
                    System.out.printf("%-12s\t", results.getObject(i));
                }
                System.out.println();
            }

            connection.close();
        } catch (ClassNotFoundException ex){
            Logger.getLogger(dbprogramming2class6.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex){
            Logger.getLogger(dbprogramming2class6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
