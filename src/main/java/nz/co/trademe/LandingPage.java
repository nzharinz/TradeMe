package nz.co.trademe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LandingPage {
	
String baseURL = "www.trademe.co.nz";
String driverPath = "C:\\Users\\hari.emani\\Downloads\\LIB\\chromedriver_win32\\chromedriver.exe";
	
public void Browser() {
	System.setProperty("webdriver.chrome.driver", driverPath);
	ChromeDriver driver = new ChromeDriver();
}



}