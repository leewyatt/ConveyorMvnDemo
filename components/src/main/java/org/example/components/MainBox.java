package org.example.components;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MainBox extends VBox {

    public MainBox() {
        getStyleClass().add("main-box");
        Label label = new Label("-----------");
        Button button = new Button("Show Time");
        button.setOnAction(e ->
                label.setText(new java.util.Date().toString())
        );
        getChildren().addAll(label, button);
    }
}