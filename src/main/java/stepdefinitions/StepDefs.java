package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juri on 16/11/2017.
 */
public class StepDefs extends BaseSteps {



    private final String VALTECH_URL = "https://www.valtech.com/";


    @Before
    public void before() {
        startWebDriver();
    }

    @After
    public void after() {
        stopWebDriver();
    }

    @Given("^User go to valtech site$")
    public void openValtechPage() {
        driver.navigate().to(VALTECH_URL);
      //  driver.get(VALTECH_URL);
    }

    @Then("^Assert that the h1 is displayed '(.*?)'$")
    public void verifyBetRecipt(String elementText) {
        WebElement element = driver.findElement(By.cssSelector(".page-header > h1"));
        assertEquals(elementText, element.getText());
    }

    @When("^Do click '(.*?)'$")
    public void clickSearchButton(String searchTerm) {
        driver.findElement(By.cssSelector("a[href = '/"+searchTerm.toLowerCase()+"/'")).click();
    }

}
