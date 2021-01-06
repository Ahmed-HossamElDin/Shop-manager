package controller;

import Connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class addprovider {private Scenes scenes = new Scenes();

    public void backbtn(ActionEvent actionEvent) throws Exception{
        scenes.transition(actionEvent, "/view/admin_managment.fxml", "controller.creatingnewstaff","Admin Managment`");
    }



    @FXML
    private TextField name, phone, email;


    @FXML
    public void done(ActionEvent actionEvent) throws SQLException {

        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();
        String sql = "INSERT INTO providers " + "VALUES ("+name.getText()+", '"+phone.getText()+"', '"+email.getText()+"')";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);

    }
}
