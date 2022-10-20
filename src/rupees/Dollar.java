package rupees;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dollar {
	
	public static WebDriver driver;
	
public static void openapplication() {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("http://183.82.103.245/nareshit/login.php");
System.out.println("Application Opened");
}

public static void login() {
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login Completed");
}
}
