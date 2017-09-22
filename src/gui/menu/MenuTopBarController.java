package gui.menu;

import gui.main.Pages;
import gui.main.SceneController;

import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;

public class MenuTopBarController
{

    @FXML
    private MenuBar menuBar;


    /**
     * Handles key input for the menu
     */
    @FXML
    public void handleKeyInput()
    {
        //TODO implement keyinput method
    }

    /**
     * Handles the page1 redirect
     */
    @FXML
    public void handlePage1Action()
    {
        SceneController.getInstance().setContent(Pages.PAGE1);
        System.out.println("Page 1 Action");
    }

    /**
     * Handles the page1 redirect
     */
    @FXML
    public void handlePage2Action()
    {
        SceneController.getInstance().setContent(Pages.PAGE2);
        System.out.println("Page 2 Action");
    }
}
