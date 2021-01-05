package controller;

import javafx.event.ActionEvent;

public class loginpage {
    private Scenes scenes = new Scenes();

    public void login(ActionEvent actionEvent) throws Exception {
        scenes.transition(actionEvent, "/view/admin_managment.fxml", "controller.loginpage");
    }

}
