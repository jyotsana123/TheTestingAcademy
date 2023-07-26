package Pramod.TheTestingAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCloseBrowser2 {

	WebDriver driver = new ChromeDriver(); 
	
	/*  using WebDriver driver = new ChromeDriver(); 
	 * offers more flexibility, maintainability, and reusability in your Selenium code.
	 * 
	 * 
	 * 
	 * Using ChromeDriver driver = new ChromeDriver(); is technically possible and will work in most cases. 
	 * However, it's generally recommended to use WebDriver driver = new ChromeDriver(); instead, and there are good reasons for doing so:

       1. Polymorphism and Abstraction: By using WebDriver instead of ChromeDriver, you are programming to an interface (WebDriver) rather than a concrete implementation (ChromeDriver). This follows the principle of polymorphism and abstraction, making your code more flexible and easier to maintain. If you later decide to switch to a different browser or driver implementation, you can do so with minimal changes to your code.

      2. Code Reusability: If you use the WebDriver interface, your code becomes more reusable. For example, if you have different parts of your code that use different drivers (e.g., ChromeDriver, FirefoxDriver, etc.), you can easily refactor them to use a common interface, such as WebDriver, to simplify the codebase.

      3. Testing with Multiple Browsers: If you design your code to use WebDriver instead of ChromeDriver, you can easily write tests that are browser-agnostic. This means you can run your tests on different browsers (e.g., Chrome, Firefox, Safari, etc.) by just changing the driver instantiation, without modifying the rest of the test logic.
      
      4. Interface Segregation: The WebDriver interface provides a clear set of methods that define how to interact with a web browser, without being tied to the implementation details of any specific driver. This adheres to the Interface Segregation Principle, promoting a more modular and maintainable design.
	 */
	
	@Test
	public void openClosebrowser()
	{
		
		
		driver.get("https://sdet.live");
		System.out.println(driver.getCurrentUrl());
	}
		
	

}
