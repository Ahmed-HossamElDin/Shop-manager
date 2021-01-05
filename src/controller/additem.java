package controller;

import Connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class additem {
    private Scenes scenes = new Scenes();
    Boolean obj;
    public void backbtn(ActionEvent actionEvent) throws Exception {
        {
            obj = loginpage.isAdmin;
            if (obj == true) {
                scenes.transition(actionEvent, "/view/admin_managment.fxml", "controller.additem", "Admin Managment");

            } else {
                scenes.transition(actionEvent, "/view/staff_managment.fxml", "controller.additem", "Staff Managment");
            }
        }
    }
        @FXML
        private TextField ID, name, price, quantity, description, providerID;


        @FXML
        public void done(ActionEvent actionEvent) throws SQLException {

            ConnectionClass connectionClass=new ConnectionClass();
            Connection connection=connectionClass.getConnection();

            String sql = "INSERT INTO items " + "VALUES ("+ID.getText()+", '"+name.getText()+"', "+quantity.getText()+", "+price.getText()+", '"+description.getText()+"', "+providerID.getText()+")";

            //String sql = "INSERT INTO items " + "VALUES ("+ID.getText()+", '"+name.getText()+"', "+quantity.getText()+", "+price.getText()+", '"+description.getText()+"', "+providerID.getText()+")";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);

        }



}
