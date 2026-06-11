import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create  map to store the number and its index
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If complement exists in the map, we found our pair!
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, remember this number and its index for later
            map.put(nums[i], i);
        }
        
        // Return  empty array if no match is found
        return new int[] {};
    }
}
