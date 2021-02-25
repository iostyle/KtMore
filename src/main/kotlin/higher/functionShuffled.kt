package higher

fun testShuffled() {
    /**
     * shuffled 随机打乱顺序
     * take 从集合中取至多个参数
     */
    val data = arrayListOf<Int>(1, 2, 3, 4, 5)
    data.shuffled()
//            .take(7)
            .take(3)
            .forEach {
                println(it)
            }
}