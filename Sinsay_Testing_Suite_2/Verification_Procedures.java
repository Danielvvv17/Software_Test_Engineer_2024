   package Sinsay_Testing_Suite_2;

   import org.junit.Assert;
   import org.openqa.selenium.By;
   import org.openqa.selenium.WebElement;

    public class Verification_Procedures extends Page_Setup_Configuration  {


    public static void validate_Cookie_Preference_Button() throws InterruptedException {   
        Thread.sleep(1700);  
        boolean conditionCookies = driver.getPageSource().contains("SETĂRI");  
        Assert.assertTrue("Cookie preference button should  be present", conditionCookies); 
     }  

    public static void validate_Accept_Cookies_Button() throws InterruptedException {  
        Thread.sleep(1700);  
        boolean conditionAccept = driver.getPageSource().contains("OK");  
        Assert.assertTrue("Accept cookies button should be present", conditionAccept);  
    }  

    public static void validate_Decline_Cookies_Button() throws InterruptedException {  
        Thread.sleep(1700);  
        boolean conditionDecline = driver.getPageSource().contains("Decline Cookies");  
        Assert.assertFalse("Decline cookies button should not be present", conditionDecline);   
    }     	   
   
    public static void validate_Account_Button_Clicked() throws InterruptedException {
        Thread.sleep(1700);
        boolean conditionAccountButton = driver.getPageSource().contains("Creează cont");
        Assert.assertTrue("Account button was clicked successfully", conditionAccountButton);
    }	
    
    public static void validate_Account_Created() throws InterruptedException {
        Thread.sleep(1700);
        boolean conditionAccountCreated = driver.getPageSource().contains("Această adresă de e-mail este deja înregistrată");
        Assert.assertTrue("Account was not created successfully", conditionAccountCreated);
    }
	
    public static void validate_Email_Entered() throws InterruptedException {
        Thread.sleep(1700);
        boolean conditionEmailEntered = driver.getPageSource().contains("email_id");
        Assert.assertTrue("Email was entered successfully", conditionEmailEntered);
    }

    public static void validate_FirstName_Entered() throws InterruptedException {
        Thread.sleep(1700);
        boolean conditionFirstNameEntered = driver.getPageSource().contains("firstname_id");
        Assert.assertTrue("First name was entered successfully", conditionFirstNameEntered);
    }
   			
    public static void validate_LastName_Entered() throws InterruptedException {
        Thread.sleep(1700);
        boolean conditionLastNameEntered = driver.getPageSource().contains("lastname_id");
        Assert.assertTrue("Last name was entered successfully", conditionLastNameEntered);
    }
	
    public static void validate_Password_Entered() throws InterruptedException {
        Thread.sleep(1700);
        boolean conditionPasswordEntered = driver.getPageSource().contains("password_id");
        Assert.assertTrue("Password was entered successfully", conditionPasswordEntered);
    }
	
    public static void validate_Privacy_Policy_Checked() throws InterruptedException {
        Thread.sleep(1700);
        boolean conditionPrivacyPolicy = driver.getPageSource().contains("privacy_policy_id");
        Assert.assertTrue("Privacy policy was checked successfully", conditionPrivacyPolicy);
    }
	
    public static void validate_Login_Button_Present() throws InterruptedException {
        Thread.sleep(1700);
        boolean conditionLoginButton = driver.getPageSource().contains("Intră în cont");
        Assert.assertFalse("Login button should be present", conditionLoginButton);
    }
    
    public static void validate_Email_Field_Present() throws InterruptedException {
        Thread.sleep(1700);
        boolean conditionEmailField = driver.getPageSource().contains("login[username]_id");
        Assert.assertFalse("Email field should not be present", conditionEmailField);
    }
    
    public static void validate_Password_Field_Present() throws InterruptedException {
        Thread.sleep(1700);
        boolean conditionPasswordField = driver.getPageSource().contains("");
        Assert.assertTrue("Password field should be present", conditionPasswordField);
    }
    
    public static void validate_Newsletter_Button_Present() throws InterruptedException {
        Thread.sleep(1700);
        boolean conditionNewsletterButton = driver.getPageSource().contains("");
        Assert.assertTrue("Newsletter close button should be present", conditionNewsletterButton);
    }
    
    public static void validate_Create_Account_Button_Not_Present() throws InterruptedException {
        Thread.sleep(1700);
        boolean conditionCreateAccountButton = driver.getPageSource().contains("Creează cont");
        Assert.assertFalse("Create Account button should not be present after login", conditionCreateAccountButton);
    }
    
    public static void validate_Invalid_Login_Message_Not_Present() throws InterruptedException {
        Thread.sleep(1700);
        boolean conditionInvalidLoginMessage = driver.getPageSource().contains("Invalid login");
        Assert.assertFalse("Invalid login message should not be present after successful login", conditionInvalidLoginMessage);
    }
    
    public static void validate_Fictional_Error_Message_Not_Present() throws InterruptedException {
        Thread.sleep(1700);
        boolean conditionFictionalErrorMessage = driver.getPageSource().contains("Fictional error message");
        Assert.assertFalse("Fictional error message should not be present after login", conditionFictionalErrorMessage);
    }

    public static void validate_Customer_Account_Present() {
        boolean conditionCustomerAccount = driver.getPageSource().contains("");
        Assert.assertTrue("Customer account should be present", conditionCustomerAccount);
    }

    public static void validate_Customer_Account_Clickable() {
        WebElement Customer_Account = waitForElementToBeClickable(By.linkText(""), 20);
        boolean conditionCustomerAccountClickable = (Customer_Account != null && Customer_Account.isDisplayed() && Customer_Account.isEnabled());
        Assert.assertTrue("Customer account should be clickable", conditionCustomerAccountClickable);
    }

    public static void validate_Logout_Present() {
        WebElement Log_Out = waitForElementToBeClickable(By.linkText(""), 20);
        boolean conditionLogoutPresent = (Log_Out != null && Log_Out.isDisplayed() && Log_Out.isEnabled());
        Assert.assertTrue("Logout button should be present", conditionLogoutPresent);
    }
	
    public static void validate_Account_Button_Present() {
        boolean conditionAccountButton = driver.getPageSource().contains("Cont");
        Assert.assertTrue("Account button should be present", conditionAccountButton);
    }

    public static void validate_Login_Email_Present() {
        boolean conditionLoginEmail = driver.getPageSource().contains("");
        Assert.assertTrue("Login email field should be present", conditionLoginEmail);
    }

    public static void validate_Login_Password_Present() {
        boolean conditionLoginPassword = driver.getPageSource().contains("");
        Assert.assertTrue("Login password field should be present", conditionLoginPassword);
    }

    public static void validate_Customer_Account_Clickable_2() {
        WebElement Customer_Account = waitForElementToBeClickable(By.linkText("Vlad Ionut"), 20);
        boolean conditionCustomerAccountClickable = (Customer_Account != null && Customer_Account.isDisplayed() && Customer_Account.isEnabled());
        Assert.assertTrue("Customer account should be clickable", conditionCustomerAccountClickable);
    }
	
    public static void validate_First_Name_Cleared() {
        String pageSource = driver.getPageSource();
        boolean conditionFirstNameCleared = !pageSource.contains("firstname=\"John\""); 
        Assert.assertTrue("First name field should be cleared", conditionFirstNameCleared);
    }

    public static void validate_Last_Name_Cleared() {
        String pageSource = driver.getPageSource();
        boolean conditionLastNameCleared = !pageSource.contains("lastname=\"Doe\""); 
        Assert.assertTrue("Last name field should be cleared", conditionLastNameCleared);
    }

    public static void validate_Date_Of_Birth_Clickable() {
        String pageSource = driver.getPageSource();
        boolean conditionDateOfBirth = pageSource.contains("id=\"dateOfBirth\"");
        Assert.assertTrue("Date of birth field should be clickable", conditionDateOfBirth);
    }

    public static void validate_Phone_Number_Cleared() {
        String pageSource = driver.getPageSource();
        boolean conditionPhoneCleared = !pageSource.contains("phone=\"1234567890\""); 
        Assert.assertTrue("Phone number field should be cleared", conditionPhoneCleared);
    }

    public  static void validate_First_Name_Entered() {
        String pageSource = driver.getPageSource();
        boolean conditionFirstNameEntered = pageSource.contains(""); 
        Assert.assertTrue("First name should be entered", conditionFirstNameEntered);
    }

    public static void validate_Last_Name_Entered() {
        String pageSource = driver.getPageSource();
        boolean conditionLastNameEntered = pageSource.contains(""); 
        Assert.assertTrue("Last name should be entered", conditionLastNameEntered);
    }

    public static void validate_Phone_Number_Entered() {
        String pageSource = driver.getPageSource();
        boolean conditionPhoneEntered = pageSource.contains(""); 
        Assert.assertTrue("Phone number should be entered", conditionPhoneEntered);
    }

    public  static void validate_Gender_Selected() {
        String pageSource = driver.getPageSource();
        boolean conditionGenderSelected = pageSource.contains(""); 
        Assert.assertTrue("Gender should be selected as 'Femeie'", conditionGenderSelected);
    }

    public static void validate_Date_Of_Birth_Selected() {
        String pageSource = driver.getPageSource();
        boolean conditionDateOfBirthSelected = pageSource.contains("");
        Assert.assertTrue("Date of birth should be selected correctly", conditionDateOfBirthSelected);
    }  
	   
    public static void validate_Delivery_Address_Clicked() {
        boolean conditionDeliveryAddressClicked = driver.getCurrentUrl().contains("");
        Assert.assertTrue("Delivery address page should be opened", conditionDeliveryAddressClicked);
    }

    public static void validate_Street_Name_Entered() {
        String streetNameValue = Testing_Configuration_Setup.StreetName;
        boolean conditionStreetNameEntered = !streetNameValue.isEmpty();
        Assert.assertTrue("Street name should be entered", conditionStreetNameEntered);
    }

    public static void validate_Region_Entered() {
        String regionValue = Testing_Configuration_Setup.Region;
        boolean conditionRegionEntered = !regionValue.isEmpty();
        Assert.assertTrue("Region should be entered", conditionRegionEntered);
    }

    public static void validate_Postcode_Entered() {
        String postcodeValue = Testing_Configuration_Setup.Postcode;
        boolean conditionPostcodeEntered = !postcodeValue.isEmpty();
        Assert.assertTrue("Postcode should be entered", conditionPostcodeEntered);
    }

    public static void validate_City_Entered() {
        String cityValue = Testing_Configuration_Setup.City;
        boolean conditionCityEntered = !cityValue.isEmpty();
        Assert.assertTrue("City should be entered", conditionCityEntered);
    }

    public static void validate_Mobile_Entered() {
        String mobileValue = Testing_Configuration_Setup.Mobile;
        boolean conditionMobileEntered = !mobileValue.isEmpty();
        Assert.assertTrue("Mobile number should be entered", conditionMobileEntered);
    }
	
    public static void validate_Date_De_Facturare_Link_Present() {
        String pageSource = driver.getPageSource();
        boolean condition = pageSource.contains("");
        Assert.assertTrue("Date de Facturare link should be present", condition);
    }
   
    public static void validate_Invoice_FirstName_Present() {
        String pageSource = driver.getPageSource();
        boolean condition = pageSource.contains("id=\"invoice-firstname\"");
        Assert.assertTrue("Invoice first name field should be present", condition);
    }
   
    public  static void validate_Invoice_LastName_Present() {
        String pageSource = driver.getPageSource();
        boolean condition = pageSource.contains("id=\"invoice-lastname\"");
        Assert.assertTrue("Invoice last name field should be present", condition);
    }

    public static void validate_Invoice_StreetName_Present() {
        String pageSource = driver.getPageSource();
        boolean condition = pageSource.contains("id=\"invoice-street0\"");
        Assert.assertTrue("Invoice street name field should be present", condition);
    }
  
    public static void validate_Invoice_PostCode_Present() {
        String pageSource = driver.getPageSource();
        boolean condition = pageSource.contains("id=\"invoice-postcode\"");
        Assert.assertTrue("Invoice postcode field should be present", condition);
    }
	
    public static void validate_Cookie_Button_Present() {
        String pageSource = driver.getPageSource();
        boolean condition = pageSource.contains("");
        Assert.assertTrue("Cookie button should be present", condition);
    }

    public static void validate_Search_Button_Present() {
        String pageSource = driver.getPageSource();
        boolean condition = pageSource.contains("");
        Assert.assertTrue("Search button should be present", condition);
    }
   
    public static void validate_Toys_For_Children_Input_Present() {
        String pageSource = driver.getPageSource();
        boolean condition = pageSource.contains("");
        Assert.assertTrue("Toys for Children input field should be present", condition);
    }
  
    public static void validate_Price_Filter_Icon_Present() {
        String pageSource = driver.getPageSource();
        boolean condition = pageSource.contains("");
        Assert.assertTrue("Price Filter icon should be present", condition);
    }

    public static void validate_Special_Price_Checkbox_Present() {
        String pageSource = driver.getPageSource();
        boolean condition = pageSource.contains("checkbox");
        Assert.assertTrue("Special Price checkbox should be present", condition);
    }

    public static void validate_QR_Application_Button_Present() {
        String pageSource = driver.getPageSource();
        boolean condition = pageSource.contains("QR Application button");
        Assert.assertFalse("QR Application button should not  be present", condition);
    }
   
    public static void validate_Slider_Input_Present() {
        String pageSource = driver.getPageSource();
        boolean condition = pageSource.contains("input.ds-range-max-slider-thumb");
        Assert.assertFalse("Slider input for price range should  not be present", condition);
    }

    public static void validate_Item_Minnie_Mouse_Present() {
        String pageSource = driver.getPageSource();
        boolean condition = pageSource.contains("Set de accesorii Minnie Mouse");
        Assert.assertTrue("Item 'Set de accesorii Minnie Mouse' should be present", condition);
    }

    public static void validate_Expand_Price_Filter_Button_Present() {
        String pageSource = driver.getPageSource();
        boolean condition = pageSource.contains("");
        Assert.assertTrue("Button to expand the price filter should be present", condition);
    }

    public static void validate_Invoice_StreetNumber_Present() {
        String pageSource = driver.getPageSource();
        boolean condition = pageSource.contains("");
        Assert.assertTrue("Invoice street number field should be present", condition);
    }
	
    public static void validateLanguageChanged() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains("Deutschland (Germany)");  
        Assert.assertTrue("Language not changed to German", condition);  
    }  

    public static void validateTrousersDisplayed() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains(Testing_Configuration_Setup.Trousers);  
        Assert.assertFalse("Trousers is not displayed", condition);  
    }  

    public static void validateManCategorySelected() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains("Men");  
        Assert.assertTrue("Men category is selected", condition);  
    }  

    public static void validateSizeAvailable() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains("134");  
        Assert.assertTrue("Size 134 is available", condition);  
    }  

    public static void validateItemVisible() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains("Shorts");  
        Assert.assertTrue("Item 'Shorts' is visible", condition);  
    }  
	
    public static void validate_Greek_Language_Selected() throws InterruptedException {  
        Thread.sleep(1700);  
        boolean isGreekSelected = driver.getPageSource().contains("Ελλάδα (Greece)");  
        Assert.assertTrue("Greek language should be selected", isGreekSelected);  
    }  

    public static void validate_Item_List_Displayed() throws InterruptedException {  
        Thread.sleep(1700);  
        boolean isItemListDisplayed = driver.getPageSource().contains("");  
        Assert.assertTrue("Item is selected", isItemListDisplayed);  
    }

    public static boolean validate_Correct_Item_Name() throws InterruptedException {  
        Thread.sleep(1700);  
        boolean isCorrectItemNameDisplayed = driver.getPageSource().contains("Μπλουζάκι με όρθιο γιακά");  
        Assert.assertTrue("Item name should match", isCorrectItemNameDisplayed);  
        return isCorrectItemNameDisplayed;  
    }

    public static void validate_Filters_Applied() throws InterruptedException {  
        Thread.sleep(1700);  
        boolean areFiltersApplied = driver.getPageSource().contains("Γυναικεία"); 
        Assert.assertTrue("Filters should be applied", areFiltersApplied);  
    }  

    public static boolean validate_Shopping_Button_Present() throws InterruptedException {  
        Thread.sleep(1700);  
        boolean isGoToShoppingButtonPresent = driver.getPageSource().contains("Πηγαίνετε στο κατάστημα");  
        Assert.assertFalse("Go to shopping button should be present", isGoToShoppingButtonPresent);  
        return isGoToShoppingButtonPresent;  
    }
	
    public static boolean validate_Italian_Language_Selected() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains("Italia (Italy)"); 
        Assert.assertTrue("Italian language should be selected", condition);  
        return condition;  
    }  

    public static boolean validate_Go_To_Shopping_Button_Present() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains("Vai al negozio"); 
        Assert.assertTrue("Go to shopping button should be present", condition);  
        return condition;  
    }  

    public static boolean validate_Hats_Search_Input_Present() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains("Hats"); 
        Assert.assertTrue("Hats search input should be present", condition);  
        return condition;  
    }  

    public static boolean validate_Man_Selection_Present() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains("Man"); 
        Assert.assertTrue("Man category should be present", condition);  
        return condition;  
    }  

    public static boolean validate_Item_4_Title_Present() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains("Completo lavorato a maglia Mickey Mouse");
        Assert.assertTrue("Item title should be present", condition);  
        return condition;  
    }
	
    public static boolean validate_Login_Page_Title() {  
        String pageTitle = driver.getTitle();  
        boolean condition = pageTitle.contains("");  
        Assert.assertTrue("Login page title should be present", condition);  
        return condition;  
    }  

    public static boolean validate_Account_Login_Success() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains(""); 
        Assert.assertTrue("User should be logged in successfully", condition);  
        return condition;  
    }  

    public static boolean validate_School_Supplies_Page_Loaded() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains(""); 
        Assert.assertTrue("School Supplies page should be present", condition);  
        return condition;  
    }  

    public static boolean validate_Item_1_In_Cart_1() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains("Calendar 2025"); 
        Assert.assertTrue("Calendar 2025 should be in cart", condition);  
        return condition;  
    }  

    public static boolean validate_Item_2_In_Cart_2() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains("Carte cu autocolante"); 
        Assert.assertTrue("Carte cu autocolante should be in cart", condition);  
        return condition;  
    }
	
    public static boolean validate_Item_1_In_Cart_3() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains("");   
        Assert.assertTrue("Set de 8 ghivece cu picioare ar trebui să nu mai  fie în coș", condition);  
        return condition;  
    }  

    public static boolean validate_Item_2_In_Cart_4() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains("");   
        Assert.assertTrue("Set de 8 ghivece cu picioare ar trebui să mai fie în coș", condition);  
        return condition;  
    }  
    
    public static boolean validate_Cart_Empty_After_Deletion() {  
        String pageSource = driver.getPageSource();  
        boolean condition = !pageSource.contains("");   
        Assert.assertFalse("Coșul ar trebui să fie gol după ștergerea articolului", condition);  
        return condition;  
    }  

    public static boolean validate_Item_Quantity_Updated() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains("");  
        Assert.assertTrue("Cantitatea ar trebui să fie actualizată în coș", condition);  
        return condition;  
    }  

    public static boolean validate_Cart_Total_Price() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains("");  
        Assert.assertTrue("Prețul total ar trebui să fie corect în coș", condition);  
        return condition;  
    }
	
    public static boolean validate_Item_1_In_Cart() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains("Suport pentru oală 2 pack");  
        Assert.assertTrue("Suport pentru oală 2 pack ar trebui să fie în coș", condition);  
        return condition;  
    }  

    public static boolean validate_Item_2_In_Cart() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains("");  
        Assert.assertTrue("Coș pentru depozitare ar trebui să fie în coș", condition);  
        return condition;  
    }  

    public static boolean validate_Item_Quantity() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains(""); 
        Assert.assertTrue("Cantitatea ar trebui să fie actualizată în coș", condition);  
        return condition;  
    }  

    public static boolean validate_Cart_Total() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains("");  
        Assert.assertTrue("Prețul total ar trebui să fie corect în coș", condition);  
        return condition;  
    }  

    public static boolean validate_Total_Item_Count() {  
        String pageSource = driver.getPageSource();  
        boolean condition = pageSource.contains(""); 
        Assert.assertTrue("Numărul total de articole ar trebui să fie corect în coș", condition);  
        return condition;  
    }  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


   }
