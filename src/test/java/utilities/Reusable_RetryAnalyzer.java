package utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Reusable_RetryAnalyzer implements IRetryAnalyzer{

	private int retyCount = 0;
	private final int maxRetryCount = 3;
	
	@Override
	public boolean retry(ITestResult result)
	{
		if(retyCount > maxRetryCount)
		{
			return  true ;  	// Retry the test again
		}
		return false;   		// Do not retry further
	}

}
