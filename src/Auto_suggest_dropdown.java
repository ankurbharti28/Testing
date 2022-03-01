
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggest_dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		// Auto suggestive dropdown selection. We get options only when we enter any keywords
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 

		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("IND");
		Thread.sleep(3000);
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option: options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
		

	}

}
