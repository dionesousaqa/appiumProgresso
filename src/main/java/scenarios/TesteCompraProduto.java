package scenarios;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class TesteCompraProduto {

    AndroidDriver driver;

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


    }

@Test
    public void testeComprarProdutoAplicativo(){

    }

}
