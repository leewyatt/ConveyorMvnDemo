package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.components.HelloBox;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        HelloBox helloBox = new HelloBox();
        Scene scene = new Scene(helloBox, 380, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello Conveyor");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}