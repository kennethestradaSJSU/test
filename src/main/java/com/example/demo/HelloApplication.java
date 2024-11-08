package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.*;

import java.io.IOException;

public class HelloApplication extends Application {
//    @Override
//    public void start(Stage primaryStage) {
//        // Set up UI components
//        Label label = new Label("Hello, JavaFX!");
//        StackPane root = new StackPane(label);
//        Scene scene = new Scene(root, 300, 200);
//
//        // Set up and display the stage
//        primaryStage.setTitle("JavaFX Application");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }

//    @Override
//    public void start(Stage primaryStage) {
//        Rectangle rectangle = new Rectangle(200, 150);
//        rectangle.setFill(Color.RED);
//
//        Button button = new Button("Click Me");
//
//        StackPane stackPane = new StackPane();
//        stackPane.getChildren().addAll(rectangle, button);
//        // The button will be on top
//
//        Scene scene = new Scene(stackPane, 300, 250);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }

//    @Override
//    public void start(Stage primaryStage) {
//        Label topLabel = new Label("Top");
//        Label leftLabel = new Label("Left");
//        Label rightLabel = new Label("Right");
//        Label bottomLabel = new Label("Bottom");
//        Label centerLabel = new Label("Center");
//
//        BorderPane borderPane = new BorderPane();
//        borderPane.setTop(topLabel);
//        borderPane.setLeft(leftLabel);
//        borderPane.setRight(rightLabel);
//        borderPane.setBottom(bottomLabel);
//        borderPane.setCenter(centerLabel);
//
//        // Create a scene with the BorderPane as the root node
//        Scene scene = new Scene(borderPane, 300, 200);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//    }

//        @Override
//        public void start(Stage primaryStage) {
//            // Create labels for each region
//            Label topLabel = new Label("Top");
//            Label leftLabel = new Label("Left");
//            Label rightLabel = new Label("Right");
//            Label bottomLabel = new Label("Bottom");
//            Label centerLabel = new Label("Center");
//
//            // Set the labels in the respective regions
//            BorderPane borderPane = new BorderPane();
//            borderPane.setTop(topLabel);
//            borderPane.setLeft(leftLabel);
//            borderPane.setRight(rightLabel);
//            borderPane.setBottom(bottomLabel);
//            borderPane.setCenter(centerLabel);
//            // Align the labels within their regions
//            BorderPane.setAlignment(topLabel, Pos.CENTER);
//            BorderPane.setAlignment(leftLabel, Pos.CENTER_LEFT);
//            BorderPane.setAlignment(rightLabel, Pos.CENTER_RIGHT);
//            BorderPane.setAlignment(bottomLabel, Pos.CENTER);
//            BorderPane.setAlignment(centerLabel, Pos.CENTER);
//
//            // Create a scene with the BorderPane as the root node
//            Scene scene = new Scene(borderPane, 300, 200);
//
//            primaryStage.setTitle("BorderPane Example");
//            primaryStage.setScene(scene);
//            primaryStage.show();
//        }

    @Override
    public void start(Stage primaryStage) {
        // Create an HBox with 20px spacing between children
        HBox hbox = new HBox(20);
        hbox.setPadding(new Insets(15)); // 15px padding
        hbox.setAlignment(Pos.CENTER);

        Button buttonA = new Button("Button A");
        Button buttonB = new Button("Button B");
        Button buttonC = new Button("Button C");
        hbox.getChildren().addAll(buttonA, buttonB, buttonC);

        // Create a scene with the HBox as the root node
        Scene scene = new Scene(hbox, 300, 200);

        // Set up the stage
        primaryStage.setTitle("HBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }




    public static void main(String[] args) {
            launch(args);
        }
}