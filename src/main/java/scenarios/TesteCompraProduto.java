package scenarios;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import mydemoapp.pages.CarrinhoPage;
import mydemoapp.pages.HomePage;
import mydemoapp.pages.LoginPage;
import mydemoapp.pages.PageObject;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class TesteCompraProduto {

    AndroidDriver driver;
    HomePage homePage;
    CarrinhoPage carrinhoPage;
    LoginPage loginPage;
    PageObject pageObject;

    @Before
    public void before() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setPlatformVersion("16");
        options.setAutomationName("UIAutomator2");
        options.setDeviceName("emulator-5554");
        //options.setApp("src/main/resources/Android-MyDemoAppRN.1.3.0.build-244.apk"); >> se o app ainda n foi instalado
        options.setNoReset(false);
        options.setAppPackage("com.saucelabs.mydemoapp.rn");
        options.setAppActivity(".MainActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage = new HomePage(driver);
        carrinhoPage = new CarrinhoPage(driver);
        loginPage = new LoginPage(driver);
        pageObject = new PageObject(driver);

    }

@Test
    public void testeComprarProdutoAplicativo() {
        pageObject.clicarBotaoOk();
        driver.findElement(AppiumBy.id("android:id/button1")).click();

        pageObject.elementoProduto();
        homePage.clicarPorXpath(homePage.produto);
        homePage.clicarPorXpath(homePage.idAddCarrinho);
        homePage.clicarPorXpath(homePage.btnCarrinho);

        pageObject.elementoQuantidade();
        carrinhoPage.alterarQuantidadePra3();

        pageObject.elementoCheckout();
        carrinhoPage.clicarPorXpath("//android.widget.TextView[@text='Proceed To Checkout']");

        pageObject.elementoUserName();
        loginPage.preencherCampoTextoPorAccessibilityId(loginPage.inputIdUsername, "bob@example.com");

        pageObject.elementoPassword();
        loginPage.preencherCampoTextoPorAccessibilityId(loginPage.inputIdPassword,"102030");

        pageObject.elementoLogin();
        loginPage.clicarPorAcessibilityId(loginPage.btnAcessibilityIdLogin);

    }

}
