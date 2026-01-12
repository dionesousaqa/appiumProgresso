import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Map;

public class ExemplosAutomarizacaoAppium {

   AndroidDriver driver;

   @Before
   public void before() throws MalformedURLException {

      UiAutomator2Options options = new UiAutomator2Options();
      options.setPlatformName("Android");
      options.setPlatformVersion("16");
      options.setAutomationName("UIAutomator2");
      options.setDeviceName("emulator-5554");
      options.setAppPackage("io.appium.android.apis");
      options.setAppActivity(".ApiDemos");

      driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

   }

   @Test
   public void primeiroExemplo() throws MalformedURLException, InterruptedException {
      Thread.sleep(3000);
      driver.findElement(AppiumBy.accessibilityId("App")).click();
      Thread.sleep(3000);
      driver.findElement(AppiumBy.accessibilityId("Activity")).click();
      Thread.sleep(3000);
      driver.findElement(AppiumBy.accessibilityId("Hello World")).click();
      Thread.sleep(3000);

      Assert.assertEquals("Hello, World!",driver.findElement(AppiumBy.accessibilityId("Hello, World!")).getText());

   }
   @Test
   public void scrollDown() throws InterruptedException {
      Thread.sleep(3000);
      driver.findElement(AppiumBy.accessibilityId("Views")).click();

      driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
              +"new UiSelector().text(\"WebView\"));"));

   }
   @Test
   public void dragAndDrop() throws InterruptedException {
      driver.findElement(AppiumBy.accessibilityId("Views")).click();

      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("Drag and Drop")));
      driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

      WebDriverWait waiti = new WebDriverWait(driver, Duration.ofSeconds(10));
      waiti.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("io.appium.android.apis:id/drag_dot_1")));

      RemoteWebElement source = (RemoteWebElement) driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));

      WebDriverWait waitih = new WebDriverWait(driver, Duration.ofSeconds(10));
      waitih.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("io.appium.android.apis:id/drag_dot_2")));
      RemoteWebElement destination = (RemoteWebElement) driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_2"));

      driver.executeScript("gesture: dragAndDrop", Map.of("sourceId", source.getId(), "destinationId", destination.getId()));
   }

   @Test
   public void webViewTest() throws InterruptedException {

      WebDriverWait waitii = new WebDriverWait(driver, Duration.ofSeconds(30));
      waitii.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("Views")));
      driver.findElement(AppiumBy.accessibilityId("Views")).click();

      driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
              +"new UiSelector().text(\"WebView\"));"));

      driver.findElement(AppiumBy.accessibilityId("WebView")).click();

      WebDriverWait waiti = new WebDriverWait(driver, Duration.ofSeconds(30));
      waiti.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("android:id/aerr_wait")));


      Object [] handles = driver.getContextHandles().toArray();
      System.out.println(handles[0]+" - "+ handles[1]);
      String weViewContext = (String) handles[1];
      driver.context(weViewContext);

      Assert.assertTrue(driver.getPageSource().contains("This page is a Selenium sandbox"));

   }
   @Test
   public void recorder(){
      WebElement el1 = driver.findElement(AppiumBy.accessibilityId("Views"));
      el1.click();

      WebDriverWait waitii = new WebDriverWait(driver, Duration.ofSeconds(30));
      waitii.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("Drag and Drop")));
      WebElement el2 = driver.findElement(AppiumBy.accessibilityId("Drag and Drop"));
      el2.click();

      WebDriverWait waiti = new WebDriverWait(driver, Duration.ofSeconds(30));
      waiti.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("io.appium.android.apis:id/drag_dot_1")));
      WebElement el3 = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
      el3.click();

   }
   @After
   public void after(){
      if (driver != null){
         driver.quit();;
      }
   }
}
