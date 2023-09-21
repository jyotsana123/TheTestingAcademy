package Pramod.TheTestingAcademy;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowClick {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//give me link count of webpage
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2. Give me the count of links which present only in footer section
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		//3. Give me the link count of 1st column in footer section
		WebElement coloumn = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumn.findElements(By.tagName("a")).size());
		
		//4. Click on each link in the column to check link is working
		 for(int i=1; i<coloumn.findElements(By.tagName("a")).size(); i++)
		 {
			 String clickonlinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			 coloumn.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			 Thread.sleep(2000);
		 }
		 
		 switchToMyWindow(1);
		 
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


