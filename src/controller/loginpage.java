package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.Admin;
import model.StaffMember;
import model.SystemUser;

import java.sql.ResultSet;
import java.sql.Statement;

public class loginpage {
    private Scenes scenes = new Scenes();
    public static Boolean isAdmin = true;

    @FXML
    private TextField username, password;

    public void setIsNotAdmin() {
        this.isAdmin = false;
    }
    public void setIsAdmin() {
        this.isAdmin = true;

    }

    public void AdminLogin(ActionEvent actionEvent) throws Exception {
        scenes.transition(actionEvent, "/view/admin_managment.fxml", "controller.loginpage", "Admin Managment");
    }
    public void StaffMemberLogin(ActionEvent actionEvent) throws Exception {
        scenes.transition(actionEvent, "/view/staff_managment.fxml", "controller.loginpage", "Staff Managment");
    }
    public Boolean state = isAdmin;
    ActionEvent actionEvent;
    public void Login(ActionEvent actionEvent) throws Exception {
        this.actionEvent=actionEvent;
        if(isAdmin == true)
        {
            Admin admin = new Admin();
            String sql = "admin";
            state = admin.login(username.getText(), password.getText(), this.actionEvent, sql);
            if (state){
                AdminLogin(actionEvent);
            }else{
                System.out.println("not found");
            }
        }
        else
        {
            StaffMember staff = new StaffMember();
            String sql = "staffmember";
            state = staff.login(username.getText(), password.getText(), this.actionEvent, sql);
            if (state){
                StaffMemberLogin(actionEvent);
            }else{
                System.out.println("not found");
            }
        }
    }

}
