package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnCardContainer(String containerName){
        if(containerName.equalsIgnoreCase("Learn Angular")){
            driver.findElement(By.xpath(".//span[contains(text(),'Angular Material')]")).click();
        }
    }

}
