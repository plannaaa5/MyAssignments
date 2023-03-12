package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class WebElementActions {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();  //launch latest chrome driver version
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);  // launch chrome browser
		driver.get("http://leaftaps.com/opentaps");	//load URL	
		driver.findElement(By.id("username")).sendKeys("demoSalesManager"); // enter user name
		driver.findElement(By.id("password")).sendKeys("crmsfa"); // enter psswd
		driver.findElement(By.className("decorativeSubmit")).click(); // click login
		driver.findElement(By.partialLinkText("CRM/SFA")).click(); // click CRM/SFA link
		driver.findElement(By.linkText("Leads")).click();  // click leads
		driver.findElement(By.linkText("Create Lead")).click(); // click create lead
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Duplead Co"); // enter Co.name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("FName"); // enter Fname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lname"); // enter Lname
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId")); // dropdown 
		Select sec = new Select(source);
		sec.selectByIndex(4);  // select by Index
		WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId")); // dropdown 
		Select Market = new Select(market);
		Market.selectByVisibleText("Automobile"); // select by Visible Text
		WebElement corp = driver.findElement(By.id("createLeadForm_ownershipEnumId")); // dropdown 
		Select Corp = new Select(corp);
		Corp.selectByValue("OWN_CCORP"); // select by Visible Text
		driver.findElement(By.name("submitButton")).click(); // click submit
		String title = driver.getTitle();	// get title
		System.out.println(title);
		
	}
 
}
