package controller;

import Connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.Statement;

public class deleteprovider {private Scenes scenes = new Scenes();

    public void backbtn(ActionEvent actionEvent) throws Exception{
        scenes.transition(actionEvent, "/view/admin_managment.fxml", "controller.creatingnewstaff","Admin Managment`");
    }

    @FXML
    private TextField id;

    public void done(ActionEvent actionEvent) throws Exception {
        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();
        String sql = "DELETE FROM providers WHERE id = '"+id.getText()+"'";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        System.out.println("provider deleted");
    }
}
