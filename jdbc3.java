import java.sql.*;
import java.io.*;
import java.sql.DriverManager;
public class jdbc3 {
    public static void main(String[] args) throws Exception{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String pass = "College@123#";
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel", "root","College@123#");
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from rahul");
            while(rs.next()){
                int id = rs.getInt("id");
                String n = rs.getString("name");
                String surname = rs.getString("surname");
                String course = rs.getString("course");
                System.out.println("id: " + id);
                System.out.println("Name: " + n);
                System.out.println("surname " + surname);
                System.out.println("course " + course);
            }
            connection.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}
