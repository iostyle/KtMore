package algorithm_revenge.tree.leetcode

class LeetCode_707 {

    class MyLinkedList() {

        /** Initialize your data structure here. */
        private var head: Node? = null

        class Node {
            var `val`: Int? = null
            var next: Node? = null
        }

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        fun get(index: Int): Int {
            if (index == 0) {
                return head?.`val` ?: -1
            }
            var pointer: Node? = head
            var pointerIndex = 0
            while (pointer?.next != null) {
                pointer = pointer.next
                pointerIndex++
                if (pointerIndex == index) {
                    return pointer?.`val` ?: -1
                }
            }
            return -1
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        fun addAtHead(`val`: Int) {
            head = Node().also {
                it.`val` = `val`
                it.next = head
            }
        }

        /** Append a node of value val to the last element of the linked list. */
        fun addAtTail(`val`: Int) {
            if (head == null) {
                head = Node().also {
                    it.`val` = `val`
                }
                return
            }
            var temp = head
            while (temp?.next != null) {
                temp = temp.next
            }
            temp?.next = Node().also {
                it.`val` = `val`
            }
        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        fun addAtIndex(index: Int, `val`: Int) {
            if (index == 0) {
                head = Node().also {
                    it.`val` = `val`
                }
                return
            }
            var pointer: Node? = head
            var pointerIndex = 0
            while (pointerIndex < index) {
                if (pointerIndex == index - 1) {
                    pointer?.next = Node().also {
                        it.`val` = `val`
                        it.next = pointer?.next
                    }
                    return
                } else {
                    if (pointer?.next != null) {
                        pointer = pointer.next
                        pointerIndex++
                    } else {
                        throw Error("ArrayIndexOutOfBoundsException")
                    }
                }
            }
            throw Error("ArrayIndexOutOfBoundsException")
        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        fun deleteAtIndex(index: Int) {
            if (index == 0) {
                head = head?.next
                return
            }
            var pointer: Node? = head
            var pointerIndex = 0
            while (pointerIndex < index) {
                if (pointerIndex == index - 1) {
                    pointer?.next = pointer?.next?.next
                    return
                } else {
                    if (pointer?.next != null) {
                        pointer = pointer.next
                        pointerIndex++
                    }
                }
            }
        }

    }

    /**
     * Your MyLinkedList object will be instantiated and called as such:
     * var obj = MyLinkedList()
     * var param_1 = obj.get(index)
     * obj.addAtHead(`val`)
     * obj.addAtTail(`val`)
     * obj.addAtIndex(index,`val`)
     * obj.deleteAtIndex(index)
     */
}