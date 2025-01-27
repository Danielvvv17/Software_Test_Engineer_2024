 package Booking_Testing_Suite_1;

   import org.junit.Assert;



	public class Verification_Procedures extends Page_Setup_Configuration {
	    
	
	
	public static void validationCookies() throws InterruptedException {
		Thread.sleep(1700);
		boolean conditionCookies = driver.getPageSource().contains("Manage Cookie Preferences");
		Assert.assertFalse("Could not click on the button: Accept ", conditionCookies);  
	}
	
	public static void validationFligtsPage() throws InterruptedException {
		Thread.sleep(1700);
		boolean conditionChangeToFlightsPage = driver.getPageSource().contains("Flights");
		Assert.assertTrue("Navigation was done successfully to flights page", conditionChangeToFlightsPage);
	}
	
	public static void validationDepartureBox() throws InterruptedException {
		Thread.sleep(1700);
		boolean conditionInputText = driver.getPageSource().contains(Testing_Configuration_Setup.DEPARTURE_LOCATION);
		Assert.assertFalse("Text could not be entered in the box", conditionInputText);
	}
	
	public static void validationDestinationBox() throws InterruptedException {
		Thread.sleep(1700);
		boolean conditionInputText = driver.getPageSource().contains(Testing_Configuration_Setup.DESTINATION_LOCATION);
		Assert.assertFalse("Text could not be entered in the box!", conditionInputText);
	}
	
	public static void validationCalendarDisplayed() throws InterruptedException {
		Thread.sleep(1700);
		boolean conditionCalendarDisplayed= driver.getPageSource().contains("dd,MM,yyyy");
		Assert.assertFalse("The calendar was not displayed on the page!", conditionCalendarDisplayed);
	}
	
	public static void validationDepartureDate() throws InterruptedException {
		Thread.sleep(1700);
		boolean conditionDepartureDate = driver.getPageSource().contains(Testing_Configuration_Setup.DEPARTURE_DATE);
		Assert.assertTrue("The day of departure has  been selected!", conditionDepartureDate);
	}
	
	public static void validationReturnDate() throws InterruptedException {
		Thread.sleep(1700);
		boolean conditionReturnDate = driver.getPageSource().contains(Testing_Configuration_Setup.RETURN_DATE);
		Assert.assertTrue("The day of return has   been selected!", conditionReturnDate);
	}
	
	public static void validationSearchbutton() throws InterruptedException {
		Thread.sleep(1700);
		boolean conditionButtonClikable= driver.getPageSource().contains("Search");
		Assert.assertTrue("The button can be clicked", conditionButtonClikable);
	}
	
	public static void validationPassengerDetails_1() throws InterruptedException {
		Thread.sleep(1700);
		boolean conditionWindowDisplayed = driver.getPageSource().contains("Passenger Details");
		Assert.assertFalse("Pop-up window opens", conditionWindowDisplayed);
	}
	
	public static void validationPassengerDetails_2() throws InterruptedException {
		Thread.sleep(1700);
		boolean conditionVerifyFirstName = driver.getPageSource().contains("Alexandru");
		Assert.assertTrue("The box contains the first name", conditionVerifyFirstName);
	}
	
	public static void validationPassengerDetails_3() throws InterruptedException {
		Thread.sleep(1700);
		boolean conditionVerifyFamilyName = driver.getPageSource().contains("Gavril");
		Assert.assertTrue("The box contains the family name", conditionVerifyFamilyName);
	}  
	
	public static void validationPassengerDetails_4() throws InterruptedException {
		Thread.sleep(1700);
		boolean conditionGender = driver.getPageSource().contains("Bărbat");
		Assert.assertTrue("Gender Male has been selected", conditionGender);
	}	
	
	public static void validationPassengerDetails_5() throws InterruptedException {
		Thread.sleep(1700);
		boolean conditionCloseWindow = driver.getPageSource().contains("Gata");
		Assert.assertTrue("Pop-up window closed", conditionCloseWindow);
	}
	
	public static void validationFlightTicket_1() throws InterruptedException {
	    Thread.sleep(1700);
		boolean conditionFlightTicket = driver.getPageSource().contains("Business Ticket");
		Assert.assertFalse("Elementul nu se afla pe pagina!", conditionFlightTicket);
	}
	
	public static void validationFlightTicket_2() throws InterruptedException {
		Thread.sleep(1700);
		boolean conditionFlightTicket = driver.getPageSource().contains("Flexible Ticket");
		Assert.assertFalse("Elementul a fost selectat cu succes!", conditionFlightTicket);
	}
	
    public static void validationNextPage_2() throws InterruptedException {
		Thread.sleep(1700);
		boolean conditionMoveTo = driver.getPageSource().contains("Next Button");
		Assert.assertFalse("Selectarea urmatoarei pagini a fost facuta cu succes!", conditionMoveTo);
    }
    
    public static void validationDestinationBox_2() throws InterruptedException {
		Thread.sleep(1700);
		boolean conditionInputText = driver.getPageSource().contains(Testing_Configuration_Setup.DESTINATION_LOCATION_2);
		Assert.assertFalse("Text could not be entered in the box", conditionInputText);
	}
    
	public static void validationFlightOptions() throws InterruptedException {
		Thread.sleep(1700);
		boolean conditionTheFastestOption = driver.getPageSource().contains("The fastest option");
		Assert.assertFalse("The element was visible", conditionTheFastestOption);
	}  
	
	public static void validationFlightDetails() throws InterruptedException {
		Thread.sleep(1700);
		boolean conditionFlightDetails = driver.getPageSource().contains("View details");
		Assert.assertFalse("The element was visible", conditionFlightDetails);
	}	
	
	public static void validationSelectButton() throws InterruptedException {
		Thread.sleep(1700);
		boolean conditionSelectButton = driver.getPageSource().contains("Select");
		Assert.assertTrue("The button was not displayed on the pop-up window!", conditionSelectButton);
	}
	
	public static void validationPassengerContact_1() throws InterruptedException {
	    Thread.sleep(1700);
		boolean conditionContactEmail = driver.getPageSource().contains("alexandrugavril27@gmail.com");
		Assert.assertTrue("The email has been validated",  conditionContactEmail);
	}
	
	public static void validationPassengerContact_2() throws InterruptedException {
		Thread.sleep(1700);
		boolean conditionPhoneNumber = driver.getPageSource().contains("0755979658");
		Assert.assertFalse("The phone number has been entered in the text box", conditionPhoneNumber);
	}
	
    public static void validationPassengerContact_3() throws InterruptedException {
		Thread.sleep(1700);
		boolean conditionNextButton = driver.getPageSource().contains("Next Button");
		Assert.assertFalse("Selectarea urmatoarei pagini a fost facuta cu succes!", conditionNextButton);
    }
   
    public static void validationNumberOfAdults() throws InterruptedException {
        Thread.sleep(1700);
        boolean conditionNumberofadults = driver.getPageSource().contains("Adults");
        Assert.assertFalse("Number of adults element is not displayed", conditionNumberofadults);
    }

    public static void validationButtonAdults() throws InterruptedException {
        Thread.sleep(1700);
        boolean conditionButtonAdults = driver.getPageSource().contains("Button");
        Assert.assertTrue("Number of adults decrease button clicked", conditionButtonAdults);
    }

    public static void validationNumberOfChildren() throws InterruptedException {
        Thread.sleep(1700);
        boolean conditionNumberofchildren = driver.getPageSource().contains("Children");
        Assert.assertTrue("Number of children button clicked 3 times", conditionNumberofchildren);
    }

    public static void validationFirstChild() throws InterruptedException {
        Thread.sleep(1700);
        boolean conditionAgefirstchild = driver.getPageSource().contains("Vârstă 1 copil");
        Assert.assertFalse("First child is present on the page ", conditionAgefirstchild);
      
    }

    public static void validationSecondChild() throws InterruptedException {
        Thread.sleep(1700);
        boolean conditionAgesecondchild = driver.getPageSource().contains("Vârstă 2 copil");
        Assert.assertFalse("Second child is present on the page ", conditionAgesecondchild);
        
    }

    public static void validationThirdChild() throws InterruptedException {
        Thread.sleep(1700);
        boolean conditionAgethirdchild = driver.getPageSource().contains("Vârstă 3 copil");
        Assert.assertFalse("Third child is present on the page ", conditionAgethirdchild);
        
       }
	}


        
    
        

     

        

     
       
       
    