import java.util.*;
public class name {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.nextLine();
        sc.close();
        String arr[]=name.split(" ");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i].charAt(0)+".");
        }
        System.out.print(arr[arr.length-1]);
    }
    
}
