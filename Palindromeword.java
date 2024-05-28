package HackerRank;
import java.util.*;
public class Palindromeword {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
     
        int len=a.length();
        String a2="";
        for(int i=len-1;i>=0;i--){
            char ch=a.charAt(i);
            a2=a2+ch;
        }
        if(a.compareTo(a2)==0){
            System.out.println("Yes");
        }
            else{
                System.out.println("No");
            
        }
        
    }
}
