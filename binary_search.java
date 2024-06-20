import java.util.*;
public class binary_search {
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
        int mid=0;
        int l=0;
        int u=n-1;
        while(l<=u){
            mid=l+u/2;
            if(arr[mid]==num){
                flag=1;
                break;
            }
            else if(num>arr[mid]){
                l=mid+1;
            }
            else{
                u=mid-1;
            }
        }
        if(flag==1){
            System.out.println("Element found");

        }
        else{
            System.out.println("Element not found");
        }
    }
}
