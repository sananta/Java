public class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> map = new HashMap<>(); //how to declare a hashmap
       for (int i = 0; i < nums.length; i++) {
           int complement = target - nums[i];
           if (map.containsKey(complement) && map.get(complement) != i) {
               return new int[] {map.get(complement), i};
           }
           else {
                map.put(nums[i], i); 
           }
      }
      return null; 
    }
}
