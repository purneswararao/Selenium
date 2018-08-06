package Realtime;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	public FileInputStream fis;
   public XSSFWorkbook wb;
   public XSSFSheet sheet;
	public ReadData (String excelpath) {
		{
			try {
				File src =new File(excelpath);
				FileInputStream fis =new FileInputStream(src);
				 wb=new XSSFWorkbook(fis);
			    
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			}
	}
			public String getData(int sheetNumber,int row,int cell)
			{
				sheet=wb.getSheetAt(sheetNumber);
				String data=sheet.getRow(row).getCell(cell).getStringCellValue();
				return data;
			}
			public int RowCount(int sheetIndex)
			{
				int number=wb.getSheetAt(sheetIndex).getLastRowNum();
				//int row1 =wb.getSheetAt(sheetIndex).getFirstRowNum();
				number=number+1;
				return number;
			}
			public int cellCount(int sheetIndex) {
			XSSFRow row=sheet.getRow(0);
			return row.getLastCellNum();
			
				
		}
}

