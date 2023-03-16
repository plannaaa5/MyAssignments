package week2.day2;

import java.util.List;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FBAssgn1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();  // load latest Chrome driver version
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);  // launch Chrome browser
		driver.get("https://en-gb.facebook.com/");  // load URL
		driver.manage().window().maximize();  // maximize window
		//driver.manage().timeouts().implicitlyWait(Duration, 30);
		driver.findElement(By.xpath("//div[@class='_6ltg']/a[@data-testid='open-registration-form-button']")).click(); // click create new button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_5dbb']/input")).sendKeys("Fname"); // enter First name
		driver.findElement(By.xpath("//div[@class='placeholder']/following-sibling::input")).sendKeys("Lname");  // enter Surname
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("1234567809"); // enter mob #
		driver.findElement(By.id("password_step_input")).sendKeys("psswd");  // enter psswd
		WebElement date = driver.findElement(By.id("day"));  // find dropdown element
		Select sel = new Select(date);  // create Select class
		List<WebElement> list = sel.getOptions();  // list dropdown options
		for (int i = 1; i < list.size()+1; i++) {  // Loop & click correct dropdown option
			Thread.sleep(100);    // add thread.sleep
			if (i == 18) {
				list.get(i).click();
			}
		}
		WebElement mon = driver.findElement(By.id("month"));
		Select selm = new Select(mon);
		List<WebElement> listm = selm.getOptions();
		for (int i = 1; i < listm.size()+1; i++) {
			Thread.sleep(100);
			if (i == 2) {
				listm.get(i).click();
			}
		}
		
		//Select test = new Select (driver.findElement(By.id("year")));
		// test.selectByValue("1981");
		
		WebElement yr = driver.findElement(By.id("year"));
		Select sely = new Select(yr);
		List<WebElement> listy = sely.getOptions();
		for (int i = 1; i < listy.size()+1; i++) {
			Thread.sleep(100);
			if (i == 42) {
				listy.get(i).click();
			}
		}
		
		driver.findElement(By.name("sex")).click();  // select radio button
	}

}
