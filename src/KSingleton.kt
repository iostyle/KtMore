import java.io.Serializable

/**
 * 饿汉式
 */
object KSingleton : Serializable {
    fun doSomeThing() {
        println("do some thing")
    }

    private fun readResolve(): Any {
        return KSingleton
    }
}