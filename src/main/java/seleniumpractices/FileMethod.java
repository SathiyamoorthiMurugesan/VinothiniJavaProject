package seleniumpractices;

import java.io.File;
import java.io.IOException;

public class FileMethod {

	static File NewFile,f ;
	static File HelloWorld = new File("D://Learnings//HelloWorld.txt");
	
	public static void main(String[] args) throws Exception {

		File f = new File("D://Learnings//vino1234.txt");
		
		File NewFile = createNewFile();
		deleteFile(f);
		RenameFile(NewFile);
		createNewFolder("D://Learnings//","makeNewDirectory");
		changeFileFormat(HelloWorld);
		
	}
		
		public static File createNewFile() throws Exception{
			File NewFile = new File("D://Learnings//vino12345.txt");
			if(NewFile.createNewFile())
			{System.out.println("File gets created");
			}
			else 
				System.out.println("No file created yet");
			return NewFile;
		
		}
	
		public static void deleteFile(File emptyFile) {
		if(emptyFile.delete()){
			System.out.println("file get deleted");
		}
		else{
			System.out.println("File not deleted");
		}
		}
		public static void RenameFile(File NewFile) {
		boolean FileExists = NewFile.renameTo(new File("D://Learnings//RenameFile.txt"));
		System.out.println(FileExists);
		
		}
		public static void createNewFolder(String directory,String directoryName) 
		{
			String path= directory+directoryName;
			File file =new File(path);
			boolean result = file.mkdirs();
			if(result){
				System.out.println("Directory created successfully");
			}
			else {
				System.out.println("Directory not created successfully");
			}
		}
		public static void changeFileFormat(File HelloWorldTxtFile) 
		{
			String formattedFile= HelloWorldTxtFile.getPath().replace(".txt",".xls");
			HelloWorldTxtFile.renameTo(new File(formattedFile));
			System.out.println(formattedFile);
		}
		
}
	
	


