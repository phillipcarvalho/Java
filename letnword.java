
import java.util.*;
public class letnword {
    void find(String s,char x){
        char y=x;
        int x1=x;
        if((x1>=65)&& (x1<=90)){
            int y1=x1+32;
            y= (char)y1;
        }
        if((x1>=97)&&(x1<=122)){
            int y1=x1-32;
            y=(char)y1;
        }
        String arr[]=s.split(" ");
        for(String word:arr){
            if((x==word.charAt(0)) || (y==word.charAt(0)) ){
                System.out.print(word+ " ");
            }
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String sent;
        char x;
        System.out.println("Enter the sentence to be checked: ");
        sent=sc.nextLine();
        System.out.println("Enter the letter to be checked in lower case");
        x=sc.next().charAt(0);
        sc.close();
        letnword l=new letnword();
        System.out.println("Words in "+sent+" starting with letter "+x+" :");
        l.find(sent,x);
    }
}
