package leet_code

object Palindrome {
    fun isPalindrome(x: Int): Boolean {
        val string = x.toString()
        val middleIndex = string.length / 2
        val left = string.substring(0, middleIndex).toCharArray()
        val right = string.substring(middleIndex, string.length).reversed().toCharArray()
        for (i in 0 until middleIndex) {
            if (left[i] != right[i]) return false
        }
        return true
    }

    class Node {
        var v: Int = -1
        var next: Node? = null
    }

    /**
     * 判断单链表是否为回文链
     */
    fun isNodeListPalindrome(x: Long): Boolean {
        //init 模拟输入一个头节点
        var head: Node? = null
        var t: Node? = null
        x.toString().toCharArray().forEach {
            if (head == null) {
                head = Node()
                head?.v = it.toString().toInt()
                t = head
            } else {
                t?.next = Node().apply {
                    v = it.toString().toInt()
                }
                t = t?.next
            }
        }

        //start
        var slowNode: Node? = head
        var fastNode: Node? = head
        while (fastNode?.next?.next != null) {
            slowNode = slowNode?.next
            fastNode = fastNode.next?.next
        }

        slowNode?.next?.let {
            var flipNode: Node? = flipNodeList(it)
            while (flipNode != null) {
                if (flipNode.v != head?.v) return false
                flipNode = flipNode.next
                head = head?.next
            }
        }

        return true
    }

    private fun flipNodeList(node: Node): Node {
        // 5 4 3 2 1
        val dummyHead = Node().also { it.next = node }

//        dummyHead.print()

        val curNode: Node? = node

        while (curNode?.next != null) {

            val temp = dummyHead.next

            dummyHead.next = curNode.next

            curNode.next = curNode.next?.next

            dummyHead.next?.next = temp

//            dummyHead.print()
        }

        return dummyHead.next!!
    }


    fun Node.print() {
        var temp: Node? = this
        print("(${temp?.v},")
        while (temp?.next != null) {
            temp = temp.next
            print("${temp?.v},")
        }
        print(")")
        println()
    }
}