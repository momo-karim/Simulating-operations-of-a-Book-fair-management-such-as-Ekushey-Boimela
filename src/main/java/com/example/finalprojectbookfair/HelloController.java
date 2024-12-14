package com.example.finalprojectbookfair;

import com.example.finalprojectbookfair.Admin.AdminDashboardControllergotcurrepted;
import com.example.finalprojectbookfair.Admin.admin;
import com.example.finalprojectbookfair.Logistics.Logistics;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class HelloController {

    @FXML
    private PasswordField passwordTextField;
    @FXML
    private Button signUpbutton;
    @FXML
    private TextField userIdTextField;
    @FXML
    private Button forgetPassWordButton;
    @FXML
    private Button lohinbutton;
    @FXML
    private Label messageLabel;
    ArrayList<admin> adminArrayList=new ArrayList<>();
    ArrayList<Logistics>logisticsArrayList=new ArrayList<>();
    private ArrayList<UserClass> TheUser;


//    public void setAdminArrayList(ArrayList<admin> adminArrayList) {
//        this.adminArrayList = adminArrayList;
//    }

    @FXML
    public void initialize(){
        adminArrayList.add(new admin("admin1", "admin", "admin123", "Male", "Admin", LocalDate.now()));
        logisticsArrayList.add(new Logistics("log1", "logistics", "log123", "Male", "Logistics", LocalDate.now()));

        System.out.println("Sample users initialized.");
    }







    @FXML
    public void onLoginButton(ActionEvent actionEvent) throws IOException {
        String userId = userIdTextField.getText();
        String password = passwordTextField.getText();

        if (userId.isEmpty() || password.isEmpty()) {
            messageLabel.setText("Please enter both User ID and Password.");
            return;
        }
        for (admin admin : adminArrayList) {
            if (admin.getId().equals(userId) && admin.getPassword().equals(password)) {
                messageLabel.setText("Login successful! Redirecting to Admin Dashboard...");
                AdminDashboardControllergotcurrepted ADC = SceneSwitcher.switchScene(actionEvent, "/com.example.finalprojectbookfair/Admin/adminDashboard.fxml");
                return;
            }
        }


        for (Logistics logistics : logisticsArrayList) {
            if (logistics.getId().equals(userId) && logistics.getPassword().equals(password)) {
                messageLabel.setText("Login successful! Redirecting to Logistics Dashboard...");
                SceneSwitcher.switchScene(actionEvent, "/com.example.finalprojectbookfair/Logistics/LogisticsDashboard.fxml");
                return;
            }
        }
        messageLabel.setText("Invalid User ID or Password. Please try again.");


        //AdminDashboardControllergotcurrepted ADC=SceneSwitcher.switchScene(actionEvent,"/com.example.finalprojectbookfair/admin/adminDashboard.fxml");







        //SceneSwitcher.switchScene(actionEvent,"adminDashboard.fxml");
        //data passing
        //HelloController hc= fxmlLoader.getController();
        //hc.setStudList(Studlist);


    }

    @FXML
    public void onForgetPassword(ActionEvent actionEvent) throws IOException {
//        SceneSwitcher.switchScene(actionEvent,"resetpassword.fxml");
        SceneSwitcher.switchSceneWithData(actionEvent, "resetpassword.fxml", this.TheUser);
    }

    @FXML
    public void onSignUp(ActionEvent actionEvent) throws IOException {
//        SceneSwitcher.switchScene(actionEvent,"signin.fxml");
        SceneSwitcher.switchSceneWithData(actionEvent,"signin.fxml" , this.TheUser);

    }

    public void setter(admin admin) {

    }

    public void setUserList(ArrayList<UserClass> userList) {

    }
}