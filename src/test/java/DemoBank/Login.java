package DemoBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nktkm\\Downloads\\chromedriver_win32" + 
				 "\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.demo.guru99.com/V4/");

	}
}
