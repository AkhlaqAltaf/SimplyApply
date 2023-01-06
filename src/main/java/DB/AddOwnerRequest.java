package DB;

public class AddOwnerRequest {


private DataBase db;
    public void addOwnerReq(

            String cnic,
            String ownerName,
            int age,
            String phone,
            String email,
            String education,
            String image,
            String instName


    ){

db=new DataBase();
    db.saveOwner("PendingOwner",cnic,ownerName,age,phone,email,education,image,instName);





    }

}

