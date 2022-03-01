import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_using_text {

	public static void main(String[] args) {
			
		/*
		This is used when there is no access to complete code or full code is not ready
		Use only text to identify objects
		Don't use much
		*/
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 

		driver.get("http://www.qaclickacademy.com/");
		driver.findElement(By.xpath("//*[text()='Practice']")).click();
	
	}

}
