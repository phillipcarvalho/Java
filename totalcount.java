import java.util.*;
public class totalcount {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the sentence");
    String sen=sc.nextLine();
        sc.close();
        int uc=0;
        int lc=0;
        int dc=0;
        int pch;
        for(int i=0;i<sen.length();i++){
            char ch=sen.charAt(i);
            pch=ch;
            if((pch>=65)&&(pch<=90)){
                uc++;
            }
            if((pch>=97)&&(pch<=122)){
                lc++;
            }
            if((pch>=48)&&(pch<=57)){
            dc++;
        }
    }
        System.out.println("Number of uppercase characters "+uc);
        System.out.println("Number of lowercase characters "+lc);
        System.out.println("Number of digits "+dc);
    
}
}