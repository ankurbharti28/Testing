import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Webtablesort_usingStreams {

	public static void main(String[] args) {
		
		// Program to sort a table column and verify whether its sorting is correct or not
		// We will use javaStreams
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		//Open Website
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		// Click on 1st column header to sort the column items
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//Get the list of all webelements of 1st column using Javastreams
		List<WebElement> elementslist=driver.findElements(By.xpath("//tr/td[1]"));
		
		//Get items of webelements List and store them in a list. This is called our original list (that is sorted already)
		List<String> originalList= elementslist.stream().map(s->s.getText()).collect(Collectors.toList());
		
		// Sort the original list and store them in a new sorted list
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		
		// Compare both original and sorted list using assertion
		Assert.assertTrue(originalList.equals(sortedList));
		;

	}

}
