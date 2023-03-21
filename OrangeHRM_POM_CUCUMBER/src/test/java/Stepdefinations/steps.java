package Stepdefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pageobject_library.AddNewEmployeeREG;
import Pageobject_library.Loginpage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps extends Basic_step
{
	public WebElement emplist;
	
	
  public AddNewEmployeeREG empl;
   
	@Given("^i open chrome browser$")
	public void i_open_chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		lp=new Loginpage(driver);
	   
	}

	@Given("^i open with with url \"([^\"]*)\"$")
	public void i_open_with_with_url(String url) throws Throwable {
	   driver.get(url);
	}

	@Then("^i should see login page$")
	public boolean i_should_see_login_page() throws Throwable {
	    if(driver.findElement(By.id("btnLogin")).isDisplayed())
	    {
	    	return true;
	    }else
	    {
	    	return false;
	    }
	}

	@When("^i enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String uid) throws Throwable {
	    lp.setusername(uid);
	    
	}

	@When("^i enter userpassword as \"([^\"]*)\"$")
	public void i_enter_userpassword_as(String pwd) throws Throwable {
	   lp.setuserpassword(pwd);
	}

	@When("^i click login butten$")
	public void i_click_login_butten() throws Throwable {
	   lp.clicklogin();
	}

	@Then("^i should see admin module displayed$")
	public boolean i_should_see_admin_module_displayed() throws Throwable {
	    if(driver.findElement(By.linkText("Admin")).isDisplayed())
	    {
	    	return true;
	    }else
	    {
	    	return false;
	    }
	}

	@When("^i click logout$")
	public void i_click_logout() throws Throwable {
	   lp.clickwelcome();
	   Thread.sleep(2000);
	   lp.clicklogout();
	}

	@When("^i close browser$")
	public void i_close_browser() throws Throwable {
	  driver.close();
	}

	@Then("^i should see erorr message$")
	public boolean i_should_see_erorr_message() throws Throwable {
	   String errmsg=driver.findElement(By.id("spanMessage")).getText();
	   if(errmsg.toLowerCase().contains("invalid"))
	   {
		   return true;
	   }else
	   {
		   return false;
	   }
	}
	@When("^i click PIM link$")
	public void i_click_PIM_link() throws Throwable {
	   empl=new AddNewEmployeeREG(driver);
	   empl.clickpImLink();
	}

	@When("^i click Add Employee link$")
	public void i_click_Add_Employee_link() throws Throwable {
	   empl.clickAddemployeelink();
	}

	@When("^i enter firstname As \"([^\"]*)\"$")
	public void i_enter_firstname_As(String fname) throws Throwable {
	    empl.setfirstname(fname);
	}

	@When("^i enter lastname AS \"([^\"]*)\"$")
	public void i_enter_lastname_AS(String lname) throws Throwable {
	    empl.setlastname(lname);
	}

	@When("^i take employee id value$")
	public void i_take_employee_id_value() throws Throwable {
	   empl.storeemployeeid();
	}

	@When("^i create login details$")
	public void i_create_login_details() throws Throwable {
	  empl.clicklogindetails();
	}

	@When("^i enter user name as \"([^\"]*)\"$")
	public void i_enter_user_name_as(String username) throws Throwable {
	  empl.setusername(username);
	}
	@When("^i enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String pwd) throws Throwable {
	  empl.setpassword(pwd);
	  Thread.sleep(2000);
	}
	@When("^i enter conformpassword as \"([^\"]*)\"$")
	public void i_enter_conformpassword_as(String pwd) throws Throwable {
	  
	   empl.setconfrompassword(pwd);
	}

	@When("^i select status \"([^\"]*)\"$")
	public void i_select_status(String status) throws Throwable {
	    empl.setstatus(status);
	}

	@When("^i click save buteen$")
	public void i_click_save_buteen() throws Throwable {
	    empl.clicksave();
	    Thread.sleep(2000);
	}

	@Then("^i should see Personal details$")
	public boolean i_should_see_Personal_details() throws Throwable {
	   if(driver.findElement(By.linkText("Personal Details")).isDisplayed())
	   {
		   return true;
	   }else
		   return false;
	}

	@When("^i click Edit buteen$")
	public void i_click_Edit_buteen() throws Throwable {
	  empl.Editdetails();
	}

	@When("^i enter Other Id \"([^\"]*)\"$")
	public void i_enter_Other_Id(String otherid) throws Throwable {
	  empl.setotherID(otherid);
	}

	@When("^i enter Driver's License Number \"([^\"]*)\"$")
	public void i_enter_Driver_s_License_Number(String licence) throws Throwable {
	   empl.setlicence(licence);
	   
	}

	@When("^i enter License Expiry Date$")
	public boolean i_enter_License_Expiry_Date() throws Throwable {
	   empl.setlicenceEXPdate();
	   
	   Thread.sleep(3000);
	   String expdate="23/Apr/2024";
	   String[]temp=  expdate.split("/");
	     String date=   temp[0];
	     String month=temp[1];
	     String year= temp[2];
	     
	     Select year1=new Select(driver.findElement(By.className("ui-datepicker-year")));
	     year1.selectByVisibleText(year);
	     
	     Select month1=new Select(driver.findElement(By.className("ui-datepicker-month")));
	     month1.selectByVisibleText(month);
	     
	     WebElement cal=   driver.findElement(By.className("ui-datepicker-calendar"));
	   List<WebElement>rows=  cal.findElements(By.tagName("tr"));
	   boolean flag=false;
	   for(int i=1;i<rows.size();i++)
	   {
		List<WebElement>colms=   rows.get(i).findElements(By.tagName("td"));
		if(colms.get(1).getText().equals(date))
		{
			
			flag=true;
			break;
			
		}
		System.out.println(date);
		
		Thread.sleep(5000);
	   }
	   return flag;
	}

	@When("^i click Gender$")
	public void i_click_Gender() throws Throwable {
	  empl.setGender();
	  
	}

	@When("^i select Marital Status$")
	public void i_select_Marital_Status() throws Throwable {
	   empl.setmeritalstatus();
	   Select marit=new Select(driver.findElement(By.id("personal_cmbMarital")));
	   marit.selectByValue("Single");
	}

	@When("^i select Nationality$")
	public void i_select_Nationality() throws Throwable {
	   empl.setnation();
	   Thread.sleep(2000);
	   Select nation=new Select(driver.findElement(By.id("personal_cmbNation")));
			   nation.selectByValue("82");
	}

	@When("^i enter Date of Birth$")
	public boolean i_enter_Date_of_Birth() throws Throwable {
	    empl.setDOB();
	    Thread.sleep(3000);
	    String dob="17/Mar/2022";
	  String[]temp=  dob.split("/");
	    String date=  temp[0];
	    String month=temp[1];
	    String year=temp[2];
	    
	    Select year1=new Select(driver.findElement(By.className("ui-datepicker-year")));
	    		year1.selectByVisibleText(year);
	    		
	    Select month1=new Select(driver.findElement(By.className("ui-datepicker-month")));
	    	month1.selectByVisibleText(month);
	    	
	   WebElement cal=driver.findElement(By.className("ui-datepicker-calendar"));
	List<WebElement>rows= cal.findElements(By.tagName("tr"));
	boolean flag=false;
	for(int i=1;i<rows.size();i++)
	{
	List<WebElement>colms=	rows.get(i).findElements(By.tagName("td"));
	if(colms.get(1).getText().equals(date)){
	
	  flag=true;
	}
	}
	return flag;
	}

	@When("^i save personal details$")
	public void i_save_personal_details() throws Throwable {
	   empl.clicksavepersonal();
	}

	@When("^i click Employee List link$")
	public void i_click_Employee_List_link() throws Throwable {
	    empl.clickemployeelistlink();
	}

	@When("^i enter taken employee id$")
	public void i_enter_taken_employee_id() throws Throwable {
	   empl.searchemployeeid();
	}

	@When("^i click search butten$")
	public void i_click_search_butten() throws Throwable {
	   empl.clicksearch();
	}

	@Then("^i shoud see employee table in  new employee registration$")
	public void i_shoud_see_employee_table_in_new_employee_registration() throws Throwable {
	  
		empl.employeelisttable();
	   

	
	
	}
	
	
	
	
	
	
	
	
}
