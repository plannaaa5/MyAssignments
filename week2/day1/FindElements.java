package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElements {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();   // to launch Chrome browser
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://leaftaps.com/opentaps/control/main"); // to load URL
        driver.manage().window().maximize(); // to maximize browser
        driver.findElement(By.id("username")).sendKeys("DemoCSR");  // enter Username
        driver.findElement(By.id("password")).sendKeys("crmsfa");   // enter password
        driver.findElement(By.className("decorativeSubmit")).click(); // click Login
        driver.findElement(By.partialLinkText("CRM/SFA")).click();  // click hyperlink
        driver.findElement(By.linkText("Leads")).click();  // click leads
        driver.findElement(By.linkText("Create Lead")).click();   // click create leads
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CoName"); // enter Company name
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("FName");  // enter First name
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("LName");  // enter Last name
        driver.findElement(By.name("submitButton")).click();  // click submit 
        
	}
 
}
