package com.worldskills.wsapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.nio.file.Paths;

@SpringBootApplication
public class WsapplicationApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(WsapplicationApplication.class);
        FXMLLoader loader = new FXMLLoader(WsapplicationApplication.class.getResource("/view/main.fxml"));
        loader.setControllerFactory(applicationContext::getBean);
        Scene scene = new Scene(loader.load(), 400, 400, false, SceneAntialiasing.BALANCED);


        stage.setScene(scene);
        stage.getIcons().add(new Image(String.valueOf(WsapplicationApplication.class.getResource("/pictures/logo.png"))));
        stage.show();
    }
}
