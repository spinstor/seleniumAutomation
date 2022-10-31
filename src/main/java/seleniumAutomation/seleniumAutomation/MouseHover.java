package seleniumAutomation.seleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.findElement(By.id("userid")).sendKeys("rv1189");
		driver.findElement(By.id("password")).sendKeys("aquafina8");
		driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.id("pin")).sendKeys("351984");
		driver.findElement(By.xpath("//button")).click();
}
}

