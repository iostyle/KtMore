package algorithm.question.egg

class Egg {

//    // k层会碎
//    val k = 18

//    var eggs = 2
//
//    fun findK() {
//        var current = -1
//        var num = -1
//
//        while (current < k) {
//            current += eggs
//            num++
//            println("第${num}次 在${current}层丢 ${if (current < k) "没碎" else "碎了"}")
//        }
//
//        num++
//        println("第${num}次 在${current - 1}层丢 ${if (current - 1 < k) "没碎" else "碎了"}")
//        println("一共丢了${num}次 k为${if (current - 1 >= k) current - 1 else current}")
//    }

    // k层会碎
    private val k = 15

    // 有多少个蛋
    private var eggs = 2

    private var currentEggs = eggs

    fun findK() {
        var current = -1
        var num = 0

        while (true) {
            num++

            if (currentEggs == eggs) {
                current += eggs

                if (current >= k) {
                    currentEggs--
                }

                println("第${num - 1}次 在第${current}层丢 ${if (current < k) "没碎" else "碎了"} 还有${currentEggs}个蛋")
            } else {
                current--

                if (current >= k) {
                    currentEggs--
                    println("第${num - 1}次 在第${current}层丢 ${if (current < k) "没碎" else "碎了"} 还有${currentEggs}个蛋")
                    if (currentEggs == 0) {
                        println("一共丢了${num}次 k为${current}")
                        return
                    }
                } else {
                    println("第${num - 1}次 在第${current}层丢 ${if (current < k) "没碎" else "碎了"} 还有${currentEggs}个蛋")
                    println("一共丢了${num}次 k为${current + 1}")
                    return
                }
            }
        }
    }
}