package topKFrequent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

//Input: nums = [1,1,1,2,2,3], k = 2
//Output: [1,2]
public class TopKFrequent {
	public static int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1); // count frequencies of values
		}

		Queue<Integer> maxmaxheap = 
				new PriorityQueue<>((a, b) -> map.get(b) - map.get(a)); 
		// Descending order, compares 2 adjacent elements and swap its position (a and b are keys)
		for (int key : map.keySet()) {
			maxmaxheap.add(key);
		}

		int ans[] = new int[k];
		for (int i = 0; i < k; i++) {
			ans[i] = maxmaxheap.poll();
		}

		return ans;
	}
}
