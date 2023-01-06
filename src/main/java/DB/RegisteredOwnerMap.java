package DB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RegisteredOwnerMap {



    private ArrayList ownerName;
    private ArrayList cnic;
    private ArrayList age;
    private ArrayList phone;
    private ArrayList email;
    private ArrayList education;
    private  ArrayList instituteName;
    private ArrayList image;
    private DataBase db;


    public RegisteredOwnerMap(){


        ownerName=new ArrayList<>();
        cnic=new ArrayList<>();
        phone=new ArrayList<>();
        email=new ArrayList<>();
        education=new ArrayList<>();
        instituteName=new ArrayList<>();
        image=new ArrayList<>();
        age=new ArrayList<>();
      getRegisteredOwner();
    }


    public void getRegisteredOwner(){
        db=new DataBase();
        try {


            PreparedStatement st = null;
            try {
                st = db.setConnection().prepareStatement("SELECT * FROM RegisterOwner");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            ResultSet rs = null;
            try {
                rs = st.executeQuery();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            while (true) {
                try {
                    if (!rs.next())
                        break;


                    ownerName.add(rs.getString("OwnerName"));

                    cnic.add(rs.getString("CNIC"));
//                 category.add(rs.getString("BoardName"));
                    age.add(rs.getString("Age"));
                    phone.add(rs.getString("Phone"));
                    email.add(rs.getString("Email"));
                    education.add(rs.getString("Education"));
                    instituteName.add(rs.getString("InstituteName"));
                    image.add(rs.getString("Image"));



                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }



            }


        } finally {

        }



    }

    public ArrayList getOwnerName() {
        return ownerName;
    }

    public ArrayList getCnic() {
        System.out.println(cnic.toString());
        return cnic;
    }

    public ArrayList getAge() {
        return age;
    }

    public ArrayList getPhone() {
        return phone;
    }

    public ArrayList getEmail() {
        return email;
    }

    public ArrayList getEducation() {
        return education;
    }

    public ArrayList getInstituteName() {
        return instituteName;
    }

    public ArrayList getImage() {
        return image;
    }



}
