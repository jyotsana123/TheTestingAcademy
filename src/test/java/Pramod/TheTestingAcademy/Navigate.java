package Pramod.TheTestingAcademy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Navigate {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://sdet.live");
		driver.navigate().to(new URL("https://google.com"));
		//to() is overloaded method, in one we pass string url and in other we pass URL
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.navigate().forward();
		
		

	}

}

/* navigate() method returns the object of RemoteNavigation class
 * RemoteNavigation class implements the methods of Navigation interface -> back(), forward(), to(), refresh()
 */

/* In Selenium, Navigation navigate() is a method available in the WebDriver interface that returns an instance of the WebDriver.Navigation interface. 
 * It provides a way to control and perform various navigation actions in the web browser, 
 * such as opening URLs, navigating back and forward, and refreshing the current page.  
 */