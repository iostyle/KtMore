import java.io.Serializable

/**
 * 线程安全的懒汉式
 */
class KLazilySingleton private constructor() : Serializable {
    fun doSomeThing() {
        println("do some thing")
    }

    companion object {
        private var mInstance: KLazilySingleton? = null
            get() {
                return field ?: KLazilySingleton()
            }

        @JvmStatic
        @Synchronized
        fun getInstance(): KLazilySingleton {
            return requireNotNull(mInstance)
        }
    }

    private fun readResolve(): Any {
        return KLazilySingleton.getInstance()
    }

}