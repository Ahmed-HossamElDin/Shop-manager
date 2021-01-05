package controller;

import javafx.event.ActionEvent;

public class staff_managment {
    private Scenes scenes = new Scenes();
    public void additem(ActionEvent actionEvent) throws Exception {
        scenes.transition(actionEvent, "/view/addanewitem.fxml", "controller.staff_managment","Add a new item");
    }

    public void edititem(ActionEvent actionEvent) throws Exception {
        scenes.transition(actionEvent, "/view/editanitem.fxml", "controller.staff_managment","Edit an item");

    }

    public void deleteitem(ActionEvent actionEvent) throws Exception{
        scenes.transition(actionEvent, "/view/deleteanitem.fxml", "controller.staff_managment","Delete an item");
    }

    public void searchitem(ActionEvent actionEvent) throws Exception{
        scenes.transition(actionEvent, "/view/searchforanitem.fxml", "controller.staff_managment","search for an existing item");
    }

    public void maketransaction(ActionEvent actionEvent) throws Exception {
        scenes.transition(actionEvent, "/view/makeatransaction.fxml", "controller.staff_managment","Make a transaction");
    }

    public void backbtn(ActionEvent actionEvent) throws Exception {
        scenes.transition(actionEvent, "/view/loginpage.fxml", "controller.admin_managment","Login");
    }
}
