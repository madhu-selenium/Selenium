package magento_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Launchurl {
	
	WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
@Test
public void main() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();//maximizing the window
		Thread.sleep (2000); //pause the execution for some time
		//driver.close();  //closing the window
}
}
