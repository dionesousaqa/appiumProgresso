package mydemoapp.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageObject {
    private WebDriver driver;
    private WebDriverWait wait;

    private By botaoOk = AppiumBy.id("android:id/button1");
    private By produto = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc='store item'])[1]/android.view.ViewGroup[1]/android.widget.ImageView");
    private By quantidade = AppiumBy.xpath("//android.view.ViewGroup[@content-desc='counter plus button']/android.widget.ImageView");
    private By checkout = AppiumBy.xpath("//android.widget.TextView[@text='Proceed To Checkout']");
    private By userName = AppiumBy.accessibilityId("Username input field");
    private By password = AppiumBy.accessibilityId("Password input field");
    private By login = AppiumBy.accessibilityId("Login button");

    public PageObject(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void clicarBotaoOk(){
        wait.until(ExpectedConditions.elementToBeClickable(botaoOk));
    }
    public void elementoProduto(){
        wait.until(ExpectedConditions.elementToBeClickable(produto));
    }
    public void elementoQuantidade(){
        wait.until(ExpectedConditions.elementToBeClickable(quantidade));
    }
    public void elementoCheckout(){
        wait.until(ExpectedConditions.elementToBeClickable(checkout));
    }
    public void elementoUserName(){
        wait.until(ExpectedConditions.elementToBeClickable(userName));
    }
    public void elementoPassword(){
        wait.until(ExpectedConditions.elementToBeClickable(password));
    }
    public void elementoLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(login));
    }
}