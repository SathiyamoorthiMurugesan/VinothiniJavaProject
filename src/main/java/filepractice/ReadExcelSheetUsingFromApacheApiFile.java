package filepractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ReadExcelSheetUsingFromApacheApiFile {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		File file = new File(
				"C:\\Users\\prabu\\git\\VinothiniJavaProject\\src\\main\\resources\\test1\\ApacheAPI.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		for (Row row : sheet) {
			for(org.apache.poi.ss.usermodel.Cell cell: row) {
				if(cell.getCellType() == cell.CELL_TYPE_NUMERIC) {
			//	System.out.println("*******"+cell.getCellType());
				System.out.println(cell.getNumericCellValue());
				}
			}
			}
		
//		Iterator<Row> ite = sheet.iterator();
//		Row row= sheet.getRow(5);
//		
//		Iterator<Cell> cellIterator = row.cellIterator();
//		while(ite.hasNext()) {
//			while(cellIterator.hasNext()){
//				System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
//		     }
//	    }
		workbook.close();
		fis.close();
}
}
