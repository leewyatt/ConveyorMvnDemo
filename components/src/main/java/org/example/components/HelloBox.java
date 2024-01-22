package org.example.components;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class HelloBox extends VBox {

    public HelloBox() {
        Label label = new Label();

        Button button = new Button("Say Hello");
        button.setOnAction(e ->
                label.setText("Hello World; Hello Conveyor!")
        );

        getChildren().addAll(label, button);
        setAlignment(Pos.CENTER);
        setSpacing(20);
    }

}