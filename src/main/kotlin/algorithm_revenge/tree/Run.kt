package algorithm_revenge.tree

import algorithm_revenge.tree.leetcode.LeetCode_124

fun main() {
    val run = LeetCode_124()

    val node = getTestTreeNodes()

    run.maxPathSum(node)

    println(run.answer.toString())
}

fun getTestTreeNodes(): TreeNode {
    return TreeNode(-10).apply {
        left = TreeNode(9).apply {
        }
        right = TreeNode(20).apply {
            left = TreeNode(15)
            right = TreeNode(7)
        }
    }
}

