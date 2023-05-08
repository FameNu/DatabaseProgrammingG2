import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab13 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password = "fame270547";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);

            String sql = "UPDATE student SET email=? WHERE studentID=?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "abcd@kmutt.ac.th");
            preparedStatement.setString(2, "111111");
//            preparedStatement.setString(3, "bbbb");
//            preparedStatement.setString(4, "aaaa@gmail.com");
//            preparedStatement.setString(5, "IT");

            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException ex){
            Logger.getLogger(dbprogramming2class6.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex){
            Logger.getLogger(dbprogramming2class6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
