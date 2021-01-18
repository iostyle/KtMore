package algorithm_revenge.tree

import algorithm_revenge.tree.leetcode.LeetCode_105
import algorithm_revenge.tree.leetcode.LeetCode_124
import algorithm_revenge.tree.leetcode.LeetCode_707

fun main() {
//    val run = LeetCode_124()
//
//    val node = getTestTreeNodes()
//
//    run.maxPathSum(node)
//
//    println(run.answer.toString())

//    val run = LeetCode_105()
//    run.buildTree(intArrayOf(3, 9, 20, 15, 7), intArrayOf(9, 3, 15, 20, 7))

    /*
    ["MyLinkedList","addAtHead","get","addAtHead","addAtHead","deleteAtIndex","addAtHead","get","get","get","addAtHead","deleteAtIndex"]
                    [[],[4],[1],[1],[5],[3],[7],[3],[3],[3],[1],[4]]
     */
//    val obj = LeetCode_707.MyLinkedList()
//    obj.addAtHead(4)
//    obj.get(1)
//    obj.addAtHead(1)
//    obj.addAtHead(5)
//    obj.deleteAtIndex(3)
//    obj.addAtHead(7)
//    obj.get(7)
//    obj.get(3)
//    obj.get(3)
//    obj.addAtHead(1)
//    obj.deleteAtIndex(4)
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

