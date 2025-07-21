package ArraysAndString;
import java.util.Scanner;
public class RevMannualInbuilt {
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        String s=sc.nextLine();
	        String rev1="";
	        for(int i=s.length()-1;i>=0;i--)
	            rev1+=s.charAt(i);
	        String rev2=new StringBuilder(s).reverse().toString();
	        System.out.println("Manual Reverse: "+rev1);
	        System.out.println("Built in Reverse: "+rev2);
	        if(rev1.equals(rev2))
	            System.out.println("Same");
	        else
	            System.out.println("Different");
	    }
	}
