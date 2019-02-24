package lab1;

public class r2groupsum {
	public static boolean groupSum(int start, int[] nums, int target) {
	    if (start >= nums.length) return target == 0;
	    return groupSum(start + 1, nums, target - nums[start])
	            || groupSum(start + 1, nums, target);
	}
}
