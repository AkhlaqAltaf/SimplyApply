package DB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BlockOwner {

    private  DataBase db;
    private ArrayList<String> blackCnic;

    public void blockCnic(String cnic){

db=new DataBase();
        {


            {

                try {


                    PreparedStatement p = db.setConnection().prepareStatement("INSERT INTO Block(cnic) VALUES (?);");
                    p.setString(1, cnic);

                    int rowsInserted = p.executeUpdate();


                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }


            }


        }}

    public BlockOwner(){


    }
    public void checkBlackList(){
        db=new DataBase();
        try {


            PreparedStatement st = null;
            try {
                st = db.setConnection().prepareStatement("SELECT * FROM Block");
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

                blackCnic.add(rs.getString("cnic"));



                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }



            }


        } finally {

        }



    }

    public ArrayList getBlackCnic(){

        return blackCnic;
    }


    public boolean isBlock(String cnic) {
        blackCnic=new ArrayList<>();
        checkBlackList();
        String s= String.valueOf(cnic);

   System.out.println(getBlackCnic().size()+"Size");

        for(int i=0;i<getBlackCnic().size();i++){
            System.out.println(blackCnic.get(i));

            if(blackCnic.get(i).equals(s)){

                return true;
            }

        }

        return false;


    }



}
