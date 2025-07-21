package ArraysAndString;
import java.util.Scanner;
public class RotateArray {
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt(); 
	        int[]a=new int[n];
	        for(int i=0;i<n;i++)
	            a[i]=sc.nextInt();
	        int d=sc.nextInt();
	        d=d%n;
	        reverse(a,0,d - 1);
	        reverse(a,d,n - 1);
	        reverse(a,0,n - 1);
	        for(int i=0;i<n;i++)
	            System.out.print(a[i]+" ");
	    }

	    static void reverse(int[]a,int start, int end) {
	        while(start<end) {
	            int temp=a[start];
	            a[start]=a[end];
	            a[end]=temp;
	            start++;
	            end--;
	        }
	    }
	}
