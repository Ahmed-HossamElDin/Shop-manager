package controller;

import Connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Popup;

import java.sql.Connection;
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

    public void Login(ActionEvent actionEvent) throws Exception {
        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();

        if(isAdmin == true)
        {
            Statement statement=connection.createStatement();
            String sql = "SELECT username FROM admin WHERE username = '"+username.getText()+"' AND password = '"+password.getText()+"'";
            ResultSet resultSet=  statement.executeQuery(sql);

            if (resultSet.next())
            {
                System.out.println("found");
                AdminLogin(actionEvent);
            }
            else
                System.out.println("not found");
        }
        else
        {
            Statement statement=connection.createStatement();
            String sql = "SELECT username FROM staffmember WHERE username = '"+username.getText()+"' AND password = '"+password.getText()+"'";
            ResultSet resultSet=  statement.executeQuery(sql);

            if (resultSet.next())
            {
                System.out.println("found");
                StaffMemberLogin(actionEvent);
            }
            else
            {
                System.out.println("not found");
            }
        }
    }

}
