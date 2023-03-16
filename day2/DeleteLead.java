package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {
	
	/*  Step 1: Launch the browser
		Step 2	Enter the username
		Step 3	Enter the password
		Step 4	Click Login
		Step 5	Click crm/sfa link
		Step 6	Click Leads link
		Step 7	Click Find leads
		Step 8	Click on Phone
		Step 9	Enter phone number
		Step 10	Click find leads button
		Step 11	Capture lead ID of First Resulting lead
		Step 12	Click First Resulting lead
		Step 13	Click Delete
		Step 14	Click Find leads
		Step 15	Enter captured lead ID
		Step 16	Click find leads button
		Step 17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		Step 18	Close the browser (Do not log out)
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
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("");
		driver.findElement(By.name("phoneAreaCode")).sendKeys("044");
		driver.findElement(By.name("phoneNumber")).sendKeys("1234567809");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText()); // capture first lead
		String firstLeadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click(); // click first lead
		driver.findElement(By.className("subMenuButtonDangerous")).click(); // click delete
		Thread.sleep(1000);
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("id")).sendKeys(firstLeadId);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[6]")).click();
		driver.close();
		
	}

}
