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
public class countClumps {
    public int countClumps(int[] nums) {
    int count = 0;
    int i = 0;
      
    while(i < nums.length) {
        int val = nums[i];
        i++;
        int length = 1;
        while(i < nums.length && nums[i] == val) {
            i++;
            length++;
        }
                                            
        if(length > 1)
            count++;
    }
                                                          
    return count;
}
}
