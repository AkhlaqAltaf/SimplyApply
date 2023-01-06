package DB;

public class InstituteAdder {



DataBase db;

    public void addInstitute(

            int boardID,String instName,
            String boardName,
            String instAddress,
            int lastResult,
            String description
            ,String image1,
            String image2,
            String category



    ){

        db=new DataBase();
        db.saveInstitute("RegisterInstitute",boardID,instName,boardName,instAddress,lastResult,


                description,image1,image2,category);







    }




    {





    }
}
