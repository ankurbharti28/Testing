import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selectors_locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		css i better than xpath as its fast, easy to use and etc.
		Syntax:  tagname[attribute='value']   or  [attribute='value']
		*/
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 

		driver.get("https://login.salesforce.com/?locale=in");
//		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("jbaskjdsakjdn");   //with tag,attribute and value
//		or
//		driver.findElement(By.cssSelector("[id='username']")).sendKeys("jbaskjdsakjdn");   //without tag
//		or
//		driver.findElement(By.cssSelector("#username")).sendKeys("jbaskjdsakjdn");   //without tag and attribute.It only works for id value
//		or
		driver.findElement(By.cssSelector(".input.r4.wide.mb16.mt8.username")).sendKeys("jbaskjdsakjdn");   //without tag and attribute.It only works for class value. When there are space/gap in class name, replace them with dots(.)
		
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("12321");
		driver.findElement(By.cssSelector("input[id='Login']")).click();
	}

}
