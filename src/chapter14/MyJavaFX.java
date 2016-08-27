package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Border;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MyJavaFX extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a button and place it in the scene
    Button btOK = new Button("NotOK");
    btOK.setBorder(Border.EMPTY);
    btOK.setStyle("-fx-border-color: red;");
    btOK.setFont(Font.font("Times New Roman", 
      FontWeight.BOLD, FontPosture.ITALIC, 40));
   // This code is added in version 2
     Button btCANCEL = new Button("CANCEL");
    btCANCEL.setBorder(Border.EMPTY);
    btCANCEL.setStyle("-fx-border-color: blue;");
    btCANCEL.setFont(Font.font("Times New Roman", 
      FontWeight.BOLD, FontPosture.ITALIC, 40));
    
    Button btn2 = new Button();
    
     Pane pane = new HBox(10);
      pane.getChildren().add(btCANCEL);
       pane.getChildren().add(btOK);    
    //   pane.getChildren().add(btn2);  
    
    Scene scene = new Scene(pane, 100, 150); 
    //Scene scene = new Scene(btOK, 10, 150);
    primaryStage.setTitle("MyJavaFX"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
   primaryStage.show(); // Display the stage
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  
  public static void main(String[] args) { 
    launch(args);
  } 
}
