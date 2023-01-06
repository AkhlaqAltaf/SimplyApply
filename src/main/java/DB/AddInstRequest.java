package DB;

public class AddInstRequest {

DataBase db;
    public void addInstituteReq(

            int boardID, String instName,
            String boardName,
            String instAddress,
            int lastResult,
            String description
            , String image1,
            String image2,
            String category



    ){

        db=new DataBase();
        db.saveInstitute("PendingInstitute",boardID,instName,boardName,instAddress,lastResult,


                description,image1,image2,category);









    }



}
