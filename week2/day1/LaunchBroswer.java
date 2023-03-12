package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBroswer {

	public static void main(String[] args) {
		
		//In case Chrome version is changed, ChromeOptions to be run as below
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        // to launch browser
        ChromeDriver driver = new ChromeDriver(options);
		//ChromeDriver driver = new ChromeDriver();
		// to load URL
        driver.get("https://www.amazon.com/");
        // to maximize window
		driver.manage().window().maximize();
		// to close window
		driver.close();
			

	}

}
