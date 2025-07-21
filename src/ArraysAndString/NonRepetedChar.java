package ArraysAndString;
import java.util.Scanner;
public class NonRepetedChar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        char[] a=input.toCharArray();
        for(int i=0;i<a.length;i++) {
            boolean b=false;
            for(int j=0;j<a.length;j++) {
                if(i!=j&&a[i]==a[j]) {
                    b=true;
                    break;
                }
            }
            if(!b) {
                System.out.print(a[i]);
            }
        }
    }
}
