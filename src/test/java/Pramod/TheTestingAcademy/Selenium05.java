package Pramod.TheTestingAcademy;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Add multiple extesion to chrome -> addblocker & lightshot
		//Path of addblocker -> C:\Users\dell\Downloads\AddBlocker.crdownload
		//Path of lightshot -> C:\Users\dell\Downloads\lightshot.crdownload
		
		
		List<File> extension = new ArrayList<>();
		extension.add(new File("C:/Users/dell/Downloads/AddBlocker.crdownload"));
		extension.add(new File("C:/Users/dell/Downloads/lightshot.crdownload"));
		ChromeOptions option = new ChromeOptions();
		option.addExtensions(extension);
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