import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_multiitems_in_cart {

	public static void main(String[] args) {
		
		// Program to add multiple defined items in cart

		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		int j=0;
		
		String[] itemsNeeded={"Cucumber","Brocolli","Beetroot","Carrot","Potato"};  // Creating a array for items
		
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++)
		{
			String[] name=products.get(i).getText().strip().split("-");
			String formattedName=name[0].trim();		
			
			List itemsNeededList=Arrays.asList(itemsNeeded); // converted array into arraylist to make search easy
			
			if(itemsNeededList.contains(formattedName))
			{		
				j++;
//				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsNeeded.length)
				{
					break;
				}
			}
		}
		
		
	}

}
