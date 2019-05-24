import java.io.Serializable

/**
 * 静态内部类单例
 */
class KOptimizeSingleton private constructor() : Serializable {
    fun doSomeThing() {
        println("do some thing")
    }

    //静态内部类
    private object SingletonHolder {
        val instance: KOptimizeSingleton = KOptimizeSingleton()
    }

    companion object {
        @JvmStatic
        fun getInstance(): KOptimizeSingleton {
            return SingletonHolder.instance
        }
    }

    private fun readResolve(): Any {
        return SingletonHolder.instance
    }
}