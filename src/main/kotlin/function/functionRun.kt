package function

fun testRun() {
    var mood = "sad"
    /**
     * 独立作用域
     */
    run {
        val mood = "happy"
        println(mood)
    }
    println(mood)

    /**
     * 返回作用域内最后一个对象
     */
    mood = run {
        val flag = true
        if (flag) "happy" else "sad"
    }
    println(mood)
}