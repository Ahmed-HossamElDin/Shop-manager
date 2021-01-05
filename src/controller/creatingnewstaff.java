package controller;


import Connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class creatingnewstaff {
    private Scenes scenes = new Scenes();

    public void backbtn(ActionEvent actionEvent) throws Exception{
        scenes.transition(actionEvent, "/view/admin_managment.fxml", "controller.creatingnewstaff","Admin Managment`");
    }


    @FXML
    private TextField username, email, password;


    @FXML
    public void RegisterButton(ActionEvent actionEvent) throws SQLException {

        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();

        String sql = "INSERT INTO staffmember " + "VALUES ('"+username.getText()+"', '"+email.getText()+"', '"+password.getText()+"')";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);


    }
}
