//  https://leetcode.com/problems/find-all-the-lonely-nodes/

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
    var sol: List<Int> = List(0) {0}
    fun getLonelyNodes(root: TreeNode?): List<Int> {
        /*
        Iterate recursively through the whole tree.
        If a node has only 1 child, add the value of that
        child to a list that is returned at the end.
        
        */
        
        traverse(root)
        println(sol)
        return sol
    }
    
    fun traverse(root: TreeNode?) {
        if(root == null)
            return
        
        if(root.left != null && root.right == null) {
            var value =  root.left.`val`
            sol += value
            traverse(root.left)
        }
        else if(root.left == null && root.right != null) {
            var value =  root.right.`val`
            sol += value
            traverse(root.right)
        }
        else { // neither is null or both are null
            traverse(root.left)
            traverse(root.right)
        }
    }
}

/*
Sample input:
[1,2,3,null,4]
[7,1,4,6,null,5,3,null,null,null,null,null,2]
[11,99,88,77,null,null,66,55,null,null,44,33,null,null,22]

*/
