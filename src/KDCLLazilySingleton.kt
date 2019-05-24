import java.io.Serializable

/**
 * DLC(Double Check Look)
 */
class KDCLLazilySingleton private constructor() : Serializable {
    fun doSomeThing() {
        println("do some thing")
    }

    companion object {
        @JvmStatic
        val instance: KDCLLazilySingleton by lazy(LazyThreadSafetyMode.SYNCHRONIZED) { KDCLLazilySingleton() }
    }

    private fun readResolve(): Any {
        return instance
    }
}