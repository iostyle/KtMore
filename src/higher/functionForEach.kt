package higher

fun testForEach(){
    val list = listOf(1, 2, 3, 4, 5)
    list.forEach(::println)
    list.forEach { println(it) }
}