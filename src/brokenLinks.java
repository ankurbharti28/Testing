import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class brokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		/*
		Check Broken Links on a webpage
		
		Broken links are links which throws error
		Links can be checked by opening  or without openings
		we can check whether link is broken or not by, Without even opening in browser 
		Links can be checked by checking Status of responses
		If status is >400 then its BrokenLink
		There are java methods which can check the status of a broken link and identify it whether its broken or not
		Selenium is used to get the link and Javamethod is used to identify whether link is broken or not.
		
		*/
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		List<WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a =new SoftAssert();
		
		for(WebElement link : links)   //Enhanced for loop to iterate for all links
		{
			String url =link.getAttribute("href");
			
			HttpURLConnection  conn=(HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode=conn.getResponseCode();
			System.out.println(respCode);  // printresponse code of each link
			
			// applied soft assertion with condition and message. Soft assert will collect all the failures and continue the script till last and fail/pass the script after completion
			a.assertTrue(respCode<400, "The link with text: "+ link.getText()+ " is broken with code "+ respCode);
		}
		
		a.assertAll();  //This will report result
		
//		String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
//		String url=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		
		// Java program to open a URL
//		HttpURLConnection  conn=(HttpURLConnection)new URL(url).openConnection();
//		conn.setRequestMethod("HEAD");
//		conn.connect();
		
		// store response code of request in a variable
//		int respCode=conn.getResponseCode();
		
		// print response code just to check response
//		System.out.println(respCode);

	}

}
