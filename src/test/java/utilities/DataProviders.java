package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	//DataProvider 1
	
	@DataProvider(name="GiftCardData")
	public String [][] getData() throws IOException
	{
		String path=".\\testData\\EmailData.xlsx";//taking excel file from testData
		
		ExcelUtility xlutil=new ExcelUtility(path);//creating an object for XLUtility
		
		int totalrows=xlutil.getRowCount("Sheet1");	
		int totalcols=xlutil.getCellCount("Sheet1",0);
			
		String logindata[][]=new String[totalrows+1][totalcols];//created for two dimension array which can store the data user and password
		
		for(int i=0;i<=totalrows;i++)  //1   //read the data from xl storing in two deminsional array
		{		
			for(int j=0;j<totalcols;j++)  //0    i is rows j is col
			{
				logindata[i][j]=xlutil.getCellData("Sheet1",i, j);
			} 
			}
	return logindata;//returning two dimension array
				
	
	
}
}
