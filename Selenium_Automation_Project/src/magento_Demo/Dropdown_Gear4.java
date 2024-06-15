package magento_Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Dropdown_Gear4 {
	WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void Drop_down_Gear()throws InterruptedException {
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
		driver.findElement(By.id("email")).sendKeys("test2024@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("Welcome@123");
	    driver.findElement(By.id("send2")).click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
	      WebElement Gear = driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]/li[4]"));
		    act = new Actions(driver);
			act.click(Gear).build().perform();
			//driver.close();  //closing the window
	}
	@Test
	public void Gear_add_cart()throws InterruptedException {
		//String Url = driver.getCurrentUrl();
		//if (Url.equals("https://magento.softwaretestingboard.com/gear.html")) {
			//System.out.println("https://magento.softwaretestingboard.com/gear.html");
		//Actions act=new Actions(driver);
	       Actions prod=new Actions(driver);
	       //Actions size=new Actions(driver);
	       //Actions color=new Actions(driver);
	       Actions add_cart=new Actions (driver);
	       
		WebElement product=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[2]/div/div/strong/a"));
			prod = new Actions(driver);
			prod.click(product).build().perform();
			
			//WebElement siz= driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-168\"]"));
			//size = new Actions(driver);
			//size.click(siz).build().perform();
					//WebElement clr= driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-60\"]"));
					//color = new Actions(driver);
			//color.click(clr).build().perform();
			
			WebElement add_to_cart= driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span"));
			add_cart = new Actions(driver);
			add_cart.click(add_to_cart).build().perform();
			driver.close();  //closing the window
		}
	}



