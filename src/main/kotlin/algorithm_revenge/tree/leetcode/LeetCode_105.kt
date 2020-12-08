package algorithm_revenge.tree.leetcode

import algorithm_revenge.tree.TreeNode

class LeetCode_105 {

    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        //中序遍历的索引
        val inMap = HashMap<Int, Int>()
        for (i in inorder.indices) {
            inMap[inorder[i]] = i
        }

//        val root = buildTree(preorder, inorder, 0, preorder.size - 1, 0, inorder.size - 1, inMap)
        val root = buildTree(preorder, 0, preorder.size - 1, inorder, 0, inorder.size - 1, inMap)

        return root
    }

    fun buildTree(preorder: IntArray, inorder: IntArray, preLeft: Int, preRight: Int, inLeft: Int, inRight: Int, inMap: HashMap<Int, Int>): TreeNode? {
        if (preLeft > preRight || inLeft > inRight) return null

        val root = TreeNode(preorder[preLeft])
        val pIndex = inMap[root.`val`]!!

        val leftDiff = pIndex - inLeft
        val rightDiff = preRight - pIndex + inLeft - preLeft

        root.left = buildTree(preorder, inorder, preLeft + 1, pIndex - inLeft + preLeft, pIndex - leftDiff, pIndex - 1, inMap)
        root.right = buildTree(preorder, inorder, pIndex - inLeft + preLeft + 1, pIndex - inLeft + preLeft + rightDiff, pIndex + 1, pIndex + rightDiff, inMap)

        return root
    }

    fun buildTree(preorder: IntArray, preStart: Int, preEnd: Int, inorder: IntArray, inStart: Int, inEnd: Int, inMap: HashMap<Int, Int>): TreeNode? {
        if (preStart > preEnd || inStart > inEnd) return null

        val root = TreeNode(preorder[preStart])
        val inRoot = inMap[root.`val`]!!
        val numsLeft = inRoot - inStart

        root.left = buildTree(preorder, preStart + 1, preStart + numsLeft, inorder, inStart, inRoot - 1, inMap)
        root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd, inorder, inRoot + 1, inEnd, inMap)

        return root
    }

}