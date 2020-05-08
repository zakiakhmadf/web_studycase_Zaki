package demo.pages.pos;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignInPage {

    public void inputUsername(String username) {
        WebElement inputUsername = AndroidDriverInstance.androidDriver.findElement(By.id("emailOrPhoneEditText"));
        inputUsername.sendKeys(username);
    }

    public void inputPassword(String password) {
        WebElement inputPassword = AndroidDriverInstance.androidDriver.findElement(By.id("passwordEditText"));
        inputPassword.sendKeys(password);
    }

    public void clickSignIn() {
        WebElement signIn = AndroidDriverInstance.androidDriver.findElement(By.id("signInButton"));
        signIn.click();
    }
}
