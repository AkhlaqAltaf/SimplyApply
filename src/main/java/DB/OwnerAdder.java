package DB;

public class OwnerAdder {




    public void addOwner(

            String cnic,
            String ownerName,
            int age,
            String phone,
            String email,
            String education,
            String image,
            String instName


    ){

 DataBase db=new DataBase();

        db=new DataBase();
        db.saveOwner("RegisterOwner",cnic,ownerName,age,phone,email,education,image,instName);




    }

}
