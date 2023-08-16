package Pramod.TheTestingAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SpiceJet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		WebElement from = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']"));
		Actions a = new Actions(driver);
		a.moveToElement(from).click().sendKeys(from, "Del").build().perform();
		WebElement to = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']"));
		a.moveToElement(to).sendKeys(to,"mum").build().perform();
		
		String monthYear = driver.findElement(By.cssSelector(".css-76zvg2.r-homxoj.r-adyw6z.r-1kfrs79")).getText();
		System.out.println(monthYear);
		String month = monthYear.split(" ")[0].trim();
		String year = monthYear.split(" ")[1].trim();		
		while(!(month.equals("October")&&year.equals("2023")))
		{
			driver.findElement(By.xpath("#main-container > div > div.css-1dbjc4n.r-14lw9ot > div.css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-vgw6uq.r-156q2ks.r-11ict49.r-8uuktl.r-136ojw6 > div.css-1dbjc4n.r-1pcd2l5.r-1uwte3a.r-m611by.r-bnwqim > div.css-1dbjc4n.r-19h5ruw.r-136ojw6 > div > div.css-1dbjc4n.r-1niwhzg.r-z2wwpe.r-17b9qp5.r-1g94qm0.r-h3f8nf.r-u8s1d.r-u3yave.r-8fdsdq > div.css-1dbjc4n.r-14lw9ot.r-11u4nky.r-rs99b7.r-6koalj.r-eqz5dr.r-1pi2tsx.r-pm9dpa.r-1knelpx.r-13qz1uu > div.r-1loqt21.r-u8s1d.r-11xbo3g.r-1v2oles.r-1otgn73.r-16zfatd.r-1i6wzkk.r-lrvibr.r-184en5c.css-1dbjc4n > svg")).click();
			monthYear = driver.findElement(By.cssSelector(".css-76zvg2.r-homxoj.r-adyw6z.r-1kfrs79")).getText();
			System.out.println(monthYear);
			String month1 = monthYear.split(" ")[0].trim();
			String year1 = monthYear.split(" ")[1].trim();	
		}
		
		

	}

}
