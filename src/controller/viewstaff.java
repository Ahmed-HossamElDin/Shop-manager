package controller;

import javafx.event.ActionEvent;

public class viewstaff {
    private Scenes scenes = new Scenes();


        public void backbtn(ActionEvent actionEvent) throws Exception{
            scenes.transition(actionEvent, "/view/editastaffmember.fxml", "controller.creatingnewstaff","Search for staff member");
        }


    public void done(ActionEvent actionEvent) throws Exception {
        scenes.transition(actionEvent, "/view/editastaffmember.fxml", "controller.creatingnewstaff","Search for staff member");

    }
}
