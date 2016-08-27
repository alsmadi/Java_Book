package chapter16;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class ButtonDemo extends Application {
  protected Text text = new Text(50, 50, "JavaFX Programming");
  
   Button test1;
  protected BorderPane getPane() {
    HBox paneForButtons = new HBox(20);
    Button test= new Button();
    test1= new Button("test1");
    Button btLeft = new Button("Left", 
      new ImageView("image/left.gif"));
    Button btRight = new Button("Right", 
      new ImageView("image/right.gif"));   
    paneForButtons.getChildren().addAll(btLeft, btRight, test, test1);
    paneForButtons.setAlignment(Pos.CENTER);
    paneForButtons.setStyle("-fx-border-color: green");

    BorderPane pane = new BorderPane();
    pane.setBottom(paneForButtons);
    
    Pane paneForText = new Pane();
    paneForText.getChildren().add(text);
    pane.setCenter(paneForText);
    
    btLeft.setOnAction(e -> text.setX(text.getX() - 10));
    
     btLeft.setOnAction(e -> test.setStyle("-fx-background-color: white;"));
    btRight.setOnAction(e -> text.setX(text.getX() + 10));
     btRight.setOnAction(e -> test());
    
    return pane;
  }
  
  void test(){
     test1.setStyle("-fx-background-color: green;"); 
  }
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a scene and place it in the stage
    Scene scene = new Scene(getPane(), 450, 200);
    primaryStage.setTitle("ButtonDemo"); // Set the stage title
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
