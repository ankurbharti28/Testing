import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class selenium_Grid {

	public static void main(String[] args) throws MalformedURLException {
		
		// Selenium grid to run test case on remote and cross borwser testing
	   // There is selenium grid jar file that need to install in server and node
		//Check setup process and command to run 
		
		DesiredCapabilities dc=new DesiredCapabilities();
        dc.setBrowserName("Chrome");
        dc.setPlatform(Platform.WINDOWS);
        
        // here we are running pr executing test case on remote
        // so command will be different
        
        WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
        driver.get("http://google.com");
        
	}

}
