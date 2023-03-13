package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> h = new HashMap<>();

		int result[] = new int[2];
		for (int i = 0; i < nums.length; ++i) {
			Integer temp = h.get((target - nums[i]));
			if (temp != null) {
				result[0] = temp;
				result[1] = i;
				break;
			} else {
				h.put(nums[i], i);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		TwoSum sum = new TwoSum();
		int [] i = {2,7,11,15};
		int [] twosum = sum.twoSum(i, 9);
		System.out.println(Arrays.toString(twosum));
	}

}
