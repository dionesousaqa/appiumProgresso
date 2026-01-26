package mydemoapp.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class CarrinhoPage extends BasePage {
    AndroidDriver driver;

    public CarrinhoPage(AndroidDriver driverTeste){
        super(driverTeste);
        this.driver =  driverTeste;
    }


    public String xpathIrParaCheckout = "//android.widget.TextView[@text='Proceed To Checkout']";
    String btnAdicionarItemCarrinho = "//android.view.ViewGroup[@content-desc='counter plus button']/android.widget.ImageView";


    public void alterarQuantidadePra3(){

        driver.findElement(AppiumBy.xpath(btnAdicionarItemCarrinho)).click();
        driver.findElement(AppiumBy.xpath(btnAdicionarItemCarrinho)).click();
    }

    public void clicarPorXpath(String elemento){
        driver.findElement(AppiumBy.xpath(elemento)).click();
    }
}

