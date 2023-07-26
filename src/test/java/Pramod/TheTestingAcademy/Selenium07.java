package Pramod.TheTestingAcademy;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--starts-maximized");
		WebDriver driver = new ChromeDriver(option); // ---> launching browser
		driver.get("https://sdet.live");
		System.out.println(driver.getTitle());
		driver.close();
		System.out.println(driver.getTitle());
		
		
	/*	Close - it will close the current window only, session it will still exist in this , Error will be invalid session id
		Quit - session id is null, close all the window, error will be session id not exist   */
		
	}

}


