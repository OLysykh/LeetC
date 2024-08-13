package tasks.N1TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        var nums = new int[]{2, 7, 11, 15};
        var nums = new int[]{3,2,4};
        int target = 6;
        Arrays.stream(twoSum(nums, target)).forEach(x -> System.out.print(x + " "));
    }

//    private static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//
//        return new int[]{-1, -1};
//    }



    //more optimised solution
    private static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                return new int[]{map.get(difference), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

}