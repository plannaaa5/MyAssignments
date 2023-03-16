package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditLead {

	/*http://leaftaps.com/opentaps/control/main
	
	* 1	Launch the browser
	* 2	Enter the username
	* 3	Enter the password
	* 4	Click Login
	* 5	Click crm/sfa link
	* 6	Click Leads link
	* 7	Click Find leads
	* 8	Enter first name
	* 9	Click Find leads button
	* 10 Click on first resulting lead // NEED HELP
	* 11 Verify title of the page
	* 12 Click Edit
	* 13 Change the company name
	* 14 Click Update
	* 15 Confirm the changed name appears
	* 16 Close the browser (Do not log out)
*/
	
	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//form[@method='POST']//input[@name='firstName'])[3]")).sendKeys("Ann");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='x-panel-btns x-panel-btns-center']//button[@class='x-btn-text'])[5]")).click();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[text()='11050']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Org name");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());
		driver.close();

	}

}
