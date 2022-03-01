import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame_Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://jqueryui.com/droppable/");
		
		//Calculate number of frame in a webpage
		System.out.println(driver.findElements(By.tagName("iframe")).size());
				
	    driver.switchTo().frame(0);  //Switch into a frame using frame number
//		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));   //Switch into a frame with webelement using class name
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));  //Enter into a frame with webelement using css selector
		driver.findElement(By.id("draggable")).click(); //choose element in frame
		
		Actions a=new Actions(driver);   //action class use to perform actions in frame
		WebElement source=driver.findElement(By.id("draggable"));  //  define webelement of source that need to drag
		WebElement target=driver.findElement(By.id("droppable"));  //  define webelement of target in which item need to drop
		a.dragAndDrop(source, target).build().perform(); // to drag and drop 1 box into another in a frame
		
		driver.switchTo().defaultContent();		
		
		
		//Practise Exercise 
		

	}

}
