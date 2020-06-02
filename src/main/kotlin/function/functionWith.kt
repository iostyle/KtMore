package function

/**
 * with 返回作用域最后一个对象 参数在作用域内用 this 代替
 */
fun testWith() {
    var str = "abc"
    str = with(str) {
        println(this)
        this.reversed()
        println(this)
        "cba"
    }
    println(str)
}