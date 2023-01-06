package Animation;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class DropingButtons {

@FXML
private Button logout,request,messages,notification,CRUDS;



    public Button butonLogOut(){

         logout =new Button("lOGOUT");

        TranslateTransition tt = new TranslateTransition(Duration.millis(4000), logout);
        tt.setByX(200);

        double getx= tt.getFromX();
        System.out.println("Get From Z"+getx);

        tt.play();
        tt.setOnFinished(e->{
            tt.setByX(0.0);
            tt.setDuration(new Duration(50));
            tt.setByY(300);
            tt.play();


            tt.setOnFinished(end->{
//                rectangle.setHeight(90);
//                rectangle.setWidth(0);
                tt.setByX(100);
                tt.setByY(0.0);
                tt.play();

            });

        });
        tt.setAutoReverse(false);



    return logout;
    }






    public Button butonRequest(){

        request =new Button("Request");


        TranslateTransition tt = new TranslateTransition(Duration.millis(4000), request);
        tt.setByX(200);

        double getx= tt.getFromX();
        System.out.println("Get From Z"+getx);

        tt.play();
        tt.setOnFinished(e->{
            tt.setByX(0.0);
            tt.setDuration(new Duration(100));
            tt.setByY(300);
            tt.play();

            tt.setOnFinished(end->{

                tt.setFromX(23);
                tt.setByY(0.0);
                tt.play();

            });

        });
        tt.setAutoReverse(false);



        return request;
    }



    public Button butonMessage(){

        messages =new Button("Message");


        TranslateTransition tt = new TranslateTransition(Duration.millis(4000), messages);
        tt.setByX(400);

        double getx= tt.getFromX();
        System.out.println("Get From Z"+getx);


        if(getx>300){

            tt.setByY(500);
            tt.setByX(0.0);
        }

        tt.play();
        tt.setOnFinished(e->{
            tt.setByX(0.0);
            tt.setDuration(new Duration(100));
            tt.setByY(300);
            tt.play();

            tt.setOnFinished(end->{

                tt.setFromX(20);
                tt.setFromY(4.0);
                tt.play();

            });

        });
        tt.setAutoReverse(false);



        return messages;
    }


    public Button buttonNotification(){

        notification =new Button("Notification");


        TranslateTransition tt = new TranslateTransition(Duration.millis(4000), notification);
        tt.setByX(400);

        double getx= tt.getFromX();
        System.out.println("Get From Z"+getx);


        if(getx>300){

            tt.setByY(500);
            tt.setByX(0.0);
        }

        tt.play();
        tt.setOnFinished(e->{
            tt.setByX(0.0);
            tt.setDuration(new Duration(50));
            tt.setByY(300);
            tt.play();

            tt.setOnFinished(end->{
//                rectangle.setHeight(90);
//                rectangle.setWidth(0);
                tt.setFromX(20);
                tt.setFromY(80);
                tt.play();

            });

        });
        tt.setAutoReverse(false);



        return notification;
    }



    public Button butonCruds(){

        CRUDS =new Button("CRUDS");


        TranslateTransition tt = new TranslateTransition(Duration.millis(4000),CRUDS);
        tt.setByX(200);

        double getx= tt.getFromX();
        System.out.println("Get From Z"+getx);



        tt.play();
        tt.setOnFinished(e->{
            tt.setByX(0.0);
            tt.setDuration(new Duration(50));
            tt.setByY(300);
            tt.play();

            tt.setOnFinished(end->{

                tt.setDuration(new Duration(80));
                tt.setFromX(23);
                
                tt.play();

            });

        });
        tt.setAutoReverse(false);



        return CRUDS;
    }



}




