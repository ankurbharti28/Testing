import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Disable_check {

	public static void main(String[] args) {
		
		// Validating whether UI Elements are disabled or enabled with attributes
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 

		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		
//		System.out.println(driver.findElement(By.id("Div1")).isEnabled());   // this is function to check whether selected attribute is enabled or not
		
//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();   // Selecting "Round trip" radio button 
		
//		System.out.println(driver.findElement(By.id("Div1")).isEnabled());   // this is function to check whether selected attribute is enabled or not
		
		
		// Above functions do not work in selenium as disable attribute are coded differently in this website
        // So Need to follow another process to check enable/disable
		
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); // this is function to print attribute which is getting change for enable/disable date
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();         // Selecting "Round trip" radio button to change attribute value
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); // this is function to print attribute which is getting change for enable/disable date
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))    // condition to check whether attribute is enable or disabled
		{
			System.out.println("Its enabled");			
		}
		else
		{
			System.out.println("Its disabled");			
		}
		
	  		  
	}

}
