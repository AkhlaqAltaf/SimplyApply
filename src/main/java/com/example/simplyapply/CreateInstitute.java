package com.example.simplyapply;

import DB.AddInstRequest;
import DB.AddOwnerRequest;
import DB.BlockOwner;
import DB.DataBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CreateInstitute implements Initializable {

    private Stage formStage;
    private FXMLLoader loader;

    private Scene scene;
    private DataBase db;



    @FXML
    private TextField age;

    @FXML
    private TextField board;

    @FXML
    private TextField boardID;

    @FXML
    private Label boardIDL;

    @FXML
    private Label boardL;

    @FXML
    private Pane boardP;

    @FXML
    private Button cancel;

    @FXML
    private ComboBox<?> category;

    @FXML
    private Label categoryL;

    @FXML
    private TextField cnic;

    @FXML
    private Label cnicL;

    @FXML
    private TextArea description;

    @FXML
    private Pane descriptionP;

    @FXML
    private TextField education;

    @FXML
    private TextField email;

    @FXML
    private TextField imagePath1;

    @FXML
    private Label imagePath1L;

    @FXML
    private TextField imagePath2;

    @FXML
    private Label imagePath2L;

    @FXML
    private TextField instName;

    @FXML
    private Label instNameL;

    @FXML
    private TextField ownerName;

    @FXML
    private Label ownerNameL;
    @FXML
    private Label error;
    @FXML
    private TextField phone;

    @FXML
    private Button reset;

    @FXML
    private TextField result;
    @FXML
    private  String value;
    @FXML
    private Pane resultP;

    @FXML
    private Button save;
    @FXML
    private TextField address;
    private AddInstRequest instReq;
    private AddOwnerRequest ownerReq;

    private FileInputStream fis;
    CreateInstituteValidator validator;
    @Override

    public void initialize(URL location, ResourceBundle resources) {


        validator=new CreateInstituteValidator();



    }
    public void createForm(){

        formStage =new Stage();
        formStage.setTitle("Institute Information Form");
        Parent root = null;
        try{
            root= loader.load(getClass().getResource("CreateInst.fxml"));

        }catch (Exception e){

        }

        scene=new Scene(root);

        formStage.setScene(scene);
        formStage.show();
    }

public void sendInstituteRequest(){


}

public void boardIDType(){
      boolean b=  validator.isInteger(boardID.getText());
      if(b){
        boardID.setStyle(null);
        message(null);
      }
      else {
          boardID.setStyle("-fx-border-color: red");
          message(validator.getMessage());
      }

}
public void ageType(){
    boolean b=  validator.isInteger(age.getText());
    if(b){

        age.setStyle(null);
        message(null);
    }
    else {
        age.setStyle("-fx-border-color: red");
        message(validator.getMessage());

    }

}
public void cnicType(){
    boolean b=  validator.isInteger(cnic.getText());
    if(b){
        cnic.setStyle(null);
        message(null);

    }
    else {
        cnic.setStyle("-fx-border-color: red");
        message(validator.getMessage());
    }
}



public void phoneType(){
    boolean b=  validator.isInteger(phone.getText());
    if(b){
        phone.setStyle(null);
        message(null);

    }
    else {
        phone.setStyle("-fx-border-color: red");
        message(validator.getMessage());
    }

}

public void resultType(){
    boolean b=  validator.isInteger(result.getText());
    if(b){
        result.setStyle(null);
        message(null);

    }
    else {
        result.setStyle("-fx-border-color: red");
        message(validator.getMessage());
    }

}





public boolean isNullText(){

    boolean isNull=true;


    try{

        isNull =  validator.isNull(


                Integer.parseInt(age.getText()+""),
                board.getText(),
                Integer.parseInt(boardID.getText()+""),
                cnic.getText(),
                description.getText(),
                education.getText(),
                email.getText(),
                imagePath1.getText(),
                imagePath2.getText(),
                instName.getText(),
                ownerName.getText(),
                Integer.parseInt(result.getText()),
                address.getText()


        );

    }catch (Exception ex){

       message(validator.getMessage());
        isNull=true;

    }

        return isNull;
}





public void saveClick(ActionEvent event){



              if(isNullText()){
                message(validator.getMessage());
              return;
              }
              else if(validator.isBlock(cnic.getText())){
                  message(validator.getMessage());
                   return;
              }
              else {

                  save(event);
                  return;
              }






}

public void save(ActionEvent event){



        instReq =new AddInstRequest();
        ownerReq =new AddOwnerRequest();

        instReq.addInstituteReq(Integer.parseInt(boardID.getText()),instName.getText(),
                board.getText(), address.getText(),Integer.parseInt(result.getText()),description.getText(),imagePath1.getText(),imagePath2.getText(), (String) category.getValue()

        );


        ownerReq.addOwnerReq(cnic.getText(),
                ownerName.getText(),Integer.parseInt(age.getText()),
                phone.getText(), email.getText(),
                education.getText(),imagePath1.getText(),instName.getText()

        );

    ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();



}

    public void resertClick(){


        category.setValue(null);
        ownerName.setText(null);
        instName.setText(null);
        board.setText(null);
        boardID.setText(null);
        imagePath1.setText(null);
        imagePath2.setText(null);
        phone.setText(null);
        cnic.setText(null);
        email.setText(null);
        education.setText(null);
        age.setText(null);
        description.setText(null);
        address.setText(null);
        result.setText(null);



    }
    public void cancelClick(ActionEvent event){


        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();


    }


  public void image1Chooser() {
      Stage primaryStage=new Stage();
      Button btn = new Button("SAVE");
      FileChooser file = new FileChooser();
      file.setTitle("Save Image");
      //System.out.println(pic.getId());
      File file1 = file.showSaveDialog(primaryStage);
      StackPane root = new StackPane();
      Scene scene = new Scene(root,200,300);
      primaryStage.setScene(scene);
      root.getChildren().add(btn);
      primaryStage.show();


      btn.setOnAction(e->
      {

          imagePath1.setText(String.valueOf(file1));
          System.out.println(file1);
          primaryStage.close();

      });







  }



  public void image2Chooser(){
      Stage primaryStage=new Stage();
      Button btn = new Button("SAVE");
      FileChooser file = new FileChooser();
      file.setTitle("Save Image");
      //System.out.println(pic.getId());
      File file1 = file.showSaveDialog(primaryStage);
      StackPane root = new StackPane();
      Scene scene = new Scene(root,200,300);
      primaryStage.setScene(scene);
      root.getChildren().add(btn);
      primaryStage.show();


      btn.setOnAction(e->
      {

          imagePath2.setText(String.valueOf(file1));
          System.out.println(file1);
          primaryStage.close();

      });





  }

public void message(String message){


        error.setText(message);
        error.setWrapText(true);

}


}
