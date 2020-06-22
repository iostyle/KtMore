package algorithm.leet_code

/**
给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

示例：

输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/add-two-numbers
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun ListNode.toStr(): String {
    var temp = this
    var str = temp.`val`.toString() + " "
    while (temp.next != null) {
        str += temp.next!!.`val`.toString() + " "
        temp = temp.next!!
    }
    return str
}

class q2 {
    // 这个方案超出内存限制了
//    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
//        var t1 = l1
//        var t2 = l2
//        val l3 = ListNode((t1?.`val` ?: 0) + (t2?.`val` ?: 0))
//        var t3 = l3
//        // 整合
//        while (t1?.next != null || t2?.next != null || l3.`val` >= 10) {
//            t1 = t1?.next
//            t2 = t2?.next
//            t3.next = ListNode((t1?.`val` ?: 0) + (t2?.`val` ?: 0))
//            t3 = t3.next!!
//        }
//        // 重新进位10
//        t3 = l3
//        while (t3.next != null) {
//            if (t3.`val` >= 10) {
//                t3.`val` -= 10
//                t3.next!!.`val` += 1
//            }
//            t3 = t3.next!!
//        }
//        return l3
//    }

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var carry = 0
        var t1 = l1
        var t2 = l2
        while (true) {
            val v1 = t1?.`val` ?: 0
            val v2 = t2?.`val` ?: 0
            val result = (v1 + v2 + carry)
            when {
                result >= 10 -> {
                    carry = result / 10
                    t1?.`val` = (result % 10)
                }
                // 后边判断是因为中间结果可能为0
                result == 0 && (t1?.next == null && t2?.next == null) -> {
                    return l1
                }
                else -> {
                    carry = 0
                    t1?.`val` = result
                }
            }
            if (t1!!.next == null && (carry > 0 || t2?.next != null))
                t1.next = ListNode(0)
            t1 = t1.next
            t2 = t2?.next
        }
    }
}