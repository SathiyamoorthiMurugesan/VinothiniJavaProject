package arrayComplete;

public class ReverseArray {

	public static void main(String[] args) {

		int a[]= {20,59,70,1,80,80,100,90};
		
		System.out.println("List of Array here");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("******************");
		System.out.println("Reverse of array");
		for(int j=a.length-1;j>=0;j--)
		{
			System.out.print(a[j]);
			System.out.print(" ");
				}
		
	}

}
