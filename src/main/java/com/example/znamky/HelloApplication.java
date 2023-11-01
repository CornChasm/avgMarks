package com.example.znamky;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 600);
        stage.setTitle("Average out your marks");
        stage.setScene(scene);
        stage.show();
        stage.setMinWidth(400);
        stage.setMinHeight(600);
    }

    public static void main(String[] args) {
        launch();
    }
}
