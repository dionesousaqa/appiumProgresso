package mydemoapp.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageObjectCheckout {
    private WebDriver driver;
    private WebDriverWait wait;

    private By inputName = AppiumBy.accessibilityId("Full Name* input field");
    private By inputEndereco = AppiumBy.accessibilityId("Address Line 1* input field");
    private By inputCidade = AppiumBy.accessibilityId("City* input field");
    private By inputCodigoPostal = AppiumBy.accessibilityId("Zip Code* input field");
    private By inputCodigoPais = AppiumBy.accessibilityId("Country* input field");
    private By irParaPagamento = AppiumBy.xpath("//android.widget.TextView[@text='To Payment']");


    public PageObjectCheckout(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void nome(){wait.until(ExpectedConditions.elementToBeClickable(inputName));}
    public void endereco(){
        wait.until(ExpectedConditions.elementToBeClickable(inputEndereco));
    }
    public void cidadedade(){
        wait.until(ExpectedConditions.elementToBeClickable(inputCidade));
    }
    public void codigoPostal(){wait.until(ExpectedConditions.elementToBeClickable(inputCodigoPostal));}
    public void pais(){
        wait.until(ExpectedConditions.elementToBeClickable(inputCodigoPais));
    }
    public void btPagamento(){
        wait.until(ExpectedConditions.elementToBeClickable(irParaPagamento));
    }

}