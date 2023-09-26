package automationAll;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/AmazonTestdata.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String value = wb.getSheet("amazon").getRow(1).getCell(3).getStringCellValue();
		String text = wb.getSheet("amazon").getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(text);
		System.out.println(value);
			
		}
	
}
