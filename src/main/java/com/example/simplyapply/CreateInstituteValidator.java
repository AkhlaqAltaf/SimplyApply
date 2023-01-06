package com.example.simplyapply;


import DB.AddInstRequest;
import DB.AddOwnerRequest;
import DB.BlockOwner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;

public class CreateInstituteValidator {


    public CreateInstituteValidator(


    ) {

    }

    public boolean isNull(

            int age,
            String board,
            Integer boardID,
            String cnic,
            String description,
            String education,
            String email, String imagePath1,
            String imagePath2,
            String instName,
            String ownerName,
            int result,
            String address


    ){



        if(age==0||board.isEmpty()||boardID==0||cnic.isEmpty()||description.isEmpty()||education.isEmpty()||
        education.isEmpty()||email.isEmpty()||imagePath1.isEmpty()||instName.isEmpty()||ownerName.isEmpty()
        ||result==0||address.isEmpty()
        ){
            message("All Mandatory  TextField Should be filled");
            return true;

        }


        else{

            return false;
        }
    }
   String message;
    public void message(String message){

this.message=message;

    }
    public String getMessage(){

        return message;

    }
    public boolean isInteger(String input){

        try{

            Double.parseDouble(input);
            return  true;
        }
        catch (Exception e){

            message("Please Enter Integer");
            return false;

        }
    }

    public boolean isBlock(String cnic){

        BlockOwner blockOwner=new BlockOwner();
        if(blockOwner.isBlock(cnic)){
           message("CNIC BLOCKED Please Contact Us: " +
                   "akhlaqaltaf@gmail.com");

           return  true;
        }

        else{

            return  false;
        }


    }



    private int age;
    private String board;

    
    private Integer boardID;

    
    private String cnic;

   
    
    private String description;

   
    
    private String education;

    
    private String email;

    
    private String imagePath1;

   

    
    private String imagePath2;

   
    
    private String instName;


    
    private String ownerName;

    
    private int result;

    
    private String address;
    private String instID;
     
    




}
