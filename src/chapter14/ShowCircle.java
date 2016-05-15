package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.*;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ShowCircle extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a circle and set its properties
    Circle circle = new Circle(20,20,3);
    Rectangle r1 = new Rectangle(50,100,20,19);
    r1.setFill(Color.GREEN);
   // r1.setArcHeight(30);
    //r1.setArcWidth(20);
  //  r1.setHeight(30);
    //r1.setWidth(16);
    r1.setFill(Color.BLACK);
    Rectangle filler = new Rectangle(100, 50, 30, 40);
  filler.setFill(Color.RED);
    Circle circle1 = new Circle();
    circle.setCenterX(100);
    circle.setCenterY(100);
    circle.setRadius(50);
    circle1.setCenterX(10);
    circle1.setCenterY(10);
    circle1.setRadius(25);
    circle.setStroke(Color.BLACK);
    circle.setFill(Color.GREEN);
    
    Arc arc = new Arc(20.0,20.0,20.0,20.0,20.0,20.0);
     arc.setFill(Color.RED); // Set fill color
    arc.setType(ArcType.ROUND); // Set arc type
    // Create a pane to hold the circle 
    Pane pane = new Pane();
 //   pane.getChildren().add(circle);
   //  pane.getChildren().add(circle1);
   // pane.getChildren().add(r1);
     pane.getChildren().add(arc);
   // pane.getChildren().add(filler);
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 200, 200);
    primaryStage.setTitle("ShowCircle"); // Set the stage title
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
