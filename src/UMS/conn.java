package UMS;
import java.sql.*;
public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:derby://localhost:1527/UMS", "root", "Sanket@98");
            s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
