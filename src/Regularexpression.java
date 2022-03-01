import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regularexpression {

	public static void main(String[] args) {
				
		/* 
		Xpath using Regular Expression
		use it when value keeps on changing or long text
		Syntax:     tagName[contains(@attribute,'value')] 
		e.g.  input[contains(@name,'username')];
		*/   
		
		/*
		css using regular expression
		use it when value keeps on changing or long text
		Syntax:    tagName[Attribute*='value'] 
		e.g.	input[name*='username'];
        */
	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 

		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("andkasndiasn");
		driver.findElement(By.cssSelector("input#password")).sendKeys("1272636");
		driver.findElement(By.xpath("//input[contains(@name,'proc')]")).click();
		
	}

}
