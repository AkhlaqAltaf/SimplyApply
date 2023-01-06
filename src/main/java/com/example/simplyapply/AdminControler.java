package com.example.simplyapply;

import DB.DataBase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.effect.BlendMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.URL;
import java.util.EventListener;
import java.util.Objects;
import java.util.ResourceBundle;


public class AdminControler {

    @FXML
    private AnchorPane rightSide;
    @FXML
    private AnchorPane setRight;

    private Scene  scene;






    FXMLLoader loader;






    public Scene loginPage(){

        Parent root;

        try {
            root = loader.load(getClass().getResource("LoginPage.fxml"));


        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        scene=new Scene(root);

     return scene;



    }

    public void loginClick(ActionEvent event){

        final Node source = (Node) event.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();


        stage.close();

        Stage primaryStage=new Stage();

        primaryStage.setScene(admin());
        primaryStage.show();



    }



    public Scene admin(){


        Parent root,root2;

        try {
            root = loader.load(getClass().getResource("AdminDashboard.fxml"));



        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        scene=new Scene(root);

        return  scene;

    }






    public void requesClick(ActionEvent e){
      PandingRequest map=new PandingRequest();

    rightSide.getChildren().setAll(map.pandingReqMaper());



    }
    public void dashborad(){

        try {
            setRight = loader.load(getClass().getResource("RightSide.fxml"));


        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        rightSide.getChildren().setAll(setRight);


    };
    public void messageClick(ActionEvent e){


    }
    public void notificationClick(ActionEvent e){


    }

    public void crudsClick(ActionEvent e) {

        try {
            setRight = loader.load(getClass().getResource("CRUDS.fxml"));


        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

          rightSide.getChildren().setAll(setRight);


    }




    public  void  createClick(){
    CreateInstitute create=new CreateInstitute();
    create.createForm();

    }

    public void searchClick(){

        RegisteredInstitute map=new RegisteredInstitute();

        rightSide.getChildren().setAll(map.registeredInstMaper());


    }
    public void schoolClick(){


    }

    public void collegeClick(){


    }
    public void universityClick(){

    }

    public void academyClick(){


    }






//    public void saveClick(ActionEvent event){
//        String id=boardID.getText();
//
//        int idInt=Integer.parseInt(id);
//
//        String oID=ownerID.getText();
//
//        int ownID=Integer.parseInt(oID);
//
//  createInst=new CreateInstitute();
//
//        createInst.saveInstitute(idInt,instName.getText(),category.getText(),board.getText(),division.getText(),instAddress.getText(),ownID,
//                ownerName.getText(),email.getText(),ownerAddress.getText());
//
//        final Node source = (Node) event.getSource();
//        final Stage stage = (Stage) source.getScene().getWindow();
//        stage.close();
//
//    }


    public void cancelClick(){



    }
    public void logOutClick(ActionEvent e) {}




//    public void createForm(){
//     Stage  formStage =new Stage();
//        formStage.setTitle("Institute Information Form");
//        Parent root = null;
//
//        try{
//
//            root= loader.load(getClass().getResource("CreateInst.fxml"));
//
//        }catch (Exception e){
//
//        }
//
//        scene=new Scene(root);
//
//        formStage.setScene(scene);
//        formStage.show();
//
//    }



}
