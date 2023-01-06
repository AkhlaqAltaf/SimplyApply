package DB;

import java.sql.*;
import java.util.ArrayList;

public class DataBase {


    public Connection setConnection(){
        Connection   dbConnection;
        {
            try {
               dbConnection = DriverManager.getConnection("jdbc:sqlserver://;databaseName=SimplyApply;trustServerCertificate=true;", "sa","root");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return  dbConnection;

    }











    public ArrayList getRequest(){


        ArrayList<String>  institute=new ArrayList<>();
        try {

            PreparedStatement st = setConnection().prepareStatement("SELECT * FROM PendingInstReq");
            ResultSet rs = st.executeQuery();

            Integer i=0;
            while (rs.next()) {
                i=i+1;

                System.out.println(i);
                institute.add(i+"       "+rs.getString("instName")+  "              " +
                        " "+rs.getString("ownerName")+"                 "+  rs.getString("instAddress"));

            }


        }catch (Exception io){


            System.out.println("No Data For Fetching");
        }

        return institute;










    }


    public  void saveInstitute(
                String tableName,
            int boardID,String instName,
            String boardName,
            String instAddress,
            int lastResult,
            String description, String image1,
            String image2,
                String category

    )


    {

        try {

            System.out.println(tableName);

            PreparedStatement p = setConnection().prepareStatement("INSERT INTO "+tableName+" (BoardID,InstituteName,BoardName," +
                    "InstituteAddress,LastResult,Description,Image1,Image2,Category) VALUES (?,?,?,?,?,?,?,?,?);");
           p.setInt(1,boardID);
           p.setString(2,instName);
           p.setString(3,boardName);
           p.setString(4,instAddress);
           p.setInt(5,lastResult);
           p.setString(6,description);
           p.setString(7,image1);
           p.setString(8,image2);
            p.setString(9,category);

            int rowsInserted = p.executeUpdate();



        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }



    public  void saveOwner(
            String tableName,
            String cnic,
            String ownerName,
            int age,
            String phone,
            String email,
            String education,
            String image,
            String instName


    )


    {

        try {

            System.out.println(tableName);

            PreparedStatement p = setConnection().prepareStatement("INSERT INTO "+tableName+" (OwnerName,CNIC,Age,Phone," +
                    "Email,Education,InstituteName,Image) VALUES (?,?,?,?,?,?,?,?);");

            p.setString(1,ownerName);
            p.setString(2,cnic);

            p.setInt(3,age);
            p.setString(4,phone);
            p.setString(5,email);
            p.setString(6,education);
            p.setString(7,instName);
            p.setString(8,image);

            int rowsInserted = p.executeUpdate();



        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }



    public void deleteInst(String tableName,int boardID){


try{

    PreparedStatement st =setConnection().prepareStatement("DELETE FROM "+tableName+" WHERE BoardID = " + boardID + ";");
    st.executeUpdate();

}catch (SQLException ex){

    System.out.println(ex.getMessage());
}

    }

    public void deleteOwner(String tableName,String cnic) {


        try {

            PreparedStatement st = setConnection().prepareStatement("DELETE FROM "+tableName+" WHERE CNIC = " + cnic + ";");
            st.executeUpdate();

        } catch (SQLException ex) {

            System.out.println(ex.getMessage());
        }
    }

    public boolean isPresent(int boardID) {
    String s= String.valueOf(boardID);

        RegisteredInstituteMap reg=new RegisteredInstituteMap();
        for(int i=0;i<reg.getInstituteId().size();i++){
               System.out.println(reg.getInstituteId().get(i));

            if(reg.getInstituteId().get(i).equals(s)){

                return true;
            }

        }

        return false;


    }

}











