package Pramod.TheTestingAcademy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TagnameLocator3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://app.vwo.com/#/login");
		System.out.println(driver.findElements(By.tagName("a")).size());
		List<WebElement> allInput = driver.findElements(By.tagName("a"));
		for(WebElement w :allInput)
		{
	        System.out.println(w.getText());
			//System.out.println(link);
			
			
			if(w.getText().contains("Start a free trial"))
			{
				w.click();
				break;  //without break it gives StaleElementReference Exception
			
			}
			
			
		}
		
		//Assert.assertEquals(driver.getTitle(), "Get Started with Free Trial | VWO");
	}

}
