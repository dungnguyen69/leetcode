package twoSum;

import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] output = null;
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(target - nums[i]))
				map.put(nums[i], i);
			else {
				output = new int[] { map.get(target - nums[i]), i };
				break;
			}
		}
		return output;
	}
}
