package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utilities.Reusable_FakerUtils;
import utilities.Reusable_MouseKeyboardActions;

public class BaseClass {
//static 
	public WebDriver driver;
	Properties p;
	public Reusable_FakerUtils faker;
	public Reusable_MouseKeyboardActions act;
	
	@Parameters({"os","br"})
	@BeforeClass
	public void setUp(String os,String br) throws IOException
	{
		FileReader file = new FileReader(".//src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--headless");
//		option.addArguments("--incognito");
		
		
		switch (br.toLowerCase()) 
		{
			case "chrome" : driver = new ChromeDriver(option);	break;
			case "firefox": driver = new FirefoxDriver();	    break;

			default: System.out.println("invalid browser name"); return;
		}
		
		faker = new Reusable_FakerUtils();
		
		
		driver.get(p.getProperty("AppURL2"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}
	
	
//	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	//ScreenShot 
	public String captureScreen(String tname) throws IOException
	{
		
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\"+ tname +"_"+timeStamp+".png";
		File targetFile = new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
		return targetFilePath;
	}
	
	
	
	
	
}
