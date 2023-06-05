package stringsLesson;

public class LoginApp {
    public  String expectedUsername = "admin";  //value for comparison
    public String expectedPassword = "12345";   //value for comparison
    public static void main(String[] args) {

        LoginApp loginApp = new LoginApp();
//        boolean success = loginApp.verifyUser("ADmin","12345");  //commented to run the loginApp.stringExamples()
//        System.out.println("Login success " + success);          //commented to run the loginApp.stringExamples()
        loginApp.stringExamples();
    }
    public boolean verifyUser(String username, String password){
        username = username.toLowerCase();  //changes all characters of the username to lower case
        password = password.toLowerCase();  //changes all characters of the password to lower case
        boolean success = false;
        if (username == null || password == null){
            System.out.println("The username or password is null");
        }
//                if (username.isEmpty() || password.isEmpty()){
        else if (username.length() == 0 || password.length() == 0) {
            System.out.println("The username and password is empty");
        }
        else if (username.isBlank() || password.isBlank()) {
            System.out.println("The username and password is blank");
        }
        else if (!username.equalsIgnoreCase(expectedUsername) || !password.equalsIgnoreCase(expectedPassword)) {
//        else if (!username.equals(expectedUsername) || !password.equals(expectedPassword)) {
            System.out.println("The username and password does not match the expected values");
        }
        else {
            success = true;
        }
        return success;
    }
    public void stringExamples(){
        String txt1 = "dog";
        String txt2 = "catalog";
//        System.out.println(txt2.contains(txt1));  //verify that txt2 contains txt1
//        System.out.println(txt2.replace("cat", txt1)); //replace "cat" in the txt2 with the value of txt1

        System.out.println(txt1.charAt(0));  //print the first character of txt1
        System.out.println(txt1.charAt(1));  //print the second character of txt1
        System.out.println(txt1.charAt(txt1.length()-1));  //print the last character of txt1
    }
}
