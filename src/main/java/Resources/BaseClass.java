package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Inside Base Class first create a method for invoking browser
//Take file data.properties into BaseClass
//We Create method in BaseClass and in TestCase 
// We Define Separate WebDriver for PageObject Model
public class BaseClass {
	public WebDriver driver;
	public WebDriver Initialisebrowser() throws IOException {
		FileInputStream f1=new FileInputStream("E:\\Selenium Demo\\MAVEN_PROJECT\\src\\main\\java\\Resources\\Data.properties");
		Properties prop=new Properties();
		prop.load(f1);
		String browser=prop.getProperty("Browser");
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		return driver;
	}
	

}
