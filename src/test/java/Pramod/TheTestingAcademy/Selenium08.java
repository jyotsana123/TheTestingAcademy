package Pramod.TheTestingAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://app.vwo.com/#/login");
//		WebElement id = driver.findElement(By.id("login-username"));
//		id.sendKeys(args)
		driver.findElement(By.id("login-username")).sendKeys("93npu2yyb0@esiix.com");
		driver.findElement(By.name("password")).sendKeys("Wingify@123");
		driver.findElement(By.className("btn--positive")).click();
		driver.quit();
	}

}
