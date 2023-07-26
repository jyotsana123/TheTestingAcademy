package Pramod.TheTestingAcademy;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/* There is three type of PageLoad Strategy -> it's gives the strategy to load the pages.
		Page load strategy -> normal, eager, none
       1. Normal: it's wait for complete page to load
       2. eager: DOM or page is ready to access, but other resources like images are still loading
       3. none: doesn't block webdriver at all 
		
		By default it's normal */
       
		ChromeOptions option = new ChromeOptions();
//		option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//		option.setPageLoadStrategy(PageLoadStrategy.EAGER);
		option.setPageLoadStrategy(PageLoadStrategy.NONE);   //---> NONE is faster than other two normal and eager
		WebDriver driver = new ChromeDriver(option); // ---> launching browser
		driver.get("https://app.vwo.com/#/login");
		System.out.println(driver.getTitle());
		
	}

}
