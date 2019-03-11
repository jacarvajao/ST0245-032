/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

/**
 *
 * @author Windows
 */
public class fix34 {
    public int[] fix34(int[] nums) {
    int i = 0;
    
    while(i < nums.length && nums[i] != 3)
        i++;
              
    int j = i + 1;
                  
    while(j < nums.length && nums[j] != 4)
        j++;
                            
    while(i < nums.length) {
        if(nums[i] == 3) {
            int temp = nums[i+1];
            nums[i+1] = nums[j];
            nums[j] = temp;
                                                          
            while(j < nums.length && nums[j] != 4)
                j++;
        }
        i++;
    }

    return nums;
}
}
