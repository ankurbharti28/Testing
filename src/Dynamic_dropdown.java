import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
//		Dynamic Dropdown
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 

		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    Thread.sleep(2000L);
		
	    driver.findElement(By.xpath("//a[contains(text(),'Bengaluru (BLR)')]")).click();    //selecting From City
		Thread.sleep(2000L);
		
		//  Using indexing for multiple match of same xpath
		
//		driver.findElement(By.xpath("(//a[contains(text(),'Chennai (MAA)')])[2]")).click();    //selecting To City
		
		// Another approach of parent-child relationship xpath finding for same value in another dropdown 
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();   //selecting To City
		  
	}

}
