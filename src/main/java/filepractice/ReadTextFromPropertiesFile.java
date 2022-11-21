package filepractice;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadTextFromPropertiesFile {

	//read a text from property file 
	
	public static void main(String[] args) throws Exception {

		Properties p = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\prabu\\git\\VinothiniJavaProject\\src\\main\\resources\\test1\\New.properties");
		p.load(fis);
		String user = p.getProperty("User");
		String Password = p.getProperty("Password");
		String loginAttempts = p.getProperty("LoginAttempts");
		System.out.println("User Profile Name:   "+ user  + "     Password: "+ Password);
		System.out.println("loginAttempts: " +loginAttempts);
		
		System.out.println("*********************************");
		
		System.out.println(getSpecificPropFromFile("User"));
		
		String fileNam = "C:\\Users\\prabu\\git\\VinothiniJavaProject\\src\\main\\resources\\test1\\New.properties";
		System.out.println(getSpecificPropFromFile(fileNam, "Password"));
		
	}
	
	public static String getSpecificPropFromFile(String propName) throws Exception {
		Properties p = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\prabu\\git\\VinothiniJavaProject\\src\\main\\resources\\test1\\New.properties");
		p.load(fis);
		return p.getProperty(propName);
	}
	
	public static String getSpecificPropFromFile(String file,  String propName) throws Exception {
		Properties p = new Properties();
		FileInputStream fis= new FileInputStream(file);
		p.load(fis);
		return p.getProperty(propName);
	}
}
