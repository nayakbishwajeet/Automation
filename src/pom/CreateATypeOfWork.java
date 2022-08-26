package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateATypeOfWork 
{
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement CreateTypeOfWorkButton;
	
	@FindBy(id="name")
	private WebElement NameTextfield;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitButton;
	
	public CreateATypeOfWork(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void createATypeOfWorkmethod() throws InterruptedException
	{
		CreateTypeOfWorkButton.click();
		Thread.sleep(3000);
		NameTextfield.sendKeys("ITaaaA");
		Thread.sleep(3000);
		submitButton.click();
		
	}
}
