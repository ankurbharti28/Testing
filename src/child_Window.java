import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
//		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
//		driver.findElement(By.cssSelector(".blinkingText")).click();
		
//		Set<String> windows=driver.getWindowHandles();    // [parentid, childid]
//		Iterator<String> it=windows.iterator();
//		String parentid=it.next();
//		String childid=it.next();
//		driver.switchTo().window(childid);
		
//		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
//		String emailid=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
//		driver.switchTo().window(parentid);
		
//		driver.findElement(By.id("username")).sendKeys(emailid);
		
//		Exercise
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> wind=driver.getWindowHandles();
		Iterator<String> it=wind.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		
		driver.switchTo().window(parentid);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
		
	}
	

}
