import java.util.HashMap;
/**
 * https://leetcode.com/problems/two-sum/
 * */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] temp = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if(map.containsKey(difference)){
                return new int[]{map.get(difference),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{0,0};
    }
}
