package ArraysAndString;
import java.util.Scanner;
public class FrequentElementFrequency {
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int[]a=new int[n];
	        for(int i=0;i<n;i++)
	            a[i]=sc.nextInt();
	        int count=0,freq=a[0];
	        for(int i=0;i<n;i++) {
	            int c=1;
	            for(int j=i+1;j<n;j++) {
	                if(a[i]==a[j])
	                    c++;
	            }
	            if(c>count) {
	                count=c;
	                freq=a[i];
	            }
	        }
	        System.out.println("Most Frequent Element: "+freq);
	        System.out.println("Frequency: "+count);
	    }
	}
