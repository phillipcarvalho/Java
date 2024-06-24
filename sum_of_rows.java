import java.util.*;
public class sum_of_rows {
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
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum=sum+arr1[i][j];
            }
            System.out.println("Sum of row "+(i+1)+":"+sum);
            sum=0;
        }
      
}

}