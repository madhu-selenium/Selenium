package magento_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class User_Sign_Up {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@DataProvider (name = "usersignup")
	public Object[][] dpMethod() {
	   Object[][] data=new Object [3][5];
	   
	   //Registered User
	   data[0][0]="Test User";
	   data[0][1]="Test 2027";
	   data[0][2]="test2027@gmail.com";
	   data[0][3]="Welcome";
	   data[0][4]="Welcome@123";
	   //Unregistered User
	   data[1][0]="Test User";
	   data[1][1]="Test 2028";
	   data[1][2]="test2028@yahoo.com";
	   data[1][3]="Welcome";
	   data[1][4]="Welcome";
	   //Registered User with incorrect password
	   data[2][0]="Test User";
	   data[2][1]="Test 2024";
	   data[2][2]="test2024@yahoo.com";
	   data[2][3]="Welcome@12";
	   data[2][4]="Welcome@12";
	   return data;
	}
	@Test(dataProvider = "usersignup")
	public void enterUrl(String firstname, String lastname, String email_address, String password, String password_confirmation) throws InterruptedException {
	driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");
	driver.findElement(By.xpath("//a[text()='Create an Account']")).click();
	WebElement first_name = driver.findElement(By.id("firstname"));
	first_name.sendKeys(firstname);
	WebElement last_name = driver.findElement(By.id("lastname"));
	last_name.sendKeys(lastname);
	WebElement email_id = driver.findElement(By.id("email_address"));
	email_id.sendKeys(email_address);
	WebElement enter_pass = driver.findElement(By.id("password"));
	enter_pass.sendKeys(password);
	WebElement confirm_pass = driver.findElement(By.name("password_confirmation"));
	confirm_pass.sendKeys(password_confirmation);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Create an Account']")).click();
 
    String Url = driver.getCurrentUrl();
    if (Url.equals("https://magento.softwaretestingboard.com/customer/account/")) {
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
