import java.sql.SQLException;
import java.sql.*;
import java.io.*;

public class jdbc2 {
    public static void main(String[] args)  throws Exception{
try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost: 3306/hostel";
               String username = "root";
             String password = "College@123#";
              Connection connection = DriverManager.getConnection(url,username,password);
                        Statement statement = connection.createStatement();
                     statement.executeUpdate("insert into rahul values(5,'vivek','kumar','Btech')");
                  System.out.println("successfully inserted: ");
                  connection.close();
}
       catch (SQLException e) {
            System.out.println(e);
        }
    }
}
