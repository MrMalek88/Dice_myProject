package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DiceApplicationBasePage;
import utilities.ConfigReader;
import utilities.Driver;

public class DiceApplicationBaseTest extends DiceApplicationBasePage {

    WebDriver driver;
    DiceApplicationBasePage diceApplicationBasePage;


@BeforeMethod
public void setup() {
        driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("appURL"));
        diceApplicationBasePage = new DiceApplicationBasePage();
        driver.findElement(By.id("email")).sendKeys("malekshaar@outlook.com");
        driver.findElement(By.id("password")).sendKeys("Othman97");
        diceApplicationBasePage.signIn.click();
        driver.findElement(By.cssSelector("#typeaheadInput"))
                .sendKeys("qa test engineer");
        driver.findElement(By.cssSelector("#submitSearch-button")).click();
        //driver.findElement(By.cssSelector("#facets > dhi-accordion.facet-group.ng-tns-c71-4.ng-star-inserted > " +
                //"div.facet-body.ng-tns-c71-4.ng-trigger.ng-trigger-expand > div > js-remote-options-filter > div > ul:nth-child(2) > li:nth-child(1) > span > button")).click();

        }

//@AfterMethod
//public void teardown() {
//        Driver.quitDriver();
//        }

@Test
public void clickOnEachJobTitle(){

        for (int i = 0; i < diceApplicationBasePage.jobTitle.size() ; i++) {
                diceApplicationBasePage.jobTitle.get(i).click();
                diceApplicationBasePage.applyButton.get(i).click();
                nextAfterApplyButton.get(i).click();

                //if (nextAfterApplyButton.get(0).isDisplayed().
                //)

                diceApplicationBasePage.nextAfterApplyButton.get(i).click();
                diceApplicationBasePage.finalApplyButton.get(i).click();
        }
//        diceApplicationBasePage.jobTitle.get(0).click();
//        //techGlobalBasePage.headerDropdownOptions.get(0).click();
//        diceApplicationBasePage.applyButton.get(0).click();
//        //diceApplicationBasePage.username.sendKeys("malekshaar@outlook.com");
//        //driver.findElement(By.id("username")).sendKeys("malekshaar@outlook.com");
//        //driver.findElement(By.id("username")).sendKeys("malekshaar@outlook.com");
//        diceApplicationBasePage.nextAfterApplyButton.get(0).click();
//        diceApplicationBasePage.finalApplyButton.get(0).click();
        }
        }
        