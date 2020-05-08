package demo.pages.pos;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutPopUp {

    public void clickCharge() {
        WebElement charge = AndroidDriverInstance.androidDriver.findElement(By.id("tablet_ok_button"));
        charge.click();
    }

    public void clickSuggestedExactCash() {
        WebElement suggest = AndroidDriverInstance.androidDriver.findElement(By.id("cash_suggest_lowest"));
        suggest.click();
    }
}
