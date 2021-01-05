package controller;

import javafx.event.ActionEvent;

public class loginpage {
    private Scenes scenes = new Scenes();
    private Boolean isAdmin = true;
    
	public void setIsNotAdmin() {
		this.isAdmin = false;
	}
	public void setIsAdmin() {
		this.isAdmin = true;
	}
	 
    public void AdminLogin(ActionEvent actionEvent) throws Exception {
        scenes.transition(actionEvent, "/view/admin_managment.fxml", "controller.loginpage", "Admin Managment");
    }
    public void StaffMemberLogin(ActionEvent actionEvent) throws Exception {
        scenes.transition(actionEvent, "/view/cart.fxml", "controller.loginpage", "Staff Managment");
    }
    public void Login(ActionEvent actionEvent) throws Exception {
        if(isAdmin == true)
        {
        	AdminLogin(actionEvent);
        }
        else
        {
        	StaffMemberLogin(actionEvent);
        }  	
    }

}
