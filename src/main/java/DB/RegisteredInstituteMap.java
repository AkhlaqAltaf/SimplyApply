package DB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RegisteredInstituteMap {


    DataBase db;


    ArrayList boardId;
    ArrayList  instituteName;
    ArrayList Category;
    ArrayList boardName;
    ArrayList category;
    ArrayList address;


    ArrayList pastResult;
    ArrayList description;
    ArrayList image1;
    ArrayList image2;



    public RegisteredInstituteMap(){
        db=new DataBase();

        boardId=new ArrayList<>();
        boardName=new ArrayList<>();
        instituteName=new ArrayList<>();
        category=new ArrayList<>();
        address=new ArrayList<>();
        pastResult=new ArrayList<>();
        description=new ArrayList<>();
        image1=new ArrayList<>();
        image2=new ArrayList<>();
        getRegisteredInst();

    }

    public void getRegisteredInst(){
        try {


            PreparedStatement st = null;
            try {
                st = db.setConnection().prepareStatement("SELECT * FROM RegisterInstitute");
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
                    if (!rs.next()) break;


                    boardId.add(rs.getString("BoardID"));
                    instituteName.add(rs.getString("InstituteName"));
//                 category.add(rs.getString("BoardName"));
                    boardName.add(rs.getString("BoardName"));
                    address.add(rs.getString("InstituteAddress"));


                    pastResult.add(rs.getString("LastResult"));
                    description.add(rs.getString("Description"));
                    image1.add(rs.getString("Image1"));
                    image2.add(rs.getString("Image2"));
                    category.add(rs.getString("Category"));




                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }



            }


        } finally {

        }
    }


    public ArrayList getInstituteId(){

        return  boardId;


    }

    public ArrayList getInstituteName(){

        return  instituteName;


    }



    public ArrayList getBoardName() {
        return boardName;
    }



    public ArrayList getCategory() {
        return category;
    }

    public ArrayList getAddress(){

        return  address;
    }
    public ArrayList getDescription(){


        return  description;
    }


    public ArrayList getImage1() {
        return image1;
    }

    public ArrayList getImage2(){

        return  image2;
    }

    public ArrayList getPastResult(){

        return  pastResult;
    }




}


