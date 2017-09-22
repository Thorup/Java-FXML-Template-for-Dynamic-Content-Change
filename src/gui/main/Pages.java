package gui.main;

public enum Pages
{
    PAGE1("page1"), PAGE2("page2");

    private String name;

    Pages(String page)
    {
    }

    public String getPageName() {
        return name;
    }
}
