package org.test.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;
	public static void browser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\R SABRINATHAN\\eclipse1-workspace\\AccountCreation\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	public static void loadurl(String url)
	{
		driver.get(url);
		
		
	}
	public static void signIn(WebElement e)
	{
		e.click();
	}
    public static void fill(WebElement e,String value)
    {
    	e.clear();
    	e.sendKeys(value);
    	
    }
}
