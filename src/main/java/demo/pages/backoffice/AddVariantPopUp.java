package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;

public class AddVariantPopUp {

    public void clickAddVariant() {
        WebDriverInstance.webDriver.findElement(By.xpath("//a[contains(text(),'Add Variant')]")).click();
    }

    public void inputFirstVariantName(String name) {
        WebDriverInstance.webDriver
                .findElement(By.xpath("//div[@class='fade in modal']//div[2]//div[1]//div[1]//input[1]")).sendKeys(name);
    }

    public void inputFirstVariantPrice() {
        String randomPrice = RandomUtils.generateRandomItemPrice();
        WebDriverInstance.webDriver
                .findElement(By.xpath("//div[@class='fade in modal']//div[2]//div[2]//div[1]//input[1]")).sendKeys(randomPrice);
    }

    public void inputFirstVariantSKU() {
        String randomSKU = RandomUtils.generateRandomSKU();
        WebDriverInstance.webDriver
                .findElement(By.xpath("//div[@class='fade in modal']//div[2]//div[3]//div[1]//input[1]")).sendKeys(randomSKU);
    }

    public void inputSecondVariantName(String name) {
        WebDriverInstance.webDriver
                .findElement(By.xpath("//div[@class='fade in modal']//div[3]//div[1]//div[1]//input[1]")).sendKeys(name);
    }

    public void inputSecondVariantPrice() {
        String randomPrice = RandomUtils.generateRandomItemPrice();
        WebDriverInstance.webDriver
                .findElement(By.xpath("//div[@class='fade in modal']//div[3]//div[2]//div[1]//input[1]")).sendKeys(randomPrice);
    }

    public void inputSecondVariantSKU() {
        String randomSKU = RandomUtils.generateRandomSKU();
        WebDriverInstance.webDriver
                .findElement(By.xpath("//div[@class='fade in modal']//div[3]//div[3]//div[1]//input[1]")).sendKeys(randomSKU);
    }

    public void clickConfirm() {
        WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
    }

}
