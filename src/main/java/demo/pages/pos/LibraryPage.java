package demo.pages.pos;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;

public class LibraryPage {

    public void clickLibrary() {
        AndroidDriverInstance.androidDriver.findElement(By.id("tool_bar_library_img")).click();
    }

    public void chooseOrder() {

        AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'Pasta')]")).click();
    }
}
