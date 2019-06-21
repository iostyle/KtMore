package higher

fun testReduce() {

    var list = listOf(1, 2, 3, 4, 5)
//    val sum = list.reduce { acc, i -> acc + i }
//    println(sum)

    var res = list.map(::factorial)
    println(res)

//    println(factorial(3))
}


//求n的阶乘：n!=1×2×3×...×n
fun factorial(n: Int): Int {
    return if (n == 0) {
        1
    } else {
        /**
         *  这里acc是累计结果
         *  i 是当前循环值
         *  -> 箭头后面的返回值赋值给acc
         *  最终返回acc
         */
        (1..n).reduce { acc, i ->
            acc * i
        }
    }
}