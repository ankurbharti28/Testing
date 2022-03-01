import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		
//		Other type of Dropdown
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 

		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		driver.findElement(By.id("hrefIncAdt")).click();    //added 1 more adult i.e. 2 Adult selected
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());   //printing selected output
		
//		Using While loop To add multiple adults by pressing + icon multiple time
		
		/*
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		*/
		
		
//		Using for loop To add multiple adults by pressing + icon multiple time
		
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();  //click on Done button
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());   //printing selected output
		
		

	}

}
