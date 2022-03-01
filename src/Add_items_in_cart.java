

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_items_in_cart {

	public static void main(String[] args) {
		
		/* Program to add a specific vegetables in shopping website cart */
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++)
		{
			String name=products.get(i).getText();
//			System.out.println(name);
			if(name.contains("Cucumber"))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
		

	}

}
