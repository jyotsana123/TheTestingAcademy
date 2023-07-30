package Pramod.TheTestingAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class KatalonLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.findElement(By.linkText("Make Appointment")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/profile.php#login");
		driver.findElement(By.name("username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");
	}

}
