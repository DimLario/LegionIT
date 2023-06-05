package pages;

public class AboutPage extends Page implements PageInterface{
    String disclamer;
    public String getDisclamer() {
        return disclamer;
    }
    public void setDisclamer(String disclamer) {
        this.disclamer = disclamer;
    }
    public void getDeveloperNane(){
        System.out.println("Mary Johns (AboutPage class)");
    }
}
