package org.in.on;

import java.sql.Driver;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Horlicks {
public static WebDriver driver;
@BeforeClass
public void Beforeclass()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\R SABRINATHAN\\eclipse1-workspace\\Collegues\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.facebool.com/");
	
}
@AfterClass()
public void Afterclass()
{
	driver.quit();
}
@BeforeMethod()
public void BeforeMethod()
{
	Date d=new Date();
	System.out.println(d);
	
}
@org.testng.annotations.AfterMethod()
public void AfterMethod()
{
	Date d1=new Date();
	System.out.println(d1);
}
@Parameters({"usernmae"})
@Test(priority=-1)

	public void username(String s1)
	{
	 WebElement user=driver.findElement(By.id("email"));
	 user.sendKeys(s1);
		
	}
@Parameters({"password"})
@Test()
public void password(@Optional("greens")String s1)
{
	WebElement pass=driver.findElement(By.id(s1));
	pass.sendKeys("87896510");
}
@Test(priority=10)
public void button()
{
	WebElement button=driver.findElement(By.id("loginbutton"));
	button.click();
}


}