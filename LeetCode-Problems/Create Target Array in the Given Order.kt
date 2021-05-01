//  https://leetcode.com/problems/create-target-array-in-the-given-order/

class Solution {
    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
        /*
        Time complexity could be drastically improved
        Instead of pushing everything back with inner for loop,
        we could use a different data structure (maybe a linked list)
        */
        
        val target: IntArray = Array(nums.size) {-1}.toIntArray()
        
        for(i in 0 until nums.size) {
            // if something is already there, push everything back
            if(target[index[i]] != -1) 
                for(z in nums.size-1 downTo index[i]+1 )
                    target[z] = target[z-1]
                
            target[index[i]] = nums[i]
        }
        
        return target
    }
}
