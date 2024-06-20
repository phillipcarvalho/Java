import java.util.*;
public class arraytasks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
 
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         
        }
        sc.close();
        System.out.println("Array elements are:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Array elements reversed:");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=arr[i];//Copying array elements
        }

        
    }
    
}
