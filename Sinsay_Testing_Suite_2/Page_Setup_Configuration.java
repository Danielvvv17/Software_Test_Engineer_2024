 package Sinsay_Testing_Suite_2;

  import java.net.HttpURLConnection;
  import java.net.URI;
  import java.net.URL;
  import java.time.Duration;
  import java.util.List;
  import java.util.concurrent.ExecutorService;
  import java.util.concurrent.Executors;
  import java.util.concurrent.TimeUnit;
  import org.junit.After;
  import org.junit.Before;
  import org.openqa.selenium.By;
  import org.openqa.selenium.JavascriptExecutor;
  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.WebElement;
  import org.openqa.selenium.chrome.ChromeDriver;
  import org.openqa.selenium.support.ui.ExpectedConditions;
  import org.openqa.selenium.support.ui.Select;
  import org.openqa.selenium.support.ui.WebDriverWait;
  
  
  
    public class Page_Setup_Configuration {
	 
	static WebDriver driver;
	
	@Before
    public void initDriver() {
        System.getProperty(Testing_Configuration_Setup.CHROME_DRIVER_PATH); 
        Page_Setup_Configuration.driver = new ChromeDriver(); 
        Page_Setup_Configuration.driver.manage().window().maximize();
        driver.navigate().to(Testing_Configuration_Setup.BASE_URL);
    } 
	
	@After
    public void closeConnection() {
        driver.quit();
		
    }
    
    public static WebElement waitForElementToBeClickable(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
   
    }
	
   
    public static void Accept_Cookies_1()  throws InterruptedException {
    	
    	WebElement ButtonCookie = waitForElementToBeClickable(By.id("cookiebotDialogOkButton"), 20);
    	ButtonCookie.click();
    	Thread.sleep(5000);
    }
    
    
    public static void Sign_In_2()  throws InterruptedException {
	    	
		 WebElement Account_Button = waitForElementToBeClickable(By.linkText("Cont"), 20);
		 Account_Button.click();
		 Thread.sleep(2000);
		 
		 WebElement Create_Account = waitForElementToBeClickable(By.xpath("//button[text()='Creează cont']"), 20);  
		 Create_Account.click();
		 Thread.sleep(2000);
		 
		 WebElement Email = waitForElementToBeClickable(By.id("email_id"), 20);  
		 Email.sendKeys(Testing_Configuration_Setup.EMAIL); 
		 Thread.sleep(2000);
		 
		 WebElement FirstName = waitForElementToBeClickable(By.id("firstname_id"), 20);  
		 FirstName.sendKeys(Testing_Configuration_Setup.FIRST_NAME);  
		 Thread.sleep(2000);
		 
		 WebElement LastName = waitForElementToBeClickable(By.id("lastname_id"), 20);  
		 LastName.sendKeys(Testing_Configuration_Setup.LAST_NAME); 
		 Thread.sleep(2000);
		 
		 WebElement Password = waitForElementToBeClickable(By.id("password_id"), 20);  
		 Password.sendKeys(Testing_Configuration_Setup.PASSWORD);
		 Thread.sleep(2000);
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;  
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight);");   
		 Thread.sleep(2000); 
		 
		 WebElement Promotions = waitForElementToBeClickable(By.id("is_subscribed_id"), 20);  
		 Promotions.click();  
		 Thread.sleep(2000);
		 
		 WebElement Privacy_Policy = waitForElementToBeClickable(By.id("privacy_policy_id"), 20);  
		 Privacy_Policy.click();	 
		 Thread.sleep(3000); 
		 
		 WebElement Create_Account_2 = waitForElementToBeClickable(By.xpath("//button[text()='Creează cont']"), 20);  
     	 Create_Account_2.click();	
		 Thread.sleep(2000);
		 
		 js.executeScript("window.scrollTo(0, 0);");
		 Thread.sleep(2000);
    }
    
     public static void Login_3() throws InterruptedException {
    	
		 WebElement Login_Account1 = waitForElementToBeClickable(By.xpath("//button[text()='Intră în cont']"), 20);  
		 Login_Account1.click();
		 Thread.sleep(2000);
		 
		 WebElement Login_Email = waitForElementToBeClickable(By.id("login[username]_id"), 20);  
		 Login_Email.sendKeys(Testing_Configuration_Setup.EMAIL);
		 Thread.sleep(2000);
		 
		 WebElement Login_Password = waitForElementToBeClickable(By.id("login[password]_id"), 20);  
		 Login_Password.sendKeys(Testing_Configuration_Setup.PASSWORD);
		 Thread.sleep(2000);
		 
		 WebElement Login_Account2 = waitForElementToBeClickable(By.xpath("//button[text()='Intră în cont']"), 20);  
		 Login_Account2.click();
		 Thread.sleep(6000);
		 
		 WebElement Newsletter = driver.findElement(By.xpath("//span[@class='ds-icon outline-close ds-icon-size__l']"));
		 Newsletter.click();
		 Thread.sleep(2000);
		 
		 }
    
    
    public static void Sign_Out_4() throws InterruptedException {
    	
		 Thread.sleep(2000);
		 
		 WebElement Customer_Account = waitForElementToBeClickable(By.linkText("Vlad Ionut"), 20);
    	 Customer_Account.click();
    	 Thread.sleep(2000);
    	 
    	 WebElement Log_Out  = driver.findElement(By.linkText("Delogare"));
    	 Log_Out.click();
    }
    
    
    public static void Customer_Account_1()  throws InterruptedException {
    	 
    	 WebElement ButtonCookie = waitForElementToBeClickable(By.id("cookiebotDialogOkButton"), 20);
     	 ButtonCookie.click();
     	 Thread.sleep(2000);
     	 
     	 WebElement Account_Button = waitForElementToBeClickable(By.linkText("Cont"), 20);
		 Account_Button.click();	
		 Thread.sleep(2000);
		 
		 WebElement Login_Email = waitForElementToBeClickable(By.id("login[username]_id"), 20);  
		 Login_Email.sendKeys(Testing_Configuration_Setup.EMAIL);
		 Thread.sleep(2000);
		 
		 WebElement Login_Password = waitForElementToBeClickable(By.id("login[password]_id"), 20);  
		 Login_Password.sendKeys(Testing_Configuration_Setup.PASSWORD);	
		 Thread.sleep(2000);
		 
		 WebElement Show_Password = waitForElementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div/form/div[2]/div/div/button"), 20);  
		 Show_Password.click();
		 Thread.sleep(2000);
		 
		 WebElement Remember_Me_ID = waitForElementToBeClickable(By.id("login[remember_me]_id"), 20);
		 Remember_Me_ID.click();
		 Thread.sleep(2000);
		 
		 WebElement Login_Account2 = waitForElementToBeClickable(By.xpath("//button[text()='Intră în cont']"), 20);  
		 Login_Account2.click();
		 Thread.sleep(2000);
		 
		 WebElement Newsletter = driver.findElement(By.xpath("//span[@class='ds-icon outline-close ds-icon-size__l']"));
		 Newsletter.click();
		 Thread.sleep(2000);
		 
		 WebElement Customer_Account = waitForElementToBeClickable(By.linkText("Vlad Ionut"), 20);
    	 Customer_Account.click();
     }
     
     
     
    public static void Personal_Data_2()  throws InterruptedException {
    	 
    	 WebElement Account_Setting = waitForElementToBeClickable(By.linkText("Setările contului"), 20);
    	 Account_Setting.click();
    	 Thread.sleep(2000);
    	 
    	 WebElement First_Name = waitForElementToBeClickable(By.id("firstname"), 20);
    	 First_Name.clear();
    	 Thread.sleep(2000);
    	 
    	 First_Name.sendKeys(Testing_Configuration_Setup.FirstName);
    	 Thread.sleep(2000);
    	 
    	 WebElement Last_Name = waitForElementToBeClickable(By.id("lastname"), 20);
    	 Last_Name.clear();
    	 Thread.sleep(2000);
    	 
    	 Last_Name.sendKeys(Testing_Configuration_Setup.LastName);
    	 Thread.sleep(2000);
    	 
    	 WebElement Date_Of_Birth = waitForElementToBeClickable(By.id("dateOfBirth"), 20);
    	 Date_Of_Birth.click();
    	 Thread.sleep(2000);
    	 
    	 WebElement Next = driver.findElement(By.xpath("//td[text()='»']"));
    	 Next.click();
    	 By nextButtonLocator = By.xpath("//td[text()='»']");
         for (int i = 0; i < 3; i++) { 
         WebElement nextButton = driver.findElement(nextButtonLocator);
         nextButton.click();
         if (i < 2) {
         try {
         Thread.sleep(5000);
         } catch (InterruptedException e) {
         e.printStackTrace();
         
         } } }
         
         WebElement Select_Year = driver.findElement(By.xpath("//td[text()='2021']"));
         Select_Year.click();
         Thread.sleep(2000);
         
         WebElement Select_Month = driver.findElement(By.xpath("//td[text()='Iun']"));
         Select_Month.click();
         Thread.sleep(2000);
         
         WebElement Select_Day = driver.findElement(By.xpath("//td[text()='12']"));
         Select_Day.click();
         Thread.sleep(2000);
         
         WebElement Select_Gender = driver.findElement(By.id("gender"));
         Select_Gender.click();
         Thread.sleep(2000);
         
         Select select = new Select(waitForElementToBeClickable(By.id("gender"), 10));
         select.selectByVisibleText("Femeie");
         Thread.sleep(2000);
         
         WebElement Phone = driver.findElement(By.id("phone"));
         Phone.clear();
         Thread.sleep(2000);
         Phone.sendKeys (Testing_Configuration_Setup.PHONE_NUMBER);
         
         JavascriptExecutor js = (JavascriptExecutor) driver;
         long scrollPosition = (Long) js.executeScript("return document.body.scrollHeight");
         long scrollStep = 200;  

         try {
             while (scrollPosition > 0) {
                 js.executeScript("window.scrollBy(0, -arguments[0]);", scrollStep);
                 scrollPosition -= scrollStep;
                 Thread.sleep(200); 
             }
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         }
    	 
    public static void Delivery_Dates_3()  throws InterruptedException { 
    	 
    	 WebElement Delivery_Address = waitForElementToBeClickable(By.linkText("Date de livrare"), 20);
    	 Delivery_Address.click();
    	 Thread.sleep(2000);
    	 
    	 WebElement Street_Name = waitForElementToBeClickable(By.id("addressStreetName"), 20);
    	 Street_Name.sendKeys(Testing_Configuration_Setup.StreetName);
    	 Thread.sleep(2000);
    	 
    	 WebElement Region = waitForElementToBeClickable(By.id("addressRegion"), 20);
    	 Region.sendKeys(Testing_Configuration_Setup.Region);
    	 Thread.sleep(2000);
    	 
    	 WebElement Postcode = waitForElementToBeClickable(By.id("addressPostcode"), 20);
    	 Postcode.sendKeys(Testing_Configuration_Setup.Postcode);
    	 Thread.sleep(2000);
    	 
    	 WebElement City = waitForElementToBeClickable(By.id("addressCity"), 20);
    	 City.sendKeys(Testing_Configuration_Setup.City);
    	 Thread.sleep(2000);
    	 
    	 WebElement Mobile = waitForElementToBeClickable(By.id("addressPhone"), 20);
    	 Mobile.sendKeys(Testing_Configuration_Setup.Mobile);
    	 Thread.sleep(5000);
    	 
         } 
           
    public static void Invoice_Dates_4()  throws InterruptedException {
    	 
    	 WebElement Billing_Dates = waitForElementToBeClickable(By.linkText("Date de Facturare"), 20);
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].scrollIntoView(true);",Billing_Dates );
         Thread.sleep(2000);
    	 Billing_Dates.click();
    	 Thread.sleep(5000); 
    	 JavascriptExecutor j2s = (JavascriptExecutor) driver;
         long scrollPosition = (Long) js.executeScript("return document.body.scrollHeight");
         long scrollStep = 200; 
         try {
         while (scrollPosition > 0) {
         j2s.executeScript("window.scrollBy(0, -arguments[0]);", scrollStep);
         scrollPosition -= scrollStep;
         Thread.sleep(200); 
             }
         } catch (InterruptedException e) {
         e.printStackTrace();
         }
         
    	 WebElement label = driver.findElement(By.xpath("//label[contains(text(), 'Factură pentru Persoană Fizică')]"));
    	 label.click();
    	 Thread.sleep(2000);
    	 
    	 WebElement Invoice_FirstName = waitForElementToBeClickable(By.id("invoice-firstname"), 20);
    	 Invoice_FirstName.clear();
    	 Thread.sleep(2000);
    	 Invoice_FirstName.sendKeys(Testing_Configuration_Setup.FirstName);
    	 Thread.sleep(2000);
    	 
    	 WebElement Invoice_LastName = waitForElementToBeClickable(By.id("invoice-lastname"), 20);
    	 Invoice_LastName.clear();
    	 Thread.sleep(2000);
    	 Invoice_LastName.sendKeys(Testing_Configuration_Setup.LAST_NAME);
    	 Thread.sleep(2000);
    	 
    	 WebElement Invoice_StreetName = waitForElementToBeClickable(By.id("invoice-street0"), 20);
    	 Invoice_StreetName.sendKeys(Testing_Configuration_Setup.StreetName);
    	 Thread.sleep(2000);
    	 
    	 WebElement Invoice_StreetNumber = waitForElementToBeClickable(By.id("invoice-street1"), 20);
    	 Invoice_StreetNumber.sendKeys(Testing_Configuration_Setup.StreetNumber);
    	 Thread.sleep(2000);
    	 
    	 WebElement Invoice_PostCode = waitForElementToBeClickable(By.id("invoice-postcode"), 20);
    	 Invoice_PostCode.sendKeys(Testing_Configuration_Setup.Postcode);
    	 Thread.sleep(2000);
    	 
    	 WebElement Invoice_City = waitForElementToBeClickable(By.id("invoice-city"), 20);
    	 Invoice_City.sendKeys(Testing_Configuration_Setup.City);
    	 Thread.sleep(2000);
    	
     }  
    	 
   public static void Search_In_Romanian_1 () throws InterruptedException {
//	  
    	 WebElement ButtonCookie = waitForElementToBeClickable(By.id("cookiebotDialogOkButton"), 20);
    	 ButtonCookie.click();
    	 Thread.sleep(2000);
    	 
    	 WebElement Search_Button = waitForElementToBeClickable(By.id("algoliaButton"), 20);
    	 Search_Button.click();
    	 Thread.sleep(2000);
    	 
    	 WebElement Toys_For_Children = waitForElementToBeClickable(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/header/div[3]/div[1]/div[2]/div/div/div[1]/div/div/div/div[2]/input"), 20);
    	 Toys_For_Children.sendKeys(Testing_Configuration_Setup.Toys);
      	 Thread.sleep(2000);
      	 
      	 WebElement Price_Filter = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/header/div[3]/div[1]/div[2]/div/div/div[2]/div[1]/div[4]/div/div/div[1]/button/div/div/span"));
      	 Price_Filter.click();
      	 Thread.sleep(3000);   
      	 
      	 WebElement  Special_Price= driver.findElement(By.id("checkbox"));
      	 JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].scrollIntoView(true);",Special_Price );
         Thread.sleep(5000);
         
         WebElement QR_Aplication = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/button"));
      	 QR_Aplication.click();
      	 Thread.sleep(2000);
      	 Thread.sleep(2000);
      	 Special_Price.click();
      	 Thread.sleep(5000);
      	 
      	 WebElement slider = driver.findElement(By.cssSelector("input.ds-range-max-slider-thumb"));
         JavascriptExecutor js1 = (JavascriptExecutor) driver;
         js1.executeScript("arguments[0].value = 60;", slider);
         js1.executeScript("arguments[0].dispatchEvent(new Event('change'));", slider);
      	 Thread.sleep(4000);
      	 
      	 WebElement Item_1 = driver.findElement(By.xpath("//h2[text()='Set de accesorii Minnie Mouse']"));
         Item_1.click();
      
      	 
    	 } 
    	
    	 
   public static void Search_In_German_2 () throws InterruptedException {
    		 
         WebElement Languages = waitForElementToBeClickable(By.xpath("//span[text()='ro']"), 20);
         Languages.click();
    	 Thread.sleep(5000);
    	 
         WebElement Change_Language1 = waitForElementToBeClickable(By.xpath(" //span[text()='România (Romania)']/ancestor::div[@class='sc-cTkxnA fOJgiT']"), 20);
         Change_Language1.click();
         Thread.sleep(5000);
         
         WebElement Deutsch_Button =waitForElementToBeClickable(By.xpath("//span[text()='Deutschland (Germany)']/ancestor::div[@class='sc-cTkxnA kdFZSs']"), 20);
         Deutsch_Button.click();
         Thread.sleep(2000);
         
         WebElement Go_To_Shopping = waitForElementToBeClickable(By.xpath("//button[text()='Shop ansehen']"), 20);  
         Go_To_Shopping.click();
         Thread.sleep(2000);
         
         WebElement Newsletter2 = driver.findElement(By.xpath("//span[@class='ds-icon outline-close ds-icon-size__l']"));
         Newsletter2.click();
    	 Thread.sleep(2000);
    	 
    	 WebElement Search_Button = waitForElementToBeClickable(By.id("algoliaButton"), 20);
    	 Search_Button.click();
    	 Thread.sleep(2000);
    	 
    	 WebElement Trousers = waitForElementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/header/div[3]/div[1]/div[2]/div/div/div[1]/div/div/div/div[2]/input"), 20);
    	 Trousers.sendKeys(Testing_Configuration_Setup.Trousers);
    	 Thread.sleep(2000);
    	 
    	 WebElement Category = driver.findElement(By.xpath("(//span[@class='ds-icon outline-plus ds-icon-size__m'])"));
    	 Category.click();
    	 Thread.sleep(2000)
    	 ;
    	 WebElement Man_Box = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/header/div[3]/div[1]/div[2]/div/div/div[2]/div[1]/div[1]/div/div/div[2]/div/div/div/ul/li[2]/label/div[1]"));
    	 Man_Box.click();
    	 Thread.sleep(2000);
    	 
    	 WebElement Size = driver.findElement(By.xpath("(//span[@class='ds-icon outline-plus ds-icon-size__m'])[1]"));
    	 Size.click();
    	 Thread.sleep(2000);
    	 
    	 WebElement More_Sizes = driver.findElement(By.xpath("//button[.//span[text()='Mehr']]"));
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].scrollIntoView(true);",More_Sizes );
         Thread.sleep(3000);
         More_Sizes.click();
         Thread.sleep(3000);
         
         WebElement Choose_Size = driver.findElement(By.xpath("//span[text()='134']"));
         Choose_Size.click();
         Thread.sleep(3000);
         
         WebElement Item_2 = driver.findElement(By.xpath("//h2[text()='Shorts']"));
         Item_2.click();
         Thread.sleep(3000);
       
    	 } 
    	 
    	 
   public static void Search_In_Greek_3 () throws InterruptedException {
     
         WebElement Languages = waitForElementToBeClickable(By.xpath("//span[text()='de']"), 20);
         Languages.click();
         Thread.sleep(3000);
         
         WebElement Change_Language = waitForElementToBeClickable(By.xpath("//span[text()='Deutschland (Germany)']/ancestor::div[@class='sc-cTkxnA fOJgiT']"), 20);
         Change_Language.click();
         Thread.sleep(3000);
         
         WebElement Greek_Button =waitForElementToBeClickable(By.xpath("//span[text()='Ελλάδα (Greece)']/ancestor::div[@class='sc-cTkxnA kdFZSs']"), 20);
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].scrollIntoView(true);",Greek_Button ); 
         Thread.sleep(3000);
         Greek_Button.click();
         Thread.sleep(3000);
         
         WebElement Go_To_Shopping =driver.findElement(By.xpath("//button[text()='Πηγαίνετε στο κατάστημα']")); 
         Go_To_Shopping.click();
         Thread.sleep(5000);
         
         WebElement Search_Button = driver.findElement(By.id("algoliaButton"));
    	 Search_Button.click();
    	 Thread.sleep(3000);
    	 
    	 WebElement Dresses = waitForElementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/header/div[3]/div[1]/div[2]/div/div/div[1]/div/div/div/div[2]/input"), 20);
    	 Dresses.sendKeys(Testing_Configuration_Setup.Dresses);
    	 Thread.sleep(3000);
    	 
    	 WebElement Delete_Filters = driver.findElement(By.xpath("//span[contains(@class, 'ds-text') and contains(@class, 'ds-input-field-prefix-suffix') and text()='Εκκαθάριση']"));
    	 Delete_Filters.click();
    	 Thread.sleep(2000);
    	 
    	 WebElement T_shirts = waitForElementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/header/div[3]/div[1]/div[2]/div/div/div[1]/div/div/div/div[2]/input"), 20);
    	 T_shirts.sendKeys(Testing_Configuration_Setup.T_shirts);
    	 Thread.sleep(2000);
    	 
    	 WebElement Category = driver.findElement(By.xpath("(//span[@class='ds-icon outline-plus ds-icon-size__m'])"));
    	 Category.click();
    	 Thread.sleep(2000);
    	 
    	 WebElement Women_Box = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/header/div[3]/div[1]/div[2]/div/div/div[2]/div[1]/div[1]/div/div/div[2]/div/div/div/ul/li[3]/label/div[1]"));
    	 Women_Box.click();
    	 Thread.sleep(2000);
    	 
    	 WebElement Colour = driver.findElement(By.xpath("(//span[@class='ds-icon outline-plus ds-icon-size__m'])[2]"));
    	 Colour.click();
    	 Thread.sleep(2000);
    	 
    	 WebElement Choose_Color= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/header/div[3]/div[1]/div[2]/div/div/div[2]/div[1]/div[3]/div/div/div[2]/div/div/div/ul/li[4]/div/div"));
    	 JavascriptExecutor js1 = (JavascriptExecutor) driver;
         js1.executeScript("arguments[0].scrollIntoView(true);",Choose_Color); 
         Thread.sleep(4000);
         Choose_Color.click();
         Thread.sleep(4000);
         
    	 WebElement Item_3 = driver.findElement(By.xpath("//h2[text()='Μπλουζάκι με όρθιο γιακά']"));
    	 Item_3.click();
   
        }  
   
         
         
   public static void Search_In_Italy_4 () throws InterruptedException {
        	 
         WebElement Languages = waitForElementToBeClickable(By.xpath("//span[text()='gr']"), 20);
         Languages.click();
         Thread.sleep(3000);
         
         WebElement Change_Language = waitForElementToBeClickable(By.xpath("//span[text()='Ελλάδα (Greece)']/ancestor::div[@class='sc-cTkxnA fOJgiT']"), 20);
         Change_Language.click();
         Thread.sleep(3000);
         
         WebElement Italy_Button =waitForElementToBeClickable(By.xpath("//span[text()='Italia (Italy)']/ancestor::div[@class='sc-cTkxnA kdFZSs']"), 20);
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].scrollIntoView(true);",Italy_Button ); 
         Thread.sleep(3000);
         Italy_Button.click();
         Thread.sleep(3000);
         
         WebElement Go_To_Shopping = waitForElementToBeClickable(By.xpath("//button[text()='Vai al negozio']"), 20);  
         Go_To_Shopping.click();
         Thread.sleep(3000);
         
         WebElement Search_Button = driver.findElement(By.id("algoliaButton"));
    	 Search_Button.click();
    	 Thread.sleep(3000);
    	 
    	 WebElement Hats = waitForElementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/header/div[3]/div[1]/div[2]/div/div/div[1]/div/div/div/div[2]/input"), 20);
    	 Hats.sendKeys(Testing_Configuration_Setup.Hats);
    	 Thread.sleep(3000);
    	 
    	 WebElement Category = driver.findElement(By.xpath("(//span[@class='ds-icon outline-plus ds-icon-size__m'])"));
    	 Category.click();
    	 Thread.sleep(3000);
    	 
    	 WebElement Man_Box = waitForElementToBeClickable(By.xpath(" /html/body/div[1]/div[1]/div/div[2]/div/header/div[3]/div[1]/div[2]/div/div/div[2]/div[1]/div[1]/div/div/div[2]/div/div/div/ul/li[2]/label/div[1]"), 20);  
    	 Man_Box.click();
    	 Thread.sleep(3000);
    	 
    	 WebElement Colour = driver.findElement(By.xpath("(//span[@class='ds-icon outline-plus ds-icon-size__m'])[2]"));
    	 Colour.click();
    	 Thread.sleep(3000);
    	 
    	 WebElement Choose_Color = waitForElementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/header/div[3]/div[1]/div[2]/div/div/div[2]/div[1]/div[3]/div/div/div[2]/div/div/div/ul/li[9]/div/div"), 20);
    	 JavascriptExecutor js7 = (JavascriptExecutor) driver;
         js7.executeScript("arguments[0].scrollIntoView(true);",Choose_Color ); 
         Thread.sleep(3000);
    	 Choose_Color.click();
    	 Thread.sleep(3000);
    	 
    	 WebElement Item_4 = driver.findElement(By.xpath("//h2[text()='Completo lavorato a maglia Mickey Mouse']"));
    	 Item_4.click();
    	 Thread.sleep(3000);
    	
         
         }   
         
         
         
         
   public static void Shopping_Children_s_School_Supplies_1 () throws InterruptedException {
        	 
         WebElement ButtonCookie = waitForElementToBeClickable(By.id("cookiebotDialogOkButton"), 20);
     	 ButtonCookie.click();
     	 Thread.sleep(2000);
     	 
     	 WebElement Account_Button = waitForElementToBeClickable(By.linkText("Cont"), 20);
		 Account_Button.click();	
		 Thread.sleep(2000);
		 
		 WebElement Login_Email = waitForElementToBeClickable(By.id("login[username]_id"), 20);  
		 Login_Email.sendKeys(Testing_Configuration_Setup.EMAIL);
		 Thread.sleep(2000);
		 
		 WebElement Login_Password = waitForElementToBeClickable(By.id("login[password]_id"), 20);  
		 Login_Password.sendKeys(Testing_Configuration_Setup.PASSWORD);	
		 Thread.sleep(2000);
		 
		 WebElement Show_Password = waitForElementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div/form/div[2]/div/div/button"), 20);  
		 Show_Password.click();
		 Thread.sleep(2000);
		 
		 WebElement Remember_Me_ID = waitForElementToBeClickable(By.id("login[remember_me]_id"), 20);
		 Remember_Me_ID.click();
		 Thread.sleep(2000);
		 
		 WebElement Login_Account_2 = waitForElementToBeClickable(By.xpath("//button[text()='Intră în cont']"), 20);  
		 Login_Account_2.click();
		 Thread.sleep(6000);
		 
	     WebElement Newsletter_email = driver.findElement(By.id("np-mail"));
	     Newsletter_email.sendKeys(Testing_Configuration_Setup.EMAIL) ;
	     Thread.sleep(3000);
	     
	     WebElement Newsletter_Close = driver.findElement(By.xpath("//button[contains(@class, 'ds-button') and contains(@class, 'ds-button__light') and contains(@class, 'ds-button__icon')]"));
	     Newsletter_Close.click();     
		 Thread.sleep(3000);
		 
	     driver.get("https://www.sinsay.com/ro/ro/noul-an-scolar")  ;
		 Thread.sleep(2000);
		 
		 driver.get("https://www.sinsay.com/ro/ro/noul-an-scolar/ghiozdane-si-penare/tinute-elegante")  ;
		 Thread.sleep(2000);
		 
		 driver.get(" https://www.sinsay.com/ro/ro/noul-an-scolar/ghiozdane-si-penare/tinute-sport")  ;
		 Thread.sleep(2000);
		 
    	 driver.get("https://www.sinsay.com/ro/ro/calendar-2025-999ca-99x")  ;
    	 Thread.sleep(5000);
    	 
         WebElement Buy_Item_1 = waitForElementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div/div[3]/section/section/button"), 20);
         JavascriptExecutor js12 = (JavascriptExecutor) driver;
         js12.executeScript("arguments[0].scrollIntoView(true);",Buy_Item_1 ); 
         WebElement QR = waitForElementToBeClickable(By.xpath("/html/body/div[4]/div/div/div[1]/button"), 20);
    	 QR.click();
         Buy_Item_1.click();	
         Thread.sleep(2000);
         
         WebElement Shopping_Continue = waitForElementToBeClickable(By.xpath("//button[contains(text(), 'Continuă cumpărăturile')]"), 20);
         Shopping_Continue.click();
         Thread.sleep(2000);
         
		 WebElement Item_2 = driver.findElement(By.xpath("//div[contains(text(), 'Carte cu autocolante')]"));
		 Item_2.click();		
	     Thread.sleep(2000);
	     
		 WebElement Add_To_Cart_Item_2 = waitForElementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div/div[3]/section/section/button"), 20);
		 JavascriptExecutor js29 = (JavascriptExecutor) driver;
         js29.executeScript("arguments[0].scrollIntoView(true);",Add_To_Cart_Item_2); 
		 Add_To_Cart_Item_2.click();
		 Thread.sleep(2000);
		 
		 WebElement Go_To_Cart = waitForElementToBeClickable(By.xpath("//a[@data-testid='cart-confirmation-go-to-cart' and text()='Mergi la plată']"), 20);
		 Go_To_Cart.click();
		 Thread.sleep(2000);
		 
		 WebElement Delete_Item_1 = waitForElementToBeClickable(By.xpath("//*[@id=\"cartRoot\"]/div/div[1]/div[2]/div[1]/button"), 20);
         Delete_Item_1.click();
         Thread.sleep(2000);
         
         WebElement Select_Element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div[2]/div/div[5]/div"));
		 JavascriptExecutor jss = (JavascriptExecutor) driver;
	     jss.executeScript("arguments[0].scrollIntoView(true);",Select_Element );
	     Thread.sleep(2000);
		 Select_Element.click();
		 Thread.sleep(2000);
		 
		 WebElement Select_Q = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div[2]/div/div[5]/div/div/ul/li[5]"));
		 Select_Q.click();
	     Thread.sleep(2000);	     
	     
    }
                
   public static void Home_And_Garden_Accessories_2 () throws InterruptedException {
	   
	    driver.get("https://www.sinsay.com/ro/ro/spring-weekend")  ;
	    Thread.sleep(2000);
	    
	    WebElement Home_And_Garden = waitForElementToBeClickable(By.xpath("/html/body/div[1]/div[2]/main/div[1]/div[2]/div/div/ul/li[3]/p/a"), 20);
	    Home_And_Garden.click();
	    Thread.sleep(2000);
	    
	    driver.get(" https://www.sinsay.com/ro/ro/suport-tip-felinar-pentru-lumanare-201al-03x")  ;
	    Thread.sleep(2000);
	    
	    WebElement Add_To_Cart_Item_1 = waitForElementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div/div[3]/section/section/button"), 20);
	    JavascriptExecutor js347 = (JavascriptExecutor) driver;
        js347.executeScript("arguments[0].scrollIntoView(true);",Add_To_Cart_Item_1 ); 
	    Add_To_Cart_Item_1.click();
	    Thread.sleep(2000);
	    
		WebElement Go_To_Cart = waitForElementToBeClickable(By.xpath("//a[@data-testid='cart-confirmation-go-to-cart' and text()='Mergi la plată']"), 20);
		Go_To_Cart.click();
		Thread.sleep(2000);	 
		
	    WebElement Delete_Item_1 = waitForElementToBeClickable(By.xpath(" //*[@id=\"cartRoot\"]/div/div[1]/div[2]/div[1]/button"), 20);
	    JavascriptExecutor jsd = (JavascriptExecutor) driver;
	    jsd.executeScript("arguments[0].scrollIntoView(true);",Delete_Item_1 ); 
        Thread.sleep(2000);
        Delete_Item_1.click();
	    Thread.sleep(2000);
	    
         } 
    
   public static void Shopping_for_the_kitchen_and_living_room_3 () throws InterruptedException {
        	 
        driver.get("https://www.sinsay.com/ro/ro/casa")  ;
      	Thread.sleep(2000);   
      	
        WebElement Kitchen_And_Living_Room = waitForElementToBeClickable(By.xpath("/html/body/div[1]/div[2]/main/div[1]/div[2]/div/div/ul/li[4]/p/a"), 20);
        Kitchen_And_Living_Room.click();
	    Thread.sleep(2000); 
	    
	    WebElement Item_1 = waitForElementToBeClickable(By.xpath("//a[text()='Suport pentru oală 2 pack']"), 20);
	    JavascriptExecutor js47 = (JavascriptExecutor) driver;
        js47.executeScript("arguments[0].scrollIntoView(true);",Item_1 ); 
        Thread.sleep(2000);   
	    Item_1.click();
	    Thread.sleep(2000);  
	    
	    WebElement Add_To_Cart_Item_1 = waitForElementToBeClickable(By.xpath("//button[@data-testid='add-to-cart-button']"), 20);
	    JavascriptExecutor js447 = (JavascriptExecutor) driver;
        js447.executeScript("arguments[0].scrollIntoView(true);",Add_To_Cart_Item_1 ); 
	    Add_To_Cart_Item_1.click();
	    Thread.sleep(2000);
	    
	    WebElement Shopping_Continue = waitForElementToBeClickable(By.xpath("//button[contains(text(), 'Continuă cumpărăturile')]"), 20);
        Shopping_Continue.click();
        Thread.sleep(2000);
        
	    WebElement Item_2 = waitForElementToBeClickable(By.xpath("//div[contains(text(), 'Coș pentru depozitare')]"), 20);
	    Item_2.click();
	    Thread.sleep(2000);
	    
	    WebElement Add_To_Cart_Item_2 = waitForElementToBeClickable(By.xpath("//button[@data-testid='add-to-cart-button']"), 20);
	    JavascriptExecutor js7 = (JavascriptExecutor) driver;
        js7.executeScript("arguments[0].scrollIntoView(true);",Add_To_Cart_Item_2 ); 
	    Thread.sleep(2000);
	    Add_To_Cart_Item_2.click();
	    Thread.sleep(2000);
	    
	    WebElement Go_To_Cart = waitForElementToBeClickable(By.xpath("//a[@data-testid='cart-confirmation-go-to-cart' and text()='Mergi la plată']"), 20);
		Go_To_Cart.click();
	  

         } 
   public static void Validate_All_Links_1() {
       
	     List<WebElement> allLinks = driver.findElements(By.tagName("a"));	     
	     ExecutorService executor = Executors.newFixedThreadPool(10); 
	     for (WebElement link : allLinks) {	          
	     String linkText = link.getText();
	     String href = link.getAttribute("href");          
	     Runnable task = () -> {
	     boolean isValid = false;
	     try {                 
	     if (href != null && !href.isEmpty()) {                   
	     URI uri = new URI(href);
	     URL url = uri.toURL();
	     HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
	     httpURLConnection.setRequestMethod("HEAD");
	     httpURLConnection.setConnectTimeout(5000); 
	     httpURLConnection.setReadTimeout(5000); 
	     httpURLConnection.connect();
	     int responseCode = httpURLConnection.getResponseCode();                  
	     httpURLConnection.disconnect();                  
	     isValid = (responseCode >= 200 && responseCode < 400);
     }
	    } catch (Exception e) {         
     }
	     String ANSI_GREEN = "\u001B[32m";
	     String ANSI_RED = "\u001B[31m";
	     String ANSI_RESET = "\u001B[0m";        
	     if (isValid) {
	     System.out.println(linkText + " - " + href + " - " + ANSI_GREEN + "VALID" + ANSI_RESET);
	   } else {
	     System.out.println(linkText + " - " + href + " - " + ANSI_RED + "INVALID" + ANSI_RESET);
     }     };     
	     executor.submit(task);
	     }
       executor.shutdown();
	     try {
	     if (!executor.awaitTermination(1, TimeUnit.MINUTES)) {
	     executor.shutdownNow(); 
	     }
	   } catch (InterruptedException e) {
	     executor.shutdownNow();
	        }
	 }    
         
     }  
	
	
	
	
	

