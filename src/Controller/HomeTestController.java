package Controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class HomeTestController {

    @FXML
    private Label hello;
    
    
    private Stage stage;
    private Scene scene;
    
//    @FXML
//    private ImageView image1View;
//    Image image1 = new Image(getClass().getResourceAsStream("image/icons8-wheel-48.png"));

    @FXML
    void btnOnClick(ActionEvent event) {

    }
//    public void displayImage (){
//        image1View.setImage(image1);
//    }

    @FXML
    public void signoutButtonClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/assignment4/Login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}