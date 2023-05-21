package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DiceApplicationBasePage {


    public DiceApplicationBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "a[class*='bold']")
    public List<WebElement> jobTitle;

    @FindBy(css = "#loginDataSubmit > div:nth-child(3) > div > button")
    public WebElement signIn;

    @FindBy(css = "div[class*=apply-button]")
    public List<WebElement> applyButton;

    @FindBy(id = "username")
    public WebElement username;


    @FindBy(css = "button[class*=btn-block]")
    public List<WebElement> nextAfterApplyButton;

    @FindBy(css = "button[class*=btn-block]")
    public List<WebElement> finalApplyButton;






}

