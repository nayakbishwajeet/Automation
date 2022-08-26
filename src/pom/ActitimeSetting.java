package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeSetting 
{
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typesofworkLink;
	
	@FindBy(xpath="//a[.='Leave Types']")
	private  WebElement leavetypesLink;
	
	@FindBy(xpath="//a[.='Workflow Settings']")
	private WebElement workflowsettingsLink;
	
	@FindBy(xpath="//a[.='Notifications']")
	private WebElement notificationsLink;
	
	@FindBy(xpath="//a[.='Logo Settings']")
	private WebElement logosettingsLink;
	
	@FindBy(xpath="//div[.='Licenses']")
	private WebElement licensesLink;
	
	public ActitimeSetting(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void typesOfWorkMethod()
	{
		typesofworkLink.click();
	}
	public void LeaveTypesMethod() 
	{
		leavetypesLink.click();
	}
	
	

}
