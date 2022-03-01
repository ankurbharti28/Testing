import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tablecontent_usingStreams {

	public static void main(String[] args) {
		// Program to get the price of a element/vggier
	    // We will use javaStreams
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		//Open Website
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		// Click on 1st column header to sort the column items
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//Get the webelements of 1st column in a list using Javastreams
		List<WebElement> elementslist=driver.findElements(By.xpath("//tr/td[1]"));
		
		//Get items of webelements List and store them in a list. This is called our original list (that is sorted already)
		List<String> price= elementslist.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		
		
	}

	private static String getPriceVeggie(WebElement s) {
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
