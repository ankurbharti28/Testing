import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		
		String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		
		System.out.println(opt);
		
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(dropdown);
		s.selectByVisibleText(opt);
		
		driver.findElement(By.id("name")).sendKeys(opt);		
		driver.findElement(By.id("alertbtn")).click();	
		System.out.println(driver.switchTo().alert().getText());
		String txt=(driver.switchTo().alert().getText());
		if(txt.contains(opt))
		{
			System.out.println("Success");
		}
		
		else
		{
		System.out.println("Not found")	;
		}	
		
		
	}

}
