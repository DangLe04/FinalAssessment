
package Controller;


import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class HomeController {
    
        
    @FXML
    private Button topic_btn1;

    @FXML
    private Button topic_btn2;

    @FXML
    private Button topic_btn3;

    @FXML
    private Button topic_btn4;

    @FXML
    private Button topic_btn5;

    @FXML
    private Button topic_btn6;

    @FXML
    private Button topic_btn7;

    @FXML
    private Button topic_btn8;
    
    @FXML
    private AnchorPane topic_pane1;

    @FXML
    private AnchorPane topic_pane2;

    @FXML
    private AnchorPane topic_pane3;

    @FXML
    private AnchorPane topic_pane4;

    @FXML
    private AnchorPane topic_pane5;

    @FXML
    private AnchorPane topic_pane6;

    @FXML
    private AnchorPane topic_pane7;

    @FXML
    private AnchorPane topic_pane8;    

    @FXML
    private Button addEmployee_btn;

    @FXML
    private AnchorPane addEmployee_form;

    @FXML
    private Button close;

    @FXML
    private Button home_btn,learning_btn,credit_btn,quiz_btn,test_btn,survey_btn;
    
    @FXML
    private AnchorPane credit_form,quiz_form,home_form,learning_form,test_form,survey_form;
    
    @FXML
    private Button quiz_btn1,quiz_btn2;
    
    @FXML
    private AnchorPane quiz_form1,quiz_form2;
    
    @FXML
    private Button logout;

    @FXML
    private AnchorPane main_form;

    @FXML
    private Button minimize;

    @FXML
    private Button salary_btn;

    @FXML
    private Button salary_clearBtn;

    @FXML
    private TableColumn<?, ?> salary_col_employeeID;

    @FXML
    private TableColumn<?, ?> salary_col_firstName;

    @FXML
    private TableColumn<?, ?> salary_col_lastName;

    @FXML
    private TableColumn<?, ?> salary_col_position;

    @FXML
    private TableColumn<?, ?> salary_col_salary;

    @FXML
    private TextField salary_employeeID;

    @FXML
    private Label salary_firstName;

    @FXML
    private AnchorPane salary_form;

    @FXML
    private Label salary_lastName;

    @FXML
    private Label salary_position;

    @FXML
    private TextField salary_salary;

    @FXML
    private TableView<?> salary_tableView;

    @FXML
    private Button salary_updateBtn;

    @FXML
    private Label label1;
    
    @FXML
    private ComboBox comBoBox1;
    
        
    private Stage stage;
    private Scene scene;
    

    
    
    public void initialize(URL url, ResourceBundle rb){   
        

    }
    

//   @FXML
//    public void signoutButtonClicked(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("/assignment4/Login.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }

    @FXML
    void salaryReset(ActionEvent event) {

    }

    @FXML
    void salarySelect(MouseEvent event) {

    }

    @FXML
    void salaryUpdate(ActionEvent event) {

    }

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
            quiz_form1.setVisible(true);
            quiz_form2.setVisible(false);
//            topic_pane3.setVisible(false);
//            topic_pane4.setVisible(false);
//            topic_pane5.setVisible(false);
//            topic_pane6.setVisible(false);
//            topic_pane7.setVisible(false);
//            topic_pane8.setVisible(false);
            
            quiz_btn1.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            quiz_btn2.setStyle("-fx-background-color:transparent");
//            topic_btn3.setStyle("-fx-background-color:transparent");
//            topic_btn4.setStyle("-fx-background-color:transparent");
//            topic_btn5.setStyle("-fx-background-color:transparent");
//            topic_btn6.setStyle("-fx-background-color:transparent");
//            topic_btn7.setStyle("-fx-background-color:transparent");
//            topic_btn8.setStyle("-fx-background-color:transparent");

        } 
        else if (event.getSource() == quiz_btn2) {
            quiz_form1.setVisible(false);
            quiz_form2.setVisible(true);
//            topic_pane3.setVisible(false);
//            topic_pane4.setVisible(false);
//            topic_pane5.setVisible(false);
//            topic_pane6.setVisible(false);
//            topic_pane7.setVisible(false);
//            topic_pane8.setVisible(false);
            
            quiz_btn2.setStyle("-fx-background-color:linear-gradient(to bottom right, #3a4368, #28966c);");
            quiz_btn1.setStyle("-fx-background-color:transparent");
//            topic_btn3.setStyle("-fx-background-color:transparent");
//            topic_btn4.setStyle("-fx-background-color:transparent");
//            topic_btn5.setStyle("-fx-background-color:transparent");
//            topic_btn6.setStyle("-fx-background-color:transparent");
//            topic_btn7.setStyle("-fx-background-color:transparent");
//            topic_btn8.setStyle("-fx-background-color:transparent");
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
