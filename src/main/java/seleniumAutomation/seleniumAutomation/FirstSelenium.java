package seleniumAutomation.seleniumAutomation;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstSelenium {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		WebElement id= driver.findElement(By.id("userid"));
		id.sendKeys("DR1325");
		String att= id.getAttribute("value");
		System.out.println(att);
		driver.findElement(By.id("password")).sendKeys("aquafina1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[@class='nice-name' and text()='HDFCBANK']")).click();
		driver.findElement(By.xpath("//span[@data-balloon='Chart (C)']")).click();
		WebElement chartFrame=driver.findElement(By.id("chart-iframe"));
		driver.switchTo().frame(chartFrame);
		WebElement symbol=new WebDriverWait(driver, Duration.ofSeconds(20))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='symbol']")));
		driver.findElement(By.id("symbol")).sendKeys("ICIC");
		symbol.clear();
		Actions action=new Actions(driver);
		action.doubleClick().build().perform();
		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//translate[@original='30m']")));
		firstResult.click();
		driver.findElement(By.xpath("//translate[contains(text(),'10 Min')]")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
