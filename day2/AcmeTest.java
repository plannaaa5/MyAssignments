package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AcmeTest {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();  // load latest Chrome driver version
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);  // launch chrome browser
		driver.get("https://acme-test.uipath.com/login");  // load URL
		driver.manage().window().maximize();  // maximize
		driver.findElement(By.name("email")).sendKeys("kumar.testleaf@gmail.com");  //enter username
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("leaf@12"); // enter psswd
		driver.findElement(By.xpath("//form/button")).click(); // click login
		Thread.sleep(1000);
		System.out.println(driver.getTitle());  // get title
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log Out")).click();  // logout
		Thread.sleep(1000);
		driver.close(); 

	}

}
