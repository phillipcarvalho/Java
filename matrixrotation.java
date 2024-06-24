import java.util.*;
public class matrixrotation {
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
        System.out.println("Clockwise Rotation by 90 degrees:");
        for(int j=0;j<c;j++){
            for(int i=r-1;i>=0;i--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("AntiClockwise Rotation by 90 degrees:");
        for(int j=c-1;j>=0;j--){
            for(int i=0;i<r;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(" Rotation by 180 degrees:");
        for(int i=r-1;i>=0;i--){
            for(int j=c-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
}
}
