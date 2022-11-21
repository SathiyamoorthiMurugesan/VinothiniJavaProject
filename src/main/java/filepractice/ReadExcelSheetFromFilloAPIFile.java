package filepractice;

import java.util.ArrayList;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ReadExcelSheetFromFilloAPIFile {

	public static void main(String[] args) throws FilloException  {
		
		System.out.println(System.getProperty("user.dir"));
		Fillo filo = new Fillo();
//		Connection connection = filo.getConnection("C:\\Users\\prabu\\git\\VinothiniJavaProject\\src\\main\\resources\\test1\\ApacheAPI.xlsx");
		Connection connection = filo.getConnection(System.getProperty("user.dir")+"\\src\\main\\resources\\test1\\ApacheAPI.xlsx");
		String str1 = "Select * from Sheet1";
		Recordset records = connection.executeQuery(str1);
	//	System.out.println(records.getCount());
		while(records.next())
		{
			
			System.out.println(records.getField("Address"));
		//	System.out.println(records.getField());
		}
		records.close();
		connection.close();
	}

}

//+" " + records.getField("Contact Number")