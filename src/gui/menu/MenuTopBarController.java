package gui.menu;

import gui.main.Pages;
import gui.main.SceneController;

import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;

public class MenuTopBarController
{

    @FXML
    private MenuBar menuBar;

    @FXML
    public void handleKeyInput()
    {
        //TODO implement keyinput method
    }

    @FXML
    public void handleAboutAction()
    {
        //TODO implement action on click
        SceneController.getInstance().setContent(Pages.PAGE1);
        System.out.println("Page 1 Action");
    }

    @FXML
    public void handlePage1Action()
    {
        SceneController.getInstance().setContent(Pages.PAGE1);
        System.out.println("Page 1 Action");
    }

    @FXML
    public void handlePage2Action()
    {
        SceneController.getInstance().setContent(Pages.PAGE2);
        System.out.println("Page 2 Action");
    }
}
