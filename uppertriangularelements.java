import java.util.*;

public class uppertriangularelements {
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
    System.out.println("Upper Triangular Elements:");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(i<=j){ //to exclude the diagonal just keep if statement without equal to sign(=)
            System.out.print(arr[i][j]+"\t");
        }
        else{
       
                System.out.print("\t");
            
        }
    }
        System.out.println();
    }
}
}
