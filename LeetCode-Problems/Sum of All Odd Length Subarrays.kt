// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/

class Solution {
    fun sumOddLengthSubarrays(arr: IntArray): Int {
        var len = arr.size
        
        var sum = 0
        
        // arrLen takes on the values [1, 3, 5, .., len]
        for(arrLen in 1..len step 2) {
            
            // iterate through all subarrays of size arrLen
            // startIndex represents the start of each subarray
            for(startIndex in 0..(len - arrLen)) {
                
                // visit the next 'arrLen' elements
                // (if arrLen = 3, visit the next 3 elements)
                for(t in startIndex until (startIndex+arrLen))
                    sum += arr[t]
            }
        } 
        
        return sum
    }
}
