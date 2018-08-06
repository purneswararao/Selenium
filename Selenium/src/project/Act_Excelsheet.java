package project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Act_Excelsheet {
	public static File f1;
	public static FileInputStream fis;
	public static XSSFSheet sh;
	public static XSSFWorkbook wb;
 public static void readExeel(String excelpath) {
		 try {
			f1 =new File(excelpath);
			  fis =new FileInputStream(f1);
			 wb=new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 }
 public static String getData(int sheetNumber ,int rownum,int cellnum) {
	 sh=wb.getSheetAt(sheetNumber);
		 String data=sh.getRow(rownum).getCell(cellnum).getStringCellValue();
		 return data;
 }

 public static int getRow(int sheetNumber) {
	 int row =sh.getLastRowNum();
	 row=row+1;
	 return row;
 }
 public static int getColumn(int sheetNumber) {
	 XSSFRow row=sh.getRow(0);
		return row.getLastCellNum();
 }
}
