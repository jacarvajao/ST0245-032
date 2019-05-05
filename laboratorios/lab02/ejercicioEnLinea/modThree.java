
public class modThree {
	int[] nums;
	
	modThree(int[] nums){
		this.nums=nums;
	}
 	public boolean modThreem() {
		  boolean result = false;
		  for (int i = 0;i<nums.length-2;i++)
		  if( (nums[i] % 2 == 0 && nums[i+1] % 2 == 0 && nums[i+2] % 2 == 0)|| (!(nums[i] % 2 == 0) && !(nums[i+1] % 2 == 0) && !(nums[i+2] % 2 == 0)))
		    result = true;
		    
		    return result;
		        
		}
}
