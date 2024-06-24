import java.util.*;
public class summatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
    System.out.println("Enter number of rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr1[][]=new int[r][c];
        int arr2[][]=new int[r][c];
        System.out.println("Enter first array elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter second array elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Addition of two Arrays: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr1[i][j]+arr2[i][j]+"\t");
            }
            System.out.println();
        }
       
}
}

