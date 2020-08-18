package com.etsy.step_definitions.Dyson;

import com.etsy.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DysonStepDefs {

    private String URL="https://www.dyson.co.uk/sticks/dyson-cyclone-v10-shop-all.html";

    @When("I am on the v10 page")
    public void i_am_on_the_v10_page() throws InterruptedException {
        Driver.get().get(this.URL);
        Driver.get().manage().window().maximize();
        Thread.sleep(3500);
    }

    @Then("the (.*) should be displayed")
    public void the_should_be_displayed(String message) {
        WebElement actualMessage = Driver.get().findElement(By.className("trade-up-item__stock-message"));
        Assert.assertEquals(message,actualMessage.getText());
    }
}
