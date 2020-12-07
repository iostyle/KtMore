package algorithm_revenge.tree.leetcode

import algorithm_revenge.tree.TreeNode

class LeetCode_124 {
    var answer = Int.MIN_VALUE

    fun maxPathSum(root: TreeNode?): Int {
        traverse(root)
        return answer
    }

    fun traverse(root: TreeNode?): Int {
        return root?.let {

            val left = Math.max(0, traverse(it.left))
            val right = Math.max(0, traverse(it.right))

            answer = Math.max(answer, left + right + it.`val`)

            return Math.max(left, right) + it.`val`

        } ?: 0
    }
}