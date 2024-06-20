import java.util.*;
public class linear_search {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
       
        System.out.println("Enter the element to be searched:");
        int num=sc.nextInt();
        sc.close();
        int flag=0;
        int x=0;
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                flag=1;
                x=i;
            }
            
        }
        if(flag==1){
            System.out.println(num+" found at index "+x+" in the array");
        }
        else{
            System.out.println("Element not found");
        }

    }
}
