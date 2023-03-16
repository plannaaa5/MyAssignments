package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	
	
	/* Step 1. Launch URL "http://leaftaps.com/opentaps/control/login"
	Step 2. Enter UserName and Password Using Id Locator
	Step 3. Click on Login Button using Class Locator
	Step 4. Click on CRM/SFA Link
	Step 5. Click on contacts Button
	Step 6. Click on Create Contact
	Step 7. Enter FirstName Field Using id Locator
	Step 8. Enter LastName Field Using id Locator
	Step 9. Enter FirstName(Local) Field Using id Locator
	Step 10. Enter LastName(Local) Field Using id Locator
	Step 11. Enter Department Field Using any Locator of Your Choice
	Step 12. Enter Description Field Using any Locator of your choice 
	Step 13. Enter your email in the E-mail address Field using the locator of your choice
	Step 14. Select State/Province as NewYork Using Visible Text
	Step 15. Click on Create Contact
	Step 16. Click on edit button 
	Step 17. Clear the Description Field using .clear
	Step 18. Fill ImportantNote Field with Any text
	Step 19. Click on update button using Xpath locator
	Step 20. Get the Title of Resulting Page.  */
	
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();  // load latest Chrome driver version
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);  // launch chrome browser
		driver.get("http://leaftaps.com/opentaps/control/login");  // load URL
		driver.manage().window().maximize();  // maximize
		driver.findElement(By.id("username")).sendKeys("Democsr");  //enter username
		driver.findElement(By.id("password")).sendKeys("crmsfa"); // enter psswd
		driver.findElement(By.className("decorativeSubmit")).click(); // click login
		driver.findElement(By.linkText("CRM/SFA")).click();  // click CRM/SFA link
		driver.findElement(By.linkText("Contacts")).click();  // click contact
		driver.findElement(By.linkText("Create Contact")).click();  // click create button
		driver.findElement(By.id("firstNameField")).sendKeys("Fname"); 
		driver.findElement(By.id("lastNameField")).sendKeys("Lname");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Floc");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Lloc");
		driver.findElement(By.name("departmentName")).sendKeys("Dept");
		driver.findElement(By.name("description")).sendKeys("Desc");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abc@gmail.com");
		WebElement stat = driver.findElement(By.name("generalStateProvinceGeoId")); // find dropdown element
		Select state = new Select (stat);  // create Select Class 
		state.selectByVisibleText("New York");  // drop down selection by Visible Text
		driver.findElement(By.name("submitButton")).click(); // click create contact
		driver.findElement(By.linkText("Edit")).click(); // click edit
		driver.findElement(By.name("description")).clear(); // clear desc
		driver.findElement(By.name("importantNote")).sendKeys("Imp Note");
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input[@name='submitButton']")).click();  // click update
		System.out.println(driver.getTitle()); // get title
	}

}
