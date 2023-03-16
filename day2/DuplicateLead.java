package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DuplicateLead {

	
	/*http://leaftaps.com/opentaps/control/main
	 
	1	Launch the browser
	2	Enter the username
	3	Enter the password
	4	Click Login
	5	Click crm/sfa link
	6	Click Leads link
	7	Click Find leads
	8	Click on Email
	9	Enter Email
	10	Click find leads button
	11	Capture name of First Resulting lead
	12	Click First Resulting lead
	13	Click Duplicate Lead
	14	Verify the title as 'Duplicate Lead'
	15	Click Create Lead
	16	Confirm the duplicated lead name is same as captured name
	17	Close the browser (Do not log out)
	
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
		driver.findElement(By.linkText("Email")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("emailAddress")).sendKeys("abc@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//td[@class='x-btn-center'])[6]")).click(); // click find lead by Indexing
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText()); // capture name of first lead
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click(); // check first lead
		driver.findElement(By.linkText("Duplicate Lead")).click();  // click duplicate lead
		System.out.println(driver.getTitle());  // verify title
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.findElement(By.id("viewLead_firstName_sp")).getText()); // verify duplicate name same
//		driver.close();
	}

}
