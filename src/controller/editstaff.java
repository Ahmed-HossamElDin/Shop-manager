package controller;

import Connectivity.ConnectionClass;
import javafx.event.ActionEvent;

import java.sql.Connection;

public class editstaff { private Scenes scenes = new Scenes();
    ConnectionClass connectionClass=new ConnectionClass();
    Connection connection=connectionClass.getConnection();

    public void backbtn(ActionEvent actionEvent) throws Exception{
        scenes.transition(actionEvent, "/view/admin_managment.fxml", "controller.editstaff","Admin Managment");
    }


    public void view(ActionEvent actionEvent) throws Exception {
        scenes.transition(actionEvent, "/view/searchforstaffmember.fxml", "controller.editstaff","View staff member");

    }

    public void done(ActionEvent actionEvent) {
    }
}
