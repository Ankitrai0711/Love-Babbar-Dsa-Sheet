import java.util.Arrays;
import java.util.HashMap;
public class TwoSumHashMap {
    public static void main(String []args){
        int arr[] = {1,2,3,4,5};
        int target = 5;
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                System.out.println(Arrays.toString(new int[] {map.get(complement),i}));
            }
            map.put(arr[i],i);
        }
    }
}



// import java.util.HashMap;
// import java.util.Map;

// public class TwoSum {
//     public static int[] twoSum(int[] nums, int target) {
//         Map<Integer, Integer> map = new HashMap<>();

//         for (int i = 0; i < nums.length; i++) {
//             int complement = target - nums[i];

//             // Check if complement exists in map
//             if (map.containsKey(complement)) {
//                 return new int[] { map.get(complement), i };
//             }

//             // Store current number with index
//             map.put(nums[i], i);
//         }

//         throw new IllegalArgumentException("No two sum solution");
//     }

//     public static void main(String[] args) {
//         int[] nums = {2, 7, 11, 15};
//         int target = 9;

//         int[] result = twoSum(nums, target);
//         System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
//     }
// }
