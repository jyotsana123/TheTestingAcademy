package Pramod.TheTestingAcademy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://awesomeqa.com/webtable.html");
		
		//print adobe country
		List<WebElement> comp = driver.findElements(By.xpath("//tr/td[1]"));
		for(int i=0;i<comp.size();i++)
		{
			String company = comp.get(i).getText();
			System.out.println(company);
			if(company.contains("Adobe"))
			{
				System.out.println(driver.findElements(By.xpath("//tr/td[3]")).get(i).getText());
				//List<WebElement> com=driver.findElements(By.xpath("//tr/td[3]"));)
			}
		}
		
		//print every company countries
		
		List<WebElement> com = driver.findElements(By.xpath("//tr/td[1]"));
		for(int i=0;i<com.size();i++)
		{
			String company1 = com.get(i).getText();
			String country = driver.findElements(By.xpath("//tr/td[3]")).get(i).getText();
			System.out.println(company1+" - "+country);
		}
			
	}

}
