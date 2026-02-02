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

    private By inputNameCartao = AppiumBy.accessibilityId("Full Name* input field");
    private By inputNumeroCartao = AppiumBy.accessibilityId("Card Number* input field");
    private By inputDataVencimento = AppiumBy.accessibilityId("Expiration Date* input field");
    private By inputCodigoSeguranca = AppiumBy.accessibilityId("Security Code* input field");
    private By btnRevisarPedido = AppiumBy.xpath("//android.widget.TextView[@text='Review Order']");
    private By inputQuantidadeTotal = AppiumBy.accessibilityId("total number");
    private By inputResumoProdudo = AppiumBy.accessibilityId("product label");
    private By btnConfirmarPedido = AppiumBy.accessibilityId("Place Order button");



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

    public void nomeCartao(){wait.until(ExpectedConditions.elementToBeClickable(inputNameCartao));}
    public void numeroCartao(){wait.until(ExpectedConditions.elementToBeClickable(inputNumeroCartao));}
    public void dataVencimento(){wait.until(ExpectedConditions.elementToBeClickable(inputDataVencimento));}
    public void codigoSeguranca(){wait.until(ExpectedConditions.elementToBeClickable(inputCodigoSeguranca));}
    public void revisarPedidoBtn(){wait.until(ExpectedConditions.elementToBeClickable(btnRevisarPedido));}
    public void quantidadeTotal(){wait.until(ExpectedConditions.elementToBeClickable(inputQuantidadeTotal));}
    public void resumoProduto(){wait.until(ExpectedConditions.elementToBeClickable(inputResumoProdudo));}
    public void confirmarProdutoBtn(){wait.until(ExpectedConditions.elementToBeClickable(btnConfirmarPedido));}




}