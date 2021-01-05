package controller;

import javafx.event.ActionEvent;

public class searchitem { private Scenes scenes = new Scenes();
    public void backbtn(ActionEvent actionEvent) throws Exception{
        scenes.transition(actionEvent, "/view/admin_managment.fxml", "controller.searchitem","Admin Managment`");
    }
}

