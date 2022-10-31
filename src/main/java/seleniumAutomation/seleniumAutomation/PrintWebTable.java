package seleniumAutomation.seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintWebTable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selectorshub.com/xpath-practice-page/");
	String[] names= {"Garry.White, Jasmine.Morgan, Joe.Root"};
	for(int i=0; i<=names.length; i++) {
	WebElement tableinf=driver.findElement(By.xpath("//td[@class='left']/a[contains(text(),'Garry.White')]"));
	System.out.println(tableinf);
}
}
}