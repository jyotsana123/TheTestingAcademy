package Pramod.TheTestingAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//in selenium version > 4 you no need to set up the browser properties
	//	WebDriverManager.chromedriver().setup();
		
		//this will run your test in headless mode, test running in background without showing UI
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(option); // ---> launching browser
		driver.get("https://sdet.live");
		System.out.println(driver.getTitle());
		
	}

}
