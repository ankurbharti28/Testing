import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {

	public static void main(String[] args) throws InterruptedException {
		
		// Calculate the count of links on a webpage
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
//		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		// Limiting Webdriver scope
		// Calculate the count of links on a particular section of webpage For e.g. Footer section
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		// Limiting scope more
		// Calculate the count of links in a column of footer section
		
		WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		// Calculate the count of links in a column of footer section
		
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			
			String clickonlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(5000L);
		}	
			
		// Open all links of footer 1st column in next tab and then print title of that page
		
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());	
			}	
		}
	}

