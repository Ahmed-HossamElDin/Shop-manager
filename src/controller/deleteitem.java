package controller;

import Connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.Statement;

public class deleteitem { private Scenes scenes = new Scenes();
    Boolean obj;
    public void backbtn(ActionEvent actionEvent) throws Exception{{
        obj = loginpage.isAdmin;
        if(obj == true){
            scenes.transition(actionEvent, "/view/admin_managment.fxml", "controller.deleteitem","Admin Managment");

        }else{
            scenes.transition(actionEvent, "/view/staff_managment.fxml", "controller.deleteitem","Staff Managment");
        }
    }

    }

    @FXML
    private TextField ID;

    public void done(ActionEvent actionEvent) throws Exception {
        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();
        String sql = "DELETE FROM items WHERE id = '"+ID.getText()+"'";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        System.out.println("item deleted");
    }

}
