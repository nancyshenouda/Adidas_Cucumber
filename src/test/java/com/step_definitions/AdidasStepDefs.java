package com.step_definitions;

import com.pages.AdidasSearchPage;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class AdidasStepDefs {



    @Then("User should see title is Adidas")
    public void user_should_see_title_is_adidas() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "STORE";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @Given("User is on Adidas home page")
    public void user_is_on_adidas_home_page() {
        Driver.getDriver().get("https://www.demoblaze.com/index.html");
    }
    @When("user searches for phones, Laptops, Monitors")
    public void user_searches_for_phones_laptops_monitors() {
        System.out.println("User searches for products");
    }
    @Then("User navigates to Laptops")
    public void user_navigates_to_laptops() throws InterruptedException {
        AdidasSearchPage object = new AdidasSearchPage();
       object.laptops.click();
        Thread.sleep(1000);

    }
    @Then("User sees Sony vaio i5")
    public void user_sees_sony_vaio_i5() throws InterruptedException {
        AdidasSearchPage object = new AdidasSearchPage();
        object.SonyVaioI5.click();
        Thread.sleep(1000);
    }
    @Then("user clicks on Add to cart")
    public void user_clicks_on_add_to_cart() throws InterruptedException {
        AdidasSearchPage object = new AdidasSearchPage();
        object.addToCart.click();
        Thread.sleep(1000);
    }
    @Then("user accepts pop up confirmation")
    public void user_accepts_pop_up_confirmation() throws InterruptedException {
        Driver.getDriver().switchTo().alert().dismiss();
        Thread.sleep(1000);

    }
    @Given("User navigates back to home page")
    public void user_navigates_back_to_home_page() {
        AdidasSearchPage object = new AdidasSearchPage();
        object.homeButton.click();
    }
    @Then("User clicks on Laptops")
    public void user_clicks_on_laptops() throws InterruptedException {
        AdidasSearchPage object = new AdidasSearchPage();
        object.laptops.click();
        Thread.sleep(1000);
    }
    @Then("User clicks Dell i7 8gb")
    public void user_clicks_dell_i7_8gb() {
        AdidasSearchPage object = new AdidasSearchPage();
        object.dellLaptop.click();
    }
    @Given("User navigates to cart")
    public void user_navigates_to_cart() throws InterruptedException {
        AdidasSearchPage object = new AdidasSearchPage();
        object.cartButton.click();
        Thread.sleep(1000);
    }
    @Then("user clicks on delete")
    public void user_clicks_on_delete() throws InterruptedException {
        AdidasSearchPage object = new AdidasSearchPage();
        object.deleteButton.click();
        Thread.sleep(1000);
    }

    @Given("User is on placing order page")
    public void user_is_on_placing_order_page() {
        System.out.println("User is placing order");
    }
    @Then("User clicks on place order")
    public void user_clicks_on_place_order() throws InterruptedException {

        AdidasSearchPage object = new AdidasSearchPage();
        object.placeOrder.click();
        Thread.sleep(1000);
    }
    @Then("user fills all the form details")
    public void user_fills_all_the_form_details() {
        AdidasSearchPage object = new AdidasSearchPage();
        object.name.sendKeys("Nancy");
        object.country.sendKeys("USA");
        object.city.sendKeys("VA" );
        object.card.sendKeys("334455667788901" );
        object.month.sendKeys("06" );
        object.year.sendKeys("24");

    }
    @Then("user clicks Ok")
    public void user_clicks_ok() {
        AdidasSearchPage object = new AdidasSearchPage();
        object.okButton.click();
    }
    @Given("User got the payment confirmation")
    public void user_got_the_payment_confirmation() {
        System.out.println("User receives the payment confirmation");
    }
    @Then("User should see purchase ID and amount")
    public void user_should_see_purchase_id_and_amount() {
        AdidasSearchPage object = new AdidasSearchPage();
        String confirmation = object.confirmation.getText();
        String [] confirmationArray = confirmation.split("\n");
        int actualAmount = Integer.parseInt(confirmationArray[1].split(" ")[1]);
        String expectedOrderAmount = object.expectedOrderAmount.getText();
        int expectedAmount= Integer.valueOf(expectedOrderAmount);
        Assert.assertTrue(actualAmount==expectedAmount);

    }
    @Then("User click Ok")
    public void user_click_ok() {
        AdidasSearchPage object = new AdidasSearchPage();
        object.lastOkButton.click();
    }

}
