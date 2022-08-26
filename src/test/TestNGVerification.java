package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGVerification 
{
	@Test
	public void verification()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String expectedTitle="Login";
        String actualTitle=driver.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle);
        SoftAssert S=new SoftAssert();
        S.assertEquals(actualTitle, expectedTitle);
        System.out.println("Here is the result of the comparision");
        System.out.println("S S Mohanty");
        S.assertAll();
        System.out.println("Bishwajeet");
	}
	@Test
	public void normalMethod()
	{
		System.out.println("Software testing engineer");
	}
}
