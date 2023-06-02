/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author 61452
 */
public class UserpageController {
      
    
    
    @FXML
    private Button pane_btn1;

    @FXML
    private Button pane_btn2;

    @FXML
    private AnchorPane pane_form1;

    @FXML
    private AnchorPane pane_form2;
    
    
    @FXML
    void switchPane(ActionEvent event) {
        
          if (event.getSource() == pane_btn1) {
            pane_form1.setVisible(true);
            pane_form2.setVisible(false);


            pane_btn1.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            pane_form1.setStyle("-fx-background-color:transparent");


        } else if (event.getSource() == pane_btn2) {
            pane_form1.setVisible(false);
            pane_form2.setVisible(true);


            pane_btn2.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            pane_btn2.setStyle("-fx-background-color:transparent");





        }

    }
}
