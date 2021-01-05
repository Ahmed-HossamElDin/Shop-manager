package Connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
    public Connection connection;
    public  Connection getConnection(){


        String dbName="snoopyshop";
        String userName="root";
        String password="";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection= DriverManager.getConnection("jdbc:mysql://localhost/"+dbName,userName,password);


        } catch (Exception e) {
            e.printStackTrace();
        }


        return connection;
    }

}