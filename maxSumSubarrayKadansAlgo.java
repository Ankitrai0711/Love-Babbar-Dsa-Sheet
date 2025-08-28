public class maxSumSubarrayKadansAlgo {
    public static void main(String []args) { 
        int arr[] = {1,2,3,4,5};
        int currentSum = arr[0];
        int max= arr[0];
        int n = arr.length;
        for(int i =1;i<n;i++){
            currentSum = Math.max(arr[i],currentSum+arr[i]);
            max = Math.max(max,currentSum);
        }
        System.out.println(max);
    }
}

//  We also can write code as like this , both are following the concept of the Kadanse` algo
// class Main{
//     public static void main(String []args){
//         int arr[] = {1,2,3,4,5};
//         int n = arr.length;
//         int currentSum=0;
//         int max = Integer.MIN_VALUE;
//         for(int i =0;i<n;i++){
//             currentSum = currentSum+arr[i];
//             max = Math.max(currentSum,max);
//             if(currentSum < 0){
//                 currentSum =0;
//             }
//         }
//         System.out.println(max);
//     }  
// }
