import java.util.*;
public class maxmin2 {
            public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter number of rows and columns");
                int r=sc.nextInt();
                int c=sc.nextInt();
                int arr[][]=new int[r][c];
                System.out.println("Enter array elements");
                for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                        arr[i][j]=sc.nextInt();
                    }
                }
                sc.close();
                System.out.println("Array elements:");
                for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                }
                int max=arr[0][0];
                int min=arr[0][0];
               for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(max<arr[i][j]){
                        max=arr[i][j];
                    }
                    else if(min>arr[i][j]){
                        min=arr[i][j];
                    }
                }
               }
               System.out.println("Largest element: "+max);
               System.out.println("Smallest element: "+min);
            }
    
}
