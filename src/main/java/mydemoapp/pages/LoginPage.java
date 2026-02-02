package mydemoapp.pages;

import io.appium.java_client.android.AndroidDriver;

public class LoginPage extends BasePage{
    AndroidDriver driver;

    public String inputIdUsername = "Username input field";

    public String inputIdPassword = "Password input field";

    public String btnAcessibilityIdLogin = "Login button";

    public LoginPage(AndroidDriver driverScenario) {
        super(driverScenario);
        this.driver = driverScenario;
    }

}
