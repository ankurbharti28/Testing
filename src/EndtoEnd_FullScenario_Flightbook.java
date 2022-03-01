import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndtoEnd_FullScenario_Flightbook {

	public static void main(String[] args) throws InterruptedException {
		// End to end automation full scenario
		// Select From city -> To City -> Select current date -> Add passenger -> Add
		// checkboxes -> Search

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open Website
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");

		// Select From City
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000L);

		driver.findElement(By.xpath("//a[contains(text(),'Bengaluru (BLR)')]")).click();
		Thread.sleep(2000L);

		// Select To City
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

		// Select current date in Calendar

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) // condition to check whether
																					// attribute is enable or disabled
		{
			System.out.println("Its enabled");
		} else {
			System.out.println("Its disabled");

			// Select friends and family checkbox

			driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();

			// Add 5 passengers

			driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(2000L);

			// Using for loop To add multiple adults by pressing + icon multiple time
			for (int i = 1; i < 5; i++) {
				driver.findElement(By.id("hrefIncAdt")).click();
			}
			// click on Done button
			driver.findElement(By.id("btnclosepaxoption")).click();

			// click on Search flight button

			driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		}

	}
}
