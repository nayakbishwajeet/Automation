package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage 
{
	private WebDriver driver;
	@FindBy(xpath="(//div[.='Switch to actiPLANS'])[1]")
	private WebElement switchtoactiplansLink;
	@FindBy(id="container_tt")
	private WebElement timetrackLink;
	@FindBy(id="container_tasks")
	private WebElement taskLink;
	@FindBy(id="container_reports")
	private WebElement reportsLink;
	@FindBy(id="container_users")
	private WebElement usersLink;
	@FindBy(xpath="(//div[@class='menu_icon'])[1]")
	private WebElement calenderDropDown;
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsDropDown;
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement integrationDropDown;
	@FindBy(xpath="(//div[@class='menu_icon'])[4]")
	private WebElement helpandsupportDropDown;
	@FindBy(xpath="//div[@class='popup_menu_icon tips_icon_light_on']")
	private WebElement popuplink;
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	@FindBy(xpath="//a[@class='userProfileLink username ']")
	private WebElement userprofileLink;
	@FindBy(xpath="//div[@class='supportQuestionButton']")
	private WebElement chartbot;
	
	public ActitimeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	public void logoutmethod()
	{ 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",logoutLink);
		
	}
	
	public void settingsmethod()
	{
		settingsDropDown.click();
	}
	
	public void taskmethod() 
	{
		taskLink.click();
	}

}
