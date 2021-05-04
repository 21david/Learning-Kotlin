//  https://leetcode.com/problems/running-sum-of-1d-array/

class Solution {
    fun runningSum(nums: IntArray): IntArray {
        // 160 ms, faster than 89.45%
        // 35.3 mb, less than 91.37%
        // O(N) time complexity, O(1) space complexity
        
        for(i in 1 until nums.size)  // .size for the size of an IntArray
            nums[i] += nums[i-1]
        return nums
    }
    
    fun runningSum2(nums: IntArray): IntArray {
        // 192 ms, faster than 14.63%
        // 36.1 mb, less than 12.23%
        // O(N) time complexity, O(N) space complexity
        
        var sum: Int = 0
        val solution: IntArray = Array(nums.size) { 0 }.toIntArray()

        for(i in 0 until nums.size) {
            sum += nums[i]
            solution[i] = sum
        }

        return solution
    }
}

/*
Sample input:
[9]
[1,2,3,4]

*/
