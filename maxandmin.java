import java.util.*;
public class maxandmin {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter array elements:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    sc.close();
    int max=arr[0];
    int min=arr[0];
    for(int i=0;i<n;i++){
        if(max<arr[i]){
            max=arr[i];
        }
        else if(min>arr[i]){
            min=arr[i];
        }

    }
    System.out.println("Largest element: "+max);
    System.out.println("Smalles element: "+min);
}
}
