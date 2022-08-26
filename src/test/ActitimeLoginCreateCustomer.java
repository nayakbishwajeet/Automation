package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;
import pom.CreateACustomer;

public class ActitimeLoginCreateCustomer 
{
	@Test(groups = "Integration")
	public void createCustomer() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        ActitimeLoginPage login=new ActitimeLoginPage(driver);
        login.loginMethod();
        
        ActitimeHomePage home=new ActitimeHomePage(driver);
        home.taskmethod();
        CreateACustomer customer=new CreateACustomer(driver);
        customer.createCustomermethod();
        Thread.sleep(5000);
        home.logoutmethod();
        
        
	}
}
