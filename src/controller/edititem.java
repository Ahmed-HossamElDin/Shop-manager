package controller;

import Connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class edititem {
    private Scenes scenes = new Scenes();
    Boolean obj;
    public void backbtn(ActionEvent actionEvent) throws Exception{{
        obj = loginpage.isAdmin;
        if(obj == true){
            scenes.transition(actionEvent, "/view/admin_managment.fxml", "controller.edititem","Admin Managment");

        }else{
            scenes.transition(actionEvent, "/view/staff_managment.fxml", "controller.edititem","Staff Managment");
        }
    }
    }
    @FXML
    private TextField id, name, quantity, providerID;


    @FXML
    public void done(ActionEvent actionEvent) throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();

        if(!name.getText().equals(""))
        {
            String sql = "UPDATE items SET name = '"+ name.getText() +"' WHERE id = "+ id.getText() +"";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        }
        if(!quantity.getText().equals(""))
        {
            String sql = "UPDATE items SET quantity = "+ quantity.getText() +" WHERE id = "+ id.getText() +"";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        }
        if(!providerID.getText().equals(""))
        {
            String sql = "UPDATE items SET providerID = "+ providerID.getText() +" WHERE id = "+ id.getText() +"";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        }

    }
}

