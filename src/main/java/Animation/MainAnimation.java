package Animation;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainAnimation implements Initializable {

@FXML
private AnchorPane animation;


    @Override
    public void initialize(URL location, ResourceBundle resources) {



        animation.setStyle("-fx-background-color: red");
        animation.getChildren().add(getLogout());
        animation.getChildren().add(getMessage());
        animation.getChildren().add(getNotification());
        animation.getChildren().add(getLogout());
        animation.getChildren().add(getCruds());

    }

    DropingButtons btn;
    public Button getLogout(){
  btn=new DropingButtons();
  return   btn.butonLogOut();


    }
public Button getMessage(){

        btn =new DropingButtons();
        return btn.butonMessage();
}
    public Button getNotification(){

        btn =new DropingButtons();
        return btn.buttonNotification();
    }


    public Button getCruds(){

        btn =new DropingButtons();
        return btn.butonCruds();
    }

    public Button getRequest(){

        btn =new DropingButtons();
        return btn.butonRequest();
    }
    public Scene setScene(){





       FXMLLoader loader=new FXMLLoader();
        Parent root = null;
        try {
            root = loader.load(getClass().getResource("Animation.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scene scene=new Scene(root);

Button btn=new Button("Ok");


        return  scene;
    }

}
