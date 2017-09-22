package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.input.InputEvent;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuTopBarController extends VBox implements Initializable
{

    @FXML
    private MenuBar menuBar;

    @FXML
    public void handleKeyInput(final InputEvent event)
    {
        //TODO implement keyinput methods
    }

    @FXML
    public void handleAboutAction(final InputEvent event)
    {
        //TODO implement action on click
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

    }
}
