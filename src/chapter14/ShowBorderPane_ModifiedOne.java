package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class ShowBorderPane extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a border pane 
    BorderPane pane = new BorderPane();

    // Place nodes in the pane
    GridPane p1 = new GridPane();
   
    
      p1.add(new Label("First Name:"), 0, 0);
    p1.add(new TextField("Izzat"), 1, 0);
     p1.add(new Label("Last Name:"), 2, 0);
    p1.add(new TextField("Alsmadi"), 3, 0);
   // p1.getChildren().addAll(new TextField(), new Label("MI:"));
   // TextField tfMi = new TextField();
   // tfMi.setPrefColumnCount(1);
   // p1.getChildren().addAll(tfMi, new Label("Last Name:"),
     // new TextField());
   
   // p1.setStyle(STYLESHEET_MODENA);
    pane.setTop(p1); 
    GridPane p2 = new GridPane();
   
    p2.add(new Label("Major:"), 0, 0); 
    p2.add(new TextField("Software Engineering"), 0, 1);
    pane.setRight(p2);
    GridPane p3 = new GridPane();
    p3.add(new Label("Hobbies.....:"), 0, 0); 
     p3.add(new Label("  Soccer"), 1, 0); 
    Image image3 = new Image("Soccer.jpg");
    ImageView iv = new ImageView();
     iv.setImage(image3);
     iv.setFitWidth(150);
     iv.setFitHeight(150);
    p3.add(iv,1,1);
   // p3.add(new ImageView(image3),1,1);
    pane.setBottom(new CustomPane("Bottom"));
    GridPane p4 = new GridPane();
    //p3.add(new Label("Hobbies"), 1, 0); 
     p4.add(new Label("  Hiking"), 1, 0);
    Image image4 = new Image("Hiking.jpg");
    ImageView iv2 = new ImageView();
     iv2.setImage(image4);
     iv2.setFitWidth(50);
     iv2.setFitHeight(150);
    p4.add(iv2,1,1);
    pane.setLeft(p4);
     GridPane p5 = new GridPane();
    p5.add(new Label("  Programming"), 1, 0);
    Image image5 = new Image("Prog.jpg");
    ImageView iv1 = new ImageView();
     iv1.setImage(image5);
     iv1.setFitWidth(150);
     iv1.setFitHeight(50);
    p5.add(iv1,1,1);
    pane.setBottom(p5);
   // pane.setBottom(new CustomPane("Left"));
    pane.setCenter(p3); 
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("My Home Page"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
   public static void main(String[] args) {
    launch(args);
  }
} 

// Define a custom pane to hold a label in the center of the pane
class CustomPane extends StackPane {
  public CustomPane(String title) {
    getChildren().add(new Label(title));
    setStyle("-fx-border-color: red");
    setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
  }
}