import java.util.*;

public class equalmatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns for first matrix");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int arr1[][]=new int[r1][c1];
        System.out.println("Enter number of rows and columns for second matrix");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int arr2[][]=new int[r2][c2];
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
      
        int k=0;
		for( int i=0; i<r1;i++) {
			for(int j=0; j<c1; j++) {
				if(arr1[i][j]==arr2[i][j]) {
					k=1;
				}
                else{
                    k=0;
                }
				
			}
		}
			
			if(k==1){
				System.out.println("Equal Matrices");
            }
			else{
				System.out.println("Unequal matrices");
            }

        }
    }