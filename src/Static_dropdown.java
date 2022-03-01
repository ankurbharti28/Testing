import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Static_dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 

		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		
		
//	Dropdown with select tag - static
		
		WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByIndex(2);    //1st approach:  select option on basis of index
		System.out.println(dropdown.getFirstSelectedOption().getText());   //print the selected option
		
		dropdown.selectByVisibleText("USD");   //2nd approach:    select option on basis of visible text
		System.out.println(dropdown.getFirstSelectedOption().getText());   //print the selected option
		
		dropdown.selectByValue("INR");    //3rd approach:   select option on basis of value
		System.out.println(dropdown.getFirstSelectedOption().getText());   //print the selected option
		
		
		

	}

}
