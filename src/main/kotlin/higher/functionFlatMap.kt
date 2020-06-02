package higher

fun testFlatMap() {

    val oldList = arrayListOf(1..10, 2..8, 3..9)
    /**
     * flatMap 扁平化集合
     */
    val newList = oldList.flatMap { it }

    println(oldList.toString())
    println(newList.toString())

    /**
     * flatMap 结合 map
     */
    val newList2 = oldList.flatMap {
        it.map {
            "No.$it"
        }
    }
    println(newList2.toString())
}