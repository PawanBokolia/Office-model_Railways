package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	public static  WebDriver createInstance(String browser){
		
		WebDriver driver =null;
		
		switch(browser.toLowerCase())
		{
			case "chrome" : 
			ChromeOptions options = new ChromeOptions();
//            options.addArguments("--incognito");
//            options.addArguments("--headless");
            driver = new ChromeDriver(options); break;
            
			case "firefox" :
				driver = new FirefoxDriver();  break;
				
			case "edge" :
				driver = new EdgeDriver();  break;
			
			default : System.out.println("invalid browser");	
		}	
	
		return driver;
			
	}
			
}
	
	
	

