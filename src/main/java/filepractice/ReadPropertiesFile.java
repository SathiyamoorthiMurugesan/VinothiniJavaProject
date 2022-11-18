package filepractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	//read a text from property file 
	
	public static void main(String[] args) throws IOException {

		Properties p = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\prabu\\git\\VinothiniJavaProject\\src\\main\\resources\\test1\\New.properties");
		p.load(fis);
		String user = p.getProperty("User");
		String Password = p.getProperty("Password");
		String loginAttempts = p.getProperty("LoginAttempts");
		System.out.println("User Profile Name:   "+ user  + "     Password: "+ Password);
		System.out.println("loginAttempts: " +loginAttempts);
		
	}
}
