package com.example.simplyapply;

import javafx.scene.control.Button;

public  class PandingReqDTO {

    AdminControler controler=new AdminControler();

    Verification obj=new Verification(



    );

    private Integer instituteID;
    private String instituteName;
    private String board;
    private String address;



    private String description;
    private String image1;
    private String image2;


    private String ownerCnic;
    private String ownerName;



    private String phone;
    private String email;
    private String education;
    private String image;
    private String category;

    private Integer ownerAge;


    private Button verify;
    private Button reject;




    public PandingReqDTO(String instituteID,
                         String instituteName,
                         String board,
                         String address,
                         String description,
                         String instImage1,
                         String instImage2,
                         String cnic,
                         String ownerName,
                         String ownerEducation,
                         String email,
                         String phone,
                         String ownerImage,
                         String ownerAge,
                         String pastResult,
                         String category,
                         Button verify
                         ) {


        this.instituteID = Integer.valueOf(instituteID);
        this.instituteName = instituteName;
        this.board = board;
        this.address = address;
        this.description=description;
        this.image1=instImage1;
        this.image2=instImage2;
        this.ownerCnic = cnic;
        this.ownerName = ownerName;
        this.education=ownerEducation;
        this.email=email;
        this.phone=phone;
        this.image=ownerImage;
        this.ownerAge= Integer.valueOf(ownerAge);
        this.verify=verify;
        this.category=category;
         this.verify.setOnAction(e->{


           obj.getData(
                   address,
                   String.valueOf(Integer.valueOf(instituteID)),
                   board,
                   cnic,
                   education,
                   email,
                   instituteName,
                   ownerName,
                   String.valueOf(Integer.valueOf(pastResult)),
                   phone,image1,image2,description,category

           );

obj.detailMap();
         });


    }




    public String getBoard() {
        return board;
    }

    public String getAddress() {
        return address;
    }

    public String getOwnerID() {
        return ownerCnic;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public Button getVerify() {
        return verify;
    }

    public Button getReject() {
        return reject;
    }

    public Integer getInstituteID() {
        return instituteID;
    }

    public String getInstituteName() {
        return instituteName;
    }
    public String getDescription() {
        return description;
    }

    public String getImage1() {
        return image1;
    }

    public String getImage2() {
        return image2;
    }

    public String getOwnerCnic() {
        return ownerCnic;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getEducation() {
        return education;
    }

    public String getImage() {
        return image;
    }
    public Integer getOwnerAge() {
        return ownerAge;
    }




}


