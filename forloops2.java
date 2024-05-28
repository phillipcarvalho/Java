import java.util.*;

public class forloops2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n1=sc.nextInt();
            int sum=a;
            for(int j=0;j<n1;j++){
                sum=sum+(int)Math.pow(2,j)*b;
                 System.out.print(sum+" ");
                
            }
            System.out.println();
        }
    }
}

            