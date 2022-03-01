import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxWindow_DeleteCookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		
		// Maximize the window
		driver.manage().window().maximize();
		
		// Delete cookies
		driver.manage().deleteAllCookies();
		
		//Delete selected cookies
		driver.manage().deleteCookieNamed("asdf");
		
		// New session start
//		driver.manage().deleteCookieNamed("session key");
		// clock on any link
		// login page and verify login url
		
		
		driver.get("http://google.com");
		
	

	}

}
