package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicXPath {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();  // load latest Chrome driver version
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);  // launch Chrome browser
		driver.get("http://leaftaps.com/opentaps/control/login"); //load URL
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager"); // enter Username
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa"); // enter password 
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click(); // click Login
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();  // click CRM/SFA link
		driver.findElement(By.xpath("//a[text()='Leads']")).click(); // click leads button
		

	}

}
