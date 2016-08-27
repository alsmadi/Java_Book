package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a scene and place a button in the scene
    StackPane pane = new StackPane();
    pane.getChildren().add(new Button("OK")); 
     pane.getChildren().add(new Button("OK1")); 
      pane.getChildren().add(new Button("OK2")); 
       pane.getChildren().add(new Button("OK3")); 
        pane.getChildren().add(new Button("OK4")); 
         pane.getChildren().add(new Button("OK5")); 
          pane.getChildren().add(new Button("OK6")); 
           pane.getChildren().add(new Button("OK7")); 
            pane.getChildren().add(new Button("OK8")); 
    Scene scene = new Scene(pane, 200, 50);
    primaryStage.setTitle("Button in a pane"); // Set the stage title
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
