package gui.main;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        try
        {
            Scene scene = new Scene(new SceneController(), 700, 700);
            primaryStage.getIcons().add(new Image("batman.png"));
            primaryStage.setTitle("Application name");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e)
        {
            System.out.println("Error on Stage setup:");
            e.printStackTrace();
        }


    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
