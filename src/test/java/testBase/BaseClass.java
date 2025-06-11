package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;
	Properties p;
	
	@Parameters({"os","br"})
	@BeforeClass
	public void setUp(String os,String br) throws IOException
	{
		FileReader file = new FileReader(".//src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--headless");
		option.addArguments("--incognito");
		
		
		switch (br.toLowerCase()) 
		{
		case "chrome" : driver = new ChromeDriver(option);	break;
		case "firefox": driver=new FirefoxDriver();	    break;

		default: System.out.println("invalid browser name"); return;
		}
		
		driver.get(p.getProperty("AppURL2"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	public String randomString()
	{
		return RandomStringUtils.randomAlphabetic(3);
	}
	
	
	public String randomNumber()
	{
		return RandomStringUtils.randomNumeric(3);
	}
	
	public String randomAlphaNumeric()
	{
		String generateString = RandomStringUtils.randomAlphabetic(3);
		String generateNum= RandomStringUtils.randomNumeric(3);
		return(generateString+"@"+generateNum);
	}
	
	
	
	
	
	
}
