package ArraysAndString;
import java.util.Scanner;
public class CombinationPermutation {
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        String s=sc.nextLine();
	        System.out.println("Combinations:");
	        combinations("",s);
	        System.out.println("Permutations:");
	        permutations("",s);
	    }
	    static void combinations(String prefix,String s) {
	        for(int i=0;i<s.length();i++) {
	            String combo=prefix+s.charAt(i);
	            System.out.println(combo);
	            combinations(combo,s.substring(i+1));
	        }
	    }
	    static void permutations(String prefix,String s) {
	        if(s.length()==0)
	            System.out.println(prefix);
	        for(int i=0;i<s.length();i++)
	            permutations(prefix+s.charAt(i),s.substring(0, i)+s.substring(i+1));
	    }
	}
