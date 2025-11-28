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
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import org.apache.logging.log4j.LogManager;			//log
import org.apache.logging.log4j.Logger;				//log

import utilities.Reusable_FakerUtils;
import utilities.Reusable_MouseKeyboardActions;

public class BaseClass {

	public Logger logger;
	Properties p;
	public Reusable_FakerUtils faker;
	public Reusable_MouseKeyboardActions act;
	
	@Parameters({"os","br"})
	@BeforeClass(groups="BaseClass")
	public void setUp(String os,String br,ITestContext context) throws IOException
	{
		
		logger = LogManager.getLogger(this.getClass());
		logger.info("LOGGER TEST: BaseClass initialized");

		FileReader file = new FileReader(".//src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		
		
		// Create the driver
	    WebDriver driverInstance = DriverFactory.createInstance(br);
	    
	    //Store in ThreadLocal
	    DriverManager.setDriver(driverInstance);
	    
	    // Set driver to ITestContext for listeners
	    context.setAttribute("driver",  DriverManager.getDriver());		
		
	    faker = new Reusable_FakerUtils();
		
	    DriverManager.getDriver().get(p.getProperty("AppURL2"));
	    DriverManager.getDriver().manage().window().maximize();
	    DriverManager.getDriver().manage().deleteAllCookies();	
	    DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	
	}
	
	@AfterClass
	 public void tearDown() 
	{
		DriverManager.getDriver().quit();
		if (DriverManager.getDriver() != null) 
	        {
	            DriverManager.getDriver().quit();
	            DriverManager.unload();
	        }  
	}
	
	//ScreenShot 
	public String captureScreen(String tname) throws IOException
	{
		
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) DriverManager.getDriver();
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\"+ tname +"_"+timeStamp+".png";
		File targetFile = new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
		return targetFilePath;
	}
	
	
	
	
	
}
