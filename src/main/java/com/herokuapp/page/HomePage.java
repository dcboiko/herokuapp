package com.herokuapp.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.utils.WebDriverManager;

public class HomePage {

    String url = "https://the-internet.herokuapp.com/";

    WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Add/Remove Elements')]")
    private WebElement lnkAddRemoveElement;

    @FindBy(xpath = "//button[contains(text(),'Add Element')]")
    private WebElement btnAddElement;

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    private WebElement btnDeletElement;

    @FindBy(xpath = "//a[contains(text(),'A/B Testing')]")
    private WebElement lnkABTesting;

    private WebElement lnkBasicAuth;

    public HomePage(WebDriver driver) {

        driver = WebDriverManager.getDriver();
        driver.get(url);
        driver.manage().window().maximize();

        PageFactory.initElements(driver, this);

    }

    public void menuSelect() {

        lnkAddRemoveElement.click();

    }

    public void clickLnkABTesting(WebDriver driver) {

        lnkABTesting.click();

    }

    public boolean ABTestingPageisDisplayed(WebDriver driver) {

        if ((driver.getCurrentUrl() != null) || (driver.getClass() != null) || (driver.getTitle() != null)) {

            return true;

        } else {

            return false;
        }
    }

    public void clickLnkBasicAuth(WebDriver driver) {

        // lnkBasicAuth = driver.findElement(By.xpath("//a[contains(text(),'Basic
        // Auth')]"));
        // lnkBasicAuth.click();

        // try {
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // wait.until(ExpectedConditions.alertIsPresent());
        // Alert prompt = driver.switchTo().alert();
        // prompt.dismiss();
        // } catch (Exception e) {
        // e.printStackTrace();
        // // exception handling
        // }

        // // System.out.println("Alert Text: " + alertText);
        // System.out.println();

    }

}