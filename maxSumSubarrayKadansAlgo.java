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
