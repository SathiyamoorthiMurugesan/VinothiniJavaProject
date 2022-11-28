package seleniumpractices;

import java.time.format.DateTimeFormatter;

public class DateClass {

	public static void main(String[] args) {

		
		dateStringSplitintoDateMonthYear("20302022");
	}
	
	public static void dateStringSplitintoDateMonthYear(String dob)
	{
	String date = dob.substring(0,2);
	String month = dob.substring(2,4);
	String year = dob.substring(4,8);
	
	System.out.println("Date: "+ date);
	System.out.println("Month: "+ month);
	System.out.println("Year : "+year);
	
	DateTimeFormatter.ofPattern(year);
	
	
}

}
