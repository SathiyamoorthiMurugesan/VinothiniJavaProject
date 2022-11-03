package practiseExceptionHandling;

public class ThrowDemo {
	
//	CustomException CE = new CustomException();

	public static void main(String[] args) throws CustomException  {
		String pass = "1134";
		
		
		if(pass.length()==0) {
			throw new CustomException();
		}
		
		if(pass.length()<4) {
			throw new CustomException("AnyString");
		}
		
		if(!pass.equalsIgnoreCase("1234")) {
			throw new CustomException(true);
		}
	}

}
