package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();  // load latest Chrome Driver version
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);  // launch Chrome browser
		driver.get("http://leaftaps.com/opentaps/control/login");	//load URL	
		driver.findElement(By.id("username")).sendKeys("DemoCSR"); // enter user name
		driver.findElement(By.id("password")).sendKeys("crmsfa"); // enter psswd
		driver.findElement(By.className("decorativeSubmit")).click(); // click login
		driver.findElement(By.partialLinkText("CRM/SFA")).click(); // click CRM/SFA link
		driver.findElement(By.linkText("Leads")).click();  // click leads
		driver.findElement(By.linkText("Create Lead")).click(); // click create lead
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Duplead Co"); // enter Co.name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("FName"); // enter Fname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lname"); // enter Lname
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("FName local"); // enter Fname local
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Finance"); // enter Dept
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Desc"); // enter Desc
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hello@gmail.com"); // enter email
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")); // dropdown
		Select sec = new Select(state);  // dropdown inside Select tag in DOM
		sec.selectByVisibleText("New York"); // select by Visible Text
		driver.findElement(By.name("submitButton")).click(); // click create button
		String title = driver.getTitle();	// get title
		System.out.println(title);
		driver.findElement(By.linkText("Duplicate Lead")).click(); // click duplicate lead button
		driver.findElement(By.id("createLeadForm_companyName")).clear(); // clear Co. name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("New Co Name"); // Enter new Co.name
		driver.findElement(By.id("createLeadForm_firstName")).clear(); // clear Fname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("New Fname"); // New Fname
		driver.findElement(By.name("submitButton")).click(); // click create lead button
		String title1 = driver.getTitle();	// get title
		System.out.println(title1);
				
	}

}
