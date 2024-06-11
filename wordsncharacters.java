import java .util.*;

 class wordsncharacters{
     void find(String s){
        String[] arr=s.split(" ");
        for(String x:arr){
            System.out.println(x+":"+x.length());

            }
        }
        public static void main(String[] args){
            String sentence;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the sentence: ");
            sentence=sc.nextLine();
            sc.close();
             wordsncharacters t=new wordsncharacters();
            t.find(sentence);
        }
     }


