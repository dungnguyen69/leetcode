package topKFrequent;

public class Leetcode {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		int[] result;
		result = TopKFrequent.topKFrequent(nums, k);
		System.out.println("Top " + k + " Frequent elements");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
