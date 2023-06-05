package pages;

public class PagesMain {
    public static void main(String[] args) {

        Page logInScreen = new Page("Login", 1, "www.legionIT.com/login");  //creates an object logInScreen for the class Page
//        logInScreen.pageId = 1;
//        logInScreen.pageName = "Login ";
//        logInScreen.URL = "www.legionIT.com/login";

        logInScreen.openPage();             //calls method openPage from the Page class (logInScreen)
        logInScreen.clickButton("Login");
        logInScreen.closePage();

        Page aboutScreen = new Page();      //creates an object aboutScreen for the class Page
        aboutScreen.setPageId(2);           //addresses to the method setPageId from the class Page, and gives to it a value 2
        aboutScreen.setPageName("About ");  //addresses to the method setPageName from the class Page, and gives to it a value About
        aboutScreen.setURL("www.legionIT.com/about");

        aboutScreen.openPage();
        aboutScreen.clickButton("Exit");
        aboutScreen.closePage();

//        LoginPage loginPage = new LoginPage();  //creates an object loginPage for the class LoginPage
//        loginPage.setPageName("Login page");    //addresses to the method PageName from the class LoginPage, and gives to it a value "Login page"
//        loginPage.setURL("http.....");
//        loginPage.setUserName("name");
//        loginPage.setPassword("123456");
//        loginPage.populateCredentials();

        Page page = new Page();
        page.getDeveloperNane();

        Page loginPage = new LoginPage();
        loginPage.getDeveloperNane();

        Page aboutPage = new AboutPage();
        aboutPage.getDeveloperNane();
    }
}
