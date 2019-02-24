package lab1;

public class r2groupnodeadj {
	public static boolean groupNoAdj(int start, int[] nums, int target) {
	    if (start >= nums.length) return target == 0;
	    return groupNoAdj(start + 2, nums, target - nums[start])
	            || groupNoAdj(start + 1, nums, target);
	}
}
