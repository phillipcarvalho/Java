import java.util.*;

public class anagrams {
    static boolean isAnagram(String a, String b) {
        String a1=a.toLowerCase();
        String b1=b.toLowerCase();
        int a2=0;
        int b2=0;
        int flag=1;
        char c;
        if(a1.length()==b1.length()){
        for(int i=0;i<a1.length();i++){
            c=a1.charAt(i);
            for(int j=0;j<a1.length();j++){
                if(c==a1.charAt(j)){
                    a2++;
                }
                 if(c==b1.charAt(j)){
                    b2++;
                }
              
            }
           
              if(a2==b2){
                    flag=1;
              }
             else{
                    flag=0;
             }
             a2=0;
             b2=0;//refreshing values
        }
        if((flag==1) ){
            return true;
            
        }
        else{
            return false;
        
        }
    }
    else{
        return false;
    }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
