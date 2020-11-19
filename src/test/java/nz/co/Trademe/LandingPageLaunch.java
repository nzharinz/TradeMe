package nz.co.Trademe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LandingPageLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hari.emani\\Downloads\\LIB\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.trademe.co.nz/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.id("searchString")).sendKeys("iPhone");
//		Thread.sleep(2000);
		driver.findElement(By.className("icon-search-large")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("LocationFilter_regionSelect")).click();
		Thread.sleep(2000);
		Select dropDown = new Select(driver.findElement(By.id("LocationFilter_regionSelect")));
		dropDown.selectByIndex(2);
			
		}

}