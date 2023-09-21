package Pramod.TheTestingAcademy;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowClick2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/windows");
		int size =driver.findElements(By.tagName("a")).size();
		System.out.println(size);
		
		//4. Click on each link in the column to check link is working
		 for(int i=1; i<size; i++)
		 {
			 String clickonlinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			 driver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			 Thread.sleep(2000);
		 }
		 
		 switchToMyWindow(3);
		 
	}
		 
		 //5. Give me the title of 5th link
		 public static void switchToMyWindow(int index)
		 {
		 String winId = null;
		 Set<String> window = driver.getWindowHandles();
			Iterator<String> it = window.iterator();
			for(int i=0;i<=index;i++)
			{
				winId = it.next();
			}
			driver.switchTo().window(winId);
			System.out.println("Title is: "+driver.switchTo().window(winId).getTitle());
		 }
			

	}


