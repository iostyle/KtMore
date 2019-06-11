package function

import java.io.File

fun testLetVSAlso() {

    var origin = "abc"

    /**
     * let 返回作用域内最后一个对象
     */
    origin.let {
        println(it)
        it.reversed()
    }.let {
        println(it)
        it.length
    }.let {
        println(it)
    }

    /**
     * also 返回对象本身
     */
    origin.also {
        println(it)
        it.reversed()
    }.also {
        println(it)
        it.length
    }.also {
        println(it)
    }

}

/**
 * 用作链式调用
 */
class also() {
    /**
     * 常规写法
     */
    fun mkdir(path: String): File {
        val file = File(path)
        file.mkdirs()
        return file
    }

    fun mkdir2(path: String): File {
        return path.let {
            File(path)
        }.also {
            it.mkdirs()
        }
    }

    fun mkdir3(path: String) = path.let { File(path) }.also { it.mkdirs() }
}
