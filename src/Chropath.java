import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chropath {

	public static void main(String[] args) {
	
		/*
		This is a 3rd party plugin for xpath and css and works in chrome browser
		*/
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.google.com/");
		driver.findElement((By.xpath("//a[contains(text(),'Images')]"))).click();
		
	}
}
