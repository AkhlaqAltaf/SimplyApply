package com.example.simplyapply;



import DB.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class RegisteredInstData {

    @FXML
    private Button sendMessage=new Button();



    @FXML
    private Button blackList=new Button();
    @FXML
    private Label address=new Label();

    @FXML
    private Label boardID=new Label();

    @FXML
    private Label boardName=new Label();

    @FXML
    private Label cnic=new Label();

    @FXML
    private Label education=new Label();

    @FXML
    private Label email=new Label();

    @FXML
    private Label instName=new Label();

    @FXML
    private Label ownerName=new Label();

    @FXML
    private Label pastResult=new Label();

    @FXML
    private Label phone=new Label();
    @FXML
    private Label description=new Label();
    @FXML
    private Label category=new Label();


    @FXML
    private Button delete;
    String addressP;
    String boardIDP;
    String boardNameP;
    String cnicP;
    String educationP;
    String emailP;
    String instituteName;
    String ownerNameP;
    String pastResut;
    String phoneP;
    String image1;
    String image2;
    String descript;
    String categ;

    public void getData(String addressP,
                        String boardIDP,
                        String boardNameP,
                        String cnicP,
                        String educationP,
                        String emailP,
                        String instituteName,
                        String ownerNameP,
                        String pastResut,
                        String phoneP,
                        String image1,
                        String image2,
                        String description,
                        String category
    ){
        this.sendMessage = sendMessage;
        this.addressP = addressP;
        this.boardIDP = boardIDP;
        this.boardNameP = boardNameP;
        this.cnicP = cnicP;
        this.educationP = educationP;
        this.emailP = emailP;
        this.instituteName = instituteName;
        this.ownerNameP = ownerNameP;
        this.pastResut = pastResut;
        this.phoneP = phoneP;
        this.image1=image1;
        this.image2=image2;
        this.descript=description;
        this.categ=category;

    }












    public void detailMap() {
        BorderPane border = new BorderPane();

  try {
      ImageView imageView = new ImageView(new Image(
              image1
      ));
      ImageView imageView2 = new ImageView(new Image(
              image2
      ));

      imageView.setFitWidth(620);
      imageView.setFitHeight(300);
      imageView2.setFitHeight(150);
      imageView2.setFitWidth(150);
      imageView2.setLayoutY(150);
      imageView2.setLayoutX(460);


      Pane imagePane = new Pane();
      imagePane.getChildren().addAll(imageView, imageView2);


      border.setTop(imagePane);

  }catch (Exception ex){

      System.out.println("Image Not Found");
  }



        this.instName.setText("Institute Name:   "+instituteName);
        instName.setLayoutY(20);
        this.boardID.setText("Board ID:          "+this.boardIDP);
        boardID.setLayoutY(40);

        this.boardName.setText("Board Name:      "+this.boardNameP);
        boardName.setLayoutY(60);

        this.address.setText("Address:            "+this.addressP);

        address.setLayoutY(80);

        this.pastResult.setText("Past Result:      "+pastResut);
        this.pastResult.setLayoutY(100);

        this.ownerName.setText("Owner Name:       "+ownerNameP);
        ownerName.setLayoutY(120);


        this.cnic.setText("Owner CNIC:            "+cnicP);

        ownerName.setLayoutY(140);


        this.email.setText("Email:                "+emailP);
        email.setLayoutY(160);

        this.education.setText("Education:        "+educationP);
        education.setLayoutY(180);


        this.phone.setText("Phone :"+              phoneP);
        phone.setLayoutY(200);
        this.description.setText(descript);
        category.setText(categ);
        category.setLayoutY(250);
        description.setLayoutY(270);
        description.setWrapText(true);




        Pane pane=new Pane();
        pane.setPrefWidth(500);
        pane.setPrefHeight(500);
        pane.setPadding(new Insets(10,10,10,10));


        Pane buttonPane=new Pane();
        pane.setPrefWidth(620);
        Button delete=new Button("Delete");
        delete.setLayoutX(100);
        Button sendMessage=new Button("Create Message");
        sendMessage.setLayoutX(200);




        sendMessage.setOnAction(event -> {
            sendMessage(event);
        });

        delete.setOnAction(event -> {
            delete(event);
        });

        buttonPane.getChildren().addAll(delete,sendMessage);
        buttonPane.setLayoutY(280);


        pane.setStyle(";-fx-label-padding: 20;-fx-border-color: black;-fx-padding: 10 ;-fx-background-color: white");


        pane.getChildren().addAll(instName,boardID,boardName,address,pastResult,ownerName,cnic,email,education,phone,buttonPane);
//border.setLayoutX(100);
        border.setCenter(pane);

        pane.setLayoutX(300);
        border.setStyle(" -fx-border-color: black; -fx-background-color: #40b4bc");

        delete.onMouseEnteredProperty().set(e->{

//set title

            delete.setStyle("-fx-background-color: red");
            delete.onMouseExitedProperty().set(e1->{
                delete.setStyle(null);


            });
        });

        sendMessage.onMouseEnteredProperty().set(e->{

//set title

            sendMessage.setStyle("-fx-background-color: green");
            sendMessage.onMouseExitedProperty().set(e1->{
                sendMessage.setStyle(null);


            });
        });







        border.setPadding(new Insets(0,40,40,40));
        Scene scene1=new Scene(border);
        Stage stage=new Stage();
        stage.setScene(scene1);
        stage.setWidth(700);
        stage.setHeight(650);

        stage.show();





    }


    public void sendMessage(ActionEvent event){


//        InstituteAdder add=new InstituteAdder();
//        OwnerAdder adder=new OwnerAdder();
//        add.addInstitute(Integer.parseInt(boardIDP),instituteName,boardNameP,addressP,Integer.parseInt(pastResut),"",image1,image2,categ);
//        adder.addOwner(cnicP,ownerNameP,0,phoneP,emailP,educationP,"",instituteName);
//
//        DataBase db=new DataBase();
//        db.deleteInst(Integer.parseInt(boardIDP));
//        db.deleteOwner(cnicP);
//        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }

    public  void delete(ActionEvent event){


        DataBase db=new DataBase();
        db.deleteInst("RegisterInstitute",Integer.parseInt(boardIDP));
        db.deleteOwner("RegisterOwner",cnicP);

        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();


    }


}
