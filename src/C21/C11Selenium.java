package C21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C11Selenium {

	private static final String WEB_DRIVER_ID="webdriver.chrome.driver";
	private static final String WEB_DRIVER_PATH="C:\\workspace\\javaBook\\src\\C21\\Driver\\chromedriver.exe";

	public static void main(String[] args) {


		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);

		ChromeOptions options = new ChromeOptions();		


		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.naver.com");
	}
}
