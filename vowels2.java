import java.util.*;
public class vowels2 {
    void find(String s){
        String arr[]=s.split(" ");
        int count=0;
        for(String x:arr){
            for(int i=0;i<x.length();i++){
                char ch=(x.toLowerCase()).charAt(i);
                if((ch=='a')||(ch=='e')||(ch=='i')|| (ch=='o')||(ch=='u')){
                    count++;
                }
            }
            System.out.println(x+":"+count);
            count=0;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sent=sc.nextLine();
        sc.close();
        vowels2 v=new vowels2();
        v.find(sent);

    }
}
