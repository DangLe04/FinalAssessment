package Controller;

import java.io.IOException;

import Model.BackendApplication;
import Model.DatabaseHelper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginController {
    
    @FXML
    private Button admin_btn,login_button;

    @FXML
    private Button signup_button;

    @FXML
    private Label helloLabel;

    @FXML
    private ImageView image1View;

    @FXML
    private TextField password_textfield,email_textfield;
    
    private Stage stage;
    private Scene scene;
    
    JFrame f;
    // This is a log in button
    @FXML
    public void loginButtonOnClick(ActionEvent event) throws IOException {
//Show message
//        f=new JFrame();
//        JOptionPane.showMessageDialog(f,"Logged In Successfully ");

//JOptionPane.showMessageDialog(f,"Incorrect Username or Password","Alert",JOptionPane.WARNING_MESSAGE);     


        BackendApplication backendApplication = new BackendApplication();

        String email = email_textfield.getText();
        String password = password_textfield.getText();
        backendApplication.login(email,password);


//        Parent root = FXMLLoader.load(getClass().getResource("/assignment4/Home.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
    }
    
     @FXML
     public void signUpButtonClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/assignment4/SignUp.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void adminButtonClicked(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/assignment4/AdminPage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
