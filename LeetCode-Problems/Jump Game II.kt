//  https://leetcode.com/problems/jump-game-ii/

class Solution {
    fun jump(nums: IntArray): Int {
        // 164 ms, faster than 39%
        // 33.3mb, less than 95%
        
        /*
        Approach:
        Start from the end, and figure out the left-most element that can reach the end. This will be
        the last jump. Then, repeat, but pretend that that value you found is now the end of the array.
        Repeat this until the first element is reached. Technically, this could be done recursively.
        
        I think this is O(N^2) time complexity approach (for example, an array of all 1s would cause O(N^2) behavior)
        Space complexity is O(1)
        */
        
        findFurthestElement(nums, nums.size-1)
        return jumps
    }
    
    private var jumps: Int = 0
    
    private fun findFurthestElement(nums: IntArray, curEndIndex: Int) {
        if(curEndIndex == 0)
            return
        
        var indexThatCanJump = curEndIndex
        var jumpLength = 1
        
        for(i in curEndIndex-1 downTo 0) {
            if(nums[i] >= jumpLength) // if this element can jump to the end
                indexThatCanJump = i  // save this index
            jumpLength++
        }
        
        // after 1 iteration, we should have found a jump
        jumps++
        
        // now we should do it again, but starting from whatever index we found (indexThatCanJump)
        findFurthestElement(nums, indexThatCanJump)
    }
}

/*
Sample input:
[2,3,1,1,4]
[2,3,0,1,4]
[3,5,1,1,1,1,6,1,1,1,1,1]
[6,1,1,1,4,2,1,1,6,4,3,2,1,1]

*/
