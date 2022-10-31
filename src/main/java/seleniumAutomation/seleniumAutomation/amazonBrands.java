package seleniumAutomation.seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonBrands {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[starts-with(text(),'Brands')]/ancestor::div[@class='a-section a-spacing-none']/descendant::li[2]"));
	driver.findElement(By.xpath("(//span[starts-with(text(),'Brands')]/../..//ul//li//span//div)[2]")).click();
	driver.close();
}
}
