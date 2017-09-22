package gui.main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Node;
import javafx.scene.layout.VBox;

import java.io.IOException;

/**
 * The sceneController is the root controller of this GUI,
 * and handles all content page change, and sets up the FXML root.
 */
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

    /**
     * Get an instance of the SceneController
     * @return an instance of the SceneController
     */
    public static SceneController getInstance()
    {
        return _instance;
    }

    /**
     * Set the content of the GUI based on the given Enum.
     * This method should be expanded when the application gets more pages.
     * @param page an Enum which represents the page
     */
    public void setContent(Pages page)
    {
        if (page.equals(Pages.PAGE1))
        {
            this.setPage(this.page1);
        } else if (page.equals(Pages.PAGE2))
        {
            this.setPage(this.page2);
        }
    }

    /**
     * Set an pre-defined included FXML source as the active page and omits
     * the other included pages such that only one page is shown.
     * This method should be expanded when the application gets more pages.
     */
    private void resetContent()
    {
        activePage = page1;
        this.getChildren().remove(page2);
    }

    /**
     * Sets the given node as the current active page such that
     * the active page is always the only page that is shown.
     * @param page an FXML Node Object
     */
    private void setPage(Node page)
    {
        this.getChildren().remove(activePage);
        this.getChildren().add(page);
        this.activePage = page;
    }
}
