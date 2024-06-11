import java.util.*;
public class firstalphabetfrequency {
    int find(String s){
        char ch=s.charAt(0);
        int count=0;
        for(int i=0;i<s.length();i++){
            if(ch==s.charAt(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        firstalphabetfrequency f=new firstalphabetfrequency();
        System.out.println("The frequency of the first character in the sentence is:"+f.find(s));
    }
}
