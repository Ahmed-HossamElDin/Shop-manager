package controller;

import Connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.StaffMember;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class deletestaff {
    private Scenes scenes = new Scenes();

    public void backbtn(ActionEvent actionEvent) throws Exception {
        scenes.transition(actionEvent, "/view/admin_managment.fxml", "controller.deletestaff", "Admin Managment`");
    }

    @FXML
    private TextField username;

    public void done(ActionEvent actionEvent) throws Exception {
        StaffMember staff = new StaffMember();
        boolean state = staff.DeleteStaffMember(username.getText());
        if (state){
            System.out.println("Staff deleted!");
        }
    }
}

