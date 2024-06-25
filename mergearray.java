import java .util.*;
public class mergearray {
    public static void main(String[] args){
    int a[]={10,20,30,40};
    int b[]={50,60,70,80,90};
    int c[]=new int[a.length+b.length];
    for(int i=0;i<a.length;i++){
        c[i]=a[i];
    }
    for(int i=0;i<b.length;i++){
        c[a.length+i]=b[i];
    }
    System.out.println("Merged array elements:");
    for(int i=0;i<a.length+b.length;i++){
        System.out.println(c[i]+" ");
    }
}
}