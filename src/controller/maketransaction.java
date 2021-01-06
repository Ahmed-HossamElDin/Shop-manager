package controller;

import Connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class maketransaction {private Scenes scenes = new Scenes();

    Boolean obj;
    public void backbtn(ActionEvent actionEvent) throws Exception{{
        obj = loginpage.isAdmin;
        if(obj == true){
            scenes.transition(actionEvent, "/view/admin_managment.fxml", "controller.maketransaction","Admin Managment");

        }else{
            scenes.transition(actionEvent, "/view/staff_managment.fxml", "controller.maketransaction","Staff Managment");
        }
    }
    }

    @FXML
    private TextField itemID, itemQuantity, staffname;

    int[] id = new int[100];
    int[] quantity = new int[100];
    int i = 0;

    @FXML
    public void add(ActionEvent actionEvent)  {
        id[i] = Integer.parseInt(itemID.getText());
        quantity[i] = Integer.parseInt(itemQuantity.getText());
        i++;
        itemID.setText("");
        itemQuantity.setText("");
    }

    @FXML
    public void done(ActionEvent actionEvent) throws SQLException {
        int totalPrice = 0, unitPrice = 0, unitQuantity = 0;

        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();

        for(int j =0; j<i; j++)
        {
            System.out.println(id[j]+" "+quantity[j]);
            //x = SELECT price FROM items WHERE id = id[j]
            //totalPrice += quantity[j] * x;
            Statement statement=connection.createStatement();
            String sql = "SElECT price FROM items WHERE id = "+id[j]+"";
            ResultSet resultSet=  statement.executeQuery(sql);

            while(resultSet.next()) {
                unitPrice = resultSet.getInt("price");
            }
            totalPrice += quantity[j] * unitPrice;
        }
        System.out.println("totalprice= "+totalPrice);


        //Transactions
        connection=connectionClass.getConnection();
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm").format(new Date());
        System.out.println("timeStamp= "+timeStamp);
        String sql = "INSERT INTO transactions (date, staffmembername, total) VALUES ('"+timeStamp+"', '"+staffname.getText()+"', "+totalPrice+")";
        //String sql = "INSERT INTO transactions (date, staffmembername, total) VALUES ('22/22', 'mohseen', 20)";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);


        statement=connection.createStatement();

        //sql = "select MAX(id) from transactions";
        sql = "SELECT LAST(id) FROM transactions";
        sql = "SELECT id FROM transactions ORDER BY id DESC LIMIT 1";
        ResultSet resultSet=  statement.executeQuery(sql);

        int transactionMaxID = 0;
        while(resultSet.next()) {
            transactionMaxID = resultSet.getInt("id");
        }


        //Items in transaction
        for(int j =0; j<i; j++)
        {

            sql = "INSERT INTO itemsintransaction VALUES ("+ transactionMaxID +", "+id[j]+", "+quantity[j]+")";

            statement = connection.createStatement();
            statement.executeUpdate(sql);
        }

        //Update item number
        for(int j =0; j<i; j++)
        {
            statement=connection.createStatement();
            sql = "SElECT quantity FROM items WHERE id = "+id[j]+"";
            resultSet=  statement.executeQuery(sql);
            while(resultSet.next()) {
                unitQuantity = resultSet.getInt("quantity");
            }
            int quantityDiff = unitQuantity - quantity[j];
            connection=connectionClass.getConnection();
            sql = "UPDATE items SET quantity = "+ quantityDiff +" WHERE id = "+id[j]+"";
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        }
        i = 0;

    }
}
