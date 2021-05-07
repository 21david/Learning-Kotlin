//  https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    var sol: TreeNode? = null
    
    fun sortedListToBST(head: ListNode?): TreeNode? {
        // 220 ms, faster than 19.05%
        // 39.6 mb, less than 14.29%
        
        if(head == null)
            return null
        
        // convert the linkedlist to an array:
        // find the size
        var size = 0
        var t = head
        while(t != null) {
            size++
            t = t.next
        }
        
        val inputNums = Array(size) {0}.toIntArray()
        t = head
        var i = 0
        while(t != null){
            inputNums[i++] = t.`val`
            t = t.next
        }
        
//        println(Arrays.toString(inputNums))
        
        recursive(inputNums, 0, inputNums.size-1)
        
        return sol
    }
    
    
    fun recursive(array: IntArray, start: Int, end: Int) {
        if(start > end)
            return
        
        var mid = (start + end) / 2
        
        if(sol == null)
            sol = TreeNode(array[mid])
        else
            addToBST(sol, array[mid])    
            
        // recursive call with left half of array
        recursive(array, start, mid-1)
        
        // recursive call with right half of array
        recursive(array, mid+1, end)
    }
    
    fun addToBST(root: TreeNode?, num: Int) {
        if(root == null)
            return
        
        if(num < root.`val`) { // if number belongs somewhere to the left of current node
            if(root.left == null) // if there is an open spot
                root.left = TreeNode(num) // put it where it belongs
            else
                addToBST(root.left, num)  // keep searching for its spot
        }
        else if(num >= root.`val`) {   
            if(root.right == null)
                root.right = TreeNode(num)
            else
                addToBST(root.right, num)
        }
    }
}

/* 
Sample input:
(Have to draw them out to see if they met the description's requirements)
[-10,-3,0,5,9]
[-3,-2,-1,0,1,2,3]
[-5,-4,-3,-2,-1,0,1,2,3,4,5]
[-5,-4,-3,-2,-1,0,1,2,3,4,5, 6]

*/
