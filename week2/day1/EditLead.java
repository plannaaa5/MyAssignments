package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();     //load latest Chrome driver version
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);  // Launch Chrome browser
		driver.get("http://leaftaps.com/opentaps/control/login");  // load URL
		driver.findElement(By.id("username")).sendKeys("DemoCSR"); // Enter User name
		driver.findElement(By.id("password")).sendKeys("crmsfa");  // Enter psswd
		driver.findElement(By.className("decorativeSubmit")).click(); // Click login
		driver.findElement(By.partialLinkText("CRM/SFA")).click(); // click CRM/SFA link
		driver.findElement(By.linkText("Leads")).click();  // click leads button
		driver.findElement(By.linkText("Create Lead")).click(); // click create lead
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("EditLead Co"); // Enter Co.name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("First name"); // Enter Fname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Last name"); // Enter Lname
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("EditLead local"); // Fname local
		driver.findElement(By.name("departmentName")).sendKeys("Accs"); // Enter Dept
		driver.findElement(By.name("description")).sendKeys("Desc sample"); // Enter Desc
		driver.findElement(By.name("primaryEmail")).sendKeys("sample@gmail.com"); // Enter mail id
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")); // dropdown
		Select sec = new Select(state);  // dropdown inside Select tag in DOM
		sec.selectByVisibleText("New York"); // select by Visible Text
		driver.findElement(By.name("submitButton")).click(); // Click submit
		driver.findElement(By.linkText("Edit")).click(); // click edit button
		driver.findElement(By.id("updateLeadForm_description")).clear(); // clear Desc
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Imp note"); // update Note
		driver.findElement(By.name("submitButton")).click();  // click update
		String title = driver.getTitle(); // get Title
		System.out.println(title);

	}
 
}
