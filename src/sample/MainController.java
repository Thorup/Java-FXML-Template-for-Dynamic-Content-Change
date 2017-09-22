package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;
import javafx.stage.Window;

import java.io.IOException;
import java.time.temporal.Temporal;

public class MainController extends VBox
{

    public MainController()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(MainController.class.getResource("Main.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();
        } catch (IOException e)
        {
            System.out.println("Error on Scene setup:");
            e.printStackTrace();
        }
    }
}
