package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	
	@DataProvider(name="jerrylogindata")
	public String [][]  getdata() throws IOException
	{
		String path =".\\testData\\Jerry_Logintestdata.xlsx";
		ExcelUtility excel = new ExcelUtility (path);
		
		int trowNum = excel.getRowCount("Sheet1");
		int tcellNum = excel.getCellCount("Sheet1", 1);
		
		String logindata[][] = new String [trowNum][tcellNum];
		
		for(int i =1; i<=trowNum; i++)
		{
			for(int j=0; j<tcellNum; j++)
			{
				logindata[i-1][j] = excel.getCellData("Sheet1", i, j);
			}
		}
		return logindata;
	}
}

