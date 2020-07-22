package org.test.in;

import java.awt.Robot;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Automated extends BaseClass
{

@Test
public void Process() throws InterruptedException
{
	browser();
	loadurl("http://automationpractice.com/index.php");
    driver.manage().window().maximize();
	PojoClass m=new PojoClass();
	signIn(m.getSigin());
	//to enter the email address
	fill(m.getEmailAddress(),"sabarirajendran26@gmail.com");
	signIn(m.getCreateAccount());
	Thread.sleep(2000);
	signIn(m.getGender());
	fill(m.getFirstName(),"sabari");
	fill(m.getLastName(),"nathan");
	fill(m.getEmail(),"sabarirajendran26@gmail.com");
	fill(m.getPassword(),"Sabarinathan@12345");
	WebElement selectdays = driver.findElement(By.id("days"));
	Select s=new Select(selectdays);
	s.selectByIndex(26);
	WebElement selectMonth = driver.findElement(By.id("months"));
	Select t=new Select(selectMonth);
	t.selectByIndex(3);
	WebElement selectyears = driver.findElement(By.id("years"));
	Select u=new Select(selectyears);
	u.selectByValue("2014");
	fill(m.getCompany(),"xyz");
	fill(m.getAddress(),"sabarirajenran26@gmail.com");
	fill(m.getCity(),"chennai");
	fill(m.getAddress(),"omr chennai");
	fill(m.getAddressTwo(),"Ecr chennai");
	WebElement statename = driver.findElement(By.id("id_state"));
	Select b=new Select(statename);
	b.selectByVisibleText("Indiana");
	WebElement  zipcode= driver.findElement(By.id("postcode"));
    fill(zipcode,"60011");
	WebElement  country= driver.findElement(By.id("id_country"));
	Select x=new Select(country);
	x.selectByVisibleText("United States");
	WebElement additional = driver.findElement(By.id("other"));
	additional.sendKeys("please refer mail id");
	fill(m.getHomeNo(),"87878788787");
	fill(m.getPhNO(),"78976580653");
	WebElement register = driver.findElement(By.xpath("//span[text()='Register']"));
	register.click();
	
//login with new user credential
   Thread.sleep(3000);
	WebElement email = driver.findElement(By.id("email"));
	fill(email,"sabarirajendran26@gmail.com");
	
	WebElement password = driver.findElement(By.id("passwd"));
	fill(password,"Sabarinathan@12345");
	//To login
	WebElement sumit = driver.findElement(By.id("SubmitLogin"));
	sumit.click();
	
	//To select women selection
	WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
	women.click();
	Thread.sleep(2000);
	WebElement product1 = driver.findElement(By.xpath("//a[@title=\"Blouse\"]"));
	product1.click();
	driver.switchTo().frame(0);          
	WebElement adding = driver.findElement(By.xpath("//a[contains(@class,\"button-plus\")]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", adding);
	WebElement addtocart = driver.findElement(By.xpath("//p[@id=\"add_to_cart\"]//button[@type=\"submit\"]"));
	addtocart.click();
	Thread.sleep(1000);
	//proceed to check out
	WebElement proceed = driver.findElement(By.xpath("//a[contains(@title,\"Proceed to checkout\")]"));
	proceed.click();
	//proceed to check out
	WebElement signin = driver.findElement(By.xpath("//a[@title=\"Proceed to checkout\"]//span[text()='Proceed to checkout']"));
	signin.click();
	
	//procedd to checkout
	WebElement address = driver.findElement(By.xpath("//button[@class=\"button btn btn-default button-medium\"]"));
	address.click();
	Thread.sleep(2000);
	//To select this agree
	WebElement agree = driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
    agree.click();
	Thread.sleep(1000);
	//to select proceed checkout
	WebElement shipping= driver.findElement(By.xpath("//button[@class=\"button btn btn-default standard-checkout button-medium\"]"));
	shipping.click();
	//payment process
	WebElement payment = driver.findElement(By.xpath("//a[@title=\"Pay by bank wire\"]"));
	payment.click();
	//conform my order
	WebElement myorder = driver.findElement(By.xpath("//button[@class=\"button btn btn-default button-medium\"]"));
	myorder.click();
	//To select customerpage
	WebElement customerpage  = driver.findElement(By.xpath("//a[@title=\"View my customer account\"]"));
	customerpage.click();
	//order History and Details
	WebElement orderhistory = driver.findElement(By.xpath("//a[@title=\"Orders\"]"));
	orderhistory.click();
	

	
	
	
	
	
	
	
	
	
	
	

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}

