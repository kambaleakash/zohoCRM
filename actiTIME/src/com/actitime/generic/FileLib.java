package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties; 

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is generic class for data driven testing
 * @author Akash
 *
 */

public class FileLib 
{
	/**
	 * This is a generic method for reading the data from property file
	 * @param path
	 * @param key
	 * @return data
	 * @throws IOException
	 */
	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/commondata.property"); 
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);	
		
		fis.close();
		
		return data;
	}
	
	/**
	 * This is a generic method for reading the data from excel file
	 * @param path
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return data
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelData( String sheetName, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		
		fis.close();
		
		return data;
	}
	
	
	/**
	 * This is a generic method for writing the data to excel file
	 * @param path
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @param setCell
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExcelData( String sheetName, int row, int cell, String setCell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(setCell);
		
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
		wb.write(fos);
		
		fis.close();
		fos.flush();
		fos.close();
	}

}
