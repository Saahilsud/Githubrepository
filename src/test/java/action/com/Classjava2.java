package action.com;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Properties;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.IOException;


public class Classjava2 {

	public static void main(String[] args) throws Exception
	{    
		// IO and PArse both used
	
	// how to read a file from the explorer
		
			FileReader fr= new FileReader("C:\\Screenshot\\file.txt"); // read a notepad file character by character
			BufferedReader br= new BufferedReader(fr);    // store whatever we are reading into a buffer . Read buffered output stream and bufferted input stream
			
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.println((char)i);
					}
			br.close();   // we are only making br if we want to store the data . if not then just do it by fr.
			fr.close();
		
		
		
	/*	File file= new File("C:\\Users\\training_d5.01.02\\Documents\\AppiumWork\\saahil.selenium\\src\\test\\java\\test.properties");
		FileInputStream fileinput = new FileInputStream(file);
		Properties properties= new Properties();
		properties.load(fileinput);
		fileinput.close();
		
		Enumeration enuKeys= properties.keys();
		//writing into properties files.
		
		// in order to get seperate keys information:
		
		while(enuKeys.hasMoreElements()) {
			String key= (String) enuKeys.nextElement();
			String value = properties.getProperty(key);
			System.out.println(key+": "+value);
			
		}  */
		
	/*	
		// writing data
		File file= new File("C:\\Selenium Advance\\excel1.xlsx");
		FileOutputStream fout= new FileOutputStream(file);
		Properties.setProperty("xpath","\\iframes");
		Properties.store(fout,null);
		fout.close();
		
		
	/*steps followed:
		1. identify the location of the excel
		2. identify the sheet name
		3. identify the column no and identify the row
		4. identify cell
		
		*/
		
		
	 XSSFWorkbook book;   //defined in main and hence private static not required.
	 XSSFSheet Sheet;
	 XSSFRow Row;
	 XSSFCell Cell;
	
	
	//getrow() we pass the row no.
	//getcell(1) we pass the cell no.
	//getsheet() get the sheet no
	
	//in order to write the data into a new cell, we have to create a new cell with help of a program.
	
	Sheet.createRow(2);
	
	Row=Sheet.getRow(2);
	Cell=Row.createCell(1);
	Cell.setCellValue("New ValueAdded");
	FileOutputStream fileOut= new FileOutputStream(new File("C:\\Selenium Advance\\excel1.xlsx"));
	book.write(fileOut);
	fileOut.flush();
	
	
	
}
}

	