package pages;
public class LoginPage extends Page implements PageInterface{  //inheritance (Page is parent, LoginPage is child) + implements
    private String userName;
    private String password;

    public void populateCredentials(){
        System.out.println(String.format("Credentials are populated: %s, %s ", userName, password));
        System.out.println("----------------------------------");
    }
    public String getUserName() {     //getter
        return userName;
    }
    public void setUserName(String userName) {  //setter
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void getDeveloperNane(){

        System.out.println("John Smith (LoginPage class)");
    }
}
