package mydemoapp.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class HomePage {
    AndroidDriver driver;

    public String produto = "(//android.view.ViewGroup[@content-desc='store item'])[1]/android.view.ViewGroup[1]/android.widget.ImageView";

    public String idAddCarrinho = "//android.widget.TextView[@text='Add To Cart']";

    public String btnCarrinho = "//android.view.ViewGroup[@content-desc='cart badge']/android.widget.ImageView";

    public HomePage( AndroidDriver driverScenario){

        this.driver = driverScenario;

    }

    public void clicarPorXpath(String elemento){
        driver.findElement(AppiumBy.xpath(elemento)).click();
    }

}
