import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	ChromeDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
	//	driver.get("http://google.com");
//		System.out.println(driver.getTitle());
//		driver.get("https://google.com");
//		System.out.println(driver.getTitle());  
//		System.out.println("This is correct url: " + driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());   //print page source
//		driver.get("http://yahoo.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//	    driver.close();
//	    driver.get("https://www.facebook.com/");
//	    driver.findElement(By.id("email")).sendKeys("This is  just testing");
//	    driver.findElement(By.name("pass")).sendKeys("123456");
//	    driver.findElement(By.linkText("Forgotten password?")).click();
//	    driver.findElement(By.name("login")).click();
//		driver.get("https://login.salesforce.com/?locale=in");
//		driver.findElement(By.id("username")).sendKeys("yeahhh");
//		driver.findElement(By.name("pw")).sendKeys("123456");

//		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("abcdansan");   //using xpath
//		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("12345678");   //using xpath
	
//		driver.findElement(By.cssSelector("#username")).sendKeys("asdjasjdak");//using css selector
//		driver.findElement(By.cssSelector("#password")).sendKeys("12345567");  //using css selector
//		driver.findElement(By.cssSelector("#Login")).click();  //using css selector
		
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
//		driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("abcdefg@gmail.com");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("1234567");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")).click();
//		System.out.println(driver.findElement(By.className("_2YULOR")).getText());
	
//		custom xpath
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcdefg@gmail.com");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("1234567");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")).click();
//		System.out.println(driver.findElement(By.className("_2YULOR")).getText());
		
	
		
		
		
		
		
	}

}
