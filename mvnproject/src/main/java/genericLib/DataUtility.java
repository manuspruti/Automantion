package genericLib;


import java.io.FileInputStream;

//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
	public String getDatafromProperties(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("E:\\selenium\\commondata.properties.txt");
		Properties pobj=new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(key);
		return value;
	}
		public String getDtaFromExcelsheet (String Sheetname, int rownum, int cellnum) throws IOException {
			FileInputStream fis= new FileInputStream("E:\\selenium\\TestData.xlsx");
			Workbook book=WorkbookFactory.create(fis);
			Sheet sh=book.getSheet("Sheet1");
			DataFormatter format=new DataFormatter();
			String value=format.formatCellValue(sh.getRow(0).getCell(0));
			return value;
		}
	}

	