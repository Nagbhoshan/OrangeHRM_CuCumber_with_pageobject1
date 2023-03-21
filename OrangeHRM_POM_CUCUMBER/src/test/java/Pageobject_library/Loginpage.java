package Pageobject_library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	public WebDriver ldriver;

	public Loginpage(WebDriver rdriver)
	{
		ldriver=rdriver;

		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="txtUsername")
	WebElement  username_element;

	@FindBy(id="txtPassword")
	WebElement userpwd_element;

	@FindBy(id="btnLogin")
	WebElement login_butten;

	@FindBy(partialLinkText="Welcome")
	WebElement welcomlink;

	@FindBy(linkText="Logout")
	WebElement logout_link;

	public void setusername(String uid)
	{
		username_element.sendKeys(uid);
	}
	public void setuserpassword(String pwd)
	{
		userpwd_element.sendKeys(pwd);
	}

	public void clicklogin()
	{
		login_butten.click();

	}

	public void clickwelcome()
	{
		welcomlink.click();
	}
	public void clicklogout()
	{
		logout_link.click();
	}
}
