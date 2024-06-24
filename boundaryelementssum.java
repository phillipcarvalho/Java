import java.util.*;
public class boundaryelementssum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
    System.out.println("Enter number of rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr1[][]=new int[r][c];
        System.out.println("Enter first array elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
       
        sc.close();
        System.out.println("Array elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if((i==0)||(i==r-1)||(j==0)||(j==c-1)){
                sum=sum+arr1[i][j];
            }
        }
        }
        System.out.println("Boundary elements are: "+sum);
}

}
