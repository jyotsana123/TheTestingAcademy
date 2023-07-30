package Pramod.TheTestingAcademy;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//https://www.youtube.com/watch?v=3liZaog-xXM  - link
//https://www.youtube.com/watch?v=6NXZQYs-Eig&t=10s   - image

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.hyrtutorials.com/");
		driver.get("https://propftxdev.iworklab.com/");
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println(linksList.size());
		try {
		for(WebElement links :linksList)
		{
			String link = links.getAttribute("href"); //this is returning link address which I am storing in link which is string type
			URL url = new URL(link); //here we create link in URL from string link
			//open connection to the server url.openConnection(); and it return object of URLConnection
			URLConnection urlConnection = url.openConnection();
			//send http request to the server after opening the connection
			HttpsURLConnection httpsURLConnection = (HttpsURLConnection) urlConnection; //by casting 'urlConnection' convert into 'httpURLConnection' object 
			                                                                         //HttpURLConnection is abstract class
			//we need to use timeout because it takes some time to send the request due to internet speed
			httpsURLConnection.setConnectTimeout(5000);
			//now we can send request to the server
			httpsURLConnection.connect();
			//verify server response
			if(httpsURLConnection.getResponseCode()==200)
			{
				System.out.println(link+" - "+httpsURLConnection.getResponseCode()+" - "+httpsURLConnection.getResponseMessage());
				
			}
			else
			{
				System.err.println(link+" - "+httpsURLConnection.getResponseCode()+" - "+httpsURLConnection.getResponseMessage());
			}
			httpsURLConnection.disconnect();		
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}

//when you click on any link, it will create request to the server and then server will try to indentify the webpage
//if the webpage is found it will return response to the web page, if webpage is not found it will send response in error code.
//with the response code we identify whether this is the broken link or proper link.

/* 1. Collect all the links present on a web page based on the <a> tag
2. Send HTTP request for each link
3. Verify the HTTP response code
4. Determine if the link is valid or broken based on the HTTP response code
5. Repeat the process for all links captured with the first step */