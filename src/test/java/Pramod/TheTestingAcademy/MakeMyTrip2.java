package Pramod.TheTestingAcademy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MakeMyTrip2 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);

		Actions actions = new Actions(driver);
		actions.click().build().perform();
		Thread.sleep(2000);
		actions.click().build().perform();

		fromCity();
		toCity();
		selectDepartureDate();
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".journey-title"))));
		String text = driver.findElement(By.cssSelector(".journey-title")).getText();
		Assert.assertEquals(text, "Flights from New Delhi to Mumbai");
		
		

	}

	public static void fromCity() {
		// from city
		driver.findElement(By.cssSelector("label[for='fromCity']")).click();
		driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys("new");
		List<WebElement> opt = driver.findElements(By.className("calc60"));
		try {
			for (int i = 0; i < opt.size(); i++) {
				String option = opt.get(i).getText();
				System.out.println(option);
				if (option.contains("New Delhi")) {
					driver.findElements(By.className("calc60")).get(i).click();

				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void toCity() {
		// to city
		driver.findElement(By.cssSelector("label[for='toCity']")).click();
		driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys("mum");
		List<WebElement> opt = driver.findElements(By.className("calc60"));
		try {
			for (int i = 0; i < opt.size(); i++) {
				String option = opt.get(i).getText();
				System.out.println(option);
				if (option.contains("Mumbai")) {
					driver.findElements(By.className("calc60")).get(i).click();

				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void selectDepartureDate()
	{
		String monthYear = driver.findElement(By.className("DayPicker-Caption")).getText();
		System.out.println(monthYear);
		String month = monthYear.split(" ")[0].trim();
		String year = monthYear.split(" ")[1].trim();
		while(!(month.equals("August") && year.equals("2023")))
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			monthYear = driver.findElement(By.className("datepicker-switch")).getText();
			System.out.println(monthYear);
			month = monthYear.split(" ")[0].trim();
			year = monthYear.split(" ")[1].trim();
		} 
		driver.findElement(By.xpath("//p[text()='31']")).click();
	}

}
