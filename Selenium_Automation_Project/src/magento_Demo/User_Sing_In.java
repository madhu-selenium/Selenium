package magento_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class User_Sing_In {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@DataProvider (name = "dataset")
	public Object[][] dpMethod() {
	   Object[][] data=new Object [5][2];
	   
	   //Registered User
	   data[0][0]="test2024@gmail.com";
	   data[0][1]="Welcome@123";
	   //Unregistered User
	   data[1][0]="test2024@yahoo.com";
	   data[1][1]="Welcome@123";
	   //Registered User with incorrect password
	   data[2][0]="test2024@yahoo.com";
	   data[2][1]="Welcome@12";
	 //Registered User with incorrect user
	   data[3][0]="test2030@yahoo.com";
	   data[3][1]="Welcome@12";
	 //Registered User with incorrect userid / password
	   data[4][0]="test2031@yahoo.com";
	   data[4][1]="Welcome@12";

	   return data;
	}
	@Test(dataProvider = "dataset")
	public  void enterUrl(String email, String pass ) throws InterruptedException {
	driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");
	 WebElement login = driver.findElement(By.id("email"));
	 login.sendKeys(email);
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys(pass);
    Thread.sleep(2000);
    driver.findElement(By.id("send2")).click();
    String Url = driver.getCurrentUrl();
    if (Url.equals("https://magento.softwaretestingboard.com")) {
        System.out.println("Login successful");
    } else {
        System.out.println("Login Failed");
    }
		}
	@AfterMethod
	 public void closeBrowser() {
	driver.close();
	}
}
