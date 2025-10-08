package Coding;

import java.util.*;
class RemoveDuplicateElementFromArray {
    public static void main(String[] args) {
        int ar[] = {1,2,3,3,2,1,5,4,5,5};
        int j=0;
        int n = ar.length;
        sort(ar,n);
        
        for(int i =0;i<n-1;i++){
            if(ar[i]!=ar[i+1]){
                ar[j++]=ar[i];
            }
        }
    ar[j++] = ar[n - 1];
        for(int i =0;i<j;i++) {
            System.out.print(ar[i]+" ");
        }
          // System.out.println(Arrays.toString(ar));
    }
    
    
    public static void sort(int ar[],int n ){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}