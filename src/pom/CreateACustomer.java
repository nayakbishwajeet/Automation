package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateACustomer 
{
	@FindBy(xpath="//div[.='Add New']")
	private WebElement AddNewCustomerButton;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement NewCustomerButton;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement CustomerNameTextfield;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement CustomerDescriptionTextareafield;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement CreateCustomerButton;
	
	public CreateACustomer(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void createCustomermethod() throws InterruptedException
	{
		AddNewCustomerButton.click();
		Thread.sleep(3000);
		NewCustomerButton.click();
		Thread.sleep(3000);
		CustomerNameTextfield.sendKeys("Bishwajeet NayakPupunaaa");
		Thread.sleep(3000);
		CustomerDescriptionTextareafield.sendKeys("Software Engineer");
		Thread.sleep(3000);
		CreateCustomerButton.click();
		
		
	}
	
	
	
}
