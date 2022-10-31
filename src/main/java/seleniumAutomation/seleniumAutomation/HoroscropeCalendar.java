package seleniumAutomation.seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HoroscropeCalendar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.taaraka.com/todays-horoscope");
		driver.findElement(By.id("date")).click();
		WebElement year = driver.findElement(By.xpath("//input[@class='numInput cur-year']"));
		year.clear();
		year.sendKeys("1985");
		year.click();
		WebElement month = driver.findElement(By.xpath("//select[@class='flatpickr-monthDropdown-months']"));
		Select sel = new Select(month);
		sel.selectByIndex(5);
	}
}
