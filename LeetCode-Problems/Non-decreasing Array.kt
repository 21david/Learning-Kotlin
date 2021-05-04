//  https://leetcode.com/problems/non-decreasing-array/submissions/

class Solution {
    fun checkPossibility(nums: IntArray): Boolean {
        // 240 ms, faster than 100%
        // 38.7 mb, less than 100%
        
        var ct = 0
        var index = 0  // this will keep track of where the "dip" is
        
        for(i in 0 until nums.size - 1) {
            if(nums[i] > nums[i+1]) {
                if(ct == 1)  // if we found a dip
                    return false  // we can't have 2 dips
                ct++
                index = i
            }
        }
        
        if(ct == 0)  // if no dips, already non-decreasing
            return true
        
        // if only 1 dip at the beginning, we can just
        // change this number to make it non-decreasing
        if(index == 0) 
            return true;
        
        // if the dip was in the last 2 elements,
        // we can change the last element
        if(index == nums.size - 2)
            return true;
        
        // compare the sequence of #s before the dip and after.
        // both are non-decreasing, but does the 2nd one start out
        // greater (or equal to) than the end of first one?
        if(nums[index-1] > nums[index+1]) {  // if not, then we can't fix
            if(index < nums.size - 2 && nums[index] <= nums[index+2]) // (except for some cases) (edge case [5, 7, 1, 8])
                return true
            return false
        }
        
        return true
    }
}

/*
Sample input:
[4,2,3]
[4,2,1]
[1,2,3,6,4,5,6,7]
[1,2,3,4,6,5,6,8,7,9]
[1,1,1,1,6,1,1,1]
[1,1,1,5,1,1,1,1,5]
[1,1,1,1,4,1,1,1,1,4,1]
[3,4,2,3]
[5,6,7,8,1,2,3,4]
[5,1,2,3,4,5,6,7]
[1,2,3,4,5,7,6]
[4,5,6,7,8,9,6]
[5,7,1,8]
*/
