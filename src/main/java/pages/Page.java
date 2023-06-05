package pages;
public class Page {
    private String pageName;  // private = accessible only inside the class
    private int pageId;       // private = accessible only inside the class
    private String URL;       // private = accessible only inside the class

    public String getPageName() {
        return pageName;
    }
    public void setPageName(String pageName) {
        this.pageName = pageName;
    }
    public int getPageId() {
        return pageId;
    }
    public void setPageId(int pageId) {
        this.pageId = pageId;
    }
    public String getURL() {
        return URL;
    }
    public void setURL(String URL) {
        this.URL = URL;
    }

    public Page(String pageName, int pageId, String URL){  //creates constructor (constructor never returns anything)
        this.pageName = pageName;
        this.pageId = pageId;
        this.URL = URL;
    }
    public Page(){           //empty constructor (constructor always has the same name as the class)
    }

    public void openPage(){  //creates method openPage
        System.out.println(String.format("Page %s was opened", pageName));
        System.out.println("----------------------------------");
    }
    public void closePage(){  //creates method closePage
        System.out.println(String.format("Page %s was closed", pageName));
        System.out.println("----------------------------------");
    }
    public void clickButton(String buttonName){        //creates method clickButton
        System.out.println(String.format("Button %s was clicked", buttonName));
        System.out.println("----------------------------------");
    }
    public void getDeveloperNane(){
        System.out.println("The page was developed by (Page class)");
    }
}
