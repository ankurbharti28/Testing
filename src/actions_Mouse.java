import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_Mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//      For Mouse actions For this need to use Action class methods
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.amazon.com/");
		Actions a=new Actions(driver);
		
		// Moves to specific element-. Program to just to hover on a menu option.
//		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		
//		To enter a text in capital letter in search box
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
	
		
//		To enter a text in capital letter in search box and then select
//		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").contextClick().perform();
		

		
	}

}
