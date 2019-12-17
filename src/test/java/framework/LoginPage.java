package framework;

import org.openqa.selenium.By;

public class LoginPage {

    // Variables
    //Locators
    //Constructor
    //Methods

    private By emailField = By.id("email");
    private By passwordField = By.id("pass");
    private By signUpButton = By.id("loginbutton");
    private By errorMessage = By.xpath("//div[contains(text(),'Incorrect Email')]");
    private By messengerLink = By.linkText("Messenger");
    //private By signupButton = By.id("u_0_y");


}
