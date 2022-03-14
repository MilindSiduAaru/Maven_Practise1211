package Test_Cases;
//FOR PRACTISE

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page_Object_Model.Login_Page_Object;
import Resources.BaseClass;

public class Login_Test1 extends BaseClass {
	@Test(dataProvider="getData")
public void Login_Test( String a,String b) throws IOException {
	driver=Initialisebrowser();
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	Login_Page_Object LPO=new Login_Page_Object(driver);
	LPO.EnterUserName().sendKeys(a);
	LPO.EnterPassword().sendKeys(b);
	LPO.ClickToLogin().click();
	driver.close();
}
	@DataProvider
	public Object[][] getData(){
		Object[][]obj=new Object[2][2];
		obj[0][0]="Test1";
		obj[0][1]="Pass1";
		obj[1][0]="Test1";
		obj[1][1]="Pass2";
		return obj;
		
		
	}
}
