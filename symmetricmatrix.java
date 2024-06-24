import java.util.*;

public class symmetricmatrix {
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
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        int k=0;
		for( int i=0; i<r;i++) {
			for(int j=0; j<c; j++) {
				if(arr[i][j]!=arr[j][i]) {
					k=1;
				}
				
			}
		}
			
			if(k==1){
				System.out.println("Its a not a symmetric matrix");
            }
			else{
				System.out.println("Its a symmetric matrix");
            }

        }
    }


