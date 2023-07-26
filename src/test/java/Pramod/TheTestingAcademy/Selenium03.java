package Pramod.TheTestingAcademy;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Add addblocker extesion to chrome 
		//Path of addblocker -> C:\Users\dell\Downloads\AddBlocker.crdownload
		
		ChromeOptions option = new ChromeOptions();
		option.addExtensions(new File ("C:/Users/dell/Downloads/AddBlocker.crdownload"));
		WebDriver driver = new ChromeDriver(option); // ---> launching browser
		driver.get("https://sdet.live");
		System.out.println(driver.getTitle());
		
	}

}


/*  Steps to download Abbbloker extension in your system
1. search chrome extension downloader
2. open CRXExtractor
3. Open chrome web store
4. search add blocker
5. Open 
6. Copy the extension link
7. Paste in CRXExtractor -> let's start -> paste -> ok -> get .crx -> it will download in your machine
8. Copy the file path of add blocker file
9. paste in the addExtensions method argument */