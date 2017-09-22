package gui.main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Node;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class SceneController extends VBox
{
    private static SceneController _instance;
    private Node activePage;

    @FXML
    private VBox page1;
    @FXML
    private VBox page2;

    public SceneController()
    {
        _instance = this;
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

        this.resetContent();
    }

    public static SceneController getInstance()
    {
        return _instance;
    }

    private void resetContent()
    {
        activePage = page1;
        this.getChildren().remove(page2);
    }

    public void setContent(Pages page)
    {
        this.getChildren().remove(activePage);

        if (page.equals(Pages.PAGE1))
        {
            this.setPage(this.page1);
        } else if (page.equals(Pages.PAGE2))
        {
            this.setPage(this.page2);
        }
    }

    private void setPage(Node page)
    {
        this.getChildren().add(page);
        this.activePage = page;
    }
}
