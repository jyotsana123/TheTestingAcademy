package Pramod.TheTestingAcademy;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//in selenium version > 4 you no need to set up the browser properties
	//	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // ---> launching browser
		driver.get("https://sdet.live");
		
	}

}
