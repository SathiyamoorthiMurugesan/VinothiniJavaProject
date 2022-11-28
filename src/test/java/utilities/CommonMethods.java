package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class CommonMethods {

	public String readAndReturnProperty(String propName) throws Exception {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\LENOVO\\eclipse practice workspace\\123Pro\\src\\test\\resources\\App.properties");
		p.load(fis);
		return p.getProperty(propName);
	}
}
