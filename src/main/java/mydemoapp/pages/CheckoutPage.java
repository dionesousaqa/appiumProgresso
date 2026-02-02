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

    public String inputIdNomeCartao = "Full Name* input field";

    public String inputIdNumeroCartao = "Card Number* input field";

    public String inputIdCDataVencimento = "Expiration Date* input field";

    public String inputIdCodigoSeguranca = "Security Code* input field";

    public String btnRevisarPedido= "//android.widget.TextView[@text='Review Order']";

    public String inputIdQuantidadeTotal = "total number";

    public String inputIdResumoProduto = "product label";

    public String btnConfirmarPedido= "Place Order button";

    public CheckoutPage(AndroidDriver driverScenario) {
        super(driverScenario);
        this.driver = driverScenario;
    }

}
