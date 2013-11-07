package br.com.MDSGPP.ChamadaParlamentar.TestesFuncionais;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteEscolhendoDeputado {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:8085/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  //@Test
  public void testEscolhendoDeputado() throws Exception {
    driver.get(baseUrl + "/ChamadaParlamentar/Index.jsp");
    driver.findElement(By.linkText("Acompanhar Parlamentar")).click();
    new Select(driver.findElement(By.name("deputado"))).selectByVisibleText("AMAURI TEIXEIRA-PT/BA");
    driver.findElement(By.name("enviar")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alert.getText();
    } finally {
      acceptNextAlert = true;
    }
  }
}
