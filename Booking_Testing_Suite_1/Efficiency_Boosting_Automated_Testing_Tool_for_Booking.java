  package Booking_Testing_Suite_1;

       import org.junit.FixMethodOrder;
       import org.junit.Test;
       import org.junit.runners.MethodSorters;

       @FixMethodOrder(MethodSorters.NAME_ASCENDING)

  public class Efficiency_Boosting_Automated_Testing_Tool_for_Booking extends Page_Setup_Configuration{

	   @Test  
 
    public void A_Test_Search_Functionality() throws InterruptedException {
        	
		Page_Setup_Configuration.AcceptCookiesAndIgnoreAuthentification();
		Verification_Procedures.validationCookies();
		
		
		Page_Setup_Configuration.FlightsPage();
		Verification_Procedures.validationFligtsPage();
		
		
		Page_Setup_Configuration.DepartureAndDestinationLocation();
		Verification_Procedures.validationDepartureBox();
		Verification_Procedures.validationDestinationBox();
		
		Page_Setup_Configuration.JourneyDate();
		Verification_Procedures.validationCalendarDisplayed();
		Verification_Procedures.validationDepartureDate();
		Verification_Procedures.validationReturnDate();

		
		Page_Setup_Configuration.TravelPersons();
		Verification_Procedures.validationNumberOfAdults();
		Verification_Procedures.validationNumberOfChildren();
		Verification_Procedures.validationButtonAdults();
		Verification_Procedures.validationFirstChild();
		Verification_Procedures.validationSecondChild();
		Verification_Procedures.validationThirdChild();
		Verification_Procedures.validationSearchbutton();		
		
		Page_Setup_Configuration.ScroollPage();
			
        }
  
	   
       @Test
          
    public void B_Test_Booking_Process() throws InterruptedException {
        	 
        Page_Setup_Configuration.AcceptCookiesAndIgnoreAuthentification();
        Verification_Procedures.validationCookies();
        
        Page_Setup_Configuration.FlightsPage();
        Verification_Procedures.validationFligtsPage();
        
        Page_Setup_Configuration.DepartureAndDestinationLocation_2();
        Verification_Procedures.validationDepartureBox();
        Verification_Procedures.validationDestinationBox_2();
           
        Page_Setup_Configuration.JavaScriptScroll();
        
        Page_Setup_Configuration.JourneyDate_2();
        Verification_Procedures.validationCalendarDisplayed();
		Verification_Procedures.validationDepartureDate();
		Verification_Procedures.validationReturnDate();
        Verification_Procedures.validationSearchbutton();
        
        Page_Setup_Configuration.JavaScriptScroll_A();
        
        Page_Setup_Configuration.ChooseOptionsToFlight();
        Verification_Procedures.validationFlightOptions();
        Verification_Procedures.validationFlightDetails();
        Verification_Procedures.validationSelectButton();
        
        Page_Setup_Configuration.ChooseTicketFlight();
        Verification_Procedures.validationFlightTicket_1();
        Verification_Procedures.validationFlightTicket_2();
        
        Page_Setup_Configuration.JavaExecutorScroll();
        
        Page_Setup_Configuration.NextPage();
        Verification_Procedures.validationNextPage_2();
        
        Page_Setup_Configuration.PassengerDetails();
        Verification_Procedures.validationPassengerDetails_1();
        Verification_Procedures.validationPassengerDetails_2();
        Verification_Procedures.validationPassengerDetails_3();
        Verification_Procedures.validationPassengerDetails_4();
        Verification_Procedures.validationPassengerDetails_5();
        
        Page_Setup_Configuration.JavaScriptScroll_B();
        
        Page_Setup_Configuration.PassengerContact();
        Verification_Procedures.validationPassengerContact_1();
        Verification_Procedures.validationPassengerContact_2();
        Verification_Procedures.validationPassengerContact_3();

          }      
          
       @Test

    public void C_Test_Comprehensive_Links_Validation() throws InterruptedException {
	   
        Page_Setup_Configuration.AcceptCookiesAndIgnoreAuthentification();
        Verification_Procedures.validationCookies();
        
        Page_Setup_Configuration.ValidateAllLinks();
      
        
      
           }
        }
