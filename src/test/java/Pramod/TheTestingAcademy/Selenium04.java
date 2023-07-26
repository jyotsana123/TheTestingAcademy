package Pramod.TheTestingAcademy;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://chromedriver.chromium.org/capabilities

		//Change window size
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--window-size=1280,800");
		//option.addArguments("--start-maximized");  ------> maximize the window
		//option.addArguments("--disable-extensions");
		//option.addArguments("--disable-notifications");
		//option.addArguments("--disable-javascript");
		//option.addArguments("--lang=hi"); --> Set a specific language for the browser
		//option.addArguments("--download.default_directory=C:\Users\dell\Downloads\");  --> Set the download directory
		//option.addArguments("--disable-password-manager")  --> disable chrome's password manager
		
		WebDriver driver = new ChromeDriver(option); // ---> launching browser
		driver.get("https://sdet.live");
		System.out.println(driver.getTitle());
		
	}

}

