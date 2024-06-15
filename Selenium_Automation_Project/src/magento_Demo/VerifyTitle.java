package magento_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class VerifyTitle {
	
	WebDriver driver;
	@BeforeTest
	
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void main() {
		  
		  WebDriver driver = new ChromeDriver ();//open chrome bwowser
			driver.manage().window().maximize();//maximizing the window
			driver.get("https://magento.softwaretestingboard.com/");//open the url
			System.out.println(driver.getCurrentUrl());
			String expectedTitle="Home Page";
			String actualTitle=driver.getTitle();//getting title of webpage
			System.out.println(actualTitle);
			if(expectedTitle.equals(actualTitle)) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}
			driver.close();
	}
}


