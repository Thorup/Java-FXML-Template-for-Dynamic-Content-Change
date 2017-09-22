package gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class SceneController extends VBox
{
    public SceneController()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(SceneController.class.getResource("Scene.fxml"));
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
