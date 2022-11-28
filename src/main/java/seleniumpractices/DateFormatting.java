package seleniumpractices;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {

	public static void main(String[] args) {		
		
		DateFormat d= new SimpleDateFormat("YYYY-MM-DD");
		System.out.println(d.format(new Date()));
		DateFormat d1 = new SimpleDateFormat("MM-dd-yyyy");
		System.out.println(d1.format(new Date()));
		
		
		// System.out.println(java.time.LocalDate.now());   
	}

}
