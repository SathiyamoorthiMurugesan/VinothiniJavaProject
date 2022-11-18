package filepractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilePractice {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("D:\\Learnings\\Vino.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String Str1;
		
		while((Str1=br.readLine())!= null)
		{
			System.out.println(Str1);
		}
		br.close();
			
	}
  
}






















































































