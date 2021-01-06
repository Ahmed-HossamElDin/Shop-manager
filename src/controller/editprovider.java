package controller;

import Connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class editprovider {private Scenes scenes = new Scenes();

    public void backbtn(ActionEvent actionEvent) throws Exception{
        scenes.transition(actionEvent, "/view/admin_managment.fxml", "controller.creatingnewstaff","Admin Managment`");
    }

    @FXML
    private TextField id, newphone, newemail;


    @FXML
    public void done(ActionEvent actionEvent) throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();

        if(!id.getText().equals(""))
        {
            if(!newphone.getText().equals(""))
            {
                String sql = "UPDATE providers SET phone = "+ newphone.getText() +" WHERE id = "+ id.getText() +"";
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            }
            if(!newemail.getText().equals(""))
            {
                String sql = "UPDATE providers SET providerID = "+ newemail.getText() +" WHERE id = "+ id.getText() +"";
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            }
        }


    }
}
