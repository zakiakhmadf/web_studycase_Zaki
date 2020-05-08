package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoriesPage {

  public String generatedCategoryName = "";

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/categories");
  }

  public void clickCreateCategory() {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Category')]")).click();
  }

  public void inputCategoryName() {
    generatedCategoryName = RandomUtils.generateRandomCategoryName();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Category Name']")).sendKeys(generatedCategoryName);
  }

  public void clickSave() {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
  }

  public boolean successCreatedCategoryMessage() {
    WebElement success = WebDriverInstance.webDriver.findElement(By.xpath("//div[contains(text(),'Category successfully created.')]"));
    return success.isDisplayed();
  }

  public boolean createdCategoryExists() {
    String xpath = "//td[text()='"+generatedCategoryName+"']";
    WebDriverWait wait = new WebDriverWait(WebDriverInstance.webDriver, 20);
    return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).isDisplayed();
  }

  public boolean errorCategoryNameField() {
    WebElement success = WebDriverInstance.webDriver.findElement(By.xpath("//div[@id='mk-col-right']//div//form//div//div//div//div//span"));
    return success.isDisplayed();
  }

}
