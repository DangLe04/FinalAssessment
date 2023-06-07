package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class HomeController {   
        
    @FXML
    private Button topic_btn1,topic_btn2,topic_btn3,topic_btn4,topic_btn5,topic_btn6,topic_btn7,topic_btn8;
    
    @FXML
    private AnchorPane topic_pane1,topic_pane2,topic_pane3,topic_pane4,topic_pane5,topic_pane6,topic_pane7,topic_pane8;

    @FXML
    private Button home_btn,learning_btn,credit_btn,quiz_btn,test_btn,survey_btn;
    
    @FXML
    private AnchorPane credit_form,quiz_form,home_form,learning_form,test_form,survey_form;
    
    @FXML
    private Button quiz_btn1,quiz_btn2,quiz_btn3,quiz_btn4,quiz_btn5,quiz_btn6,quiz_btn7,quiz_btn8,quizdone_btn;    
    
    @FXML
    private AnchorPane quiz_form1,quiz_form2,quiz_form3,quiz_form4,quiz_form5,quiz_form6,quiz_form7,quiz_form8,completed_form;
 
    @FXML
    private Button test_btn1,test_btn2,test_btn3,test_btn4,test_btn5,test_btn6,test_btn7,test_btn8,testdone_btn;

    @FXML
    private AnchorPane test_form1,test_form2,test_form3,test_form4,test_form5,test_form6,test_form7,test_form8,completedtest_form;
    
    @FXML
    private Button addEmployee_btn;

    @FXML
    private AnchorPane addEmployee_form;

    @FXML
    private Button close;
    
    @FXML
    private Button user_proflie;
    
    @FXML
    private Button logout;

    @FXML
    private AnchorPane main_form;

    @FXML
    private Button minimize;
    
    @FXML
    private Label username_lb;
    
    @FXML
    private ComboBox comBoBox1;  
    
    @FXML
    private ComboBox<?> survey1;
    

    public void initialize(URL url, ResourceBundle rb){ 
    
    }
    
//    private  String[] listGender = {"1", "2", "3"};

//    public void addEmployeeGendernList() {
//        List<String> listG = new ArrayList<>();
//
//        listG.addAll(Arrays.asList(listGender));
//
//        ObservableList listData = FXCollections.observableArrayList(listG);
//        survey1.setItems(listData);
//    }


// This is a method that place on the button to switch to every panels 
    @FXML
    void switchForm(ActionEvent event) {
        
        if (event.getSource() == home_btn) {
            home_form.setVisible(true);
            learning_form.setVisible(false);
            credit_form.setVisible(false);
            quiz_form.setVisible(false);
            credit_form.setVisible(false);
            quiz_form.setVisible(false);            

            home_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            learning_btn.setStyle("-fx-background-color:transparent");
            credit_btn.setStyle("-fx-background-color:transparent");
            quiz_btn.setStyle("-fx-background-color:transparent");
            survey_btn.setStyle("-fx-background-color:transparent");
            test_btn.setStyle("-fx-background-color:transparent");

        } 
        else if (event.getSource() == learning_btn) {
            home_form.setVisible(false);
            learning_form.setVisible(true);
            credit_form.setVisible(false);
            quiz_form.setVisible(false);
            credit_form.setVisible(false);
            quiz_form.setVisible(false);
            
            learning_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            credit_btn.setStyle("-fx-background-color:transparent");
            home_btn.setStyle("-fx-background-color:transparent");
            quiz_btn.setStyle("-fx-background-color:transparent");
            survey_btn.setStyle("-fx-background-color:transparent");
            test_btn.setStyle("-fx-background-color:transparent");

        }          
        else if (event.getSource() == credit_btn) {
            home_form.setVisible(false);
            learning_form.setVisible(false);
            credit_form.setVisible(true);
            test_form.setVisible(false);
            survey_form.setVisible(false);
            quiz_form.setVisible(false);
            
            credit_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            learning_btn.setStyle("-fx-background-color:transparent");
            home_btn.setStyle("-fx-background-color:transparent");
            quiz_btn.setStyle("-fx-background-color:transparent");
            survey_btn.setStyle("-fx-background-color:transparent");
            test_btn.setStyle("-fx-background-color:transparent");

          }          
        else if (event.getSource() == quiz_btn) {
            home_form.setVisible(false);
            learning_form.setVisible(false);
            credit_form.setVisible(false);
            quiz_form.setVisible(true);
            survey_form.setVisible(false);
            test_form.setVisible(false);
            
            quiz_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            learning_btn.setStyle("-fx-background-color:transparent");
            home_btn.setStyle("-fx-background-color:transparent");
            credit_btn.setStyle("-fx-background-color:transparent");
            test_btn.setStyle("-fx-background-color:transparent");
            survey_btn.setStyle("-fx-background-color:transparent");

          }
        else if (event.getSource() == test_btn) {
            home_form.setVisible(false);
            learning_form.setVisible(false);
            credit_form.setVisible(false);
            test_form.setVisible(true);
            survey_form.setVisible(false);
            quiz_form.setVisible(false);
            
            test_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            learning_btn.setStyle("-fx-background-color:transparent");
            home_btn.setStyle("-fx-background-color:transparent");
            credit_btn.setStyle("-fx-background-color:transparent");
            survey_btn.setStyle("-fx-background-color:transparent");
            quiz_btn.setStyle("-fx-background-color:transparent");
            
          }
        else if (event.getSource() == survey_btn) {
            home_form.setVisible(false);
            learning_form.setVisible(false);
            test_form.setVisible(false);
            survey_form.setVisible(true);
            credit_form.setVisible(false);
            quiz_form.setVisible(false);
            
            survey_btn.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            learning_btn.setStyle("-fx-background-color:transparent");
            home_btn.setStyle("-fx-background-color:transparent");
            credit_btn.setStyle("-fx-background-color:transparent");
            test_btn.setStyle("-fx-background-color:transparent");
            quiz_btn.setStyle("-fx-background-color:transparent");

          }
          

    }
// This is a method that use to switch inside the Learning Material panel   
    @FXML
    void switchTopicPane(ActionEvent event) {
        
          if (event.getSource() == topic_btn1) {
            topic_pane1.setVisible(true);
            topic_pane2.setVisible(false);
            topic_pane3.setVisible(false);
            topic_pane4.setVisible(false);
            topic_pane5.setVisible(false);
            topic_pane6.setVisible(false);
            topic_pane7.setVisible(false);
            topic_pane8.setVisible(false);
            
            topic_btn1.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            topic_btn2.setStyle("-fx-background-color:transparent");
            topic_btn3.setStyle("-fx-background-color:transparent");
            topic_btn4.setStyle("-fx-background-color:transparent");
            topic_btn5.setStyle("-fx-background-color:transparent");
            topic_btn6.setStyle("-fx-background-color:transparent");
            topic_btn7.setStyle("-fx-background-color:transparent");
            topic_btn8.setStyle("-fx-background-color:transparent");

        } 
        else if (event.getSource() == topic_btn2) {
            topic_pane1.setVisible(false);
            topic_pane2.setVisible(true);
            topic_pane3.setVisible(false);
            topic_pane4.setVisible(false);
            topic_pane5.setVisible(false);
            topic_pane6.setVisible(false);
            topic_pane7.setVisible(false);
            topic_pane8.setVisible(false);
            
            topic_btn2.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            topic_btn1.setStyle("-fx-background-color:transparent");
            topic_btn3.setStyle("-fx-background-color:transparent");
            topic_btn4.setStyle("-fx-background-color:transparent");
            topic_btn5.setStyle("-fx-background-color:transparent");
            topic_btn6.setStyle("-fx-background-color:transparent");
            topic_btn7.setStyle("-fx-background-color:transparent");
            topic_btn8.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == topic_btn3) {
            topic_pane1.setVisible(false);
            topic_pane2.setVisible(false);
            topic_pane3.setVisible(true);
            topic_pane4.setVisible(false);
            topic_pane5.setVisible(false);
            topic_pane6.setVisible(false);
            topic_pane7.setVisible(false);
            topic_pane8.setVisible(false);
            
            topic_btn3.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            topic_btn1.setStyle("-fx-background-color:transparent");
            topic_btn2.setStyle("-fx-background-color:transparent");
            topic_btn4.setStyle("-fx-background-color:transparent");
            topic_btn5.setStyle("-fx-background-color:transparent");
            topic_btn6.setStyle("-fx-background-color:transparent");
            topic_btn7.setStyle("-fx-background-color:transparent");
            topic_btn8.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == topic_btn4) {
            topic_pane1.setVisible(false);
            topic_pane2.setVisible(false);
            topic_pane3.setVisible(false);
            topic_pane4.setVisible(true);
            topic_pane5.setVisible(false);
            topic_pane6.setVisible(false);
            topic_pane7.setVisible(false);
            topic_pane8.setVisible(false);
            
            topic_btn4.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            topic_btn1.setStyle("-fx-background-color:transparent");
            topic_btn2.setStyle("-fx-background-color:transparent");
            topic_btn3.setStyle("-fx-background-color:transparent");
            topic_btn5.setStyle("-fx-background-color:transparent");
            topic_btn6.setStyle("-fx-background-color:transparent");
            topic_btn7.setStyle("-fx-background-color:transparent");
            topic_btn8.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == topic_btn5) {
            topic_pane1.setVisible(false);
            topic_pane2.setVisible(false);
            topic_pane3.setVisible(false);
            topic_pane4.setVisible(false);
            topic_pane5.setVisible(true);
            topic_pane6.setVisible(false);
            topic_pane7.setVisible(false);
            topic_pane8.setVisible(false);
            
            topic_btn5.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            topic_btn1.setStyle("-fx-background-color:transparent");
            topic_btn2.setStyle("-fx-background-color:transparent");
            topic_btn4.setStyle("-fx-background-color:transparent");
            topic_btn3.setStyle("-fx-background-color:transparent");
            topic_btn6.setStyle("-fx-background-color:transparent");
            topic_btn7.setStyle("-fx-background-color:transparent");
            topic_btn8.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == topic_btn6) {
            topic_pane1.setVisible(false);
            topic_pane2.setVisible(false);
            topic_pane3.setVisible(false);
            topic_pane4.setVisible(false);
            topic_pane5.setVisible(false);
            topic_pane6.setVisible(true);
            topic_pane7.setVisible(false);
            topic_pane8.setVisible(false);
            
            topic_btn6.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            topic_btn1.setStyle("-fx-background-color:transparent");
            topic_btn2.setStyle("-fx-background-color:transparent");
            topic_btn4.setStyle("-fx-background-color:transparent");
            topic_btn5.setStyle("-fx-background-color:transparent");
            topic_btn3.setStyle("-fx-background-color:transparent");
            topic_btn7.setStyle("-fx-background-color:transparent");
            topic_btn8.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == topic_btn7) {
            topic_pane1.setVisible(false);
            topic_pane2.setVisible(false);
            topic_pane3.setVisible(false);
            topic_pane4.setVisible(false);
            topic_pane5.setVisible(false);
            topic_pane6.setVisible(false);
            topic_pane7.setVisible(true);
            topic_pane8.setVisible(false);
            
            topic_btn7.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            topic_btn1.setStyle("-fx-background-color:transparent");
            topic_btn2.setStyle("-fx-background-color:transparent");
            topic_btn4.setStyle("-fx-background-color:transparent");
            topic_btn5.setStyle("-fx-background-color:transparent");
            topic_btn3.setStyle("-fx-background-color:transparent");
            topic_btn6.setStyle("-fx-background-color:transparent");
            topic_btn8.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == topic_btn8) {
            topic_pane1.setVisible(false);
            topic_pane2.setVisible(false);
            topic_pane3.setVisible(false);
            topic_pane4.setVisible(false);
            topic_pane5.setVisible(false);
            topic_pane6.setVisible(false);
            topic_pane7.setVisible(false);
            topic_pane8.setVisible(true);
            
            topic_btn8.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            topic_btn1.setStyle("-fx-background-color:transparent");
            topic_btn2.setStyle("-fx-background-color:transparent");
            topic_btn4.setStyle("-fx-background-color:transparent");
            topic_btn5.setStyle("-fx-background-color:transparent");
            topic_btn3.setStyle("-fx-background-color:transparent");
            topic_btn7.setStyle("-fx-background-color:transparent");
            topic_btn6.setStyle("-fx-background-color:transparent");
        }
        
          
    }
// This is a method that use to switch inside the Quiz panel     
    @FXML
    void switchQuizPane(ActionEvent event) {
        
        if (event.getSource() == quiz_btn1) {
            quiz_form1.setVisible(false);
            quiz_form2.setVisible(true);
            quiz_form3.setVisible(false);
            quiz_form4.setVisible(false);
            quiz_form5.setVisible(false);
            quiz_form6.setVisible(false);
            quiz_form7.setVisible(false);
            quiz_form8.setVisible(false);
            completed_form.setVisible(false);
            
            quiz_btn2.setStyle("-fx-background-color:black;");
            quiz_btn1.setStyle("-fx-background-color:transparent");
            quiz_btn3.setStyle("-fx-background-color:transparent");
            quiz_btn4.setStyle("-fx-background-color:transparent");
            quiz_btn5.setStyle("-fx-background-color:transparent");
            quiz_btn6.setStyle("-fx-background-color:transparent");
            quiz_btn7.setStyle("-fx-background-color:transparent");
            quiz_btn8.setStyle("-fx-background-color:transparent");
            quizdone_btn.setStyle("-fx-background-color:transparent");

        } 
        else if (event.getSource() == quiz_btn2) {
            quiz_form1.setVisible(false);
            quiz_form2.setVisible(false);
            quiz_form3.setVisible(true);
            quiz_form4.setVisible(false);
            quiz_form5.setVisible(false);
            quiz_form6.setVisible(false);
            quiz_form7.setVisible(false);
            quiz_form8.setVisible(false);
            completed_form.setVisible(false);
            
            quiz_btn3.setStyle("-fx-background-color:black;");
            quiz_btn1.setStyle("-fx-background-color:transparent");
            quiz_btn2.setStyle("-fx-background-color:transparent");
            quiz_btn4.setStyle("-fx-background-color:transparent");
            quiz_btn5.setStyle("-fx-background-color:transparent");
            quiz_btn6.setStyle("-fx-background-color:transparent");
            quiz_btn7.setStyle("-fx-background-color:transparent");
            quiz_btn8.setStyle("-fx-background-color:transparent");
            quizdone_btn.setStyle("-fx-background-color:transparent");            
        }
        else if (event.getSource() == quiz_btn3) {
            quiz_form1.setVisible(false);
            quiz_form2.setVisible(false);
            quiz_form3.setVisible(false);
            quiz_form4.setVisible(true);
            quiz_form5.setVisible(false);
            quiz_form6.setVisible(false);
            quiz_form7.setVisible(false);
            quiz_form8.setVisible(false);
            completed_form.setVisible(false);
            
            quiz_btn4.setStyle("-fx-background-color:black;");
            quiz_btn1.setStyle("-fx-background-color:transparent");
            quiz_btn2.setStyle("-fx-background-color:transparent");
            quiz_btn3.setStyle("-fx-background-color:transparent");
            quiz_btn5.setStyle("-fx-background-color:transparent");
            quiz_btn6.setStyle("-fx-background-color:transparent");
            quiz_btn7.setStyle("-fx-background-color:transparent");
            quiz_btn8.setStyle("-fx-background-color:transparent");
            quizdone_btn.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == quiz_btn4) {
            quiz_form1.setVisible(false);
            quiz_form2.setVisible(false);
            quiz_form3.setVisible(false);
            quiz_form4.setVisible(false);
            quiz_form5.setVisible(true);
            quiz_form6.setVisible(false);
            quiz_form7.setVisible(false);
            quiz_form8.setVisible(false);
            completed_form.setVisible(false);
            
            quiz_btn5.setStyle("-fx-background-color:black;");
            quiz_btn1.setStyle("-fx-background-color:transparent");
            quiz_btn3.setStyle("-fx-background-color:transparent");
            quiz_btn2.setStyle("-fx-background-color:transparent");
            quiz_btn4.setStyle("-fx-background-color:transparent");
            quiz_btn6.setStyle("-fx-background-color:transparent");
            quiz_btn7.setStyle("-fx-background-color:transparent");
            quiz_btn8.setStyle("-fx-background-color:transparent");
            quizdone_btn.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == quiz_btn5) {
            quiz_form1.setVisible(false);
            quiz_form2.setVisible(false);
            quiz_form3.setVisible(false);
            quiz_form4.setVisible(false);
            quiz_form5.setVisible(false);
            quiz_form6.setVisible(true);
            quiz_form7.setVisible(false);
            quiz_form8.setVisible(false);
            completed_form.setVisible(false);
            
            quiz_btn6.setStyle("-fx-background-color:black;");
            quiz_btn1.setStyle("-fx-background-color:transparent");
            quiz_btn3.setStyle("-fx-background-color:transparent");
            quiz_btn4.setStyle("-fx-background-color:transparent");
            quiz_btn2.setStyle("-fx-background-color:transparent");
            quiz_btn5.setStyle("-fx-background-color:transparent");
            quiz_btn7.setStyle("-fx-background-color:transparent");
            quiz_btn8.setStyle("-fx-background-color:transparent");
            quizdone_btn.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == quiz_btn6) {
            quiz_form1.setVisible(false);
            quiz_form2.setVisible(false);
            quiz_form3.setVisible(false);
            quiz_form4.setVisible(false);
            quiz_form5.setVisible(false);
            quiz_form6.setVisible(false);
            quiz_form7.setVisible(true);
            quiz_form8.setVisible(false);
            completed_form.setVisible(false);
            
            quiz_btn7.setStyle("-fx-background-color:black;");
            quiz_btn1.setStyle("-fx-background-color:transparent");
            quiz_btn3.setStyle("-fx-background-color:transparent");
            quiz_btn4.setStyle("-fx-background-color:transparent");
            quiz_btn5.setStyle("-fx-background-color:transparent");
            quiz_btn2.setStyle("-fx-background-color:transparent");
            quiz_btn6.setStyle("-fx-background-color:transparent");
            quiz_btn8.setStyle("-fx-background-color:transparent");
            quizdone_btn.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == quiz_btn7) {
            quiz_form1.setVisible(false);
            quiz_form2.setVisible(false);
            quiz_form3.setVisible(false);
            quiz_form4.setVisible(false);
            quiz_form5.setVisible(false);
            quiz_form6.setVisible(false);
            quiz_form7.setVisible(false);
            quiz_form8.setVisible(true);
            completed_form.setVisible(false);
            
            quiz_btn8.setStyle("-fx-background-color:black;");
            quiz_btn1.setStyle("-fx-background-color:transparent");
            quiz_btn3.setStyle("-fx-background-color:transparent");
            quiz_btn4.setStyle("-fx-background-color:transparent");
            quiz_btn5.setStyle("-fx-background-color:transparent");
            quiz_btn6.setStyle("-fx-background-color:transparent");
            quiz_btn2.setStyle("-fx-background-color:transparent");
            quiz_btn7.setStyle("-fx-background-color:transparent");
            quizdone_btn.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == quiz_btn8) {
            quiz_form1.setVisible(false);
            quiz_form2.setVisible(false);
            quiz_form3.setVisible(false);
            quiz_form4.setVisible(false);
            quiz_form5.setVisible(false);
            quiz_form6.setVisible(false);
            quiz_form7.setVisible(false);
            quiz_form8.setVisible(false);
            completed_form.setVisible(true);
            
            quizdone_btn.setStyle("-fx-background-color:black;");
            quiz_btn8.setStyle("-fx-background-color:transparent");
            quiz_btn3.setStyle("-fx-background-color:transparent");
            quiz_btn4.setStyle("-fx-background-color:transparent");
            quiz_btn5.setStyle("-fx-background-color:transparent");
            quiz_btn6.setStyle("-fx-background-color:transparent");
            quiz_btn7.setStyle("-fx-background-color:transparent");
            quiz_btn2.setStyle("-fx-background-color:transparent");
            quiz_btn1.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == quizdone_btn) {
            quiz_form1.setVisible(true);
            quiz_form2.setVisible(false);
            quiz_form3.setVisible(false);
            quiz_form4.setVisible(false);
            quiz_form5.setVisible(false);
            quiz_form6.setVisible(false);
            quiz_form7.setVisible(false);
            quiz_form8.setVisible(false);
            completed_form.setVisible(false);
            
            quiz_btn1.setStyle("-fx-background-color:black;");
            quiz_btn8.setStyle("-fx-background-color:transparent");
            quiz_btn3.setStyle("-fx-background-color:transparent");
            quiz_btn4.setStyle("-fx-background-color:transparent");
            quiz_btn5.setStyle("-fx-background-color:transparent");
            quiz_btn6.setStyle("-fx-background-color:transparent");
            quiz_btn7.setStyle("-fx-background-color:transparent");
            quiz_btn2.setStyle("-fx-background-color:transparent");
            quizdone_btn.setStyle("-fx-background-color:transparent");
        }            
        
    }
// This is a method that use to switch inside the Test panel 
    @FXML
    void switchTestPane(ActionEvent event) {
        
        if (event.getSource() == test_btn1) {
            test_form1.setVisible(false);
            test_form2.setVisible(true);
            test_form3.setVisible(false);
            test_form4.setVisible(false);
            test_form5.setVisible(false);
            test_form6.setVisible(false);
            test_form7.setVisible(false);
            test_form8.setVisible(false);
            completedtest_form.setVisible(false);
            
            test_btn2.setStyle("-fx-background-color:black;");
            test_btn1.setStyle("-fx-background-color:transparent");
            test_btn3.setStyle("-fx-background-color:transparent");
            test_btn4.setStyle("-fx-background-color:transparent");
            test_btn5.setStyle("-fx-background-color:transparent");
            test_btn6.setStyle("-fx-background-color:transparent");
            test_btn7.setStyle("-fx-background-color:transparent");
            test_btn8.setStyle("-fx-background-color:transparent");
            testdone_btn.setStyle("-fx-background-color:transparent");

        } 
        else if (event.getSource() == test_btn2) {
            test_form1.setVisible(false);
            test_form2.setVisible(false);
            test_form3.setVisible(true);
            test_form4.setVisible(false);
            test_form5.setVisible(false);
            test_form6.setVisible(false);
            test_form7.setVisible(false);
            test_form8.setVisible(false);
            completedtest_form.setVisible(false);
            
            test_btn3.setStyle("-fx-background-color:black;");
            test_btn1.setStyle("-fx-background-color:transparent");
            test_btn2.setStyle("-fx-background-color:transparent");
            test_btn4.setStyle("-fx-background-color:transparent");
            test_btn5.setStyle("-fx-background-color:transparent");
            test_btn6.setStyle("-fx-background-color:transparent");
            test_btn7.setStyle("-fx-background-color:transparent");
            test_btn8.setStyle("-fx-background-color:transparent");
            testdone_btn.setStyle("-fx-background-color:transparent");           
        }
        else if (event.getSource() == test_btn3) {
            test_form1.setVisible(false);
            test_form2.setVisible(false);
            test_form3.setVisible(false);
            test_form4.setVisible(true);
            test_form5.setVisible(false);
            test_form6.setVisible(false);
            test_form7.setVisible(false);
            test_form8.setVisible(false);
            completedtest_form.setVisible(false);
            
            test_btn4.setStyle("-fx-background-color:black;");
            test_btn1.setStyle("-fx-background-color:transparent");
            test_btn3.setStyle("-fx-background-color:transparent");
            test_btn2.setStyle("-fx-background-color:transparent");
            test_btn5.setStyle("-fx-background-color:transparent");
            test_btn6.setStyle("-fx-background-color:transparent");
            test_btn7.setStyle("-fx-background-color:transparent");
            test_btn8.setStyle("-fx-background-color:transparent");
            testdone_btn.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == test_btn4) {
            test_form1.setVisible(false);
            test_form2.setVisible(false);
            test_form3.setVisible(false);
            test_form4.setVisible(false);
            test_form5.setVisible(true);
            test_form6.setVisible(false);
            test_form7.setVisible(false);
            test_form8.setVisible(false);
            completedtest_form.setVisible(false);
            
            test_btn5.setStyle("-fx-background-color:black;");
            test_btn1.setStyle("-fx-background-color:transparent");
            test_btn3.setStyle("-fx-background-color:transparent");
            test_btn4.setStyle("-fx-background-color:transparent");
            test_btn2.setStyle("-fx-background-color:transparent");
            test_btn6.setStyle("-fx-background-color:transparent");
            test_btn7.setStyle("-fx-background-color:transparent");
            test_btn8.setStyle("-fx-background-color:transparent");
            testdone_btn.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == test_btn5) {
            test_form1.setVisible(false);
            test_form2.setVisible(false);
            test_form3.setVisible(false);
            test_form4.setVisible(false);
            test_form5.setVisible(false);
            test_form6.setVisible(true);
            test_form7.setVisible(false);
            test_form8.setVisible(false);
            completedtest_form.setVisible(false);
            
            test_btn6.setStyle("-fx-background-color:black;");
            test_btn1.setStyle("-fx-background-color:transparent");
            test_btn3.setStyle("-fx-background-color:transparent");
            test_btn4.setStyle("-fx-background-color:transparent");
            test_btn5.setStyle("-fx-background-color:transparent");
            test_btn2.setStyle("-fx-background-color:transparent");
            test_btn7.setStyle("-fx-background-color:transparent");
            test_btn8.setStyle("-fx-background-color:transparent");
            testdone_btn.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == test_btn6) {
            test_form1.setVisible(false);
            test_form2.setVisible(false);
            test_form3.setVisible(false);
            test_form4.setVisible(false);
            test_form5.setVisible(false);
            test_form6.setVisible(false);
            test_form7.setVisible(true);
            test_form8.setVisible(false);
            completedtest_form.setVisible(false);
            
            test_btn7.setStyle("-fx-background-color:black;");
            test_btn1.setStyle("-fx-background-color:transparent");
            test_btn3.setStyle("-fx-background-color:transparent");
            test_btn4.setStyle("-fx-background-color:transparent");
            test_btn5.setStyle("-fx-background-color:transparent");
            test_btn6.setStyle("-fx-background-color:transparent");
            test_btn2.setStyle("-fx-background-color:transparent");
            test_btn8.setStyle("-fx-background-color:transparent");
            testdone_btn.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == test_btn7) {
            test_form1.setVisible(false);
            test_form2.setVisible(false);
            test_form3.setVisible(false);
            test_form4.setVisible(false);
            test_form5.setVisible(false);
            test_form6.setVisible(false);
            test_form7.setVisible(false);
            test_form8.setVisible(true);
            completedtest_form.setVisible(false);
            
            test_btn8.setStyle("-fx-background-color:black;");
            test_btn1.setStyle("-fx-background-color:transparent");
            test_btn3.setStyle("-fx-background-color:transparent");
            test_btn4.setStyle("-fx-background-color:transparent");
            test_btn5.setStyle("-fx-background-color:transparent");
            test_btn6.setStyle("-fx-background-color:transparent");
            test_btn7.setStyle("-fx-background-color:transparent");
            test_btn2.setStyle("-fx-background-color:transparent");
            testdone_btn.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == test_btn8) {
            test_form1.setVisible(false);
            test_form2.setVisible(false);
            test_form3.setVisible(false);
            test_form4.setVisible(false);
            test_form5.setVisible(false);
            test_form6.setVisible(false);
            test_form7.setVisible(false);
            test_form8.setVisible(false);
            completedtest_form.setVisible(true);
            
            testdone_btn.setStyle("-fx-background-color:black;");
            test_btn1.setStyle("-fx-background-color:transparent");
            test_btn3.setStyle("-fx-background-color:transparent");
            test_btn4.setStyle("-fx-background-color:transparent");
            test_btn5.setStyle("-fx-background-color:transparent");
            test_btn6.setStyle("-fx-background-color:transparent");
            test_btn7.setStyle("-fx-background-color:transparent");
            test_btn8.setStyle("-fx-background-color:transparent");
            test_btn2.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == testdone_btn) {
            test_form1.setVisible(true);
            test_form2.setVisible(false);   
            test_form3.setVisible(false);
            test_form4.setVisible(false);
            test_form5.setVisible(false);
            test_form6.setVisible(false);
            test_form7.setVisible(false);
            test_form8.setVisible(false);
            completedtest_form.setVisible(false);
            
            test_btn1.setStyle("-fx-background-color:black;");
            test_btn2.setStyle("-fx-background-color:transparent");
            test_btn3.setStyle("-fx-background-color:transparent");
            test_btn4.setStyle("-fx-background-color:transparent");
            test_btn5.setStyle("-fx-background-color:transparent");
            test_btn6.setStyle("-fx-background-color:transparent");
            test_btn7.setStyle("-fx-background-color:transparent");
            test_btn8.setStyle("-fx-background-color:transparent");
            testdone_btn.setStyle("-fx-background-color:transparent");
        }            
        
    }    
    
    private double x = 0;
    private double y = 0;
// This is a method that use to Log out the Home Panel   
    public void logout() {

        Alert alert = new Alert(AlertType.CONFIRMATION);
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
    private Stage stage;
    private Scene scene;
    @FXML
    public void user_profileClicked(ActionEvent event) throws IOException {        
        Parent root = FXMLLoader.load(getClass().getResource("/assignment4/UserProfile.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
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
