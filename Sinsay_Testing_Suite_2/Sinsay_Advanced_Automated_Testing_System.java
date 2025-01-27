    package Sinsay_Testing_Suite_2;

    import org.junit.FixMethodOrder;
    import org.junit.Test;
    import org.junit.runners.MethodSorters;

    @FixMethodOrder(MethodSorters.NAME_ASCENDING)
  
    public class Sinsay_Advanced_Automated_Testing_System extends Page_Setup_Configuration{

	  
	  
	      @Test
 
    public void A_User_Authentification_Lifecycle_Login_To_Logout() throws InterruptedException {
	    	  
	    Page_Setup_Configuration.Accept_Cookies_1();
	    
	    Verification_Procedures.validate_Accept_Cookies_Button();
	    Verification_Procedures.validate_Cookie_Preference_Button();
	    Verification_Procedures.validate_Decline_Cookies_Button();  
	    System.out.println("All validations passed!"); 
	    
	    
	    
	    Page_Setup_Configuration.Sign_In_2();
	    
	    Verification_Procedures.validate_Account_Button_Clicked();
	    Verification_Procedures.validate_Account_Created();
	    Verification_Procedures.validate_Email_Entered();
	    Verification_Procedures.validate_FirstName_Entered();
	    Verification_Procedures.validate_LastName_Entered();
	    Verification_Procedures.validate_Password_Entered();
	    Verification_Procedures.validate_Privacy_Policy_Checked();
	    System.out.println("All validations passed!"); 
	    
	    
	    
	    Page_Setup_Configuration.Login_3();  
	    
	    Verification_Procedures.validate_Login_Button_Present();
	    Verification_Procedures.validate_Email_Field_Present();
	    Verification_Procedures.validate_Password_Field_Present();
	    Verification_Procedures.validate_Newsletter_Button_Present();
	    Verification_Procedures.validate_Create_Account_Button_Not_Present();
	    Verification_Procedures.validate_Invalid_Login_Message_Not_Present();
	    Verification_Procedures.validate_Fictional_Error_Message_Not_Present();
	    System.out.println("All validations passed!"); 
	    
	    
	    
	    Page_Setup_Configuration.Sign_Out_4();
	    
	    Verification_Procedures.validate_Customer_Account_Present();
	    Verification_Procedures.validate_Customer_Account_Clickable();
	    Verification_Procedures.validate_Logout_Present();
	    System.out.println("All validations passed!");  
     }

	      
	      @Test
	      
	public void B_Comprehensive_Configuration_Guide_for_Customer_Account_Setup_and_Management() throws InterruptedException {
	    
	    Page_Setup_Configuration.Customer_Account_1();
	    
	    Verification_Procedures.validate_Account_Button_Present();
	    Verification_Procedures.validate_Login_Email_Present();
	    Verification_Procedures.validate_Login_Password_Present();
	    Verification_Procedures.validate_Customer_Account_Clickable();
	    System.out.println("All validations passed!"); 
	    
	    
	    
	    Page_Setup_Configuration.Personal_Data_2();
	    
	    Verification_Procedures.validate_First_Name_Cleared();
	    Verification_Procedures.validate_Last_Name_Cleared();
	    Verification_Procedures.validate_Phone_Number_Cleared();
	    Verification_Procedures.validate_First_Name_Entered();
	    Verification_Procedures.validate_Last_Name_Entered();
	    Verification_Procedures.validate_Phone_Number_Entered();
	    Verification_Procedures.validate_Gender_Selected();
	    Verification_Procedures.validate_Date_Of_Birth_Selected();
	    System.out.println("All validations passed!");  
	    
	    
	    
	    Page_Setup_Configuration.Delivery_Dates_3();
    
	    Verification_Procedures.validate_Delivery_Address_Clicked();
	    Verification_Procedures.validate_Street_Name_Entered();
	    Verification_Procedures.validate_Region_Entered();
	    Verification_Procedures.validate_Postcode_Entered();
	    Verification_Procedures.validate_City_Entered();
	    Verification_Procedures.validate_Mobile_Entered();
	    System.out.println("All validations passed!");  
	    
	    
	    
	    Page_Setup_Configuration.Invoice_Dates_4();
	    
	    Verification_Procedures.validate_Date_De_Facturare_Link_Present();
	    Verification_Procedures.validate_Invoice_FirstName_Present();
	    Verification_Procedures.validate_Invoice_LastName_Present();
	    Verification_Procedures.validate_Invoice_StreetName_Present();
	    Verification_Procedures.validate_Invoice_PostCode_Present();
	    System.out.println("All validations passed!");    
	 }
	      
	      @Test
	      
    public void C_Performance_Analysis_of_Search_Algorithms_in_Multilingual_Contexts() throws InterruptedException {      
    	
    	Page_Setup_Configuration.Search_In_Romanian_1();
    	
    	 Verification_Procedures.validate_Cookie_Button_Present();
    	 Verification_Procedures.validate_Search_Button_Present();
    	 Verification_Procedures.validate_Toys_For_Children_Input_Present();
    	 Verification_Procedures.validate_Price_Filter_Icon_Present();
    	 Verification_Procedures.validate_Special_Price_Checkbox_Present();
    	 Verification_Procedures.validate_QR_Application_Button_Present();
    	 Verification_Procedures.validate_Slider_Input_Present();
    	 Verification_Procedures.validate_Item_Minnie_Mouse_Present();
    	 Verification_Procedures.validate_Expand_Price_Filter_Button_Present();
    	 Verification_Procedures.validate_Invoice_StreetNumber_Present();
    	 System.out.println("All validations passed!");  
    	 
    	   
    	Page_Setup_Configuration.Search_In_German_2();
    	
    	 Verification_Procedures.validateLanguageChanged();  
    	 Verification_Procedures.validateTrousersDisplayed();  
    	 Verification_Procedures.validateManCategorySelected();  
    	 Verification_Procedures.validateSizeAvailable();  
    	 Verification_Procedures.validateItemVisible();  
    	 System.out.println("All validations passed!");  
    	    
    	Page_Setup_Configuration.Search_In_Greek_3();
    	
    	Verification_Procedures.validate_Greek_Language_Selected(); 
    	Verification_Procedures.validate_Item_List_Displayed(); 
    	Verification_Procedures.validate_Correct_Item_Name(); 
    	Verification_Procedures.validate_Filters_Applied(); 
    	Verification_Procedures.validate_Shopping_Button_Present(); 
    	System.out.println("All validations passed!");  
    	 
    	 
    	Page_Setup_Configuration.Search_In_Italy_4();
    	
    	Verification_Procedures.validate_Italian_Language_Selected(); 
    	Verification_Procedures.validate_Go_To_Shopping_Button_Present(); 
    	Verification_Procedures.validate_Hats_Search_Input_Present(); 
    	Verification_Procedures.validate_Man_Selection_Present(); 
    	Verification_Procedures.validate_Item_4_Title_Present(); 
    	System.out.println("All validations passed!");  
   	       
     }
	      
    
	      
	      
	      @Test
	      
    public void D_Shopping_System_Operational_Testing() throws InterruptedException {  
    
	    Page_Setup_Configuration.Shopping_Children_s_School_Supplies_1(); 
	    
	    Verification_Procedures.validate_Login_Page_Title();
	    Verification_Procedures.validate_Account_Login_Success();
	    Verification_Procedures.validate_School_Supplies_Page_Loaded();
	    Verification_Procedures.validate_Item_1_In_Cart_1();
	    Verification_Procedures.validate_Item_2_In_Cart_2();
	    System.out.println("All validations passed!");  
	    
	    Page_Setup_Configuration.Home_And_Garden_Accessories_2();
	    
	    Verification_Procedures.validate_Item_1_In_Cart_3();
	    Verification_Procedures.validate_Cart_Empty_After_Deletion();
	    Verification_Procedures.validate_Item_Quantity_Updated();
	    Verification_Procedures.validate_Cart_Total_Price();
	    System.out.println("All validations passed!");  
	    
	    
	    Page_Setup_Configuration.Shopping_for_the_kitchen_and_living_room_3();
	    
	    Verification_Procedures.validate_Item_Quantity(); 
	    Verification_Procedures.validate_Cart_Total(); 
	    Verification_Procedures.validate_Item_2_In_Cart(); 
	    Verification_Procedures.validate_Item_1_In_Cart(); 
	    Verification_Procedures.validate_Total_Item_Count(); 
	    System.out.println("All validations passed!");  
     }  
	      
	      
	      @Test
	      
    public void E_Test_Comprehensive_Links_Validation() throws InterruptedException {     
	      
    	Page_Setup_Configuration.Validate_All_Links_1();
    	
	      	           
    
     }  

    
     }   
    
       
    
    
    
    
    