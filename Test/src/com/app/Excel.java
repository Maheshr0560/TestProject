package com.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	
	
	XSSFSheet sheet1;
	//String filePath ="resources"+File.separator+"TestData.xlsx";
	String filePath ="C:\\Users\\umamaheswar.amudam\\Desktop\\naukridata.xlsx";



 public String getData(int sheetindex,int rownum,int columnno) throws IOException
    {
	 	File src = new File(filePath);
	 	FileInputStream fis= new FileInputStream(src);
	 	XSSFWorkbook wb =new XSSFWorkbook(); 
    	sheet1= wb.getSheetAt(sheetindex);
    	String data=sheet1.getRow(rownum).getCell(columnno).getStringCellValue().trim();
    	return data;
    }
}
