package Q3;

import java.util.HashMap;
import java.util.Map;

public class Q3 {
    public static void main(String[] args) {
        int[] nums1 = {1,1,1};
        System.out.println(continuousSubArraysEqualsK(nums1, 2));

        int[] nums2 = {1,2,3};
        System.out.println(continuousSubArraysEqualsK(nums2, 3));

    }



    public static int continuousSubArraysEqualsK (int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i : nums) {
            sum += i;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum,0) + 1);
        }
        return count;
    }
}
