
import java.util.*;
public class vowels {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the sentence");
    String s=sc.nextLine();
    sc.close();
    int count=0;
    for(int i=0;i<s.length();i++){
        char ch=(s.toLowerCase()).charAt(i);
        if((ch=='a')||(ch=='e')||(ch=='i')|| (ch=='o')||(ch=='u')){
            count++;
        }
    }
    System.out.println("Number of vowels: "+count);
  }
    
}
