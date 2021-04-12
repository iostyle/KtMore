package coroutine

import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch() {
        println("start")
        val deferred = GlobalScope.async {
            delay(3000)
            "result"
        }
        println("before")
        println(deferred.await())
        println("after")
    }
    Thread.sleep(5000)
    println("end")

    /** 结果
    start
    before
    result
    after
    end
     */
}