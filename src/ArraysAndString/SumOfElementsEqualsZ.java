package ArraysAndString;
import java.util.Scanner;
public class SumOfElementsEqualsZ {
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int[]a=new int[n];
	        for(int i=0;i<n;i++)
	            a[i]=sc.nextInt();
	        int z=sc.nextInt(); 
	        for(int i=0;i<n;i++) {
	            for(int j=i+1;j<n;j++) {
	                if(a[i]+a[j]==z)
	                    System.out.println(a[i]+"+"+a[j]);
	            }
	        }
	    }
	}
