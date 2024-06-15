package magento_Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class MouseOverAction {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	//public static void main(String[] args) throws Exception {
	public void Mose_hover() throws Exception {
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		 //mouse hovering on books
		WebElement books=driver.findElement(By.xpath("//ul[@id='ui-id-2']/li[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(books).build().perform();
		
		Thread.sleep(2000);
		//mouse hovering on Whatsnew
		WebElement Whatsnew=driver.findElement(By.xpath("//ul[@id='ui-id-2']/li[2]"));
	    act=new Actions(driver);
		act.moveToElement(Whatsnew).build().perform();
		
		 //mouse hovering on women
		Thread.sleep(2000);
		WebElement women=driver.findElement(By.xpath("//ul[@id='ui-id-2']/li[3]"));
	    act=new Actions(driver);
		act.moveToElement(women).build().perform();
		
		//mouse hovering on Gear
		Thread.sleep(2000);
		WebElement Gear=driver.findElement(By.xpath("//ul[@id='ui-id-2']/li[4]"));
	    act=new Actions(driver);
		act.moveToElement(Gear).build().perform();
		
		//mouse hovering on Training
		Thread.sleep(2000);
		WebElement Training=driver.findElement(By.xpath("//ul[@id='ui-id-2']/li[5]"));
	    act=new Actions(driver);
		act.moveToElement(Training).build().perform();
		
		//mouse hovering on sale
		Thread.sleep(2000);
		WebElement Sale=driver.findElement(By.xpath("//ul[@id='ui-id-2']/li[6]"));
	    act=new Actions(driver);
		act.moveToElement(Sale).build().perform();
		
		
		
		//Action serriesOfactions=(Action) act.moveToElement(computers).contextClick();
	//	Action serriesOfactions1=(Action) act.moveToElement(electronics).contextClick();
	}

}
