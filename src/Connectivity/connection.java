package Connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    public connection getConnection() throws ClassNotFoundException, SQLException {
            String DB = "SNOOPYSHOP";
        String UserName = "root";
        String Password = "";

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/"+DB,UserName,Password);
        return null;
    }
}
