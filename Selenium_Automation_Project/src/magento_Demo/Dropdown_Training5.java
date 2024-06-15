package magento_Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dropdown_Training5 {
	WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void Drop_down_Women()throws InterruptedException {
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
		driver.findElement(By.id("email")).sendKeys("test2024@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("Welcome@123");
	    driver.findElement(By.id("send2")).click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
	      WebElement Training = driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]/li[5]"));
		    act = new Actions(driver);
			act.click(Training).build().perform();
			driver.close();  //closing the window
	}
	
}


