package pom;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditDeleteLeaveType 
{
	private WebDriver driver;
	@FindBy(xpath="(//div[@class='leaveTypeNameText'])[6]")
	private WebElement MyLeaveTypeTextField;
	
	@FindBy(xpath="(//td[@class='leaveTypeDeleteCell last'])[6]")
	private WebElement deleteIcon;
	
	@FindBy(xpath="(//div[@class='applyButton'])[2]")
	private WebElement ApplyButton;
	
	public EditDeleteLeaveType(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void editLeaveTypeMethod() throws InterruptedException
	{
		MyLeaveTypeTextField.click();
		Thread.sleep(2000);
		MyLeaveTypeTextField.clear();
		Thread.sleep(2000);
		MyLeaveTypeTextField.sendKeys("new leaveAaa ");
		Thread.sleep(2000);
		ApplyButton.click();
		
	}
	public void deleteMethod() throws InterruptedException
	{
		deleteIcon.click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		alt.accept();	
	}
}
