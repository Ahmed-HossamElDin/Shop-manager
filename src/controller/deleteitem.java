package controller;

import javafx.event.ActionEvent;

public class deleteitem { private Scenes scenes = new Scenes();
    public void backbtn(ActionEvent actionEvent) throws Exception{
        scenes.transition(actionEvent, "/view/admin_managment.fxml", "controller.deleteitem","Admin Managment`");
    }

}
