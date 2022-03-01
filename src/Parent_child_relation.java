import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_child_relation {

	public static void main(String[] args) {
		
		/*
		Parent child relationship xpath - Define xpath for parent/tagnames
		Used when there is No attribute and it keeps on changing everytime
        e.g. div[@class='1st-c']/div/div[2]/div/input 
		*/
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.google.com/");
//		driver.findElement(By.xpath("//div[@class='gb_g gb_h']/div/a/div/a")).click();   //not working :(  
		driver.findElement((By.xpath("//a[contains(text(),'Images')]"))).click();
		
	}
}
