package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeCreateLeaveType 
{
	private WebDriver driver;
	@FindBy(xpath="//span[.='Create Leave Type']")
	private WebElement CreateLeaveTypeButton;
	
	@FindBy(xpath="//input[@placeholder='Leave Type Name']")
	private WebElement LeaveTypeNameTextfield;
	
	@FindBy(id="processLeaveTimeCheckbox_createPopup")
	private WebElement ProcessLeaveTimeCheckbox;
	
	@FindBy(xpath="//span[.='Create Leave Type']")
	private WebElement CreateLeaveTypeSubmitButton;
	
	@FindBy(id="leaveTypeLightBox_cancelBtn")
	private WebElement cancelButton;
	
	public ActitimeCreateLeaveType(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void createTypeLeaveMethod() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",CreateLeaveTypeButton);
		Thread.sleep(2000);
		LeaveTypeNameTextfield.sendKeys("Not in mood leave for me1Aaa");
		Thread.sleep(2000);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",ProcessLeaveTimeCheckbox);
		Thread.sleep(2000);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",CreateLeaveTypeSubmitButton);

		
	}
	public void cancelMethod()
	{
		cancelButton.click();
	}
	

}
