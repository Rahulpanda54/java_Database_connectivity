import java.sql.*;
public class Main {
    public static void main(String[] args) throws Exception{
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
           String url  = "jdbc:mysql://localhost:3306/ram";
            String username = "root";
            String password =  "College@123#";

            Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement ps = connection.prepareStatement("select * from rahulpanda");

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                System.out.println(id);
                String name1 = rs.getString("name");
                System.out.println(name1);
                String name2 = rs.getString("surname");
                System.out.println(name2);
                String name3 = rs.getString("course");
                System.out.println(name3);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}