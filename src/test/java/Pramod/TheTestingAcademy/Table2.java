package Pramod.TheTestingAcademy;

import java.util.List;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//delete Doe data from table 1 

public class Table2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables#edit");
		List<WebElement> name = driver.findElements(By.cssSelector("#table1 td:nth-child(1)"));
		
		for(int i=0;i<name.size();i++)
		{
			String lname = name.get(i).getText();
			System.out.println(lname);
			if(lname.contains("Doe"))
			{
				driver.findElements(By.xpath("//a[text()='delete']")).get(i).click();
				break;
			}
		}
	}

}
