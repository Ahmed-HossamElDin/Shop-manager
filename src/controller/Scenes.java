package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Scenes {
    public void transition(ActionEvent actionEvent, String fxml, String context, String title) throws Exception{
        Class cl = Class.forName(context);
        Object obj = cl.newInstance();
        Parent root = FXMLLoader.load(obj.getClass().getResource(fxml));
        Scene scene = new Scene(root, 600, 400);
        Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
}
}