package demo.steps_definition;

import demo.pages.backoffice.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BackOfficeStepDefinitions {

  LoginPage loginPage = new LoginPage();
  DashboardPage dashboardPage = new DashboardPage();
  CategoriesPage categoriesPage = new CategoriesPage();
  ItemLibraryPage itemLibraryPage = new ItemLibraryPage();
  ModifiersPage modifiersPage = new ModifiersPage();
  AddOptionPopUp addOptionPopUp = new AddOptionPopUp();
  AddVariantPopUp addVariantPopUp = new AddVariantPopUp();

  @Given("User open moka backoffice login page")
  public void userOpenMokaBackofficeLoginPage() {
    loginPage.openPage();
  }

  @When("User input email/phone {string} on backoffice login page")
  public void userInputEmailOnBackofficeLoginPage(String emailOrPhone) {
    loginPage.inputEmailorPhone(emailOrPhone);
  }

  @When("User input password {string} on backoffice login page")
  public void userInputPasswordOnBackofficeLoginPage(String password) {
    loginPage.inputPassword(password);
  }

  @When("User click Sign in on backoffice login page")
  public void userClickSignInOnBackofficeLoginPage() {
    loginPage.clickSignIn();
  }


  @Then("User successfully login on backoffice")
  public void userSuccessfullyLoginOnBackoffice() {
    Assert.assertTrue(dashboardPage.isOnPage());
  }

  @When("User go to menu categories on backoffice")
  public void userGoToMenuCategoriesOnBackoffice() {
    categoriesPage.openPage();
  }


  @When("User go to menu item library on backoffice")
  public void userGoToMenuItemLibraryOnBackoffice() {
    itemLibraryPage.openPage();
  }

  @When("User go to menu modifiers on backoffice")
  public void userGoToMenuModifiersOnBackoffice() {
    modifiersPage.openPage();
  }

  @When("User click Create Modifier button on modifier page")
  public void userClickCreateModifierButtonOnModifierPage() {
    modifiersPage.clickCreateModifier();
  }

  @When("User input random modifier name")
  public void userInputRandomModifierName() {
    modifiersPage.inputRandomModifierName();
  }

  @When("User click Add Options button")
  public void userClickAddOptionsButton() {
    modifiersPage.clickAddOptions();
  }

  @When("User click Add Options button on add options pop up")
  public void userClickAddOptionsButtonOnAddOptionsPopUp() {
    addOptionPopUp.clickAddOptions();
  }

  @When("User input {string} as the first option name")
  public void userInputAsTheFirstOptionName(String name) {
    addOptionPopUp.inputFirstOptionName(name);
  }

  @When("User input {string} as the first option price")
  public void userInputAsTheFirstOptionPrice(String price) {
    addOptionPopUp.inputFirstOptionPrice(price);
  }

  @When("User click Save button on add options pop up")
  public void userClickSaveButtonOnAddOptionsPopUp() {
    addOptionPopUp.clickSave();
  }

  @When("User click Save button on modifiers page")
  public void userClickSaveButtonOnModifiersPage() {
    modifiersPage.clickSave();
  }

  @Then("User see successful created modifier message")
  public void userSeeSuccessfulCreatedModifierMessage() {
    boolean actual = modifiersPage.successCreateModifierMessage();
    Assert.assertTrue(actual);
  }

  @Then("User see that the created modifier exists")
  public void userSeeThatTheCreatedModifierExists() {
    boolean actual = modifiersPage.createdModifierExists();
    Assert.assertTrue(actual);

  }

  @When("User click Create Category button on categories page")
  public void userClickCreateCategoryButtonOnCategoriesPage() {
    categoriesPage.clickCreateCategory();
  }

  @When("User input random category name")
  public void userInputRandomCategoryName() {
    categoriesPage.inputCategoryName();
  }

  @When("User click Save button on categories page")
  public void userClickSaveButton() {
    categoriesPage.clickSave();
  }

  @Then("User see successful created category message")
  public void userSeeSuccessfulCreatedCategoryMessage() {
    boolean actual = categoriesPage.successCreatedCategoryMessage();
    Assert.assertTrue(actual);
  }

  @Then("User see that the created category exists")
  public void userSeeThatTheCreatedCategoryExists() {
    boolean actual = categoriesPage.createdCategoryExists();
    Assert.assertTrue(actual);
  }

  @When("User click Create Item button on item library page")
  public void userClickCreateItemButtonOnItemLibraryPage() throws InterruptedException {
    itemLibraryPage.clickCreateItem();
  }

  @When("User input random item name")
  public void userInputRandomItemName() {
    itemLibraryPage.inputRandomItem();
  }

  @When("User input {string} as category")
  public void userInputAsCategory(String category) {
    itemLibraryPage.inputCategory(category);
  }

  @When("User click Add Variant button on item library page")
  public void userClickAddVariantButtonOnItemLibraryPage() throws InterruptedException {
    itemLibraryPage.clickAddVariant();
  }

  @When("User click add Variant button on add variant pop up")
  public void userClickAddVariantButtonOnAddVariantPopUp() {
    addVariantPopUp.clickAddVariant();
  }

  @When("User input {string} as first variant name")
  public void userInputAsFirstVariantName(String name) {
    addVariantPopUp.inputFirstVariantName(name);
  }

  @When("User input random first variant price")
  public void userInputRandomFirstVariantPrice() {
    addVariantPopUp.inputFirstVariantPrice();
  }

  @When("User input random first variant SKU")
  public void userInputRandomFirstVariantSKU() {
    addVariantPopUp.inputFirstVariantSKU();
  }

  @When("User input {string} as second variant name")
  public void userInputAsSecondVariantName(String name) {
    addVariantPopUp.inputSecondVariantName(name);
  }

  @When("User input random second variant price")
  public void userInputRandomSecondVariantPrice() {
    addVariantPopUp.inputSecondVariantPrice();
  }

  @When("User input random second variant SKU")
  public void userInputRandomSecondVariantSKU() {
    addVariantPopUp.inputSecondVariantSKU();
  }

  @When("User click Confirm button on add variant pop up")
  public void userClickConfirmButtonOnAddVariantPopUp() {
    addVariantPopUp.clickConfirm();
  }

  @When("User choose {string} as modifier")
  public void userChooseAsModifier(String modifier) throws InterruptedException {
    itemLibraryPage.chooseModifier(modifier);
  }

  @When("User click Save button on item library page")
  public void userClickSaveButtonOnItemLibraryPage() {
    itemLibraryPage.clickSave();
  }

  @Then("User see successful created item message")
  public void userSeeSuccessfulCreatedItemMessage() {
    boolean message = itemLibraryPage.successCreatedItemMessage();
    Assert.assertTrue(message);
  }

  @Then("User see that the created item exists")
  public void userSeeThatTheCreatedItemExists() {
    boolean itemExists = itemLibraryPage.createdItemExists();
    Assert.assertTrue(itemExists);
  }

  @Then("User see error message says to save at least one option")
  public void userSeeErrorMessageSaysToSaveAtLeastOneOption() {
    boolean error = modifiersPage.errorCreateModifierMessage();
    Assert.assertTrue(error);
  }

  @Then("User see red border on category name field")
  public void userSeeRedBorderOnCategoryNameField() {
    boolean error = categoriesPage.errorCategoryNameField();
    Assert.assertTrue(error);
  }
}
