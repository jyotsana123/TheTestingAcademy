package Pramod.TheTestingAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		String msg = driver.findElement(By.id("result")).getText();
		Assert.assertEquals(msg, "You successfully clicked an alert");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss();
		String msg1 = driver.findElement(By.id("result")).getText();
		Assert.assertEquals(msg1, "You clicked: Cancel");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		driver.switchTo().alert().sendKeys("I am Jyotsana Pandey");
		driver.switchTo().alert().accept();
		String msg2 = driver.findElement(By.id("result")).getText();
		Assert.assertEquals(msg2, "You entered: I am Jyotsana Pandey");
		

	}

}
