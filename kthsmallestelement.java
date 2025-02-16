import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    Scanner S=new Scanner(System.in);
	    int n=S.nextInt();
	    int arr[]=new int[n];
	 	    for(int i=0;i<n;i++)
	    {
	        arr[i]=S.nextInt();
	    }
	    Arrays.sort(arr);
	    int k=S.nextInt();
	    System.out.println(arr[k-1]);
	 
	    
	}
}