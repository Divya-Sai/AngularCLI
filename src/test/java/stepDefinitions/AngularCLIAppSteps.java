package stepDefinitions;

import PageObjects.BasePage;
import PageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AngularCLIAppSteps {

    BasePage bpPage;
    WebDriver driver;
    HomePage hpPage;

    @Given("Open Chrome browser")
    public void open_chrome_browser() {
        bpPage = new BasePage();
        bpPage.setBrowserName("Chrome");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("Launch the {string}")
    public void launch_the(String url) throws InterruptedException {
        driver.get("http://localhost:8080/");
        Thread.sleep(5000);
    }
    @Then("verify the title of the page")
    public void verify_the_title_of_the_page() {
       String titleofthepage = driver.getTitle();
       System.out.println("title of the page is ::"+titleofthepage);
        Assert.assertEquals(titleofthepage,"MyApp");
    }
    @Then("quit the browser")
    public void quit_the_browser() {
       driver.quit();
    }


    @Then("User should click on Angular")
    public void user_should_click_on_angular() throws InterruptedException {
        hpPage = new HomePage(driver);
        hpPage.clickOnCardContainer("Learn Angular");
        Thread.sleep(5000);
        Set<String> winIds=driver.getWindowHandles();

        List<String> al = new ArrayList(winIds);
        String WindId1 = al.get(0);
        String WinId2 = al.get(1);

        driver.switchTo().window(WinId2);
        String titleofLearnAngularPage = driver.getTitle();
        System.out.println("the title of Learn Angular Page is:::"+titleofLearnAngularPage);
      //  Assert.assertEquals(titleofLearnAngularPage,"");

    }

}
