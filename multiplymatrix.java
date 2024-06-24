import java.util.*;
public class multiplymatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
    System.out.println("Enter number of rows and columns for first matrix");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int arr1[][]=new int[r1][c1];
        System.out.println("Enter number of rows and columns for second matrix");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int arr2[][]=new int[r2][c2];
        int arr3[][]=new int[r1][c2];//2D array to store multiplied matrix
        System.out.println("Enter first array elements");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter second array elements");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Multiplication of two Arrays: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                arr3[i][j]=0;
                for(int k=0;k<c2;k++){
                    arr3[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
System.out.println("Multiplied matrix:");
for(int i=0;i<r1;i++){
    for(int j=0;j<c2;j++){
        System.out.print(arr3[i][j]+"\t");
    }
    System.out.println();
}
}
}
