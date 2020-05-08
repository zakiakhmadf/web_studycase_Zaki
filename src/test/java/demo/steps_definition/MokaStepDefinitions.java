package demo.steps_definition;

import demo.pages.pos.StartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MokaStepDefinitions {

  StartPage startPage = new StartPage();

  @Given("User is on moka start page")
  public void userIsOnMokaStartPage() {
    boolean actual = startPage.isOnPage();
    Assert.assertTrue(actual);
  }

  @When("User click sign in button on moka start page")
  public void userClickSignInButtonOnMokaStartPage() {
    startPage.clikSignInButton();
  }

  @When("User input email {string} on moka sign in page")
  public void userInputEmailOnMokaSignInPage(String arg0) {
  }

  @When("User input password {string} on moka sign in page")
  public void userInputPasswordOnMokaSignInPage(String arg0) {
  }

  @When("User click Sign in button on moka sign in page")
  public void userClickSignInButtonOnMokaSignInPage() {
  }

  @When("User click Library menu on moka POS page")
  public void userClickLibraryMenuOnMokaPOSPage() {
  }

  @When("User choose random category that has been created")
  public void userChooseRandomCategoryThatHasBeenCreated() {
  }

  @When("User choose the item in that category")
  public void userChooseTheItemInThatCategory() {
  }

  @When("User click Save Button on the order pop up")
  public void userClickSaveButtonOnTheOrderPopUp() {
  }

  @When("User click charge on library page")
  public void userClickChargeOnLibraryPage() {
  }

  @When("User choose suggested exact cash to pay on checkout popup")
  public void userChooseSuggestedExactCashToPayOnCheckoutPopup() {
  }

  @When("User click charge on checkout pop up")
  public void userClickChargeOnCheckoutPopUp() {
  }

  @Then("User is on receipt page")
  public void userIsOnReceiptPage() {
  }
}
