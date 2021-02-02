package DemoBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//enter username
		driver.findElement(By.name("uid")).sendKeys("mngr306727");
		
		//enter password
		driver.findElement(By.name("password")).sendKeys("emAruhE");
		
		//click login
		driver.findElement(By.name("btnLogin")).click();
		
		//verify login successful	
	}
	
	public WebDriver launchBrowser(WebDriver driver) {
		//setup Chrome driver
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\nktkm\\Downloads\\chromedriver_win32" + 
						 "\\chromedriver.exe");
				driver = new ChromeDriver();
				String baseUrl = "http://www.demo.guru99.com/V4/";
				
				//launch the browser
				driver.get(baseUrl);
				return driver;
	}
	
	
}
