import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Alert_Handle {
	public static void main(String[] args) throws InterruptedException {

		/*
		 * Use Switch method to handle Java alerts as we can not find element of that
		 * popup and its not part of browser
		 */

		String text = "Ankur";
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click(); // Click on ALert button for popup appearing
		Thread.sleep(2000L);
		System.out.println(driver.switchTo().alert().getText()); // Grab the text appearing in alert
		driver.switchTo().alert().accept(); // Select OK or accept the Alert
		Thread.sleep(2000L);

		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("confirmbtn")).click(); // Click on Confirm button for popup appearing
		System.out.println(driver.switchTo().alert().getText()); // Grab the text appearing in alert
		driver.switchTo().alert().dismiss(); // Select Cancel or dismiss the Alert
	}
}
