package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ItemLibraryPage {

  public String itemName = "";

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/list");
  }

  public void clickCreateItem() throws InterruptedException {
    WebDriverWait wait = new WebDriverWait(WebDriverInstance.webDriver, 10);
    WebElement create = WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Item')]"));
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),'Create Item')]")));
    Thread.sleep(5000);
    create.click();
  }

  public void inputRandomItem() {
    itemName = RandomUtils.generateRandomFoodName();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Item Name']")).sendKeys(itemName);
  }

  public void inputCategory(String category) {
    WebDriverInstance.webDriver.findElement(By.xpath("//span[@class='Select-arrow']")).click();
    WebElement inputCategory = WebDriverInstance.webDriver.findElement(By.xpath("//div[contains(text(),'"+category+"')]"));
    inputCategory.click();
  }

  public void clickAddVariant() throws InterruptedException {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-block no-border-radius-top']")).click();
    Thread.sleep(3000);
  }

  public void chooseModifier(String modifierName) throws InterruptedException {
    Thread.sleep(2000);
    WebElement modifier = WebDriverInstance.webDriver
            .findElement(By.xpath("//label[text()='"+modifierName+"']/parent::div/input"));
    JavascriptExecutor js = (JavascriptExecutor) WebDriverInstance.webDriver;
    js.executeScript("arguments[0].scrollIntoView();",modifier);
    modifier.click();
  }

  public void clickSave() {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary no-outline']")).click();
  }

  public boolean successCreatedItemMessage() {
    WebElement success = WebDriverInstance.webDriver.findElement(By.xpath("//div[contains(text(),'Item was successfully created.')]"));
    return success.isDisplayed();
  }

  public boolean createdItemExists() {
    String xpath = "//td[text()='"+itemName+"']";
    WebDriverWait wait = new WebDriverWait(WebDriverInstance.webDriver, 20);
    return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).isDisplayed();
  }

}
