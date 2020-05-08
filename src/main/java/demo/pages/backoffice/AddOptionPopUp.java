package demo.pages.backoffice;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddOptionPopUp {

    public void clickAddOptions() {
        WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Add Options')]")).click();
    }

    public void inputFirstOptionName(String name) {
        WebElement inputName = WebDriverInstance.webDriver
                .findElement(By.xpath("//body/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/input[1]"));
        inputName.sendKeys(name);
    }

    public void inputFirstOptionPrice(String price) {
        WebElement inputPrice = WebDriverInstance.webDriver
                .findElement(By.xpath("//body/div/div/div/div/div/div/div/div[2]/div[2]/div[1]/input[1]"));
        inputPrice.sendKeys(price);
    }

    public void clickSave() {
        WebDriverInstance.webDriver
                .findElement(By.xpath("//div[@class='modal-footer']//button[@class='btn btn-primary'][contains(text(),'Save')]")).click();
    }
}
