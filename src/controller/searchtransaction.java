package controller;

import javafx.event.ActionEvent;

public class searchtransaction {private Scenes scenes = new Scenes();

    public void backbtn(ActionEvent actionEvent) throws Exception{
        scenes.transition(actionEvent, "/view/admin_managment.fxml", "controller.creatingnewstaff","Admin Managment`");
    }

    public void alteratransaction(ActionEvent actionEvent) throws Exception {
        scenes.transition(actionEvent, "/view/alteratransaction.fxml", "controller.searchtransaction","Alter a transaction`");
    }
}
