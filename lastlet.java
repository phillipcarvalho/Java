import java.util.*;
public class lastlet {
    void last(String s){
        String arr[]=s.split(" ");
        for(String x:arr){
            System.out.print(x.charAt(x.length()-1)+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence");
        String sent=sc.nextLine();
        System.out.println("Last letter of each word in sentence");
        sc.close();
        lastlet l=new lastlet();
        if((sent.charAt(sent.length()-1)=='.') || (sent.charAt(sent.length()-1)=='!') || (sent.charAt(sent.length()-1)=='?')){
        l.last(sent.substring(0,sent.length()-1));
    }
    else{
        l.last(sent);
    }
}
}