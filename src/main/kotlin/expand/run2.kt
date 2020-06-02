package expand

fun main() {
    printObject(A())
    printObject(B())

    C().print()

    val str = null
    println(str.toString())
}

open class A

class B : A()

fun A.print() {
    println("A")
}

fun B.print() {
    println("B")
}

/**
 * 扩展函数是静态解析的，
 * 并不是接收者类型的虚拟成员，
 * 在调用扩展函数时，
 * 具体被调用的的是哪一个函数，
 * 由调用函数的的对象表达式来决定的，
 * 而不是动态的类型决定的.
 */
fun printObject(a: A) {
    a.print()
}

class C {
    fun print() {
        println("成员函数")
    }
}

/**
 * 若扩展函数和成员函数一致，则使用该函数时，会优先使用成员函数。
 */
fun C.print() {
    println("拓展函数")
}

fun Any?.toString(): String? {
    if (this == null) return "null"
    return this.toString()
}
