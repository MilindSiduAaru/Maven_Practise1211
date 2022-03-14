package Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page_Object {
	public WebDriver driver;
	By Username=(By.xpath("//input[@id=\"username\"]"));
	By Password=(By.xpath("//input[@id=\"password\"]"));
	By ClickLogin=(By.xpath("//input[@id=\"Login\"]"));
	 public Login_Page_Object(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement EnterUserName() {
		 return driver.findElement(Username);
	 }
	 public WebElement EnterPassword() {
		 return driver.findElement(Password);
	 }
	 public WebElement ClickToLogin() {
		 return driver.findElement(ClickLogin);
	 }


}
