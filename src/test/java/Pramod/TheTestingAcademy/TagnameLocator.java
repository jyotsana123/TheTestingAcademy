package Pramod.TheTestingAcademy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TagnameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://app.vwo.com/#/login");
		List<WebElement> allInput = driver.findElements(By.tagName("a"));
		for(WebElement w :allInput)
		{
			try {
			System.out.println(w.getText());
			
			
			if(w.getText().contains("Start"))
			{
				w.click();
			}
			
			}
			catch(Exception e)
			{
				System.out.println(e);
				
			}
		}
		
		Assert.assertEquals(driver.getTitle(), "Get Started with Free Trial | VWO");
	}

}
