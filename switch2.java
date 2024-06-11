import java.util.*;
public class switch2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sen=sc.nextLine();
        sc.close();
        char ch;
        char ch2;
        int pch;
        String news="";
        for(int i=0;i<sen.length();i++){
            ch=sen.charAt(i);
            pch=ch;
            if((pch>=65)&&(pch<90)){
                ch2=(char)(pch+1);
            }
            else if((pch>=97)&&(pch<122)){
                ch2=(char)(pch+1);
            }
            else if(pch==122){
                ch2=(char)(97);
            }
            else if(pch==90){
                ch2=(char)(65);
            }
            else{
                ch2=ch;
            }
            news=news+ch2;
        }
        System.out.println("Updated string: "+news);
    }
}

