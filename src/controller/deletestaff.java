package controller;

import Connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class deletestaff { private Scenes scenes = new Scenes();

    public void backbtn(ActionEvent actionEvent) throws Exception{
        scenes.transition(actionEvent, "/view/admin_managment.fxml", "controller.deletestaff","Admin Managment`");
    }

    @FXML
    private TextField username;

    public void done(ActionEvent actionEvent) throws Exception {
        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();
        String sql = "DELETE FROM staffmember WHERE username = '"+username.getText()+"'";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        System.out.println("staff memeber deleted");
        }
    }


