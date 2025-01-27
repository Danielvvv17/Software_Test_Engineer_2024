  package Booking_Testing_Suite_1;

    import java.time.Duration;
    import java.util.List;
    import java.util.concurrent.ExecutorService;
    import java.util.concurrent.Executors;
    import java.util.concurrent.TimeUnit;
    import org.junit.After;
    import org.junit.Before;
    import org.openqa.selenium.By;
    import org.openqa.selenium.JavascriptExecutor;
    import org.openqa.selenium.NoSuchElementException;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.support.ui.ExpectedConditions;
    import org.openqa.selenium.support.ui.Select;
    import org.openqa.selenium.support.ui.WebDriverWait;
    import java.net.URL;
    import java.net.HttpURLConnection;
    import java.net.URI;

  public  class Page_Setup_Configuration {
	
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
    
    public static void AcceptCookiesAndIgnoreAuthentification() throws InterruptedException {
    	
    	try {
   		WebElement ignoreauthentifcation = driver.findElement(By.xpath("/html/body/div[19]/div/div/div/div[1]/div[1]/div/button")); 
   	    ignoreauthentifcation.click(); 
   	  } catch (NoSuchElementException e) {
   	    System.out.println("Element not found. Trying an alternative approach.");
   	    Thread.sleep(3000); 
   	    try {
   	    WebElement acceptButton1 = waitForElementToBeClickable(By.id("onetrust-accept-btn-handler"), 10);
   	    acceptButton1.click();	
   	  } catch (NoSuchElementException ex) {
   	    System.out.println("Alternative element also not found. Continuing without clicking the ticket.");
  }      
    }         
  }
    
	public static void FlightsPage() {
		
		WebElement flightsButton = driver.findElement (By.xpath("//*[@id=\"flights\"]"));  
		flightsButton.click(); 
    }
	
	public static void DepartureAndDestinationLocation()  throws InterruptedException {
		
    	 WebElement caseflights1=driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/button[1]"));
    	 caseflights1.click();
    	 WebElement textinput =waitForElementToBeClickable(By.xpath("/html/body/div[13]/div/div/div/div[1]/div/div/div/div/input"), 10);
    	 textinput.click(); 
    	 WebElement boxflights1=waitForElementToBeClickable(By.xpath("/html/body/div[13]/div/div/div/div[1]/div/div/div/div/input"), 10);
	     boxflights1.sendKeys(Testing_Configuration_Setup.DEPARTURE_LOCATION);
	     WebElement selectboxflights1=waitForElementToBeClickable(By.xpath("/html/body/div[13]/div/div/div/ul/li/span[3]/div/label/span[2]"), 10);
	     selectboxflights1.click();
	     WebElement caseflights2=waitForElementToBeClickable(By.xpath("/html/body/div[1]/div[2]/main/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/button[3]"), 10);
	     caseflights2.click();
	     WebElement boxflights2=waitForElementToBeClickable(By.xpath("/html/body/div[8]/div/div/div/div[1]/div/div/div/div/input"), 10);
	     boxflights2.sendKeys(Testing_Configuration_Setup.DESTINATION_LOCATION);
	     WebElement selectboxflights2=waitForElementToBeClickable(By.xpath("//*[@id=\"flights-searchbox_suggestions\"]/li[2]/span[3]/span"), 10);
	     selectboxflights2.click();
	}
	
	public static void  JourneyDate () throws InterruptedException {	
		
    	 WebElement Timetable=waitForElementToBeClickable(By.xpath("//*[@id=\"basiclayout\"]/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[2]/button/div[1]/span[2]/span/span"), 10);
    	 Timetable.click();
    	 try {
         Thread.sleep(2000);
	     WebElement selectdatedeparture = driver.findElement(By.xpath("/html/body/div[8]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[6]/span")); 
	     selectdatedeparture.click();  
	   } catch (NoSuchElementException e) {
	   	 System.out.println("Element not found. Trying an alternative approach.");  
	   	 try {
	   	 Thread.sleep(2000);
	   	 WebElement DateToFlight=waitForElementToBeClickable(By.xpath("//*[@id=\":R2eqgld5:\"]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[6]/span"), 10);
	     DateToFlight.click();	
	   } catch (NoSuchElementException ex) {
	   	 System.out.println("Alternative element also not found. Continuing without clicking the ticket.");  
   } 
	  }	
		 try { 
	     WebElement DateBackFlight=driver.findElement(By.xpath("//*[@id=\":R2eqgld5:\"]/div/div/div/div/div/div[2]/table/tbody/tr[3]/td[6]/span"));
	     DateBackFlight.click();
	  }  catch (NoSuchElementException ex1) {
	     System.out.println("Alternative element also not found. Continuing without clicking the ticket.");
	     try {
	   	 WebElement selectdatedestination=waitForElementToBeClickable(By.xpath("/html/body/div[8]/div/div/div/div/div/div[2]/table/tbody/tr[3]/td[6]/span"),10);
	   	 selectdatedestination.click();	
	  }  catch (NoSuchElementException ex) {
	     System.out.println("Alternative element also not found. Continuing without clicking the ticket.");  
  }
	}    		 
  }
	public static void TravelPersons()  throws InterruptedException {
		
		 try {
	     WebElement BoxPerson=driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/div/div[1]/div/div/div/div/div[2]/div[1]/div/button/span[2]"));
	   	 BoxPerson.click(); 
	   } catch (NoSuchElementException e) {
		 System.out.println("Element not found. Trying an alternative approach.");  
    	 try {
		 WebElement BoxPerson1=waitForElementToBeClickable(By.xpath("/html/body/div[1]/div[2]/main/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div/button"), 10);
		 BoxPerson1.click();	
	   } catch (NoSuchElementException ex) {
    	 System.out.println("Alternative element also not found. Continuing without clicking the ticket.");  
   }  }
		 WebElement Number_of_adults =waitForElementToBeClickable(By.xpath("/html/body/div[8]/div/div/div[1]/div/div[1]/div/div[2]/button[2]"), 10);
   	     for (int i = 0; i < 5; i++) {
   	     Number_of_adults.click();
   	     try {
   	     Thread.sleep(500); 
   	   } catch (InterruptedException e) {
   	     e.printStackTrace();
       }
  	}
   	     Thread.sleep(2000);
   	     WebElement  Number_of_adults_2=waitForElementToBeClickable(By.xpath("/html/body/div[8]/div/div/div[1]/div/div[1]/div/div[2]/button[1]"), 10);
   	     Number_of_adults_2.click();
   	     Thread.sleep(2000);
   	     Number_of_adults_2.click();
	     WebElement Number_of_children=waitForElementToBeClickable(By.xpath("/html/body/div[8]/div/div/div[1]/div/div[2]/div/div[2]/button[2]"), 10);
	     for (int i = 0; i < 3; i++) {
	     Number_of_children.click();
	   	 try {
	   	 Thread.sleep(500); 
	   } catch (InterruptedException e) {
	   	 e.printStackTrace();
  	 }
	     }   	 
	  	 
	     WebElement FirstChildren = waitForElementToBeClickable(By.xpath("/html/body/div[8]/div/div/div[1]/div/div[3]/div[1]/div[1]/select"), 10);
	     FirstChildren.click();
         Select select_1 = new Select(waitForElementToBeClickable(By.xpath("/html/body/div[8]/div/div/div[1]/div/div[3]/div[1]/div[1]/select"), 10));
         select_1.selectByVisibleText("3");
         Thread.sleep(1000);
         WebElement FirstChildren2 = waitForElementToBeClickable(By.xpath("/html/body/div[8]/div/div/div[1]/div/div[3]/div[1]/div[1]/select"), 10);
	     FirstChildren2.click();
         Thread.sleep(1000);
         WebElement SecondChildren = waitForElementToBeClickable(By.xpath("/html/body/div[8]/div/div/div[1]/div/div[3]/div[2]/div[1]/select"), 10);
         SecondChildren.click();
         Select select_2 = new Select(waitForElementToBeClickable(By.xpath("/html/body/div[8]/div/div/div[1]/div/div[3]/div[2]/div[1]/select"), 10));
         select_2.selectByVisibleText("8");
         Thread.sleep(1000);
         WebElement SecondChildren2 = waitForElementToBeClickable(By.xpath("/html/body/div[8]/div/div/div[1]/div/div[3]/div[2]/div[1]/select"), 10);
         SecondChildren2.click();
         Thread.sleep(1000);
         WebElement ThirdChildren = waitForElementToBeClickable(By.xpath("/html/body/div[8]/div/div/div[1]/div/div[3]/div[3]/div[1]/select"), 10);
         ThirdChildren.click();
         Select select_3 = new Select(waitForElementToBeClickable(By.xpath("/html/body/div[8]/div/div/div[1]/div/div[3]/div[3]/div[1]/select"), 10));
         select_3.selectByVisibleText("12");
         Thread.sleep(1000);
         WebElement ThirdChildren2 = waitForElementToBeClickable(By.xpath("/html/body/div[8]/div/div/div[1]/div/div[3]/div[3]/div[1]/select"), 10);
         ThirdChildren2.click();
         Thread.sleep(1000);
	     WebElement ButtonPopUp=waitForElementToBeClickable(By.xpath("/html/body/div[8]/div/div/div[2]/div/div/div/div[2]/button"), 10);
	     ButtonPopUp.click();
	     WebElement SearchButton=driver.findElement(By.xpath("//*[@id=\"basiclayout\"]/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div/button")); 
    	 SearchButton.click();
    	 Thread.sleep(4000);
   }
   

	
    
    public static void ScroollPage () {
		
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
    	 Long pageHeight = (Long) js.executeScript("return document.body.scrollHeight");
    	 int scrollStep = 200; 
    	 int scrollPosition = 0;
    	 try {
   	     while (scrollPosition < pageHeight) {
    	 js.executeScript("window.scrollBy(0, arguments[0]);", scrollStep);
         scrollPosition += scrollStep;
    	 Thread.sleep(200); }
       } catch (InterruptedException e) {
    	 e.printStackTrace();
    	}
    	 
//    	 scrool pana sus
    	 js.executeScript("return document.body.scrollHeight");
	     try {
	     while (scrollPosition > 0) { 
	     js.executeScript("window.scrollBy(0, -arguments[0]);", scrollStep);  
	     scrollPosition -= scrollStep;
	     Thread.sleep(200);}
	   } catch (InterruptedException e) {
	     e.printStackTrace();
	   }	 
    	 
    }
    
    
    public static void  JourneyDate_2 () throws InterruptedException {	
		
   	     WebElement Timetable=waitForElementToBeClickable(By.xpath("//*[@id=\"basiclayout\"]/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[2]/button/div[1]/span[2]/span/span"), 10);
   	     Timetable.click();
   	     try {
         Thread.sleep(2000);
	     WebElement selectdatedeparture = driver.findElement(By.xpath("/html/body/div[8]/div/div/div/div/div/div[2]/table/tbody/tr[3]/td[2]/span")); 
	     selectdatedeparture.click();  
	   } catch (NoSuchElementException e) {
	   	 System.out.println("Element not found. Trying an alternative approach.");  
	   	 try {
	   	 Thread.sleep(2000);
	   	 WebElement DateToFlight=waitForElementToBeClickable(By.xpath("//*[@id=\":R2eqgld5:\"]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[6]/span"), 10);
	     DateToFlight.click();	
	   } catch (NoSuchElementException ex) {
	   	 System.out.println("Alternative element also not found. Continuing without clicking the ticket.");  
  } 
	  }	
		 try { 
	     WebElement DateBackFlight=driver.findElement(By.xpath("//*[@id=\":R2eqgld5:\"]/div/div/div/div/div/div[2]/table/tbody/tr[3]/td[6]/span"));
	     DateBackFlight.click();
	  }  catch (NoSuchElementException ex1) {
	     System.out.println("Alternative element also not found. Continuing without clicking the ticket.");
	     try {
	   	 WebElement selectdatedestination=waitForElementToBeClickable(By.xpath("/html/body/div[8]/div/div/div/div/div/div[2]/table/tbody/tr[4]/td[5]/span"),10);
	   	 selectdatedestination.click();	
	  }  catch (NoSuchElementException ex) {
	     System.out.println("Alternative element also not found. Continuing without clicking the ticket.");  
 }
	}    
		 WebElement SearchButton=driver.findElement(By.xpath("//*[@id=\"basiclayout\"]/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div/button")); 
    	 SearchButton.click();
    	 Thread.sleep(4000);
 }
  
	public static void DepartureAndDestinationLocation_2() {
		
		 WebElement caseflights1=driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/button[1]"));
   	     caseflights1.click();
   	     WebElement textinput =driver.findElement(By.xpath("/html/body/div[8]/div/div/div/div[1]/div/div/div/div/span/span[1]"));
 	     textinput.click();
   	     WebElement boxflights1=waitForElementToBeClickable(By.xpath("/html/body/div[8]/div/div/div/div[1]/div/div/div/div/input"), 10);
	     boxflights1.sendKeys(Testing_Configuration_Setup.DEPARTURE_LOCATION_2);
	     WebElement selectboxflights1=waitForElementToBeClickable(By.xpath("//*[@id=\"flights-searchbox_suggestions\"]/li/span[3]/div/label/span[2]"), 10);
	     selectboxflights1.click();
	     WebElement caseflights2=waitForElementToBeClickable(By.xpath("/html/body/div[1]/div[2]/main/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/button[3]"), 10);
	     caseflights2.click();
	     WebElement boxflights2=waitForElementToBeClickable(By.xpath("/html/body/div[8]/div/div/div/div[1]/div/div/div/div/input"), 10);
	     boxflights2.sendKeys(Testing_Configuration_Setup.DESTINATION_LOCATION_2);
	     WebElement selectboxflights2=waitForElementToBeClickable(By.xpath("//*[@id=\"flights-searchbox_suggestions\"]/li[2]/span[3]/span"), 10);
	     selectboxflights2.click();
   }
	
	public static void JavaScriptScroll() {
		
   	     JavascriptExecutor a1 = (JavascriptExecutor) driver;
         a1.executeScript("window.scrollBy(0,300)");
   }
	
	public static void  JavaScriptScroll_A () {	
		
	     JavascriptExecutor b1 = (JavascriptExecutor) driver;
         b1.executeScript("window.scrollBy(0,400)");
   }
	
	public static void ChooseOptionsToFlight() {
		
		 WebElement choose_the_fastest_Option=waitForElementToBeClickable(By.xpath("/html/body/div[1]/div[2]/main/div/div/div[2]/div/div/div/div/div[2]/nav/div[1]/div/ul/li[3]/button"), 20); 
		 choose_the_fastest_Option.click(); 
		 WebElement view_details = waitForElementToBeClickable(By.xpath("/html/body/div[1]/div[2]/main/div/div/div[2]/div/div/div/div/div[2]/nav/div[4]/div[1]/ul/li[1]/div/div[1]/div/div/div/div/div[2]/div[2]/button"), 10);
		 view_details.click();
		 WebElement button_select =waitForElementToBeClickable(By.xpath("//span[contains(text(), 'Selectaţi')]"), 10);
		 button_select.click();
   }
	
	public static void ChooseTicketFlight() {
		
	     try {
         WebElement Business_Green_ticket = waitForElementToBeClickable(By.xpath("/html/body/div[1]/div[2]/main/div/div/div[2]/div/div[2]/div[2]/div[1]/div/fieldset/div/div[2]/label/div[1]/div/div[1]/label/span[2]"), 10);
         Business_Green_ticket.click();
       } catch (NoSuchElementException e) {
         System.out.println("Element not found. Trying an alternative approach.");
         try {
         WebElement FlexibleTicket = driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/div/div[2]/div/div[2]/div[2]/div[1]/div/fieldset/div/div[2]/label/div[1]/div/div[1]/label/span[2]"));
         FlexibleTicket.click();
       } catch (NoSuchElementException ex) {
         System.out.println("Alternative element also not found. Continuing without clicking the ticket.");
  }   
    }
  }
	public static void JavaExecutorScroll() {
		
		 JavascriptExecutor p1 = (JavascriptExecutor) driver;
         for (int i = 0; i < 10; i++) {
         p1.executeScript("window.scrollBy(0,300)"); 
         try {
         Thread.sleep(500); 
       } catch (InterruptedException e) {
         e.printStackTrace();
  }  
	}
  }
    public static void NextPage() {
    	
	     WebElement nextButton = waitForElementToBeClickable(By.xpath("/html/body/div[1]/div[2]/main/div/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div/div/div[2]/button"), 10); 
         nextButton.click();
	}
    
	public static void PassengerDetails() {
		
	     WebElement  passanger_Details = waitForElementToBeClickable(By.xpath("//*[@id=\"basiclayout\"]/div/div/div[2]/div/div[2]/div[1]/div[1]/div/form/div/div/div[2]/div/div/button/div/div/div[2]/div/div[1]"), 10); 
         passanger_Details.click();
         WebElement first_name = waitForElementToBeClickable(By.name("passengers.0.firstName"), 10);
         first_name.sendKeys(Testing_Configuration_Setup.FIRSTNAME);
         WebElement family_name = waitForElementToBeClickable(By.name("passengers.0.lastName"), 10);
         family_name.sendKeys(Testing_Configuration_Setup.LASTNAME);
         WebElement selectElement = waitForElementToBeClickable(By.name("passengers.0.gender"), 10);
         selectElement.click();
         Select select = new Select(waitForElementToBeClickable(By.name("passengers.0.gender"), 10));
         select.selectByVisibleText("Bărbat");
         WebElement close_Button = waitForElementToBeClickable(By.xpath("//span[contains(text(), 'Gata')]"), 10); 
         close_Button.click();
	}
	
	public static void  JavaScriptScroll_B () {	
		
	     JavascriptExecutor e1 = (JavascriptExecutor) driver;
         for (int i = 0; i < 10; i++) {
         e1.executeScript("window.scrollBy(0,100)"); 
         try {
         Thread.sleep(500); 
       } catch (InterruptedException e) {
         e.printStackTrace();
  }  
     }
  }	
	
	public static void  PassengerContact () {	
		
	     WebElement contact_Email = waitForElementToBeClickable(By.name("booker.email"), 10); 
         contact_Email.sendKeys(Testing_Configuration_Setup.LOGIN_MAIL);
         WebElement phone_Number = waitForElementToBeClickable(By.name("number"), 10); 
         phone_Number.sendKeys(Testing_Configuration_Setup.NUMBER_PHONE);
         WebElement next_Button = waitForElementToBeClickable(By.xpath("//span[contains(text(), 'Înainte')]"), 10); 
         next_Button.click();
	  }	
	

   
	public static void ValidateAllLinks() {
	       
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