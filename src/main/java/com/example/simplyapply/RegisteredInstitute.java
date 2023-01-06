package com.example.simplyapply;

import DB.PendingInstituteMap;
import DB.PendingOwnerMap;
import DB.RegisteredInstituteMap;
import DB.RegisteredOwnerMap;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
//import jdk.internal.icu.impl.NormalizerImpl;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class RegisteredInstitute implements Initializable {

    @FXML
    private TableColumn instituteID;

    @FXML
    private TableColumn<RegisteredInstDTO, String> instituteName;

    @FXML
    private TableColumn<RegisteredInstDTO,String> ownerName;
    @FXML
    private TableColumn<RegisteredInstDTO,String> ownerID;

    @FXML
    private TableView<RegisteredInstDTO> table;


    @FXML
    private TableColumn<RegisteredInstDTO, Button> action;

    @FXML
    private TableColumn<RegisteredInstDTO, String> board;



    RegisteredInstituteMap inst=new RegisteredInstituteMap();
    RegisteredOwnerMap owner=new RegisteredOwnerMap();

    ObservableList<RegisteredInstDTO> data= FXCollections.observableArrayList(
            data()
    );

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        instituteID.setCellValueFactory(new PropertyValueFactory<RegisteredInstDTO, String>("instituteID"));
        instituteName.setCellValueFactory(new PropertyValueFactory<RegisteredInstDTO,String>("instituteName"));
        ownerName.setCellValueFactory(new PropertyValueFactory<RegisteredInstDTO,String>("ownerName"));
        board.setCellValueFactory(new PropertyValueFactory<RegisteredInstDTO, String>("board"));
        action .setCellValueFactory(new PropertyValueFactory<RegisteredInstDTO,Button>("verify"));
        ownerID.setCellValueFactory(new PropertyValueFactory<RegisteredInstDTO,String>("ownerID"));


        table.setItems(data);


    }

    public Parent registeredInstMaper(){

        AdminControler controler=new AdminControler();
        Parent root;
        FXMLLoader loader=new FXMLLoader();
        try {

            root = loader.load(getClass().getResource("RegisteredInstMap.fxml"));

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        return root;



    }
    ArrayList<Object> array=new ArrayList<>();
    public ArrayList data(){

        ArrayList<Object> arrayList = new ArrayList<>();
        array=arrayList;
        for(int i=0;i<inst.getInstituteId().stream().toList().size();i++){


            arrayList.add(

                    new RegisteredInstDTO((String) inst.getInstituteId().stream().toList().get(i)
                            ,(String) inst.getInstituteName().stream().toList().get(i),
                            (String) inst.getBoardName().stream().toList().get(i),
                            (String) inst.getAddress().stream().toList().get(i),
                            (String) inst.getDescription().stream().toList().get(i),
                            (String) inst.getImage1().stream().toList().get(i),
                            (String) inst.getImage2().stream().toList().get(i),

                            (String) owner.getCnic().stream().toList().get(i),
                            (String) owner.getOwnerName().stream().toList().get(i),
                            (String) owner.getEducation().stream().toList().get(i),
                            (String) owner.getEmail().stream().toList().get(i),
                            (String) owner.getPhone().stream().toList().get(i),
                            (String) owner.getImage().stream().toList().get(i),
                            (String) owner.getAge().stream().toList().get(i),
                            (String) inst.getPastResult().stream().toList().get(i),
                            (String)  inst.getCategory().stream().toList().get(i),
                            new Button("Visit")


                    ));

        }

        return    arrayList;
    }


}