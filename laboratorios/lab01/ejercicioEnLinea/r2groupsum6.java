package lab1;

public class r2groupsum6 {
	public static boolean groupSum6(int start, int[] nums, int target) {
	    if (start >= nums.length) return target == 0;
	    if (nums[start] == 6)
	        return groupSum6(start + 1, nums, target - nums[start]);
	    return groupSum6(start + 1, nums, target - nums[start])
	            || groupSum6(start + 1, nums, target);
	}
}
