package keywords

import function.Model

class LateInit {
    lateinit var model: Model

    fun any() {
        //判断lateinit 修饰的变量是否被初始化（赋值）
        if (::model.isInitialized) {
            println("${model.arguments}")
        }
    }
}