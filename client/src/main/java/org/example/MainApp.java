package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.example.components.MainBox;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        String version = System.getProperty("app.version");
        if (version == null){
            version = "Dev";
        }

        String revision = System.getProperty("app.revision");
        String fullVersion = version + (revision != null ? "-" + revision : "");

        MainBox root = new MainBox();
        root.getChildren().add(new Label(fullVersion));

        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.setTitle("Hello Conveyor");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}