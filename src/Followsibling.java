import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Followsibling {

	public static void main(String[] args) {
		
		/*
		This is a way to find sibling when parent/siblings are dynamic 
		
		//*[@id='tablelist1-tab1']/following-sibling::li[1]
		*/
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.google.com/");
		driver.findElement((By.xpath("//a[contains(text(),'Images')]"))).click();
	}

}
