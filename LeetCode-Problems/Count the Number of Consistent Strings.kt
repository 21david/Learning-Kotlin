//  https://leetcode.com/problems/count-the-number-of-consistent-strings/

class Solution {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        // 228 ms, faster than 89.33% (varies with every submission)
        // 36.6 mb, less than 74.67% (varies with every submission)
        
        val allowedChars: MutableSet<Char> = mutableSetOf()
        
        for(char in allowed)
            allowedChars += char
        
        var count = 0
        
        outerLoop@
        for(word in words) {
            // check that the word is "consistent"
            for(char in word)
                // if not present in 'allowedChars'
                if(!allowedChars.contains(char)) 
                    continue@outerLoop // move on to the next word
            
            // if all letters were allowed, we need to count this string
            count++
        }
        
        return count
    }
}

/*
Sample input:
"ab"
["ad","bd","aaab","baa","badab"]
"abc"
["a","b","c","ab","ac","bc","abc"]
"cad"
["cc","acd","b","ba","bac","bad","ac","d"]
"z"
["zzzzzzzz"]
"x"
["yyyyyy", "zzzzx", "xyz", "xxx", "yyy", "zzz"]

*/
