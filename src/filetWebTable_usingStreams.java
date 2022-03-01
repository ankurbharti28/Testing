import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.util.Strings;

public class filetWebTable_usingStreams {

	public static void main(String[] args) {
		// Program to search an item in list and confirm whether that is correct or not
		// USing java stream
	
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		//Open Website
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Search any item in searbox		
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		
		//Collect webelements list of filtered items after item search		
		List<WebElement> elementList=driver.findElements(By.xpath("//tr/td[1]"));
		
		// Collect filtered items list with condition of containing searched text
		List<WebElement> filterItem= elementList.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		
		//compare both list size for verification
		Assert.assertEquals(elementList.size(), filterItem.size());

	}

}
