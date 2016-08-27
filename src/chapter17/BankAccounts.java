/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter17;

//import static chapter17.StudentRecords.loadObject;
import java.io.*;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage; 
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.control.ContentDisplay;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import java.util.*;

public class BankAccounts extends Application {
    
    public static void main(String[] args) { Application.launch(args); }
    
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
    FlowPane pane = new FlowPane();
    TextField nameField = new TextField();
    TextField positionField = new TextField();
    TextField departmentField = new TextField();
    TextField cityField = new TextField();
    TextField stateField = new TextField();
    TextField zipField = new TextField();
    long length;
    
    int numOfEntries;
    pane.setPadding(new Insets(10,10,10,10));
        pane.setVgap(5);
        pane.setHgap(8);
        
        nameField.setMinWidth(310);
        positionField.setMinWidth(310);
        departmentField.setMinWidth(310);
        cityField.setMaxWidth(140);
        stateField.setMaxWidth(40);
        zipField.setMaxWidth(70);
        pane.getChildren().addAll(new Label("Name "), nameField,
                new Label("Position"), positionField,new Label("Department"), departmentField, new Label("City   "),
                cityField, new Label("State"), stateField, new Label("Zip"),
                zipField);
        Button add = new Button("Add");
        Button first = new Button("First");
        Button next = new Button("Next");
        Button previous = new Button("Previous");
        Button last = new Button("Last");
        Button update = new Button("Update");
        Button DeSerialize = new Button("DeSerialize");
         Button Serialize = new Button("Serialize");

        pane.getChildren().addAll(add, first, next, previous, last, update,DeSerialize, Serialize);
        
        
        
        //length = file.length();
    
    TextField[] fields = {nameField, positionField, departmentField, cityField,
        stateField, zipField};
        Scene scene = new Scene(new BookPane1().getPane(), 400, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank Accounts");
        primaryStage.show(); 
        
        
        
    }
    
    
}
