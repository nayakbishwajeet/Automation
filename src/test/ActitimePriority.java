package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;
import pom.ActitimeSetting;
import pom.CreateATypeOfWork;

public class ActitimePriority 
{
	public WebDriver driver;
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        ActitimeLoginPage login=new ActitimeLoginPage(driver);
        login.loginMethod();
	}
	@Test
	public void creatework() throws InterruptedException
	{
		ActitimeHomePage home=new ActitimeHomePage(driver);
		home.settingsmethod();
		ActitimeSetting setting=new ActitimeSetting(driver);
		setting.typesOfWorkMethod();
		CreateATypeOfWork work=new CreateATypeOfWork(driver);
		work.createATypeOfWorkmethod();
	}
    @Test
	public void logout()
	{
		ActitimeHomePage home=new ActitimeHomePage(driver);
		home.logoutmethod();
	}
}
