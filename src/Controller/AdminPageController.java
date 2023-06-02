/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.Optional;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AdminPageController {

    @FXML
    private Button adhome_btn,admaterial_btn,adpractice_btn,adquiz_btn,adsurvey_btn,aduser_btn;

    @FXML
    private AnchorPane adhome_form,admaterial_form,adquiz_form,adsurvey_form,adpractice_form,aduser_form;
    
    @FXML
    private Button adtopic_btn1,adtopic_btn2,adtopic_btn3,adtopic_btn4,adtopic_btn5,adtopic_btn6,adtopic_btn7,adtopic_btn8;

    @FXML
    private AnchorPane adtopic_pane1,adtopic_pane2,adtopic_pane3,adtopic_pane4,adtopic_pane5,adtopic_pane6,adtopic_pane7,adtopic_pane8;

    @FXML
    private Button logout;

    @FXML
    private TableView<?> quizTable;
    
    @FXML
    private AnchorPane main_form;
    
    
    @FXML
    void addEmployeeInsertImage(MouseEvent event) {

    }

    @FXML
    void addEmployeeSearch(KeyEvent event) {

    }

    @FXML
    void addEmployeeSelect(MouseEvent event) {

    }

    @FXML
    void adlogout(ActionEvent event) {

    }
// This is a method that place on the button to switch to every panels in Admin Page 
    @FXML
    void switchADForm(ActionEvent event) {
        
        if (event.getSource() == adhome_btn) {
            adhome_form.setVisible(true);
            admaterial_form.setVisible(false);
            adquiz_form.setVisible(false);
            adsurvey_form.setVisible(false);   
            adpractice_form.setVisible(false); 
            aduser_form.setVisible(false);      

            adhome_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            admaterial_btn.setStyle("-fx-background-color:transparent");
            adquiz_btn.setStyle("-fx-background-color:transparent");
            adsurvey_btn.setStyle("-fx-background-color:transparent");
            adpractice_btn.setStyle("-fx-background-color:transparent");
            aduser_btn.setStyle("-fx-background-color:transparent");

        } 
        else if (event.getSource() == adquiz_btn) {
            adhome_form.setVisible(false);
            admaterial_form.setVisible(false);
            adquiz_form.setVisible(true);
            adsurvey_form.setVisible(false);   
            adpractice_form.setVisible(false); 
            aduser_form.setVisible(false);      

            adquiz_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            admaterial_btn.setStyle("-fx-background-color:transparent");
            adhome_btn.setStyle("-fx-background-color:transparent");
            adsurvey_btn.setStyle("-fx-background-color:transparent");
            adpractice_btn.setStyle("-fx-background-color:transparent");
            aduser_btn.setStyle("-fx-background-color:transparent");

        }          
        else if (event.getSource() == adpractice_btn) {
            adhome_form.setVisible(false);
            admaterial_form.setVisible(false);
            adquiz_form.setVisible(false);
            adsurvey_form.setVisible(false);   
            adpractice_form.setVisible(true);  
            aduser_form.setVisible(false);      

            adpractice_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            admaterial_btn.setStyle("-fx-background-color:transparent");
            adquiz_btn.setStyle("-fx-background-color:transparent");
            adsurvey_btn.setStyle("-fx-background-color:transparent");
            adhome_btn.setStyle("-fx-background-color:transparent");
            aduser_btn.setStyle("-fx-background-color:transparent");

          }          
        else if (event.getSource() == admaterial_btn) {
            adhome_form.setVisible(false);
            admaterial_form.setVisible(true);
            adquiz_form.setVisible(false);
            adsurvey_form.setVisible(false);   
            adpractice_form.setVisible(false);
            aduser_form.setVisible(false);      

            admaterial_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            adhome_btn.setStyle("-fx-background-color:transparent");
            adquiz_btn.setStyle("-fx-background-color:transparent");
            adsurvey_btn.setStyle("-fx-background-color:transparent");
            adpractice_btn.setStyle("-fx-background-color:transparent");
            aduser_btn.setStyle("-fx-background-color:transparent");

          }
        else if (event.getSource() == adsurvey_btn) {
            adhome_form.setVisible(false);
            admaterial_form.setVisible(false);
            adquiz_form.setVisible(false);
            adsurvey_form.setVisible(true);   
            adpractice_form.setVisible(false);
            aduser_form.setVisible(false);   
            

            adsurvey_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            admaterial_btn.setStyle("-fx-background-color:transparent");
            adquiz_btn.setStyle("-fx-background-color:transparent");
            adhome_btn.setStyle("-fx-background-color:transparent");
            adpractice_btn.setStyle("-fx-background-color:transparent");
            aduser_btn.setStyle("-fx-background-color:transparent");
            
          }
        else if (event.getSource() == aduser_btn) {
            adhome_form.setVisible(false);
            admaterial_form.setVisible(false);
            adquiz_form.setVisible(false);
            adsurvey_form.setVisible(false);   
            adpractice_form.setVisible(false);
            aduser_form.setVisible(true);  

            aduser_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            admaterial_btn.setStyle("-fx-background-color:transparent");
            adquiz_btn.setStyle("-fx-background-color:transparent");
            adhome_btn.setStyle("-fx-background-color:transparent");
            adpractice_btn.setStyle("-fx-background-color:transparent");
            adsurvey_btn.setStyle("-fx-background-color:transparent");
            
          }             
    }    

    @FXML
    void switchADTopicPane(ActionEvent event) {
    if (event.getSource() == adtopic_btn1) {
            adtopic_pane1.setVisible(true);
            adtopic_pane2.setVisible(false);
            adtopic_pane3.setVisible(false);
            adtopic_pane4.setVisible(false);
            adtopic_pane5.setVisible(false);
            adtopic_pane6.setVisible(false);
            adtopic_pane7.setVisible(false);
            adtopic_pane8.setVisible(false);
            
            adtopic_btn1.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            adtopic_btn2.setStyle("-fx-background-color:transparent");
            adtopic_btn3.setStyle("-fx-background-color:transparent");
            adtopic_btn4.setStyle("-fx-background-color:transparent");
            adtopic_btn5.setStyle("-fx-background-color:transparent");
            adtopic_btn6.setStyle("-fx-background-color:transparent");
            adtopic_btn7.setStyle("-fx-background-color:transparent");
            adtopic_btn8.setStyle("-fx-background-color:transparent");

        } 
        else if (event.getSource() == adtopic_btn2) {
            adtopic_pane1.setVisible(false);
            adtopic_pane2.setVisible(true);
            adtopic_pane3.setVisible(false);
            adtopic_pane4.setVisible(false);
            adtopic_pane5.setVisible(false);
            adtopic_pane6.setVisible(false);
            adtopic_pane7.setVisible(false);
            adtopic_pane8.setVisible(false);
            
            adtopic_btn2.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            adtopic_btn1.setStyle("-fx-background-color:transparent");
            adtopic_btn3.setStyle("-fx-background-color:transparent");
            adtopic_btn4.setStyle("-fx-background-color:transparent");
            adtopic_btn5.setStyle("-fx-background-color:transparent");
            adtopic_btn6.setStyle("-fx-background-color:transparent");
            adtopic_btn7.setStyle("-fx-background-color:transparent");
            adtopic_btn8.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == adtopic_btn3) {
            adtopic_pane1.setVisible(false);
            adtopic_pane2.setVisible(false);
            adtopic_pane3.setVisible(true);
            adtopic_pane4.setVisible(false);
            adtopic_pane5.setVisible(false);
            adtopic_pane6.setVisible(false);
            adtopic_pane7.setVisible(false);
            adtopic_pane8.setVisible(false);
            
            adtopic_btn3.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            adtopic_btn2.setStyle("-fx-background-color:transparent");
            adtopic_btn1.setStyle("-fx-background-color:transparent");
            adtopic_btn4.setStyle("-fx-background-color:transparent");
            adtopic_btn5.setStyle("-fx-background-color:transparent");
            adtopic_btn6.setStyle("-fx-background-color:transparent");
            adtopic_btn7.setStyle("-fx-background-color:transparent");
            adtopic_btn8.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == adtopic_btn4) {
            adtopic_pane1.setVisible(false);
            adtopic_pane2.setVisible(false);
            adtopic_pane3.setVisible(false);
            adtopic_pane4.setVisible(true);
            adtopic_pane5.setVisible(false);
            adtopic_pane6.setVisible(false);
            adtopic_pane7.setVisible(false);
            adtopic_pane8.setVisible(false);
            
            adtopic_btn4.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            adtopic_btn2.setStyle("-fx-background-color:transparent");
            adtopic_btn3.setStyle("-fx-background-color:transparent");
            adtopic_btn1.setStyle("-fx-background-color:transparent");
            adtopic_btn5.setStyle("-fx-background-color:transparent");
            adtopic_btn6.setStyle("-fx-background-color:transparent");
            adtopic_btn7.setStyle("-fx-background-color:transparent");
            adtopic_btn8.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == adtopic_btn5) {
            adtopic_pane1.setVisible(false);
            adtopic_pane2.setVisible(false);
            adtopic_pane3.setVisible(false);
            adtopic_pane4.setVisible(false);
            adtopic_pane5.setVisible(true);
            adtopic_pane6.setVisible(false);
            adtopic_pane7.setVisible(false);
            adtopic_pane8.setVisible(false);
            
            adtopic_btn5.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            adtopic_btn2.setStyle("-fx-background-color:transparent");
            adtopic_btn3.setStyle("-fx-background-color:transparent");
            adtopic_btn4.setStyle("-fx-background-color:transparent");
            adtopic_btn1.setStyle("-fx-background-color:transparent");
            adtopic_btn6.setStyle("-fx-background-color:transparent");
            adtopic_btn7.setStyle("-fx-background-color:transparent");
            adtopic_btn8.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == adtopic_btn6) {
            adtopic_pane1.setVisible(false);
            adtopic_pane2.setVisible(false);
            adtopic_pane3.setVisible(false);
            adtopic_pane4.setVisible(false);
            adtopic_pane5.setVisible(false);
            adtopic_pane6.setVisible(true);
            adtopic_pane7.setVisible(false);
            adtopic_pane8.setVisible(false);
            
            adtopic_btn6.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            adtopic_btn2.setStyle("-fx-background-color:transparent");
            adtopic_btn3.setStyle("-fx-background-color:transparent");
            adtopic_btn4.setStyle("-fx-background-color:transparent");
            adtopic_btn5.setStyle("-fx-background-color:transparent");
            adtopic_btn1.setStyle("-fx-background-color:transparent");
            adtopic_btn7.setStyle("-fx-background-color:transparent");
            adtopic_btn8.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == adtopic_btn7) {
            adtopic_pane1.setVisible(false);
            adtopic_pane2.setVisible(false);
            adtopic_pane3.setVisible(false);
            adtopic_pane4.setVisible(false);
            adtopic_pane5.setVisible(false);
            adtopic_pane6.setVisible(false);
            adtopic_pane7.setVisible(true);
            adtopic_pane8.setVisible(false);
            
            adtopic_btn7.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            adtopic_btn2.setStyle("-fx-background-color:transparent");
            adtopic_btn3.setStyle("-fx-background-color:transparent");
            adtopic_btn4.setStyle("-fx-background-color:transparent");
            adtopic_btn5.setStyle("-fx-background-color:transparent");
            adtopic_btn6.setStyle("-fx-background-color:transparent");
            adtopic_btn1.setStyle("-fx-background-color:transparent");
            adtopic_btn8.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == adtopic_btn8) {
            adtopic_pane1.setVisible(false);
            adtopic_pane2.setVisible(false);
            adtopic_pane3.setVisible(false);
            adtopic_pane4.setVisible(false);
            adtopic_pane5.setVisible(false);
            adtopic_pane6.setVisible(false);
            adtopic_pane7.setVisible(false);
            adtopic_pane8.setVisible(true);
            
            adtopic_btn8.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            adtopic_btn2.setStyle("-fx-background-color:transparent");
            adtopic_btn3.setStyle("-fx-background-color:transparent");
            adtopic_btn4.setStyle("-fx-background-color:transparent");
            adtopic_btn5.setStyle("-fx-background-color:transparent");
            adtopic_btn6.setStyle("-fx-background-color:transparent");
            adtopic_btn7.setStyle("-fx-background-color:transparent");
            adtopic_btn1.setStyle("-fx-background-color:transparent");
        }
    }    
    private double x = 0;
    private double y = 0;    
// This is a method that use to Log out the Home Panel   
    public void logout() {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Message");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to logout?");
        Optional<ButtonType> option = alert.showAndWait();
        try {
            if (option.get().equals(ButtonType.OK)) {

                logout.getScene().getWindow().hide();
                Parent root = FXMLLoader.load(getClass().getResource("/assignment4/Login.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(root);

                root.setOnMousePressed((MouseEvent event) -> {
                    x = event.getSceneX();
                    y = event.getSceneY();
                });

                root.setOnMouseDragged((MouseEvent event) -> {
                    stage.setX(event.getScreenX() - x);
                    stage.setY(event.getScreenY() - y);

                    stage.setOpacity(.8);
                });

                root.setOnMouseReleased((MouseEvent event) -> {
                    stage.setOpacity(1);
                });

                stage.initStyle(StageStyle.DECORATED);

                stage.setScene(scene);
                stage.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
// This is a method that use to close the application    
    public void close() {
        System.exit(0);
    }
// This is a method that use to minimize the application     
    public void minimize() {
        Stage stage = (Stage) main_form.getScene().getWindow();
        stage.setIconified(true);
    }    
}


    


