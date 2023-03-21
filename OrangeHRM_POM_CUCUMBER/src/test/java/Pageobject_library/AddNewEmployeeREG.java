package Pageobject_library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewEmployeeREG 
{
  public WebDriver ldriver;
  
  public AddNewEmployeeREG(WebDriver rdriver)
  {
	  PageFactory.initElements(rdriver,this);
  }
	
	@FindBy(linkText="PIM")
	WebElement Pimlink_element;
	
	@FindBy(linkText="Add Employee")
	WebElement AddemployeeLink;
	
	@FindBy(id="firstName")
	WebElement firstname_element;
	
	@FindBy(id="lastName")
	WebElement lastname_element;
	
	@FindBy(name="employeeId")
	WebElement employeeID_element;
	
	@FindBy(name="chkLogin")
	WebElement CreateLoginDetails;
	
	@FindBy(id="user_name")
	WebElement username_element;
	
	@FindBy(name="user_password")
	WebElement userpassword;
	
	@FindBy(id="re_password")
	WebElement userconformpassword;
	
	@FindBy(name="status")
	WebElement status_element;
	
	@FindBy(id="btnSave")
	WebElement savebutten;
	
	@FindBy(xpath="//*[@id='btnSave']")
	WebElement edit_element;
	
	@FindBy(name="personal[txtOtherID]")
	WebElement otherid_element;
	
	@FindBy(id="personal_txtLicenNo")
	WebElement licence_element;
	
	@FindBy(name="personal[txtLicExpDate]")
	WebElement licenceExpDate_element;
	
	@FindBy(id="personal_optGender_1")
	WebElement gender_element;
	
	@FindBy(id="personal_cmbMarital")
	WebElement marital_status_element;
	
	@FindBy(id="personal_cmbNation")
	WebElement nation_element;
	
	@FindBy(name="personal[DOB]")
	WebElement dataofbirth_element;
	
	@FindBy(id="btnSave")
	WebElement save_personal_element;
	
	@FindBy(linkText="Employee List")
	WebElement employeelist_link;
	
	@FindBy(name="empsearch[id]")
	WebElement searchemployeeid_element;
	
	@FindBy(id="searchBtn")
	WebElement search_element;
	
	@FindBy(id="resultTable")
	WebElement employeetable;
	
	String emp;
	public void clickpImLink()
	{
		Pimlink_element.click();
	}
	public void clickAddemployeelink()
	{
		AddemployeeLink.click();
	}
	public void setfirstname(String fname)
	{
		firstname_element.sendKeys(fname);
	}
	public void setlastname(String lname)
	{
		lastname_element.sendKeys(lname);
	}
	public void storeemployeeid()
	{
	emp=employeeID_element.getAttribute("value");
	}
	public void clicklogindetails()
	{
		CreateLoginDetails.click();
	}
	public void setusername(String username)
	{
		username_element.sendKeys(username);
	}
	public void setpassword(String pwd)
	{
		userpassword.sendKeys(pwd);
	}
	public void setconfrompassword(String pwd)
	{
		userconformpassword.sendKeys(pwd);
	}
	public void setstatus(String status)
	{
		status_element.sendKeys(status);
	}
	public void clicksave()
	{
		savebutten.click();
	}
	public void Editdetails()
	{
		edit_element.click();
	}
	public void setotherID(String otherid)
	{
		otherid_element.sendKeys(otherid);
	}
	public void setlicence(String licence)
	{
		licence_element.sendKeys(licence);
	}
	public void setlicenceEXPdate()
	{
		licenceExpDate_element.click();
	}
	public void setGender()
	{
		gender_element.click();
		
	}
	public void setmeritalstatus()
	{
	 marital_status_element.click();
	}
	public void setnation()
	{
		nation_element.click();
	}
	public void setDOB()
	{
		dataofbirth_element.click();
	}
	public void clicksavepersonal()
	{
		save_personal_element.click();
	}
	
	public void clickemployeelistlink()
	{
		employeelist_link.click();
	}
	
	public void searchemployeeid()
	{
		searchemployeeid_element.sendKeys(emp);
	}
	
	public void clicksearch()
	{
		search_element.click();
	}
	
	public void employeelisttable()
	{
	WebElement emplist=	employeetable;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
