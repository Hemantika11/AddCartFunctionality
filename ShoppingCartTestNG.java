

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


public class ShoppingCartTestNG {
    WebDriver driver;

    @Test(priority = 1)
    void openBrowser() throws InterruptedException  //BROWSER SCENARIO
    {
        System.out.println("OPen Browser");
        System.setProperty("webdriver.edge.driver", "C:\\Software\\Driver\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

    }



    @Test(priority = 2)
    void SelectComputer() throws InterruptedException
    {
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        Thread.sleep(1000);


    }

    @Test(priority = 3)
    void SelectDesktop() throws InterruptedException
    {

        driver.findElement(By.xpath("//img[@title='Show products in category Desktops']")).click();

        Thread.sleep(1000);
    }

    @Test(priority = 4)
    void selectItem()
    {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a")).click();
    }

    @Test(priority = 5)
    void addItem()
    {
        driver.findElement(By.id("add-to-cart-button-3")).click();

    }

    @Test(priority = 6)
    void shoppingCart()
    {
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
    }

    @Test(priority = 7)
    void amendQty()
    {
        driver.findElement(By.className("qty-input")).clear();
        driver.findElement(By.className("qty-input")).sendKeys("3");
        //driver.findElement(By.id("updatecart")).click();
        //driver.findElement(By.id("itemquantity11243")).click();
    }

    @Test(priority = 8)
    void updateItem()
    {
        driver.findElement(By.id("updatecart")).click();
    }

    @Test(priority = 9)
    void TermsAndCondition()
    {
        driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
    }

    @Test(priority = 10)
    void checkingOut()
    {
        driver.findElement(By.id("checkout")).click();
    }

    @Test(priority = 11)
    void GuestCheckout()
    {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
    }

    @Test(priority = 12)
    void FirstName()
    {
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Vihaan");
    }

    @Test(priority = 13)
    void LastName()
    {
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Patel");
    }

    @Test(priority = 14)
    void EmailandCompany()
    {
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("hemrpatel@gmail.com");
        driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("Crecenzo");
    }

    @Test(priority = 15)
    void SelectCountry()
    {
        WebElement SelectCountry = driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select select = new Select(SelectCountry);
        select.selectByVisibleText("United Kingdom");
    }

    @Test(priority = 16)
    void State()throws InterruptedException
    {

        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("HemelHempstead");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("12 Camberwell");
        driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("Hertfordshire");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("HP2 7DD");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("07439674578");
        driver.findElement(By.id("BillingNewAddress_FaxNumber")).sendKeys("555-123-4567");
        //driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();
        driver.findElement(By.cssSelector("#billing-buttons-container > button.button-1.new-address-next-step-button")).click();
        Thread.sleep(1000);
        //This is for creditcard radio button
        //driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button")).click();
        //driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[1]/div/div/ul/li[1]/div[1]/input")).click();
        Thread.sleep(1000);
       // driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[1]")).click();
        //driver.findElement(By.id("paymentmethod_1"));
        //This is for back link
        //driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/div/p/a")).click();
         //This is for continue button
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button")).click();
        Thread.sleep(4000);
    }



  @Test(priority = 17)
       void Billing() throws InterruptedException {

      driver.findElement(By.xpath("//*[@id=\"paymentmethod_1\"]")).click();
      // WebElement card = driver.findElement(By.id("CreditCardType"));
      driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button")).click();
      WebElement card=driver.findElement(By.xpath("//*[@id=\"CreditCardType\"] "));
      WebElement Selectcard = driver.findElement(By.id("CreditCardType"));
      Select select2 = new Select(Selectcard);
      select2.selectByVisibleText("Mastercard");
      //driver.findElement(By.id("CreditCardType")).sendKeys("Master card");

      Thread.sleep(2000);

      driver.findElement(By.id("CardholderName")).sendKeys("Mr J PATEL");
      Thread.sleep(2000);

      driver.findElement(By.id("CardNumber")).sendKeys("2345678337569");
      Thread.sleep(3000);

      WebElement selectmonth = driver.findElement(By.id("ExpireMonth"));
      Select select3 = new Select(selectmonth);
      select3.selectByValue("10");

      Thread.sleep(2000);

      WebElement selectyear = driver.findElement(By.id("ExpireYear"));
      Select select4 = new Select(selectyear);
      select4.selectByValue("2024");

      Thread.sleep(2000);
      driver.findElement(By.id("CardCode")).sendKeys("485");
      Thread.sleep(4000);
      // driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button")).click();//button
      driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/p/a")).click();
      Thread.sleep(3000);

      driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/button")).click();
      Thread.sleep(3000);



     // driver.findElement(By.xpath("//*[@id=\"paymentmethod_0\"]")).click();
      //driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button")).click();
     // driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button")).click();
     // driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button\n")).click();
  }

  void close()
  {
      driver.quit();
  }

   }










