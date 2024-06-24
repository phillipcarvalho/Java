import java.util.*;
public class diagonalelements {
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
        System.out.println(" Diagonal elements are:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if((i==j)||(i+j==r-1)){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
}
}

