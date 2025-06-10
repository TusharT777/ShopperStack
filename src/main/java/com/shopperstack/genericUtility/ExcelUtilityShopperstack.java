package com.shopperstack.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtilityShopperstack {
	public String getStringdataFromExcel(String sheetname,int rowIndex, int celIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("./src/test/resources/ShopperStackTestData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetname).getRow(rowIndex).getCell(celIndex).getStringCellValue();
	}
	public double getNumberDataFromExcel(String sheetname,int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("./src/test/resources/ShopperStackTestData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetname).getRow(rowIndex).getCell(cellIndex).getNumericCellValue();
	}
	public boolean getBooleanDataFromExcel(String sheetname,int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("./src/test/resources/ShopperStackTestData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetname).getRow(rowIndex).getCell(cellIndex).getBooleanCellValue();
	}

}
