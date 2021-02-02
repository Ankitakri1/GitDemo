package DemoBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		
		launchBrowser();
		//enter username
		driver.findElement(By.name("uid")).sendKeys("mngr306727");
		driver.findElement(By.name("password")).sendKeys("emAruhE");
		driver.findElement(By.name("btnLogin")).click();

		
		//verify login successful
		
		String expectTitle = "Guru99 Bank Manager HomePage";
		
		
		
		if(expectTitle.equals(driver.getTitle())) {
			System.out.println("Login Successful");
		}
		
		else {
			System.out.println("Login unsuccessful");
		}
	}
	
	public static void launchBrowser() {
		//setup Chrome driver
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\nktkm\\Downloads\\chromedriver_win32" + 
						 "\\chromedriver.exe");
				
				driver = new ChromeDriver();
				String baseUrl = "http://www.demo.guru99.com/V4/";
				
				//launch the browser
				driver.get(baseUrl);
	}
}
