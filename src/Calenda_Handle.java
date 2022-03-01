import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenda_Handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 

		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.id("travel_date")).click();
		
		// Grab common attribute and put into list
		
		List<WebElement> dates=driver.findElements(By.className("day"));
		
		// size of list
		int count=driver.findElements(By.className("day")).size();
		
		//interate every date of list
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText(); //text of each date in a string
				if(text.equalsIgnoreCase("28"))
				{
					driver.findElements(By.className("day")).get(i).click();
					break;
				}
		}
		
	}

}
