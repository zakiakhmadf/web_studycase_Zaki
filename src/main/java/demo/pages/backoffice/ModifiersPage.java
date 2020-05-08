package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModifiersPage {

  public String generatedModifierName = "";

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/modifier");
  }

  public void clickCreateModifier() {
    WebElement create = WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Modifier')]"));
    create.click();
  }

  public void inputRandomModifierName() {
    generatedModifierName = RandomUtils.generateRandomModifierName();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(generatedModifierName);
  }

  public void clickAddOptions() {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
  }

  public void clickSave() {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
  }

  public boolean successCreateModifierMessage() {
    WebElement success = WebDriverInstance.webDriver.findElement(By.xpath("//div[contains(text(),'Modifier successfully created.')]"));
    return success.isDisplayed();
  }

  public boolean createdModifierExists() {
    String xpath = "//td[text()='"+generatedModifierName+"']";
    WebDriverWait wait = new WebDriverWait(WebDriverInstance.webDriver, 20);
    return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).isDisplayed();
  }

  public boolean errorCreateModifierMessage() {
    WebElement success = WebDriverInstance.webDriver.findElement(By.xpath("//div[contains(text(),'Please save at least one option')]"));
    return success.isDisplayed();
  }


}
