package seleniumAutomation.seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelect {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	driver.switchTo().frame("iframeResult");
	WebElement cars=driver.findElement(By.name("cars"));
	Select sel=new Select(cars);
	sel.selectByIndex(0);
	sel.selectByIndex(2);
	Thread.sleep(3000);
	driver.close();
}
}
