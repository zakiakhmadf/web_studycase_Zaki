package demo.pages.pos;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReceiptPage {

    public boolean isOnPage() {
        WebElement newSale = AndroidDriverInstance.androidDriver.findElement(By.id("print_receipt_button"));
        return newSale.isDisplayed();
    }
}
