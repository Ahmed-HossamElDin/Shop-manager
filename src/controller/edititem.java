package controller;

import javafx.event.ActionEvent;

public class edititem {
    private Scenes scenes = new Scenes();
    Boolean obj;
    public void backbtn(ActionEvent actionEvent) throws Exception{{
        obj = loginpage.isAdmin;
        if(obj == true){
            scenes.transition(actionEvent, "/view/admin_managment.fxml", "controller.edititem","Admin Managment");

        }else{
            scenes.transition(actionEvent, "/view/staff_managment.fxml", "controller.edititem","Staff Managment");
        }
    }

    }
}

