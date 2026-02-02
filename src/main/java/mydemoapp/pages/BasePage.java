package mydemoapp.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;

public class BasePage {
    AndroidDriver driver;

    public BasePage(AndroidDriver driverScenario) {

        this.driver = driverScenario;

    }

    public void clicarPorXpath(String elemento){
        driver.findElement(AppiumBy.xpath(elemento)).click();
    }
    public void clicarPorAcessibilityId(String elemento){
        driver.findElement(AppiumBy.accessibilityId(elemento)).click();
    }
    public void preencherCampoTextoPorAccessibilityId(String elemento, String valor){
        driver.findElement(AppiumBy.accessibilityId(elemento)).sendKeys(valor);

}
    public void preencherCampoTextoPorXpath(String elemento, String valor){
        driver.findElement(AppiumBy.accessibilityId(elemento)).sendKeys(valor);

    }
    public void validarNomeProduto(String elemento, String valorEsperado){
       String valorAtual = driver.findElement(AppiumBy.accessibilityId(elemento)).getText();
        Assert.assertEquals(valorEsperado, valorAtual );
    }
}


