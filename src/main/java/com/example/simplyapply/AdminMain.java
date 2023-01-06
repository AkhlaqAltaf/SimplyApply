package com.example.simplyapply;

import javafx.application.Application;
import javafx.stage.Stage;

public class AdminMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {




          AdminControler controler= new AdminControler();

        primaryStage.setScene(controler.loginPage());
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch();
    }
}
