package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();  // load latest Chrome driver version
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);  // launch Chrome browser
		driver.get("http://leaftaps.com/opentaps/control/login"); //load URL
		driver.findElement(By.id("username")).sendKeys("DemoCSR"); // enter Username
		driver.findElement(By.id("password")).sendKeys("crmsfa"); // enter password 
		driver.findElement(By.className("decorativeSubmit")).click(); // click Login
		driver.findElement(By.partialLinkText("CRM/SFA")).click();  // click CRM/SFA link
		driver.findElement(By.linkText("Leads")).click(); // click leads button
		driver.findElement(By.linkText("Create Lead")).click(); // click create lead
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC Company"); // enter Co.name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arvind"); // enter First name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar"); // enter Last name
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Arav"); // Fname local
		driver.findElement(By.name("departmentName")).sendKeys("Accounts"); // enter Dept
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Sample for Demo"); // enter Desc
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com"); // enter email
		WebElement state =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")); // dropdown
		Select sec = new Select(state); // drop down inside Select tag in DOM
		sec.selectByVisibleText("New York");  // Select by Visible text
		driver.findElement(By.name("submitButton")).click(); // click submit
		String title = driver.getTitle();  // get Title
		System.out.println(title);
	}

}
