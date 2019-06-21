package higher

/**
 * 以集合映射为例
 */
fun testMap() {

    var oldList = listOf(1, 2, 3, 4, 5)

    /**
     * 传统写法
     */
//    var newList = ArrayList<Int>()
//    oldList.forEach {
//        val newElement = it * 2 + 3
//        newList.add(newElement)
//    }

    /**
     * map写法
     */
    val newList = oldList.map { it * 2 + 3 }
    println(newList.toString())

    /**
     * 类型转换
     */
    val newList2 = oldList.map(Int::toDouble)
    println(newList2.toString())
}