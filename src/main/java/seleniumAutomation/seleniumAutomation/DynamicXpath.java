package seleniumAutomation.seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://the-internet.herokuapp.com/dynamic_content");
	WebElement image=driver.findElement(By.xpath("//div[@class='row']//div[@id='content']//div[@id='content']/div[1]//div/img"));
	image.getAttribute("img src");
	System.out.println(image);
}
}
