package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {


    @FXML
    private Button RegisterButton;

    @FXML
    private TextField username, name, password, email, repassword;


    @FXML
    void Register(ActionEvent event)
    {
        System.out.println(username.getText());
        System.out.println(name.getText());
        System.out.println(password.getText());
    }
}
