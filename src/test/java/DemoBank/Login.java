package DemoBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	static WebDriver driver;
	

<<<<<<< HEAD
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nktkm\\Downloads\\chromedriver_win32" + 
				 "\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.demo.guru99.com/V4/");
=======
	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser();
		//enter username
>>>>>>> 31d22bb84adbae9ad085338ad791ea5916ebfd32
		driver.findElement(By.name("uid")).sendKeys("mngr306727");
		driver.findElement(By.name("password")).sendKeys("emAruhE");
		driver.findElement(By.name("btnLogin")).click();
<<<<<<< HEAD
=======
		
		//verify login successful	
	}
	
	public static void launchBrowser() {
		//setup Chrome driver
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\nktkm\\Downloads\\chromedriver_win32" + 
						 "\\chromedriver.exe");
				
				driver = new ChromeDriver();
				String baseUrl = "http://www.demo.guru99.com/V4/";
				
				//launch the browser
				driver.get(baseUrl);
>>>>>>> 31d22bb84adbae9ad085338ad791ea5916ebfd32
	}
}
