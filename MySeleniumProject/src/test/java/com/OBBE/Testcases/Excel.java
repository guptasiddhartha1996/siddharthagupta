package com.OBBE.Testcases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.OBBE.Utilities.Xls_Reader;

public class Excel extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook=new XSSFWorkbook(); 
        XSSFSheet sheet=workbook.createSheet("Test Data"); 
		
        HashMap<String,String> map=new HashMap<String,String>(); 
        map.put("1", "John"); 
        map.put("2", "Joey"); 
        map.put("3", "Ross"); 
        map.put("4", "Rachel");
        map.put("5", "Sid");
        System.out.println(map);
        
        int rowno=0; 
        
        for(HashMap.Entry entry:map.entrySet()) { 
            XSSFRow row=sheet.createRow(rowno++); 
            row.createCell(0).setCellValue((String)entry.getKey()); 
            row.createCell(1).setCellValue((String)entry.getValue()); 
        } 
   
        FileOutputStream file = new FileOutputStream("C:\\Users\\sigupta\\eclipse-workspace\\MySeleniumProject\\TestData\\New Hire.xlsx"); 
        workbook.write(file); 
        file.close(); 
        System.out.println("Data Copied to Excel"); 
		
	}

}
