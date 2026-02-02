package mydemoapp.pages;

import io.appium.java_client.android.AndroidDriver;

public class CheckoutPage extends BasePage{
    AndroidDriver driver;

    public String inputIdName = "Full Name* input field";

    public String inputIdEndereco = "Address Line 1* input field";

    public String inputIdCidade = "City* input field";

    public String inputIdCodigoPostal = "Zip Code* input field";

    public String inputIdCodigoPais = "Country* input field";

    public String btnIrParaPagamento = "//android.widget.TextView[@text='To Payment']";

    public CheckoutPage(AndroidDriver driverScenario) {
        super(driverScenario);
        this.driver = driverScenario;
    }

}
