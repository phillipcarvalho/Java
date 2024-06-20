import java.util.*;
public class selectionsort {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    sc.close();
    System.out.println("Array in entered order:");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.println("Array in sorted order");
    int temp=0;
    for (int i = 0; i < n-1; i++) 
    { 
        
        int min = i; 
        for (int j = i+1; j < n; j++) {
            if (arr[j] < arr[min]) {
                min = j; 

        }
         temp = arr[min]; 
        arr[min] = arr[i]; 
        arr[i] = temp; 
    } 
} 

    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}
}
