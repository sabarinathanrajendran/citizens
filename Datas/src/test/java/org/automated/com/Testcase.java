package org.automated.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase {
	public static void main(String[] args) throws IOException, InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\R SABRINATHAN\\eclipse1-workspace\\Datas\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("http://automationpractice.com/index.php?controller=authentication");
    driver.manage().window().maximize();
    Wait m=new WebDriverWait(driver,50);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	File f=new File("C:\\Users\\R SABRINATHAN\\eclipse1-workspace\\Datas\\Reports\\Book5.xls");
	FileInputStream stream=new FileInputStream(f);
	Workbook b=new HSSFWorkbook(stream);
	Sheet sheet = b.getSheetAt(0);
	Row row=sheet.getRow(1);
	Cell cell=row.getCell(0);
	System.out.println(cell);
	//cell.toString();
	cell.setCellType(cell.CELL_TYPE_STRING);
	driver.findElement(By.id("email")).sendKeys(cell.getStringCellValue().toString());
	
	//String valueOf = String.valueOf(b.getSheetAt(0).getRow(1).getCell(1).getNumericCellValue());
	//driver.findElement(By.id("passwd")).sendKeys(cell.toString());
	
    String email = sheet.getRow(1).getCell(1).getStringCellValue();
    System.out.println(email);
	driver.findElement(By.id("passwd")).sendKeys(email);
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
		Thread.sleep(2000);
		//proceed to check out
		WebElement proceed = driver.findElement(By.xpath("//a[contains(@title,\"Proceed to checkout\")]"));
		proceed.click();
		//proceed to check out
		WebElement signin = driver.findElement(By.xpath("//a[@title=\"Proceed to checkout\"]//span[text()='Proceed to checkout']"));
		signin.click();
		
		//procedd to checkout
		WebElement address = driver.findElement(By.xpath("//button[@class=\"button btn btn-default button-medium\"]"));
		address.click();
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
	

