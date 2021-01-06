/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Connectivity.ConnectionClass;

import javafx.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Tommy
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.SystemUser;
import java.sql.ResultSet;
import java.sql.Statement;

public class SystemUser {
    private String username;
    private String password;
    private String email;

    public boolean login(String username, String password, ActionEvent actionEvent,String sql) throws SQLException {
        ConnectionClass connectionClass = new ConnectionClass();
        Connection connection = connectionClass.getConnection();
        Statement statement = connection.createStatement();
        this.username = username;
        this.password = password;
        sql = "SElECT username FROM "+sql+" WHERE username = '"+username+"' AND password = '"+password+"'";
        ResultSet resultSet=  statement.executeQuery(sql);
        if (resultSet.next())
        {
            System.out.println("found");
            return true;
        }
        else
            return false;
    }
    public void CompleteTransaction(int Order_id){}
    public boolean AddItem(String item_details){return false;}
    public boolean changeQuantity(String item_id, int item_quantity){return false;}

}
