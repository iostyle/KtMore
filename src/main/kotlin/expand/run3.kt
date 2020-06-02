package expand

/**
 * 拓展属性
 */
fun main() {
    val str = "aa"
    //没有backing field，不能存储值，其实际是通过setXXX(str，10)操作str
    //输出：aa10
    str.s = 10

    //输出：2
    println(str.s)
}

var String.s: Int
    get() = this.length
    set(value) {
        println(this.plus(value))
    }

val List<Any>.lastIndex: Int
    get() = size - 1