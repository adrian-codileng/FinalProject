package myTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample {

public WebDriver driver;
	
	@BeforeTest
	public void setBaseURL() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:/Users/edgar.cazares/Documents/chromedriver.exe");

		System.setProperty("webdriver.chrome.driver","C://Users//l.ramirez.martinez//Desktop//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test
	public void printHomePageTittle() {
		String title= driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void printHomePageTitleWithExtraLetters(){
		String title = driver.getTitle();
		System.out.println(title+"from test #2");
	}
	
	@AfterTest
	public void endSession() {
		driver.quit();
	}

}
