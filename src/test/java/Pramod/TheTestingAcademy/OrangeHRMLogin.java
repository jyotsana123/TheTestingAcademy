package Pramod.TheTestingAcademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class OrangeHRMLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Hacker@4321");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://awesomeqa.com/hr/web/index.php/pim/viewEmployeeList");
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		
		driver.findElement(By.cssSelector(".orangehrm-firstname")).sendKeys("Jyotsana");
		driver.findElement(By.cssSelector(".orangehrm-lastname")).sendKeys("Pandey");
		//driver.findElement(By.cssSelector(".employee-image-action")).sendKeys("C:/Users/dell/Pictures/jyo.png");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h6[text()='Personal Details']"))));
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
