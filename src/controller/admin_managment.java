package controller;

import javafx.event.ActionEvent;

public class admin_managment {
    private Scenes scenes = new Scenes();
    public void createnewstaffmember(ActionEvent actionEvent) throws Exception {
        scenes.transition(actionEvent, "/view/creatingnewstaff.fxml", "controller.loginpage", "Create a new staff member");
    }

    public void backbtn(ActionEvent actionEvent) throws Exception {
        scenes.transition(actionEvent, "/view/loginpage.fxml", "controller.admin_managment","Login");loginpage obj = new loginpage() ;
        System.out.println(obj.state);
    }

    public void deletestaff(ActionEvent actionEvent) throws Exception {
        scenes.transition(actionEvent, "/view/deleteastaffmember.fxml", "controller.admin_managment","Delete a staff member");
    }

    public void additem(ActionEvent actionEvent) throws Exception  {
        scenes.transition(actionEvent, "/view/addanewitem.fxml", "controller.admin_managment","Add a new item");
}

    public void edititem(ActionEvent actionEvent) throws Exception{
        scenes.transition(actionEvent, "/view/editanitem.fxml", "controller.admin_managment","Edit an item");
    }
    public void deleteitem(ActionEvent actionEvent) throws Exception{
        scenes.transition(actionEvent, "/view/deleteanitem.fxml", "controller.admin_managment","Delete an item");
    }

    public void searchitem(ActionEvent actionEvent) throws Exception{
        scenes.transition(actionEvent, "/view/searchforanitem.fxml", "controller.admin_managment","search for an existing item");
    }

    public void editprovider(ActionEvent actionEvent) throws Exception{
        scenes.transition(actionEvent, "/view/editanitem.fxml", "controller.admin_managment","Edit a provider");
    }

    public void createprovider(ActionEvent actionEvent) throws Exception{
        scenes.transition(actionEvent, "/view/addprovider.fxml", "controller.admin_managment","Create a provider");
    }

    public void deleteprovider(ActionEvent actionEvent) throws Exception{
        scenes.transition(actionEvent, "/view/deleteprovider.fxml", "controller.admin_managment","Delete a provider");
    }

    public void maketransaction(ActionEvent actionEvent) throws Exception{
        scenes.transition(actionEvent, "/view/makeatransaction.fxml", "controller.admin_managment","Make a transaction");
    }

    public void searchtransaction(ActionEvent actionEvent) throws Exception {
        scenes.transition(actionEvent, "/view/searchfortransaction.fxml", "controller.admin_managment","Search for a transaction");
    }

    public void editstaff(ActionEvent actionEvent) throws Exception {
        scenes.transition(actionEvent, "/view/editastaffmember.fxml", "controller.admin_managment","Edit staff member");
    }

    public void altertransaction(ActionEvent actionEvent) throws Exception{
        scenes.transition(actionEvent, "/view/alteratransaction.fxml", "controller.admin_managment","Alter a transaction");
    }
}
